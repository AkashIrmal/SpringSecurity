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

import com.hovs.rule14.admin.ws.AssignRolestoUsersRequest;
import com.hovs.rule14.admin.ws.AssignRolestoUsersResult;
import com.hovs.rule14.admin.ws.AssignUserPermissionRequest;
import com.hovs.rule14.admin.ws.AssignUserPermissionResult;
import com.hovs.rule14.admin.ws.GetAssignedUsersByRoleRequest;
import com.hovs.rule14.admin.ws.GetAssignedUsersByRoleResult;
import com.hovs.rule14.admin.ws.GetCheckedMenuByUserRequest;
import com.hovs.rule14.admin.ws.GetCheckedMenuByUserResult;
import com.hovs.rule14.admin.ws.GetCurrentUsersByRoleRequest;
import com.hovs.rule14.admin.ws.GetCurrentUsersByRoleResult;
import com.hovs.rule14.admin.ws.GetManagersRequest;
import com.hovs.rule14.admin.ws.GetManagersResult;
import com.hovs.rule14.admin.ws.GetMenuByManagerRequest;
import com.hovs.rule14.admin.ws.GetMenusByManagerResult;
import com.hovs.rule14.admin.ws.GetRoleRequest;
import com.hovs.rule14.admin.ws.GetRolesResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.LoadUsersRequest;
import com.hovs.rule14.admin.ws.LoadUsersResult;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;


@Controller
public class UserPermissionController extends BaseController {
	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value="userpermission.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
        
		switch(cmd){
		case AppConstants.GET_MANAGERS: return getManagers(aRequest,aResponse);
		case AppConstants.LOAD_ROLES: return loadRoles(aRequest,aResponse);
		case AppConstants.LOAD_USERS : return loadUsers(aRequest, aResponse);
		case AppConstants.GET_CHECK_MENUS_BY_USER: return getCheckMenusByUser(aRequest,aResponse);
		case AppConstants.GET_MENUS_BY_MANAGER: return getMenusByManager(aRequest,aResponse);
		case AppConstants.GET_USER_BY_ROLE: return getCurrentUserByRole(aRequest,aResponse);
		case AppConstants.GET_ASSIGNED_USER_BY_ROLE: return getAssignedUsersByRole(aRequest,aResponse);
		case AppConstants.ASSIGNED_ROLE_TO_USER: return assignRolestoCurrentUsers(aRequest,aResponse);
		case AppConstants.ASSIGNED_USER_PERMISSION: return assignUserPermission(aRequest,aResponse);
		case AppConstants.LOAD_ALL_USERS: return loadAllUsers(aRequest,aResponse);
		
		
		}
		
		return  displayDashBoard(aRequest,aResponse);
	}
	

		private ModelAndView displayDashBoard(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
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
					   }
					   catch(Exception ex)
					   {
						   ex.printStackTrace();
					   }
					Map<String,Object> infoMap = new HashMap<String, Object>();
					infoMap.put("userBean", userBean);
			
				if(!aRequest.getServletPath().contains(AppConstants.SIF_SERVLET_PATH))
				   return new ModelAndView("userpermission" , infoMap);
				else
					return new ModelAndView("userpermission" , infoMap);
		}
		
//-------------------------- load roles--------------------------------------------------------------------------------------------------		
		private ModelAndView loadRoles(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetRoleRequest request=new GetRoleRequest();
				request.setUserId(user.getId());
			  request.setClientId(user.getClientId());
			 // CommonUtil.populateBeans(aRequest,request );
			  GetRolesResult getRolesResult=getApplicationContextObject().getRoleManager().getRoles(request);

				if(getRolesResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully load roles.");
					result = handleSuccess("successfully load roles", aRequest,null);
					result.setDetailedMessage("successfully load roles");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getRolesResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to load roles");
					result = handleFailed("failed to load roles", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}

//---------------------------------- Get managers-------------------------------------------------------------------------------------------------		
		private ModelAndView getManagers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			try{
				  Result result ;
				GetManagersRequest	getManagersRequest =new GetManagersRequest();
				User user = getApplicationContextObject().getUserPrincipal().getUser();
				//CommonUtil.populateBeans(aRequest, getManagersRequest);
				getManagersRequest.setClientId(user.getClientId());
				getManagersRequest.setIsAdmin(user.getIsAdmin());
				getManagersRequest.setUserId(user.getId());

				GetManagersResult getManagersResult=getApplicationContextObject().getRoleManager().getManagers(getManagersRequest);
				  
					if(getManagersResult.getResponseCode() == AppConstants.ResponseCode.Success.value())
				  {
					   result = handleSuccess("get managers", aRequest,null);
						 Map<String, Object> customParams = new HashMap<String,Object>();
						 customParams.put("data", getManagersResult);
						 result.setCustomParams(customParams);
						 mLogger.debug("get managers");
						 return new ModelAndView(getView(),"model",result);
				 
				  }
					else{
						mLogger.debug(" failed to load managers");
						result = handleFailed("failed to load manager", aRequest,null);
						return new ModelAndView(getView(),"model",result);
					}
			} catch (WsException_Exception e) {
				e.printStackTrace();
				Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
				return new ModelAndView(getView(),"model", errorResultInstance);
			}
			
		}
		
// --------------------------------------- Load users------------------------------------------------------------------------------------------------------
		private ModelAndView loadUsers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			try{
				  Result result ;
				  LoadUsersRequest	request =new LoadUsersRequest();
				User user = getApplicationContextObject().getUserPrincipal().getUser();
				CommonUtil.populateBeans(aRequest, request);
			
				request.setClientId(user.getClientId());
				request.setIsSupervisor(user.getIsSupervisor());
				request.setFromRow(-1);
				request.setToRow(-1);
		/*		request.setLoginName("-1");
				request.setEmailId("-1");
			
				request.setClientName("-1");
				request.setUserName("-1");*/
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
		
//---------------------------------- Get menus by userId ---------------------------------------------------------------------------------------------------		
		private ModelAndView getCheckMenusByUser(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetCheckedMenuByUserRequest request=new GetCheckedMenuByUserRequest();
			  CommonUtil.populateBeans(aRequest,request );
			  //request.setUserId(user.getId());
			  
			  GetCheckedMenuByUserResult getCheckedMenuByUserResult=getApplicationContextObject().getRoleManager().getCheckedMenusByUser(request);

				if(getCheckedMenuByUserResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get check menu by user.");
					result = handleSuccess("successfully get check menus by user", aRequest,null);
					result.setDetailedMessage("successfully get check menus by user");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getCheckedMenuByUserResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to get check menus by user");
					result = handleFailed("failed to get check menus by user", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
		
//------------------------------------------------- Get Menus by managerId--------------------------------------------------------------------
		private ModelAndView getMenusByManager(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetMenuByManagerRequest request=new GetMenuByManagerRequest();
			  CommonUtil.populateBeans(aRequest,request );
			 // request.setUserId(user.getId());
			  
			  GetMenusByManagerResult getMenusByManagerResult=getApplicationContextObject().getRoleManager().getMenusByManager(request);

				if(getMenusByManagerResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get menus by manager.");
					result = handleSuccess("successfully get menus by manager", aRequest,null);
					result.setDetailedMessage("successfully get menus by manager");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getMenusByManagerResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to menus by manager");
					result = handleFailed("failed to menus by manager", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
		
//----------------------------------------------------- Get current user by role------------------------------------------------------------------------		
		private ModelAndView getCurrentUserByRole(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetCurrentUsersByRoleRequest request=new GetCurrentUsersByRoleRequest();
			  CommonUtil.populateBeans(aRequest,request );
			 // request.setUserId(user.getId());
			  
			  GetCurrentUsersByRoleResult getCurrentUsersByRoleResult=getApplicationContextObject().getRoleManager().getCurrentUsersByRole(request);

				if(getCurrentUsersByRoleResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get user by role.");
					result = handleSuccess("successfully get user by role", aRequest,null);
					result.setDetailedMessage("successfully get user by role");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getCurrentUsersByRoleResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to get user by role");
					result = handleFailed("failed to get user by role", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
		
//----------------------------------- Get assigned users by role-------------------------------------------------------------------------------------		
		private ModelAndView getAssignedUsersByRole(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetAssignedUsersByRoleRequest request=new GetAssignedUsersByRoleRequest();
			  CommonUtil.populateBeans(aRequest,request );
			 // request.setUserId(user.getId());
			  
			  GetAssignedUsersByRoleResult getAssignedUsersByRoleResult=getApplicationContextObject().getRoleManager().getAssignedUsersByRole(request);

				if(getAssignedUsersByRoleResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get assigned user by role.");
					result = handleSuccess("successfully get assigned user by role", aRequest,null);
					result.setDetailedMessage("successfully get assigned user by role");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getAssignedUsersByRoleResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to get assigned user by role");
					result = handleFailed("failed to get assigned user by role", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
		
//--------------------------------------------------- Assign role to current user----------------------------------------------------------------------------------------------		
		private ModelAndView assignRolestoCurrentUsers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				AssignRolestoUsersRequest request=new AssignRolestoUsersRequest();
			  CommonUtil.populateBeans(aRequest,request );
			  request.setUserId(user.getId());
			  
			  AssignRolestoUsersResult assignRolestoUsersResult=getApplicationContextObject().getRoleManager().assignRolestoCurrentUsers(request);

				if(assignRolestoUsersResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully  assigned role to user.");
					result = handleSuccess("successfully assigned role to user.", aRequest,null);
					result.setDetailedMessage("successfully assigned role to user");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", assignRolestoUsersResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to assigned role to user");
					result = handleFailed("failed to assigned role to user", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
//----------------------------------- Assign user permission------------------------------------------------------------------------------------------		
		private ModelAndView assignUserPermission(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				AssignUserPermissionRequest request=new AssignUserPermissionRequest();
			  CommonUtil.populateBeans(aRequest,request );
			//  request.setUserId(user.getId());
			  
			  AssignUserPermissionResult assignUserPermissionResult=getApplicationContextObject().getRoleManager().assignUserPermissions(request);

				if(assignUserPermissionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully  assigned user permission.");
					result = handleSuccess("successfully assigned user permission.", aRequest,null);
					result.setDetailedMessage("successfully assigned user permission.");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", assignUserPermissionResult);
					 result.setCustomParams(customParams);
					 return new ModelAndView(getView(),"model",result);
				}
				else{
					mLogger.debug(" failed to assigned user permission.");
					result = handleFailed("failed to assigned user permission.", aRequest,null);
					return new ModelAndView(getView(),"model",result);
				}
				   }
				   catch(Exception ex)
				   {
					   ex.printStackTrace();
					   Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, ex);
						return new ModelAndView(getView(),"model", errorResultInstance);
				   }

				
		}
		
		
// --------------------------------------- Load all users------------------------------------------------------------------------------------------------------
				private ModelAndView loadAllUsers(HttpServletRequest aRequest,HttpServletResponse aResponse) {
					try{
						  Result result ;
						  LoadUsersRequest	request =new LoadUsersRequest();
						User user = getApplicationContextObject().getUserPrincipal().getUser();
						//CommonUtil.populateBeans(aRequest, request);
					
						request.setClientId(user.getClientId());
						request.setUserId(-1);
				/*		request.setLoginName("-1");
						request.setEmailId("-1");
					
						request.setClientName("-1");
						request.setUserName("-1");*/
						LoadUsersResult loadUsersResult=getApplicationContextObject().getUserManager().loadAllUsers(request);
						  
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
					} catch (WsException_Exception e) {
						e.printStackTrace();
						Result errorResultInstance = handleError(e.getMessage(), aRequest, e);
						return new ModelAndView(getView(),"model", errorResultInstance);
					} 
					
				}
}
