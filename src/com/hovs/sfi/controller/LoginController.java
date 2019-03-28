package com.hovs.sfi.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hovs.rule14.admin.ws.AuthenticateRequest;
import com.hovs.rule14.admin.ws.AuthenticateResult;
import com.hovs.rule14.admin.ws.ChangePasswordRequest;
import com.hovs.rule14.admin.ws.ChangePasswordResult;
import com.hovs.rule14.admin.ws.ForgotLoginNameRequest;
import com.hovs.rule14.admin.ws.ForgotLoginNameResult;
import com.hovs.rule14.admin.ws.IsEmailExistRequest;
import com.hovs.rule14.admin.ws.KbaQuestionResult;
import com.hovs.rule14.admin.ws.KbaSecurityRequest;
import com.hovs.rule14.admin.ws.UserURLMap;
import com.hovs.rule14.admin.ws.UserURLMapRequest;
import com.hovs.rule14.admin.ws.UserURLMapResult;
import com.hovs.sfi.auth.AuthConstants;
import com.hovs.sfi.auth.AuthenticationPasswordEncoder;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.util.AESSecurityUtil;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.util.HttpUtil;
import com.hovs.sfi.view.forms.LoginForm;

@Controller
public class LoginController extends BaseController{

	
	protected Log logger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value={"/login.do","/"}, method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest,"cmd" , "UnknownRequestCmd");
		switch (cmd) {
		case AppConstants.VERIFY_EMAIL_ID: return verifyEmailId(aRequest,aResponse);
		case AppConstants.CMD_VALIDATE_SECURITY_QUESTION_AND_ANSWER : return validateSecurityQuestionAndAnswer(aRequest,aResponse);
		case AppConstants.CMD_URL_MAP_FORGOT_PASSWORD : return forgotPassword(aRequest,aResponse);
		case AppConstants.FORGOT_USER_ID : return forgotUserId(aRequest,aResponse);
		case AppConstants.CMD_SET_NEW_PASSWORD : return setNewPassword(aRequest,aResponse);

		}
		return displayLoginPage(aRequest,aResponse);
	}

	private ModelAndView setNewPassword(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		try {
			String token = ServletRequestUtils.getStringParameter(aRequest,"token", null);
			if(token == null){
				Result handleSuccess = handleFailed("msg_validationError_token_required", aRequest, null);
				return new ModelAndView(getView(),"model",handleSuccess);
			}
			UserURLMapRequest userURLMapRequest = new UserURLMapRequest();
			userURLMapRequest.setTokenId(token);
			userURLMapRequest.setMode(2);
			UserURLMapResult userUrlMapResult = getApplicationContextObject().getUserManager().getUserUrlMap(userURLMapRequest);
			List<UserURLMap> userURLMapList = userUrlMapResult.getUserURLMap();
			if(userURLMapList != null && userURLMapList.size() > 0){
				UserURLMap userURLMap = userURLMapList.get(0);
				if(userURLMap != null && AuthConstants.STATE_INACTIVE.equals(userURLMap.getActive())){
					Result handleSuccess = handleFailed("msg_validationError_passwordAlreadyChanged", aRequest, null);
					return new ModelAndView(getView(),"model",handleSuccess);
				}
				Date createdOn = CommonUtil.convertToDate(userURLMap.getCreatedOn());
				Date expiryDate = CommonUtil.convertToDate(userURLMap.getExpiryDate());
				long currentDateDiff = new Date().getTime() - createdOn.getTime();
				long expiryDateDiff = expiryDate.getTime() - createdOn.getTime();
				// Check for expiry.
				if(currentDateDiff >= expiryDateDiff ){
					return new ModelAndView(getView(),"model" , "Link has expired.");
				}
			}
			
			ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
			CommonUtil.populateBeans(aRequest, changePasswordRequest);
			changePasswordRequest.setLoginName(userUrlMapResult.getLoginName());
			// Validate change password request parameters.
			ModelAndView validationResult = validateRequestParameter(aRequest,changePasswordRequest);
			if(validationResult != null){
				return validationResult;
			}
			AuthenticationPasswordEncoder authPassEncoder = new AuthenticationPasswordEncoder();
			String encodedNewPassword = authPassEncoder.encodePassword(changePasswordRequest.getNewPassword(), userUrlMapResult.getLoginName());
			changePasswordRequest.setNewPassword(encodedNewPassword);
			changePasswordRequest.setTokenId(token);
			
			
			// Call change password method of web service layer.
			ChangePasswordResult changePassword = getApplicationContextObject().getUserManager().changePassword(changePasswordRequest);
			if(changePassword.getResponseCode() == AppConstants.ResponseCode.Success.value()){
	        	userURLMapRequest.setMode(3);
				userURLMapRequest.setTokenId(token);
				userURLMapRequest.setStatus(AuthConstants.STATE_INACTIVE);
				UserURLMapResult updateUSerUrlMap = getApplicationContextObject().getUserManager().updateUserUrlMap(userURLMapRequest);
				if(updateUSerUrlMap.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					logger.debug("Successfully updated UserURLMapResult");
				}
				Result result = handleSuccess("msg_success_set_new_password", aRequest, null);
				return new ModelAndView(getView() , "model" , result);
			}else if(changePassword.getResponseCode() == AppConstants.ResponseCode.NOTMATCHED.value()){
				Result result = handleError(changePassword.getUserMessage(), aRequest, null);
				return new ModelAndView(getView() , "model" , result);
			}else{
				Result result = handleFailed(changePassword.getUserMessage(), aRequest, null);
				return new ModelAndView(getView() , "model" , result);
			}
		} catch (Throwable throwableInstance) {
			Result result = handleError("msg_error_setNewPassword", aRequest, throwableInstance);
			return new ModelAndView(getView(), "model" , result);
		}
	}


	/**
	 * Validate ChangePassword Request.
	 * @param request
	 * @param changePasswordRequest
	 * @return
	 */
	private ModelAndView validateRequestParameter(HttpServletRequest request,ChangePasswordRequest changePasswordRequest) {
		if(changePasswordRequest.getLoginName() == null ){
			Result result = handleFailed("msg_validation_error_loginNameNotProvided", request, null);
			return new ModelAndView(getView() , "model" , result);
		}
		if(changePasswordRequest.getNewPassword() == null){
			Result result = handleFailed("msg_validation_error_newPasswordNotProvided", request, null);
			return new ModelAndView(getView() , "model" , result);
		}
		if(changePasswordRequest.getConfirmPassword() == null){
			Result result = handleFailed("msg_validation_error_confirmPasswordNotProvided", request, null);
			return new ModelAndView(getView() , "model" , result);
		}
		if(!changePasswordRequest.getConfirmPassword().equals(changePasswordRequest.getNewPassword())){
			Result result = handleFailed("msg_validation_error_confirmPasswordNotEqualsToNew", request, null);
			return new ModelAndView(getView() , "model" , result);
		}
		return null;
	}
	private ModelAndView forgotPassword(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		LoginForm loginForm = new LoginForm();
		loginForm.setUiStatePath("setNewPassword");
		//loginForm.setUiStatePath("accountActivatedSuccess");
		try {
			String decrypt = AESSecurityUtil.decrypt(aRequest.getParameter(AppConstants.USERID_MASK_STRING));
			System.out.println(decrypt);
		} catch (Exception e) {
		}
		String token = ServletRequestUtils.getStringParameter(aRequest, AppConstants.TOKEN_MASK_STRING, null);
		if(token == null){
			Result handleSuccess = handleFailed("msg_validationError_token_required", aRequest, null);
			return new ModelAndView(getView(),"model",handleSuccess);
		}
		loginForm.setToken(token);
		Map<String,Object> infoMap = new HashMap<String, Object>();
		infoMap.put("loginForm",loginForm);
		return  new ModelAndView("changePassword" , infoMap);
		
	}

	private ModelAndView validateSecurityQuestionAndAnswer(
			HttpServletRequest aRequest, HttpServletResponse aResponse) {

		try{
			KbaSecurityRequest kbaSecurityRequest = new KbaSecurityRequest();
			CommonUtil.populateBeans(aRequest, kbaSecurityRequest);
			String loginName  = ServletRequestUtils.getStringParameter(aRequest, "loginName", null);
			
			
			if(kbaSecurityRequest.getSelectedKBAQuestionId1() == 0){
				String messagesArgs[] = {"1"};
				Result handleFailed = handleFailed("msg_validation_securityQuestion_not_selected", aRequest, messagesArgs);
				return new ModelAndView(getView() , "model" , handleFailed);
			}
			if(kbaSecurityRequest.getSelectedKBAAnswer1() == null || kbaSecurityRequest.getSelectedKBAAnswer1().isEmpty()){
				String messagesArgs[] = {"1"};
				Result handleFailed = handleFailed("msg_validation_securityAnswer_not_provided", aRequest, messagesArgs);
				return new ModelAndView(getView() , "model" , handleFailed);
			}
			if(kbaSecurityRequest.getSelectedKBAQuestionId2() == 0){
				String messagesArgs[] = {"2"};
				Result handleFailed = handleFailed("msg_validation_securityQuestion_not_selected", aRequest, messagesArgs);
				return new ModelAndView(getView() , "model" , handleFailed);
			}
			if(kbaSecurityRequest.getSelectedKBAAnswer2() == null || kbaSecurityRequest.getSelectedKBAAnswer2().isEmpty()){
				String messagesArgs[] = {"2"};
				Result handleFailed = handleFailed("msg_validation_securityAnswer_not_provided", aRequest, messagesArgs);
				return new ModelAndView(getView() , "model" , handleFailed);
			}
			
			kbaSecurityRequest.setLoginName(loginName);
			KbaQuestionResult kbaQuestionResult = getApplicationContextObject().getUserManager().validateForKBASecurity(kbaSecurityRequest);
			boolean isValid= kbaQuestionResult.isKbaSecurityQuestionAnswersValid();
			if( isValid && kbaQuestionResult.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				UserURLMapResult saveUserUrlMap = getApplicationContextObject().getUserManager().saveUserUrlMap(aRequest, kbaQuestionResult.getUserId(), kbaQuestionResult.getClientId(), kbaQuestionResult.getProjectId(),AppConstants.FORGOT_PASSWORD_URL,false,null);
				Result handleSuccess = handleSuccess("msg_validation_securityAnswer_succeed", aRequest, null);
				return new ModelAndView(getView() , "model" , handleSuccess);
			} 
			else{
				Result handleFailed = handleFailed("msg_validation_securityAnswer_failed", aRequest, null);
				return new ModelAndView(getView() , "model" , handleFailed);
			}
		}catch (Throwable aThrowable) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aThrowable);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	
	}

	private ModelAndView verifyEmailId(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		 try{
			logger.debug("Validate Email address is Exist or Not begin");
			String email  = ServletRequestUtils.getStringParameter(aRequest, "email", null);
			String loginName  = ServletRequestUtils.getStringParameter(aRequest, "loginName", null);
			
			Result result;
			if(email == null || email.isEmpty()){
				result = handleError("msg_required_email_id", aRequest, null);
				return new ModelAndView(getView() ,"model" , result);	
			}
			
			IsEmailExistRequest lIsEmailExistRequest = new IsEmailExistRequest();
			lIsEmailExistRequest.setEmail(email);
			
			AuthenticateRequest lAuthenticateRequest = new AuthenticateRequest();
			lAuthenticateRequest.setLoginName(loginName);
			
			 AuthenticateResult  lAuthenticateResult = getApplicationContextObject().getUserManager().getUserByLoginName(lAuthenticateRequest);
			 
			 
			// IsEmailExistsResult lResponse  =  getApplicationContextObject().getUserManager().isEmailExits(lIsEmailExistRequest);
			
			
			if(lAuthenticateResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
				if(lAuthenticateResult.getUser().getEmailId().equalsIgnoreCase(email)){
					logger.debug("Forgot password :successfully validate Email address is Exist.");
						if(lAuthenticateResult.getUser().getAdminFlag().equalsIgnoreCase(String.valueOf('Y'))){
							logger.debug("Forgot password : Processing email sending. user is admin so directly sending email.");
							 UserURLMapResult saveUserUrlMap = getApplicationContextObject().getUserManager().saveUserUrlMap(aRequest, lAuthenticateResult.getUser().getUserId(), lAuthenticateResult.getUser().getClientId(),0,AppConstants.FORGOT_PASSWORD_URL,false,null);
							 Result handleSuccess = handleSuccess("msg_validation_securityAnswer_succeed", aRequest, null);
							 Map<String, Object> customParams = new HashMap<String,Object>();
							 customParams.put("isAdmin", "Y");
							 handleSuccess.setCustomParams(customParams);
							 return new ModelAndView(getView(),"model",handleSuccess);
						}else{
							KbaSecurityRequest kbaSecurityRequest = new KbaSecurityRequest();
							kbaSecurityRequest.setEmailId(email);
							kbaSecurityRequest.setLoginName(loginName);
							KbaQuestionResult kbaQuestionResult = getApplicationContextObject().getUserManager().getUserKBAQuestionList(kbaSecurityRequest);
							
							logger.debug("Forgot password :Processing retrieve question list base on email id");
							if(kbaQuestionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
								if(kbaQuestionResult.getQuestionList() == null || kbaQuestionResult.getQuestionList().isEmpty() ){
									logger.debug("Forgot password : failed to retrieve question list base on email id beacause user not complete first time login work flow.");
									result = handleFailed("msg_user_first_time_login", aRequest,null);
									return new ModelAndView(getView(),"model",result);
								}else{
								 logger.debug("successfully retrieve question list base on email id");
								 result = handleSuccess("msg_success_to_retrieve_user_question_list", aRequest,null);
								 Map<String, Object> customParams = new HashMap<String,Object>();
								 customParams.put("data", kbaQuestionResult.getQuestionList());
								 customParams.put("isAdmin", "N");
								 result.setCustomParams(customParams);
								 return new ModelAndView(getView(),"model",result);
								}
							}else{
								logger.debug("Forgot password : failed to retrieve question list base on email id");
								result = handleFailed("msg_failed_to_retrieve_user_question_list", aRequest,null);
								return new ModelAndView(getView(),"model",result);
							}
						}
				}else{
					logger.debug("Forgot password : failed to validate email address is Exist or Not");
					result = handleFailed("msg_failed_to_valildate_email_id_exits", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				
			}else{
				logger.debug("Forgot password : failed to validate email address is Exist or Not");
				result = handleFailed("msg_failed_to_valildate_email_id_exits", aRequest,null);
				return new ModelAndView(getView(),"model",result);
			}
		 }catch (com.hovs.rule14.admin.ws.WsException_Exception aEWsException_Exception) {
				Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
				return new ModelAndView(getView(),"model", errorResultInstance);
			}
		}

	private ModelAndView displayLoginPage(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		LoginForm loginForm = new LoginForm();
		
		if(isSessionAuthenticated()){
			// User is already logged in so redirect him to home page.
			try {
				aResponse.sendRedirect(aRequest.getContextPath()+getRedirectUrlIsSessionAuthenticate());
			} catch (IOException ex) {
				 logger.error("Error while redirecting to home.do "+ ex);
			}
		}
		
		if("failed".equals(aRequest.getQueryString())){
			Integer loginReguestFailureCode = (Integer)aRequest.getSession().getAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE);
			
			if(loginReguestFailureCode==null)
			{
				return loginPageView(loginForm, "msg_user_login_already");
			}
			if(loginReguestFailureCode == AuthConstants.USER_ACCOUNT_BAD_CREDENTIALS){
				return loginPageView(loginForm,"msg_login_failed_bad_credentials_provided");
			}else if(loginReguestFailureCode == AuthConstants.USER_MAXIMUM_SESSION){
				return loginPageView(loginForm,"user_maximum_session_exceeded");
			}
			return loginPageView(loginForm,"msg_user_login_already");
		}
		return new ModelAndView("login");
	}
	
//--------------------------Get loginName By emailId---------------------------------------------------------------------------
	private ModelAndView forgotUserId(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		ForgotLoginNameRequest forgotLoginNameRequest = new ForgotLoginNameRequest();
		
		try {
			CommonUtil.populateBeans(aRequest, forgotLoginNameRequest);
		
			forgotLoginNameRequest.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
			logger.debug("processing request for get userId");
			 
			ForgotLoginNameResult forgotLoginNameResult = getApplicationContextObject().getUserManager().forgotLoginName(forgotLoginNameRequest);
			
			  if(forgotLoginNameResult.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				 /*    int USER_AUTH_ROLE = AuthConstants.ROLE_AUTH_USER;
				     grantAuthority(USER_AUTH_ROLE);*/
				     logger.debug("success to get userIds.");
					 Result result = handleSuccess("msg_send_userid", aRequest,null);
					 return new ModelAndView(getView(),"model",result);
				 }else {
					 logger.debug("Failed to get userId.");
					 Result handleError = handleFailed("msg_failed_to_send_userid", aRequest , null);
					 return new ModelAndView(getView(), "model",handleError);
				 }
		} catch (Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	}
}
