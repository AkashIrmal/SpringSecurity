package com.hovs.sfi.controller;

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

import com.hovs.rule14.admin.ws.AssignMenuPermissionRequest;
import com.hovs.rule14.admin.ws.AssignMenuPermissionResult;
import com.hovs.rule14.admin.ws.GetCheckedMenuByRoleResult;
import com.hovs.rule14.admin.ws.GetCheckedMenusByRoleRequest;
import com.hovs.rule14.admin.ws.GetManagersRequest;
import com.hovs.rule14.admin.ws.GetManagersResult;
import com.hovs.rule14.admin.ws.GetMenuByRoleRequest;
import com.hovs.rule14.admin.ws.GetMenusByRolesResult;
import com.hovs.rule14.admin.ws.GetRoleRequest;
import com.hovs.rule14.admin.ws.GetRolesResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;


@Controller
public class SetUpRoleController extends BaseController {
	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value="setuprole.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
        
		switch(cmd){
		case AppConstants.GET_MANAGERS: return getManagers(aRequest,aResponse);
		case AppConstants.LOAD_ROLES: return loadRoles(aRequest,aResponse);
		case AppConstants.GET_MENUS_BY_ROLE: return getMenusByRole(aRequest,aResponse);
		case AppConstants.GET_CHECK_MENUS_BY_ROLE: return getCheckMenusByRole(aRequest,aResponse);
		case AppConstants.ASSIGN_MENU_PERMISSION: return assignMenuPermissions(aRequest,aResponse);
		
		
		
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
				   return new ModelAndView("setuprole" , infoMap);
				else
					return new ModelAndView("setuprole" , infoMap);
		}
		
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
		
		
		private ModelAndView getMenusByRole(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetMenuByRoleRequest request=new GetMenuByRoleRequest();
				CommonUtil.populateBeans(aRequest,request );
			    GetMenusByRolesResult getMenusByRolesResult=getApplicationContextObject().getRoleManager().getMenusByRole(request);

				if(getMenusByRolesResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get menu by role.");
					result = handleSuccess("successfully load roles", aRequest,null);
					result.setDetailedMessage("successfully get menu by role");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getMenusByRolesResult);
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
		
		private ModelAndView getCheckMenusByRole(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				GetCheckedMenusByRoleRequest request=new GetCheckedMenusByRoleRequest();
			  CommonUtil.populateBeans(aRequest,request );
			  request.setUserId(user.getId());
			  
			  GetCheckedMenuByRoleResult getCheckedMenuByRoleResult=getApplicationContextObject().getRoleManager().getCheckedMenusByRole(request);

				if(getCheckedMenuByRoleResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get check menu by role.");
					result = handleSuccess("successfully get check menus by role", aRequest,null);
					result.setDetailedMessage("successfully get check menus by role");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getCheckedMenuByRoleResult);
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
		
		private ModelAndView assignMenuPermissions(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
		  try {
				Result result;
				AssignMenuPermissionRequest request=new AssignMenuPermissionRequest();
			    CommonUtil.populateBeans(aRequest,request );
			    request.setUserId(user.getId());
			  
			  AssignMenuPermissionResult assignMenuPermissionResult=getApplicationContextObject().getRoleManager().assignMenuPermissions(request);

				if(assignMenuPermissionResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					mLogger.debug("successfully get check menu by role.");
					result = handleSuccess("successfully get check menus by role", aRequest,null);
					result.setDetailedMessage("successfully get check menus by role");
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", assignMenuPermissionResult);
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
		
}
