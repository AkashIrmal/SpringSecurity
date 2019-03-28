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

import com.hovs.rule14.admin.ws.AccountType;
import com.hovs.rule14.admin.ws.AccountTypeResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.rule14.sfi.ws.SfiPrintReportResponse;
import com.hovs.rule14.sfi.ws.SfiReportRequest;
import com.hovs.rule14.sfi.ws.SfiReportResponse;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller
public class ReportController extends BaseController {
	
	private Log mLogger = LogFactory.getLog(getClass());
	
	int imode = 0 ;

	@Override
	@RequestMapping(value={"/report.do","/currentfileupdate.do","/lawfirmreport.do","/businessreport.do","/userinformationreport.do","/legalnamereport.do","/customerreport.do","/validw9report.do","/invalidw9report.do","/transmissionreport.do","/useridlistreport.do","/billingreport.do"},method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		switch (aRequest.getServletPath()) {
			
		case "/"+AppConstants.CURRENT_FILE_UPDATE_SERVLET_PATH:
			imode=1;
			break;
			
		case "/"+AppConstants.CUSTOMER_REPORT_SERVLET_PATH:
			imode=8;
			break;
			
		case "/"+AppConstants.VALIDW9_REPORT_SERVLET_PATH:
			imode=2;
			break;	
			
		case "/"+AppConstants.INVALIDW9_REPORT_SERVLET_PATH:
			imode=2;
			break;		
			
		case "/"+AppConstants.LAWFIRM_REPORT_SERVLET_PATH:
			imode=3;
			break;
			
		case "/"+AppConstants.LEGALNAME_REPORT_SERVLET_PATH:
			imode=4;
			break;
		
		case "/"+AppConstants.BUSINESS_REPORT_SERVLET_PATH:
			imode=4;
			break;
			
		case "/"+AppConstants.USER_INFORMATION_REPORT_SERVLET_PATH:
			imode=5;
			break;
			
		case "/"+AppConstants.TRANSMISSION_REPORT_SERVLET_PATH:
			imode=6;
			break;
			
		case "/"+AppConstants.USERID_LISTING_REPORT_SERVLET_PATH:
			imode=7;
			break;	
			
		case "/"+AppConstants.BILLING_REPORT_SERVLET_PATH:
			imode=9;
			break;
		
			
		/*
		case "/"+AppConstants.BILLING_REPORT_SERVLET_PATH:
			imode=10;
			break;
			
		case "/"+AppConstants.EMAIL_REPORT_SERVLET_PATH:
			imode=8;
			break;
			
		case "/"+AppConstants.INVENTORY_REPORT_SERVLET_PATH:
			imode=9;
			break;	
			
		*/	
		}
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
		
		switch(cmd){
		case AppConstants.GETSFIREPORT :return getSfiReport(aRequest, aResponse);
		case AppConstants.PRINTSFIREPORT :return printSfiReport(aRequest, aResponse);
		}
		
	
		return  displayDashBoard(aRequest,aResponse);
	}
	
//--------------------------------------------Print SFI Report---------------------------------------------------
	
		private ModelAndView printSfiReport(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			try{
				SfiReportRequest ReportRequest = new SfiReportRequest();
				ReportRequest.setAdminUserId(getApplicationContextObject().getUserPrincipal().getUser().getId());
				ReportRequest.setImode(imode);
				ReportRequest.setReportType(aRequest.getServletPath());
			    CommonUtil.populateBeans(aRequest, ReportRequest);
			    
			    
			    mLogger.debug("Processing Request To Print Reports For SFI Admin");
			    SfiPrintReportResponse reportResponse = getApplicationContextObject().getReportSfiManager().printSfiReport(ReportRequest);
			    
			    if(reportResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
					 Result result = handleSuccess("msg_success_Print_Operation", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", reportResponse.getBase64String());
					 customParams.put("status", reportResponse.isResult());
					 customParams.put("dataAvailable", reportResponse.isDataAvailable());
					 result.setCustomParams(customParams);
					 mLogger.debug("success to Print report details.");
					 return new ModelAndView(getView(),"model",result);
				 }else {
					 mLogger.debug("Failed to print reports details.");
					 Result handleError = handleFailed("msg_failed_to_print_Details_For_Report_Generation", aRequest , null);
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
			}catch (com.hovs.rule14.sfi.ws.WsException_Exception aEWsException_Exception) {
				Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
				return new ModelAndView(getView(),"model", errorResultInstance);
			}
		
	}
		
//--------------------------------------------Display SFI Report---------------------------------------------------

		private ModelAndView getSfiReport(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			try{
				SfiReportRequest ReportRequest = new SfiReportRequest();
				ReportRequest.setImode(imode);
				ReportRequest.setReportType(aRequest.getServletPath());
			    CommonUtil.populateBeans(aRequest, ReportRequest);
			    
			    mLogger.debug("Processing Request To Generate Reports For SFI Admin");
			    SfiReportResponse reportResponse = getApplicationContextObject().getReportSfiManager().getReportDetails(ReportRequest);
			    
			    if(reportResponse.getResponseCode() == AppConstants.ResponseCode.Success.value() ){
					 Result result = handleSuccess("msg_success_get_Details_To_Generate_Report_Operation", aRequest,null);
					 Map<String, Object> customParams = new HashMap<String,Object>();
					 customParams.put("data", reportResponse.getLSfiReportDto());
					 customParams.put("reportType", reportResponse.getReportType());
					 customParams.put("orderByColumns", reportResponse.getLSortCriteriaForReportDto());
					 result.setCustomParams(customParams);
					 mLogger.debug("success to get details to generate reports.");
 					 return new ModelAndView(getView(),"model",result);
				 }else {
					 mLogger.debug("Failed to get details to generate reports.");
					 Result handleError = handleFailed("msg_failed_get_Details_For_Report_Generation", aRequest , null);
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
			}catch (com.hovs.rule14.sfi.ws.WsException_Exception aEWsException_Exception) {
				Result errorResultInstance = handleError("msg_failed_invoke_webservice", aRequest, aEWsException_Exception);
				return new ModelAndView(getView(),"model", errorResultInstance);
			}
		}
		
//-------------------------Display Admin Dashboard---------------------------------------------------------------------------
		
		private ModelAndView displayDashBoard(HttpServletRequest aRequest,HttpServletResponse aResponse) {
			UserBean userBean = new UserBean();
			User user = getApplicationContextObject().getUserPrincipal().getUser();
			userBean.setLoginName(user.getLoginName());
			userBean.setReportPath(aRequest.getServletPath());
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
				   catch(Exception ex){
					   ex.printStackTrace();
				   }
		  
		  
				  try {
					   mLogger.debug("Loading Account Type List");
					   AccountTypeResult lAccountTypeResult = getApplicationContextObject().getUserManager().getAccountTypeList();
					   if(lAccountTypeResult.getResponseCode() == AppConstants.ResponseCode.Success.value()){
					      mLogger.debug("Successfully loading KBA question list");
					      AccountType type =new AccountType();
					      type.setAccountType("All");
					      type.setAccountTypeDesc("All");
					      type.setActive("Y");
					      type.setId(-1);
					      lAccountTypeResult.getAccountTypeList().add(type);
					      userBean.setAccountTypeList(lAccountTypeResult.getAccountTypeList());
					      
					   }
				   }catch (WsException_Exception e) {
					  mLogger.debug("Exception Occured while loading KBA question list");
					 e.printStackTrace();
				  }
				Map<String,Object> infoMap = new HashMap<String, Object>();
				infoMap.put("userBean", userBean);
				
				switch (aRequest.getServletPath()) {
				
					case "/"+AppConstants.CURRENT_FILE_UPDATE_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.CUSTOMER_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.VALIDW9_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.INVALIDW9_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);	
						
					case "/"+AppConstants.LAWFIRM_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.LEGALNAME_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
					
					case "/"+AppConstants.BUSINESS_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.TRANSMISSION_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.USERID_LISTING_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);		
						
					case "/"+AppConstants.EMAIL_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);
						
					case "/"+AppConstants.INVENTORY_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);	
						
					case "/"+AppConstants.BILLING_REPORT_SERVLET_PATH:
						return new ModelAndView("Reports" , infoMap);	
					
						default:
							return new ModelAndView("Reports" , infoMap);
				}
		}
}
