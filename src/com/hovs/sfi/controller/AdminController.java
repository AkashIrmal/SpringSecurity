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

import com.hovs.rule14.admin.ws.GetClientListRequest;
import com.hovs.rule14.admin.ws.GetClientListResult;
import com.hovs.rule14.admin.ws.InActivateRoleRequest;
import com.hovs.rule14.admin.ws.InActivateRoleResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.LoadRoleRequest;
import com.hovs.rule14.admin.ws.LoadRolesResult;
import com.hovs.rule14.admin.ws.Role;
import com.hovs.rule14.admin.ws.SaveUpdateRoleRequest;
import com.hovs.rule14.admin.ws.SaveorUpdateRoleResult;
import com.hovs.rule14.sfi.ws.GetSfiW9FormRequest;
import com.hovs.rule14.sfi.ws.GetSfiW9FormResponse;
import com.hovs.rule14.sfi.ws.GetSfiW9PdfResponse;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller
//@PropertySource("classpath:properties/application.properties")
public class AdminController extends BaseController {
	private Log mLogger = LogFactory.getLog(getClass());
	
	/*private static final ResourceBundle resouces  = ResourceBundle.getBundle("application");
	
	@Value("${FilledpdfFile}")
	private String tempFileLocation="D:/abc/";// = resouces.getString("FilledpdfFile");
	
	@Value("${sfi_w9_form}")
	private static String SFI_W9_FORM = "/WEB-INF/template/formpdf/fw9.pdf";// = resouces.getString("sfi_w9_form");;
*/	
	
	@Override
	@RequestMapping(value={"/role.do","/view.do"},method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
        
		switch(cmd){
		case AppConstants.LOAD_ROLES: return loadRoles(aRequest,aResponse);
		case AppConstants.GET_CLIENTS_BY_USER : return getClientsByUser(aRequest, aResponse);
		case AppConstants.SAVE_OR_UPDATE_ROLE :return saveOrUpdateRole(aRequest, aResponse);
		case AppConstants.IN_ACTIVATE_ROLE :return inActivateROle(aRequest, aResponse);
		case AppConstants.GET_TIN_PAYER_DATA :return getTINPayerData(aRequest, aResponse);
		case AppConstants.GET_W9_PDF_DATA :return getW9PdfData(aRequest, aResponse);
		
		}
		
		return  displayDashBoard(aRequest,aResponse);
		 
	
	}
	
	
	//-------------------------Display Admin Dashboard---------------------------------------------------------------------------
	private ModelAndView displayDashBoard(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		UserBean userBean = new UserBean();
		User user = getApplicationContextObject().getUserPrincipal().getUser();
		userBean.setLoginName(user.getLoginName());
		userBean.setClientId(user.getClientId());
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
			if(!aRequest.getServletPath().contains(AppConstants.VIEW_W_9_SEARCH_SERVLET_PATH))
				
			   return new ModelAndView("admin" , infoMap);
			else
				return new ModelAndView("w-9_form_search" , infoMap);
	}
	
	//--------------------------Get roles by cilentId---------------------------------------------------------------------------
	private ModelAndView loadRoles(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		UserBean userBean = new UserBean();
		User user = getApplicationContextObject().getUserPrincipal().getUser();
		userBean.setLoginName(user.getLoginName());
	  try {
			Result result;
		  LoadRoleRequest request=new LoadRoleRequest();
		  request.setClientId(user.getClientId());
		 // CommonUtil.populateBeans(aRequest,request );
		  LoadRolesResult loadRolesResult=getApplicationContextObject().getUserManager().loadRoles(request);

			if(loadRolesResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
				mLogger.debug("successfully load roles.");
				result = handleSuccess("successfully load roles", aRequest,null);
				result.setDetailedMessage("successfully load roles");
				 Map<String, Object> customParams = new HashMap<String,Object>();
				 customParams.put("data", loadRolesResult);
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
	
	
	//--------------------------Get clients by userId---------------------------------------------------------------------------
	private ModelAndView getClientsByUser(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			 Result result ;
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			GetClientListRequest request =new GetClientListRequest();
			
			request.setUserId(user.getClientId());
			request.setIsAdmin(user.getIsAdmin());
		GetClientListResult getClientListResult=getApplicationContextObject().getUserManager().getClientListByUser(request);
			  
		if(getClientListResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
			  
				   result = handleSuccess("get clients by user", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", getClientListResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("get clients by user");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		else{
			mLogger.debug(" failed to get clients");
			result = handleFailed("failed to get clients", aRequest,null);
			return new ModelAndView(getView(),"model",result);
		}
		}catch (Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} 
	
	}
	
//--------------------------save or update role---------------------------------------------------------------------------
	private ModelAndView saveOrUpdateRole(HttpServletRequest aRequest,HttpServletResponse aResponse) {
		try{
			 Result result ;

			 SaveUpdateRoleRequest request =new SaveUpdateRoleRequest();
			 Role lRole = new Role();
			 lRole.setActive(aRequest.getParameterValues("role[active]")[0].toString());
			 lRole.setRoleId(Integer.parseInt(aRequest.getParameterValues("role[roleId]")[0].toString()));
			 lRole.setClientId(Integer.parseInt(aRequest.getParameterValues("role[clientId]")[0].toString()));
			 lRole.setRoleName(aRequest.getParameterValues("role[roleName]")[0].toString());
			 
			 request.setRole(lRole);
			 request.setUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
		
			SaveorUpdateRoleResult saveorUpdateRoleResult=getApplicationContextObject().getUserManager().saveOrUpdateRole(request);
			  
		  if(saveorUpdateRoleResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
			  
				   result = handleSuccess("successfully save or update role", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", saveorUpdateRoleResult);
					 result.setCustomParams(customParams);
					 mLogger.debug("save or update role ");
					 return new ModelAndView(getView(),"model",result);
			 
			  }
		else{
			mLogger.debug(" failed to save role");
			result = handleFailed("failed to save role", aRequest,null);
			return new ModelAndView(getView(),"model",result);
		}
		}catch (Exception e) {
			e.printStackTrace();
			Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
			return new ModelAndView(getView(),"model", errorResultInstance);
		} 
	
	}
	
	
	//--------------------------InActivate role---------------------------------------------------------------------------
		private ModelAndView inActivateROle(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			try{
				 Result result ;

				 InActivateRoleRequest request =new InActivateRoleRequest();
				 CommonUtil.populateBeans(aRequest,request );
				 InActivateRoleResult inActivateRoleResult=getApplicationContextObject().getRoleManager().inActivateRoles(request);
				  
			  if(inActivateRoleResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
				  
					   result = handleSuccess("successfully inactivate role", aRequest,null);
						 Map<String, Object> customParams = new HashMap<String,Object>();
						 customParams.put("data", inActivateRoleResult);
						 result.setCustomParams(customParams);
						 mLogger.debug("inactivate role ");
						 return new ModelAndView(getView(),"model",result);
				 
				  }
			else{
				mLogger.debug(" failed to inactivate role");
				result = handleFailed("failed to inactivate role", aRequest,null);
				return new ModelAndView(getView(),"model",result);
			}
			}catch (Exception e) {
				e.printStackTrace();
				Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
				return new ModelAndView(getView(),"model", errorResultInstance);
			} 
		
		}
		
		
		//-------------------------- Get W-9 form Data---------------------------------------------------------------------------
				private ModelAndView getTINPayerData(HttpServletRequest aRequest,HttpServletResponse aResponse) {
					try{
						 Result result ;

						 GetSfiW9FormRequest request =new GetSfiW9FormRequest();
						 CommonUtil.populateBeans(aRequest,request );
						 if(request.getFromYear()==null || request.getFromYear()==0)
						 {
							 request.setFromYear(2000);
						 }
						 if(request.getToYear()==null || request.getToYear()==0)
						 {
							 request.setToYear(2075);
						 }
						 if(request.getEmailId()==null || request.getEmailId()=="")
						 {
							 request.setEmailId("-1");
						 }
						 
						 if(request.getTin()==null || request.getTin()=="")
						 {
							 request.setTin("-1");
						 }
						 if(request.getName()==null || request.getName()=="")
						 {
							 request.setName("-1");
						 }
						 GetSfiW9FormResponse getSfiW9FormResponse=getApplicationContextObject().getTinValidationManager().getTINPayerData(request);
						  
					  if(getSfiW9FormResponse.getResponseCode() == AppConstants.ResponseCode.Success.value()){
						  
							   result = handleSuccess("successfully get W-9 form data", aRequest,null);
								 Map<String, Object> customParams = new HashMap<String,Object>();
								 customParams.put("data", getSfiW9FormResponse);
								 result.setCustomParams(customParams);
								 mLogger.debug("successfully get W-9 form data ");
								 return new ModelAndView(getView(),"model",result);
						 
						  }
					else{
						mLogger.debug(" failed to get W-9 form data");
						result = handleFailed("failed to get W-9 form data", aRequest,null);
						return new ModelAndView(getView(),"model",result);
					}
					}catch (Exception e) {
						e.printStackTrace();
						Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
						return new ModelAndView(getView(),"model", errorResultInstance);
					} 
				
		}
				
//-------------------------- Get W-9 Pdf Data---------------------------------------------------------------------------
				private ModelAndView getW9PdfData(HttpServletRequest aRequest,HttpServletResponse aResponse) {
					try{
						 Result result ;

						 GetSfiW9FormRequest request =new GetSfiW9FormRequest();
						 CommonUtil.populateBeans(aRequest,request );
						/* if(request.getFromYear()==null || request.getFromYear()==0)
						 {
							 request.setFromYear(2000);
						 }
						 if(request.getToYear()==null || request.getToYear()==0)
						 {
							 request.setToYear(2075);
						 }
						 if(request.getEmailId()==null || request.getEmailId()=="")
						 {
							 request.setEmailId("-1");
						 }
						 
						 if(request.getTin()==null || request.getTin()=="")
						 {
							 request.setTin("-1");
						 }
						 if(request.getName()==null || request.getName()=="")
						 {
							 request.setName("-1");
						 }*/
						 GetSfiW9PdfResponse getSfiW9PdfResponse=getApplicationContextObject().getTinValidationManager().getW9PdfData(request);
						  
					  if(getSfiW9PdfResponse.getResponseCode() == AppConstants.ResponseCode.Success.value()){
						     result = handleSuccess("successfully get W-9 form data", aRequest,null);
								 Map<String, Object> customParams = new HashMap<String,Object>();
								 if(request.isDownloadFlag()){
									 customParams.put("base64",getSfiW9PdfResponse.getBase64String()); 
									 customParams.put("fileName",getSfiW9PdfResponse.getFirstName());
								 }else{
									 customParams.put("data", getSfiW9PdfResponse); 
								 }
								 result.setCustomParams(customParams);
								 mLogger.debug("successfully get W-9 form data ");
								 return new ModelAndView(getView(),"model",result);
						  }
					else{
						mLogger.debug(" failed to get W-9 form data");
						result = handleFailed("failed to get W-9 form data", aRequest,null);
						return new ModelAndView(getView(),"model",result);
					}
					}catch (Exception e) {
						e.printStackTrace();
						Result errorResultInstance = handleError("msg_failed_populateBeans", aRequest, e);
						return new ModelAndView(getView(),"model", errorResultInstance);
					} 
				
				}
}
