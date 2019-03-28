package com.hovs.sfi.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hovs.rule14.admin.ws.AccountTypeResult;
import com.hovs.rule14.admin.ws.KbaQuestion;
import com.hovs.rule14.admin.ws.KbaQuestionResult;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.rule14.sfi.ws.SaveOrUpdateResponse;
import com.hovs.rule14.sfi.ws.SaveUpdateUserProfileRequest;
import com.hovs.rule14.sfi.ws.SaveUpdateUserResult;
import com.hovs.sfi.auth.AuthConstants;
import com.hovs.sfi.auth.AuthenticationPasswordEncoder;
import com.hovs.sfi.auth.UserPrincipalImpl;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller("tier2AuthController")
public class Tier2AuthController extends BaseController {


	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value="/tier2.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
		switch(cmd){
		case AppConstants.UPDATE_CUSTOMER_TYPE_INFO : return updateCutomerTypeInfo(aRequest,aResponse);
		case AppConstants.UPDATE_CUSTOMER_INFO : return updateCutomerInfo(aRequest,aResponse);
		case AppConstants.VERIFY_PASSWORD : return verifyCurrentPassword(aRequest,aResponse);
		}
		return displayTier2Page(aRequest,aResponse);
	}

	private ModelAndView verifyCurrentPassword(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		String lPassword = ServletRequestUtils.getStringParameter(aRequest, "password",null);
		 if(lPassword == null || lPassword.contains("=") || lPassword.equals("")){
			  Result handleError = handleFailed("msg_failed_password_empty", aRequest , null);
			  return new ModelAndView(getView(), "model",handleError);
		  }else{
			  AuthenticationPasswordEncoder  lAuthenticationPasswordEncoder = new AuthenticationPasswordEncoder();
			  String encodedPassword = lAuthenticationPasswordEncoder.encodePassword(lPassword,getApplicationContextObject().getUserPrincipal().getUser().getLoginName());
			  if(encodedPassword.equals(getApplicationContextObject().getUserPrincipal().getPassword())){
				  Result handleError = handleSuccess("msg_success_to_verify_current_user_password", aRequest , null);
				  return new ModelAndView(getView(), "model",handleError);
			  }else{
				  Result handleError = handleFailed("msg_failed_to_verify_current_user_password", aRequest , null);
				  return new ModelAndView(getView(), "model",handleError);
			  }
		}
	}

	private ModelAndView updateCutomerTypeInfo(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest = new SaveUpdateUserProfileRequest();
		
		try {
			CommonUtil.populateBeans(aRequest, lSaveUpdateUserProfileRequest);
			lSaveUpdateUserProfileRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
			lSaveUpdateUserProfileRequest.setLoginPassword(new AuthenticationPasswordEncoder().encodePassword(lSaveUpdateUserProfileRequest.getLoginPassword(), getApplicationContextObject().getUserPrincipal().getUsername()));
			
			 mLogger.debug("processing request for update user details for first time user account created by userId"+lSaveUpdateUserProfileRequest.getUserId());
			 
			 SaveUpdateUserResult lResponse = getApplicationContextObject().getUserManager().saveOrUpdateUserDetails(lSaveUpdateUserProfileRequest);
			
			  if(lResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				     int USER_AUTH_ROLE = AuthConstants.ROLE_AUTH_USER;
				     grantAuthority(USER_AUTH_ROLE);
				     mLogger.debug("success to save or update user details.");
					 Result result = handleSuccess("msg_success_save_or_update_user_details_operation", aRequest,null);
					 return new ModelAndView(getView(),"model",result);
				 }else {
					 mLogger.debug("Failed to save or update W9Form details.");
					 Result handleError = handleFailed("msg_failed_save_or_update_user_details_operation", aRequest , null);
					 return new ModelAndView(getView(), "model",handleError);
				 }
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}catch (com.hovs.rule14.sfi.ws.WsException_Exception aEWsException_Exception) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	}

	private ModelAndView updateCutomerInfo(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest = new SaveUpdateUserProfileRequest();
		
		try {
			CommonUtil.populateBeans(aRequest, lSaveUpdateUserProfileRequest);
			lSaveUpdateUserProfileRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
			lSaveUpdateUserProfileRequest.setLoginPassword(new AuthenticationPasswordEncoder().encodePassword(lSaveUpdateUserProfileRequest.getLoginPassword(), getApplicationContextObject().getUserPrincipal().getUsername()));
			
			 mLogger.debug("processing request for update user details for first time user account created by userId"+lSaveUpdateUserProfileRequest.getUserId());
			 
			 SaveUpdateUserResult lResponse = getApplicationContextObject().getUserManager().saveOrUpdateUserProfile(lSaveUpdateUserProfileRequest);
			
			  if(lResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
					UserPrincipalImpl lUserPrincipalImpl = new UserPrincipalImpl();
				  User user = getApplicationContextObject().getUserPrincipal().getUser();
				  user.setPassword( lSaveUpdateUserProfileRequest.getLoginPassword());
				  lUserPrincipalImpl.setUser(user);
				     int USER_AUTH_ROLE = AuthConstants.ROLE_AUTH_USER;
				     grantAuthority(USER_AUTH_ROLE);
				     mLogger.debug("success to save or update user details.");
					 Result result = handleSuccess("msg_success_save_or_update_user_details_operation", aRequest,null);
					 return new ModelAndView(getView(),"model",result);
				 }else {
					 mLogger.debug("Failed to save or update W9Form details.");
					 Result handleError = handleFailed("msg_failed_save_or_update_user_details_operation", aRequest , null);
					 return new ModelAndView(getView(), "model",handleError);
				 }
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}catch (com.hovs.rule14.sfi.ws.WsException_Exception aEWsException_Exception) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	}

	private ModelAndView displayTier2Page(HttpServletRequest aRequest,
		   HttpServletResponse aResponse) {
		   UserBean lUserBean =  new UserBean();
		   try {
			   mLogger.debug("Loading KBA Question List");
			   KbaQuestionResult lKbaQuestionResult = getApplicationContextObject().getUserManager().getKBAQuestionList();
			   if(lKbaQuestionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
			      mLogger.debug("Successfully loading KBA question list");
			      lUserBean.setQuestionList(lKbaQuestionResult.getQuestionList());
			   }
		   }catch (WsException_Exception e) {
			  mLogger.debug("Exception Occured while loading KBA question list");
			 e.printStackTrace();
		  }
		   try {
			   mLogger.debug("Loading Account Type List");
			   AccountTypeResult lAccountTypeResult = getApplicationContextObject().getUserManager().getAccountTypeList();
			   if(lAccountTypeResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
			      mLogger.debug("Successfully loading KBA question list");
			      lUserBean.setAccountTypeList(lAccountTypeResult.getAccountTypeList());
			   }
		   }catch (WsException_Exception e) {
			  mLogger.debug("Exception Occured while loading KBA question list");
			 e.printStackTrace();
		  }
		   lUserBean.setEmailId(getApplicationContextObject().getUserPrincipal().getUser().getEmailId());
		   lUserBean.setLoginName(getApplicationContextObject().getUserPrincipal().getUser().getLoginName());
		   lUserBean.setAccountType(getApplicationContextObject().getUserPrincipal().getUser().getAccountType());
		   Map<String,Object> infoMap = new HashMap<String, Object>();
		   infoMap.put("tier2Bean", lUserBean);
		   return new ModelAndView("tier2",infoMap);
	}
	
	private void grantAuthority(int userAuthRole) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(auth.getAuthorities());
	    authorities.add(new SimpleGrantedAuthority(String.valueOf( userAuthRole)));
	    Authentication newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(), authorities);
	    SecurityContextHolder.getContext().setAuthentication(newAuth);
	}

}
