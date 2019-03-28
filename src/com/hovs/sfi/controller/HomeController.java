package com.hovs.sfi.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
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

import com.hovs.rule14.admin.ws.IsEmailExistRequest;
import com.hovs.rule14.admin.ws.IsEmailExistsResult;
import com.hovs.rule14.admin.ws.IsSupervisorRequest;
import com.hovs.rule14.admin.ws.IsSupervisorResult;
import com.hovs.rule14.admin.ws.IsValidModuleResult;
import com.hovs.rule14.admin.ws.KbaQuestionResult;
import com.hovs.rule14.admin.ws.KbaSecurityRequest;
import com.hovs.rule14.admin.ws.LoadClientsRequest;
import com.hovs.rule14.admin.ws.LoadClientsResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.LoadProjectRequest;
import com.hovs.rule14.admin.ws.LoadProjectsResult;
import com.hovs.rule14.admin.ws.ValidModuleRequest;
import com.hovs.rule14.sfi.ws.GetUserProfileRequest;
import com.hovs.rule14.sfi.ws.GetUserResponse;
import com.hovs.rule14.sfi.ws.SaveOrUpdateResponse;
import com.hovs.rule14.sfi.ws.SaveUpdateUserProfileRequest;
import com.hovs.rule14.sfi.ws.SaveUpdateUserResult;
import com.hovs.rule14.sfi.ws.W9FormGetRequest;
import com.hovs.rule14.sfi.ws.W9FormGetResponse;
import com.hovs.rule14.sfi.ws.W9FormRequest;
import com.hovs.rule14.sfi.ws.WsException_Exception;
import com.hovs.sfi.auth.AuthenticationPasswordEncoder;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.util.HttpUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller
public class HomeController extends BaseController{

	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value={"/home.do","/sfi.do"},method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
                       
		switch(cmd){
		case AppConstants.UPDATE_W9_DETAILS : return updateW9Details(aRequest,aResponse);
	//	case AppConstants.GET_W9_DETAILS : return getW9Details(aRequest,aResponse);
		case AppConstants.GET_MANAGERS : return getManagers(aRequest,aResponse);
		case AppConstants.GET_PROJECTS : return getProjects(aRequest, aResponse);
		case AppConstants.GET_CLIENTS : return getClients(aRequest, aResponse);
		case AppConstants.GET_MENUSBYMANAGER : return getMenusByManager(aRequest, aResponse);
		case AppConstants.GET_PROJECTGROUPS : return getProjectGroups(aRequest, aResponse);
		case AppConstants.IS_VALIDATEMAODULE : return isValidateModule(aRequest, aResponse);
		case AppConstants.LOAD_MENUS : return loadMenus(aRequest, aResponse);
		case AppConstants.LOAD_USER_ACCOUNT_DETAILS : return loadUserAccountDetails(aRequest, aResponse);
		case AppConstants.UPDATE_CUSTOMER_TYPE_INFO : return updateCutomerTypeInfo(aRequest,aResponse);
		case AppConstants.VERIFY_PASSWORD : return verifyCurrentPassword(aRequest,aResponse);
		case AppConstants.PASSWORDCHGNXTTIME : return passwordChangeNextTime(aRequest,aResponse);
		case AppConstants.VERIFY_EMAIL_ID: return verifyEmailId(aRequest,aResponse);
		}
		
		return  displayDashBoard(aRequest,aResponse);
	}
	
//--------------------------------- password change next time-------------------------------------------------------------------------------
	private ModelAndView passwordChangeNextTime(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		try{
		getApplicationContextObject().getUserManager().passwordChangeNextTime(getApplicationContextObject().getUserPrincipal().getUser().getId());
		}catch(Exception e){
			
		}
		return null;
	}

//--------------------------------- load user accoun details---------------------------------------------------------------------------
	private ModelAndView loadUserAccountDetails(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		GetUserProfileRequest lGetUserProfileRequest = new GetUserProfileRequest();
		lGetUserProfileRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
		try{
			mLogger.debug("processing request for get user details by userId"+getApplicationContextObject().getUserPrincipal().getUser().getId());
			GetUserResponse lGetUserResponse = getApplicationContextObject().getUserManager().getUserDetails(lGetUserProfileRequest);
			
			if(lGetUserResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				 Result result = handleSuccess("msg_success_get_user_details_operation", aRequest,null);
				 Map<String, Object> customParams = new HashMap<String,Object>();
				 customParams.put("data", lGetUserResponse.getSfiUser());
				 result.setCustomParams(customParams);
				 mLogger.debug("success to get user details.");
				 return new ModelAndView(getView(),"model",result);
			 }else {
				 mLogger.debug("Failed to get user details.");
				 Result handleError = handleFailed("msg_failed_get_user_details_operation", aRequest , null);
				 return new ModelAndView(getView(), "model",handleError);
			 }
		}catch (WsException_Exception aEWsException_Exception) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	}

	//-------------------------- Get W9 Details ---------------------------------------------------------------------------
	/*private ModelAndView getW9Details(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
		    W9FormGetRequest lW9FormGetRequest = new W9FormGetRequest();
		    lW9FormGetRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
		    lW9FormGetRequest.setUserId(36015);
		    
		    mLogger.debug("processing request for get W9-form details by userId"+lW9FormGetRequest.getUserId());
		    W9FormGetResponse lW9FormGetResponse = getApplicationContextObject().getTinValidationManager().getW9FromDetails(lW9FormGetRequest);
		    
		    if(lW9FormGetResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				 Result result = handleSuccess("msg_success_get_W9Form_Details_Operation", aRequest,null);
				 Map<String, Object> customParams = new HashMap<String,Object>();
				 customParams.put("data", lW9FormGetResponse.getLW9FormDto());
				 result.setCustomParams(customParams);
				 mLogger.debug("success to get W9Form details.");
				 return new ModelAndView(getView(),"model",result);
			 }else {
				 mLogger.debug("Failed to save or update W9Form details.");
				 Result handleError = handleFailed("msg_failed_get_W9Form_Details_Operation", aRequest , null);
				 return new ModelAndView(getView(), "model",handleError);
			 }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}catch (WsException_Exception aEWsException_Exception) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
		
	}*/
	
//--------------------------------------- update customer type info------------------------------------------------------------------	
	private ModelAndView updateCutomerTypeInfo(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest = new SaveUpdateUserProfileRequest();
		User user = getApplicationContextObject().getUserPrincipal().getUser();
		try {
			CommonUtil.populateBeans(aRequest, lSaveUpdateUserProfileRequest);
			lSaveUpdateUserProfileRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
			if(lSaveUpdateUserProfileRequest.getLoginPassword()!=null && lSaveUpdateUserProfileRequest.getLoginPassword()!="")
			{
			lSaveUpdateUserProfileRequest.setLoginPassword(new AuthenticationPasswordEncoder().encodePassword(lSaveUpdateUserProfileRequest.getLoginPassword(), getApplicationContextObject().getUserPrincipal().getUsername()));
			}
			else
			{
				lSaveUpdateUserProfileRequest.setLoginPassword(user.getPassword());
			}
			
			 mLogger.debug("processing request for update user details for first time user account created by userId"+lSaveUpdateUserProfileRequest.getUserId());
			 
			 SaveUpdateUserResult lResponse = getApplicationContextObject().getUserManager().saveOrUpdateUserDetails(lSaveUpdateUserProfileRequest);
			
			  if(lResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				 /*    int USER_AUTH_ROLE = AuthConstants.ROLE_AUTH_USER;
				     grantAuthority(USER_AUTH_ROLE);*/
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

//--------------------------------------- display dashboard------------------------------------------------------------------------------------------------	
	private ModelAndView displayDashBoard(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		UserBean userBean = new UserBean();
		User user = getApplicationContextObject().getUserPrincipal().getUser();
		userBean.setLoginName(user.getLoginName());
		userBean.setPasswordChangeNxtTime(user.getPasswordChangeFirstTime().equalsIgnoreCase("Y") ? true : false);

		 if(!aRequest.getServletPath().contains(AppConstants.SIF_SERVLET_PATH)){
		 try {
			   mLogger.debug("Loading KBA Question List");
			   KbaQuestionResult lKbaQuestionResult = getApplicationContextObject().getUserManager().getKBAQuestionList();
			   if(lKbaQuestionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
			      mLogger.debug("Successfully loading KBA question list");
			      userBean.setQuestionList(lKbaQuestionResult.getQuestionList());
			   }
		   }catch (com.hovs.rule14.admin.ws.WsException_Exception e) {
			  mLogger.debug("Exception Occured while loading KBA question list");
			 e.printStackTrace();
		  }
		 }
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
			  }
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }
		Map<String,Object> infoMap = new HashMap<String, Object>();
		if(!aRequest.getServletPath().contains(AppConstants.SIF_SERVLET_PATH)){
			infoMap.put("userBean", userBean);
		   return new ModelAndView("home" , infoMap);
		}else{ 
			try{
				 String autoPopulate = ServletRequestUtils.getStringParameter(aRequest, "d", AppConstants.UNKNOWN_REQUEST_CMD);
				 System.out.println("----------------------------------------->"+autoPopulate+"<-----------------------------");
				if(autoPopulate.isEmpty()){
					userBean.setAutoPopulateDisabled(true);
				}
			    W9FormGetRequest lW9FormGetRequest = new W9FormGetRequest();
			    lW9FormGetRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
			    mLogger.debug("processing request for get W9-form details by userId"+lW9FormGetRequest.getUserId());
			    W9FormGetResponse lW9FormGetResponse = getApplicationContextObject().getTinValidationManager().getW9FormDetails(lW9FormGetRequest);
			    
			    if(lW9FormGetResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
			    	userBean.setW9FormDto(lW9FormGetResponse.getLW9FormDto());
				 }
			}catch (WsException_Exception aEWsException_Exception) {
			    aEWsException_Exception.printStackTrace();
			}
			infoMap.put("userBean", userBean);
			return new ModelAndView("w9form" , infoMap);
		}
	}
	
	//-------------------------- Update W9 Details ---------------------------------------------------------------------------
	private ModelAndView updateW9Details(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			W9FormRequest lW9FormRequest = new W9FormRequest();
			CommonUtil.populateBeans(aRequest, lW9FormRequest);
			
		    System.out.println("Check Box Value"+aRequest.getParameter("checkBox"));
		    int id =Integer.parseInt(aRequest.getParameter("checkBox"));
		    switch(id){
		    case 1 : lW9FormRequest.setIndividule(true); break;
		    case 2 : lW9FormRequest.setCCorporation(true);break;
		    case 3 : lW9FormRequest.setSCorporation(true); break;
		    case 4 : lW9FormRequest.setPartnership(true); break;
		    case 5 : lW9FormRequest.setTrustOrEsate(true); break;
		    case 6 : lW9FormRequest.setLimitLibCom(true); break;
		    case 7 : lW9FormRequest.setOther(true); break;
		    }
			
			lW9FormRequest.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
			mLogger.debug("processing request for save or update W9 form details");
			lW9FormRequest.setEmailId(getApplicationContextObject().getUserPrincipal().getUser().getEmailId());
			lW9FormRequest.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
			lW9FormRequest.setLoginName(getApplicationContextObject().getUserPrincipal().getUser().getLoginName());
			lW9FormRequest.setAccountType(getApplicationContextObject().getUserPrincipal().getUser().getAccountTypeCode());
			SaveOrUpdateResponse lSaveOrUpdateResponse =  getApplicationContextObject().getTinValidationManager().saveOrUpdateW9FromDetails(lW9FormRequest);
			
			
			if(lSaveOrUpdateResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
				 Result result = handleSuccess("msg_success_saveOrUpdate_W9Form_Details_Operation", aRequest,null);
				 Map<String, Object> customParams = new HashMap<String,Object>();
				 customParams.put("id", lSaveOrUpdateResponse.getReturnId());
				 result.setCustomParams(customParams);
				 mLogger.debug("success to save or update W9Form details.");
				 return new ModelAndView(getView(),"model",result);
			 }else {
				 mLogger.debug("Failed to save or update W9Form details.");
				 Result handleError = handleFailed("msg_failed_saveOrUpdate_W9Form_Details_Operation", aRequest , null);
				 return new ModelAndView(getView(), "model",handleError);
			 }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}catch (WsException_Exception aEWsException_Exception) {
			Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
			return new ModelAndView(getView(),"model", errorResultInstance);
		}
	}
	
//----------------------------------------- get managers-------------------------------------------------------------------------------	
	private ModelAndView getManagers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			LoadManagersRequest	loadManagersRequest =new LoadManagersRequest();
			CommonUtil.populateBeans(aRequest, loadManagersRequest);
			  LoadManagersResult loadManagersResult=getApplicationContextObject().getUserManager().loadManagers(loadManagersRequest);
			  
			  if(loadManagersResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get managers", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", loadManagersResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get managers");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}

//--------------------------------------------- get projects------------------------------------------------------------------------------------------------------
	private ModelAndView getProjects(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			LoadProjectRequest	loadProjectRequest =new LoadProjectRequest();
			CommonUtil.populateBeans(aRequest, loadProjectRequest);
			LoadProjectsResult loadProjectsResult =getApplicationContextObject().getUserManager().loadProjects(loadProjectRequest);
			  
			  if(loadProjectsResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get projects", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", loadProjectsResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get projects");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}

//---------------------------------------------- get clients-----------------------------------------------------------------------------	
	private ModelAndView getClients(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			LoadClientsRequest request =new LoadClientsRequest();
			CommonUtil.populateBeans(aRequest, request);
			LoadClientsResult loadClientsResult=getApplicationContextObject().getUserManager().loadClients(request);
			  
			  if(loadClientsResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get clients", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", loadClientsResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get clients");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}
	
//---------------------------------- get menus by manager----------------------------------------------------------------------------------------------------	
	private ModelAndView getMenusByManager(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			IsSupervisorRequest request =new IsSupervisorRequest();
			CommonUtil.populateBeans(aRequest, request);
			IsSupervisorResult isSupervisorResult=getApplicationContextObject().getUserManager().isSupervisor(request);
			  
			  if(isSupervisorResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get clients", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", isSupervisorResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get clients");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}
//----------------------------------- check module is valid or not-------------------------------------------------------------------------------------	
	private ModelAndView isValidateModule(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			ValidModuleRequest request =new ValidModuleRequest();
			CommonUtil.populateBeans(aRequest, request);
			IsValidModuleResult isValidModuleResult=getApplicationContextObject().getUserManager().isValidModule(request);
			  
			  if(isValidModuleResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get clients", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", isValidModuleResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get clients");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}
	
//---------------------------------- get project groups---------------------------------------------------------------------------------------------	
	private ModelAndView getProjectGroups(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			LoadProjectRequest request =new LoadProjectRequest();
			CommonUtil.populateBeans(aRequest, request);
			LoadProjectsResult loadProjectsResult=getApplicationContextObject().getUserManager().loadProjectGroups(request);
			  
			  if(loadProjectsResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get project groups", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", loadProjectsResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get project groups");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}
	
//---------------------- load menus---------------------------------------------------------------------------------------------	
	private ModelAndView loadMenus(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			LoadMenusRequest request =new LoadMenusRequest();
			CommonUtil.populateBeans(aRequest, request);
			LoadMenusResult loadMenusResult=getApplicationContextObject().getUserManager().loadMenus(request);
			  
			  if(loadMenusResult.getResponseCode()==100)
			  {
				  Result result = handleSuccess("get menus", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("Result", loadMenusResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get menus");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		}catch (IllegalAccessException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		
		}
		return null;
	}
	//---------------------------------------verify password-----------------------------------------------------------------------------------------
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
}
