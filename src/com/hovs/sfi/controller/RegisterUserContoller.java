package com.hovs.sfi.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hovs.rule14.admin.ws.AccountTypeResult;
import com.hovs.rule14.admin.ws.AuthenticateRequest;
import com.hovs.rule14.admin.ws.AuthenticateResult;
import com.hovs.rule14.admin.ws.DtsListRequest;
import com.hovs.rule14.admin.ws.DtsListResult;
import com.hovs.rule14.admin.ws.GetClientListRequest;
import com.hovs.rule14.admin.ws.GetClientListResult;
import com.hovs.rule14.admin.ws.GetClientLocationRequest;
import com.hovs.rule14.admin.ws.GetClientLocationResult;
import com.hovs.rule14.admin.ws.GetUserTypeListByClientIdRequest;
import com.hovs.rule14.admin.ws.GetUserTypeListByClientIdResult;
import com.hovs.rule14.admin.ws.ImportDataWithDtsRequest;
import com.hovs.rule14.admin.ws.ImportDataWithDtsResult;
import com.hovs.rule14.admin.ws.InActivateUserRequest;
import com.hovs.rule14.admin.ws.InActivateUserResult;
import com.hovs.rule14.admin.ws.IsEmailExistRequest;
import com.hovs.rule14.admin.ws.IsEmailExistsResult;
import com.hovs.rule14.admin.ws.KbaQuestionResult;
import com.hovs.rule14.admin.ws.KbaSecurityRequest;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.LoadUsersRequest;
import com.hovs.rule14.admin.ws.LoadUsersResult;
import com.hovs.rule14.admin.ws.ReportToMappingRequest;
import com.hovs.rule14.admin.ws.ReportToMappingResult;
import com.hovs.rule14.admin.ws.SaveOrUpdateUserResult;
import com.hovs.rule14.admin.ws.SaveUpdateUserRequest;
import com.hovs.rule14.admin.ws.SendNotificationResult;
import com.hovs.rule14.admin.ws.SfiNotificationRequest;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.auth.AuthenticationPasswordEncoder;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.util.HttpUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller
public class RegisterUserContoller extends BaseController {
	
	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value="user.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
        
		switch(cmd){
		
		case AppConstants.GET_CLIENTS_BY_USER : return getClientListByUser(aRequest, aResponse);
		case AppConstants.LOAD_REPORT_TO : return loadReportTo(aRequest, aResponse);
		case AppConstants.GET_CLIENT_LOCATION : return getClientLocations(aRequest, aResponse);
		case AppConstants.LOAD_USERS : return loadUsers(aRequest, aResponse);
		case AppConstants.GET_USER_TYPE_LIST : return getUserTypeListByClientId(aRequest, aResponse);
		case AppConstants.VERIFY_EMAIL_ID : return verifyEmailId(aRequest, aResponse);
		case AppConstants.SAVE_OR_UPDATE_USER : return saveorUpdateUser(aRequest, aResponse);
		case AppConstants.IN_ACTIVE_USER : return inActivateUser(aRequest, aResponse);
		case AppConstants.RESET_PASSWORD : return resetPassword(aRequest, aResponse);
		case AppConstants.IMPORT_DTS : return importDataWithDts(aRequest, aResponse);
		case AppConstants.LOAD_DTS_LIST : return loadDtsList(aRequest, aResponse);
		
		}
	
		return  displayDashBoard(aRequest,aResponse);
	}
	
	
	private ModelAndView displayDashBoard(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		UserBean userBean = new UserBean();
		User user = getApplicationContextObject().getUserPrincipal().getUser();
		userBean.setLoginName(user.getLoginName());
		userBean.setId(user.getId());
		userBean.setClientId(user.getClientId());
		userBean.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
		
	  try {
		 
		   
			//--------------------------Load Menus---------------------------------------------------------------------------
			  
			   mLogger.debug("Loading managers");
			   LoadManagersRequest	loadManagersRequest =new LoadManagersRequest();
			   loadManagersRequest.setUserId(user.getId());
			   loadManagersRequest.setClientId(user.getClientId());
			   loadManagersRequest.setMode(2);
				  LoadManagersResult loadManagersResult=getApplicationContextObject().getUserManager().loadManagers(loadManagersRequest);
				 
				  if(loadManagersResult.getResponseCode()==100){
					  mLogger.debug("Susseccfully Loading managers");
					  LoadMenusRequest request =new LoadMenusRequest();
					   request.setUserId(user.getId());
					   request.setClientId(user.getClientId());
					   request.setManagerId(loadManagersResult.getManagers().get(0).getManagerId());
					   request.setIsAdmin(user.getIsAdmin());
					   
					    mLogger.debug("Loading Menus");
						LoadMenusResult loadMenusResult=getApplicationContextObject().getUserManager().loadMenus(request);
						  
						  if(loadMenusResult.getResponseCode()==100)
						  { mLogger.debug("Successfully Loading ");
							  userBean.setParentList(loadMenusResult.getParentMenuList());
							  userBean.setChildtList(loadMenusResult.getChildMenuList());
							 
						  }
						  
						  mLogger.debug("Loading Account Type List");
						   AccountTypeResult lAccountTypeResult = getApplicationContextObject().getUserManager().getAccountTypeList();
						   if(lAccountTypeResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
						      mLogger.debug("Successfully loading Account type list");
						      
						       String userTypeCode = getApplicationContextObject().getUserPrincipal().getUser().getUserTypeCode();
						       mLogger.debug("Account type code is ===>>>>>>>>>>>>>>>>>>>>"+userTypeCode);
						       if(AppConstants.SFI_USER_CODE.equalsIgnoreCase(userTypeCode)){
						    	   mLogger.debug("Remove accounts from account type list for SFI User");   
						    	   lAccountTypeResult.getAccountTypeList().remove(lAccountTypeResult.getAccountTypeList().size()-1);
						    	   lAccountTypeResult.getAccountTypeList().remove(lAccountTypeResult.getAccountTypeList().size()-1);
						       }
						      userBean.setAccountTypeList(lAccountTypeResult.getAccountTypeList());
						   }
				  }
			   }
			   catch(Exception ex)
			   {
				   ex.printStackTrace();
			   }
			Map<String,Object> infoMap = new HashMap<String, Object>();
			infoMap.put("userBean", userBean);
			if(!aRequest.getServletPath().contains(AppConstants.SIF_SERVLET_PATH))
			   return new ModelAndView("registeruser" , infoMap);
			else
				return new ModelAndView("registeruser" , infoMap);
	}
	
	private ModelAndView loadUsers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  LoadUsersRequest	request =new LoadUsersRequest();
			  User user = getApplicationContextObject().getUserPrincipal().getUser();
//			CommonUtil.populateBeans(aRequest, getManagersRequest);
			  request.setRequestType("user.do");
			  CommonUtil.populateBeans(aRequest, request);
		
			request.setClientId(user.getClientId());
			request.setActive("-1");
			request.setIsSupervisor(user.getIsSupervisor());
			request.setUserTypeCode(getApplicationContextObject().getUserPrincipal().getUser().getUserTypeCode());

			LoadUsersResult loadUsersResult=getApplicationContextObject().getUserManager().loadUsers(request);
			  
				if(loadUsersResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("load users", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", loadUsersResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("load users");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" failed to load users");
					result = handleFailed("failed to load users", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}

	private ModelAndView loadReportTo(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			ReportToMappingRequest	request =new ReportToMappingRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			//CommonUtil.populateBeans(aRequest, getManagersRequest);
			request.setClientId(user.getClientId());
		

			ReportToMappingResult reportToMappingResult=getApplicationContextObject().getUserManager().loadReportTo(request);
			  
				if(reportToMappingResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("load report", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", reportToMappingResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("load report");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" failed to load report");
					result = handleFailed("failed to load report", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}
	
	
	private ModelAndView getUserTypeListByClientId(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  GetUserTypeListByClientIdRequest	request =new GetUserTypeListByClientIdRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			//CommonUtil.populateBeans(aRequest, getManagersRequest);
			request.setClientId(user.getClientId());
		

			GetUserTypeListByClientIdResult getUserTypeListByClientIdResult=getApplicationContextObject().getUserManager().getUserTypeListByClientId(request);
			  
				if(getUserTypeListByClientIdResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("get user type list by clientId", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getUserTypeListByClientIdResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get user type list by clientId");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" failed to get user type list by clientId");
					result = handleFailed("failed to get user type list by clientId", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}
	
	private ModelAndView getClientListByUser(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  GetClientListRequest	request =new GetClientListRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			//CommonUtil.populateBeans(aRequest, getManagersRequest);
		
			request.setUserId(user.getId());
			request.setIsAdmin(user.getIsAdmin());

			GetClientListResult getClientListResult=getApplicationContextObject().getUserManager().getClientListByUser(request);
			  
				if(getClientListResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("get user type list by clientId", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getClientListResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get user type list by clientId");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" failed to get user type list by clientId");
					result = handleFailed("failed to get user type list by clientId", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}
	
	private ModelAndView getClientLocations(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  GetClientLocationRequest	request =new GetClientLocationRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			//CommonUtil.populateBeans(aRequest, getManagersRequest);
		
			//request.setUserId(user.getId());
			request.setEfileFormId(user.getClientId());

			GetClientLocationResult getClientLocationResult=getApplicationContextObject().getUserManager().getClientLocation(request);
			  
				if(getClientLocationResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("get user type list by clientId", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getClientLocationResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get user type list by clientId");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" failed to get user type list by clientId");
					result = handleFailed("failed to get user type list by clientId", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}
	
	//------------------------------------------------ verify EmailId-------------------------------------------------------------------------------------			
	private ModelAndView verifyEmailId(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		 try{
			 mLogger.debug("Validate Email address is Exist or Not begin");
			String email  = ServletRequestUtils.getStringParameter(aRequest, "email", null);
			Result result;
			if(email == null || email.isEmpty()){
				result = handleError("msg_required_email_id", aRequest, null);
				return new ModelAndView(getView() ,"model" , result);	
			}
			
			IsEmailExistRequest lIsEmailExistRequest = new IsEmailExistRequest();
			lIsEmailExistRequest.setEmail(email);
			IsEmailExistsResult lResponse  =  getApplicationContextObject().getUserManager().isEmailExits(lIsEmailExistRequest);
			
			if(lResponse.getResponseCode() == AppConstants.ResponseCode.Success.value()){
				mLogger.debug("successfully validate Email address is Exist.");
				KbaSecurityRequest kbaSecurityRequest = new KbaSecurityRequest();
				kbaSecurityRequest.setEmailId(email);
				KbaQuestionResult kbaQuestionResult = getApplicationContextObject().getUserManager().getUserKBAQuestionList(kbaSecurityRequest);
				
				mLogger.debug(" Processing retrieve question list base on email id");
				if(kbaQuestionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug(" successfully retrieve question list base on email id");
					 result = handleSuccess("msg_success_to_retrieve_user_question_list", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", kbaQuestionResult.getQuestionList());
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}else{
					mLogger.debug(" failed to retrieve question list base on email id");
					result = handleFailed("msg_failed_to_retrieve_user_question_list", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
			}else{
				mLogger.debug(" failed to validate email address is Exist or Not");
				result = handleFailed("msg_failed_to_valildate_email_id_exits", aRequest,null);
				return new ModelAndView(getView(),"model",result);
			}
		 }catch (com.hovs.rule14.admin.ws.WsException_Exception aEWsException_Exception) {
				Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
				return new ModelAndView(getView(),"model", errorResultInstance);
			}
		}
	
	private ModelAndView saveorUpdateUser(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  SaveUpdateUserRequest	request =new SaveUpdateUserRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
		
			com.hovs.rule14.admin.ws.User userData=new com.hovs.rule14.admin.ws.User();
			userData.setActive(aRequest.getParameterValues("user[active]")[0].toString());
			userData.setUserId(Integer.parseInt(aRequest.getParameterValues("user[userId]")[0].toString()));
			//userData.setClientId(Integer.parseInt(aRequest.getParameterValues("user[clientId]")[0].toString()));
			userData.setResetPassword(aRequest.getParameterValues("user[resetPassword]")[0].toString());
			userData.setIsAdmin(aRequest.getParameterValues("user[isAdmin]")[0].toString());
			userData.setNotificationMobile(aRequest.getParameterValues("user[notificationMobile]")[0].toString());	
			userData.setNotificationEmail(aRequest.getParameterValues("user[emailId]")[0].toString());
			userData.setEmailId(aRequest.getParameterValues("user[emailId]")[0].toString());				
			userData.setUserTypeId(Integer.parseInt(aRequest.getParameterValues("user[userTypeId]")[0].toString()));	 
			userData.setChangePwd(aRequest.getParameterValues("user[changePwd]")[0].toString());					 
			userData.setLoginName(aRequest.getParameterValues("user[loginName]")[0].toString());	
			userData.setFirstName(aRequest.getParameterValues("user[firstName]")[0].toString());
			userData.setMiddleName(aRequest.getParameterValues("user[middleName]")[0].toString());
			userData.setLastName(aRequest.getParameterValues("user[lastName]")[0].toString());
			userData.setAccountNumber(aRequest.getParameterValues("user[accountNumber]")[0].toString());
			userData.setPasswordchangenxttm("Y");
			userData.setPasswordExpire("Y");
			userData.setIsSupervisor(user.getIsSupervisor());
			userData.setScoutEmailNotification("0");
			userData.setScoutSMSNotification("0");
			userData.setSentryEmailNotification("0");
			userData.setSentrySMSNotification("0");
			userData.setAllowChat("0");
			userData.setIsAuditor("0");
			userData.setCountryCode("91");
			userData.setClientId(user.getClientId());
			userData.setClientLocationId(26);
			userData.setAccountTypeId(Integer.parseInt(aRequest.getParameterValues("user[accountTypeId]")[0].toString()));
			userData.setAgencyVendorName(aRequest.getParameterValues("user[agencyVendorName]")[0].toString());
			
			// Random password generator
			String previosName = aRequest.getParameterValues("user[prevLoginName]")[0].toString();
			
			// Checking User Id is Unique.
			if(previosName != null){
			if(!previosName.equalsIgnoreCase(userData.getLoginName())){
					AuthenticateRequest lAuthenticateRequest = new AuthenticateRequest();
					lAuthenticateRequest.setLoginName(userData.getLoginName());
					AuthenticateResult lResponse =  getApplicationContextObject().getUserManager().getUserByLoginName(lAuthenticateRequest);
					if(lResponse.getResponseCode() == AppConstants.ResponseCode.Success.value())
						if(lResponse != null && lResponse.getUser() != null){
							result = handleFailed("msg_user_id_already_exist", aRequest,null);
							return new ModelAndView(getView(),"model",result);
						}
			   }
			}
			
			
			String lPassword = new RandomStringUtils().random(8,true,true);
			
			userData.setPassword(new AuthenticationPasswordEncoder().encodePassword(lPassword,userData.getLoginName()));
			request.setUser(userData);
			request.setClientId(user.getClientId());
			SaveOrUpdateUserResult saveOrUpdateUserResult=getApplicationContextObject().getUserManager().saveOrUpdateUsers(request);
			  
			if(saveOrUpdateUserResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
				if(userData.getUserId()== 0){
				     SfiNotificationRequest lSfiNotificationRequest = new SfiNotificationRequest();
				     lSfiNotificationRequest.setEmailId(request.getUser().getEmailId());
				     lSfiNotificationRequest.setLegalName(request.getUser().getFirstName()+" "+request.getUser().getLastName());
				     lSfiNotificationRequest.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
				     lSfiNotificationRequest.setAccountTypeCode(aRequest.getParameterValues("user[accountTypeCode]")[0].toString());
				     lSfiNotificationRequest.setLoginName(request.getUser().getLoginName());
				     lSfiNotificationRequest.setUserPassword(lPassword);
				     lSfiNotificationRequest.setUserId(saveOrUpdateUserResult.getUserId());
				     lSfiNotificationRequest.setFlag("insertUser");
				     SendNotificationResult lNotificationResult = getApplicationContextObject().getUserManager().sendSFINotification(lSfiNotificationRequest);
				} 
				    
				     result = handleSuccess("email exist", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", saveOrUpdateUserResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("email exist");
					 return new ModelAndView(getView(),"model",result);
			 
			  }	else{
					mLogger.debug("msg_failed_to_save_or_update_user_registration");
					result = handleFailed("email not exist", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}  
		
	}
	
	private ModelAndView inActivateUser(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			  Result result ;
			  InActivateUserRequest	request =new InActivateUserRequest();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			CommonUtil.populateBeans(aRequest, request);
		
			request.setEfileFormId(user.getClientId());

			InActivateUserResult inActivateUserResult=getApplicationContextObject().getUserManager().inActivateUsers(request);
			  
				if(inActivateUserResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
			  {
				   result = handleSuccess("email exist", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", inActivateUserResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("email exist");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" email not exist ");
					result = handleFailed("email not exist", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (IllegalAccessException e) {
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			e.printStackTrace();
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}
	
	
	private ModelAndView resetPassword(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			
			Result result ;
			// Random password generator
			com.hovs.rule14.admin.ws.User user =new com.hovs.rule14.admin.ws.User() ;
			CommonUtil.populateBeans(aRequest, user);
			String lPassword = new RandomStringUtils().random(8,true,true);
			
			user.setPassword(new AuthenticationPasswordEncoder().encodePassword(lPassword,user.getLoginName()));
			user.setPasswordchangenxttm("Y");
			boolean resultFlag=getApplicationContextObject().getUserManager().updatePasswordByUserId(user);
			  
			if(resultFlag ){
				
				     SfiNotificationRequest lSfiNotificationRequest = new SfiNotificationRequest();
			
				     lSfiNotificationRequest.setUserId(String.valueOf(user.getUserId()));
				     lSfiNotificationRequest.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
				     lSfiNotificationRequest.setFlag("resetpassword");
				     lSfiNotificationRequest.setUserPassword(lPassword);
				     SendNotificationResult lNotificationResult = getApplicationContextObject().getUserManager().sendSFINotification(lSfiNotificationRequest);
				
				    
				     result = handleSuccess("email exist", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", resultFlag);
					 result.setCustomParams(customParams);
					 mLogger.debug("email exist");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug(" email not exist ");
					result = handleFailed("email not exist", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}  
		
	}
	
	private ModelAndView importDataWithDts(HttpServletRequest aRequest,HttpServletResponse aResponse)  {
		try{
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			Result result ;
		//	MultipartFile uploadedFile = ((MultipartRequest) aRequest).getFile("importFileData");
			ImportDataWithDtsRequest request =new ImportDataWithDtsRequest() ;
			CommonUtil.populateBeans(aRequest, request);
		
			
		//String response = "[-47, 1, 16, 84, 2, 101, 110, 83, 111, 109, 101, 32, 78, 70, 67, 32, 68, 97, 116, 97]";     
		String response=aRequest.getParameter("importFileData");
			/*
			String[] byteValues = response.substring(1, response.length() - 1).split(",");
			byte[] bytes = new byte[response.length()];

			for (int i=0, len=bytes.length; i<len; i++) {
			   bytes[i] = Byte.parseByte(response);     
			}*/
		    request.setFileByteData(response);
			request.setClientId(user.getClientId());
			request.setUserId(user.getId());
			request.setProjectId(-1);
			ImportDataWithDtsResult importDataWithDtsResult=getApplicationContextObject().getDtsManager().importDataWithDts(request);
			  
			if(importDataWithDtsResult!=null ){
				    
				     result = handleSuccess("msg_import_dts_success", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", importDataWithDtsResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("File imported successfully.");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug("File not imported.");
					result = handleFailed("msg_import_dts_fail", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} 
		
	}
	
/*	public static void decode(String sourceFile, String targetFile)
			throws Exception {

		byte[] decodedBytes = Base64
				.decodeBase64(loadFileAsBytesArray(sourceFile));

		//writeByteArraysToFile(targetFile, decodedBytes);
	}

	public static byte[] loadFileAsBytesArray(String fileNm) throws Exception {

		File file = new File(fileNm);
		int length = (int) file.length();
		BufferedInputStream reader = new BufferedInputStream(
				new FileInputStream(file));
		byte[] bytes = new byte[length];
		reader.read(bytes, 0, length);
		reader.close();
		return bytes;

	}*/
	private ModelAndView loadDtsList(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			
			Result result ;
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			DtsListRequest request =new DtsListRequest() ;
			CommonUtil.populateBeans(aRequest, request);
			request.setClientId(user.getClientId());
			request.setUserId(user.getId());
			DtsListResult dtsListResult=getApplicationContextObject().getDtsManager().loadDTSList(request);
			  
			if(dtsListResult!=null ){
				    
				     result = handleSuccess("msg_load_dts_success", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", dtsListResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("File imported successfully.");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
				else{
					mLogger.debug("File not imported.");
					result = handleFailed("msg_load_dts_fail", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
		} catch (WsException_Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}  
		
	}
}
