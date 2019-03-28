package com.hovs.sfi.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.hovs.sfi.auth.AuthConstants;
import com.hovs.sfi.auth.UserPrincipalImpl;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.config.ApplicationContext;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.util.HttpUtil;
import com.hovs.sfi.view.CustomViewResolver;
import com.hovs.sfi.view.forms.LoginForm;

@Controller
public abstract class BaseController extends AbstractController{
	
	public abstract ModelAndView processRequest(HttpServletRequest aRequest,HttpServletResponse aResponse);
	private Log logger = LogFactory.getLog(getClass()); 
	
	@Autowired
	ApplicationContext mApplicationContextObject;
	
	

	public ApplicationContext getApplicationContextObject() {
		return mApplicationContextObject;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest aRequest,HttpServletResponse aResponse) throws Exception {
		 CommonUtil.startLogger(logger, "Handle request for " + getClass().getName());
		 ModelAndView modelAndView = processRequest(aRequest, aResponse);
		 CommonUtil.endLogger(logger, "Handle request for " + getClass().getName());
		 return modelAndView;
	}

	/*public boolean isSessionAuthenticated(){
		HttpServletRequest request  = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		if(getApplicationContextObject().getSessionRegistry() != null ){
			SessionInformation sessionInformation = getApplicationContextObject().getSessionRegistry().getSessionInformation(request.getSession().getId());
			if(sessionInformation != null && sessionInformation.getPrincipal() != null){
				if(request.isUserInRole(String.valueOf(AuthConstants.ROLE_AUTH_USER))){
					logger.info("User is already logged in, with username " + ((UserPrincipalImpl)sessionInformation.getPrincipal()).getUsername());
					return true;
				}
			}
		}
		return false;
	}
	*/
	/**
	 * Method responsible to build the Result object with error information.
	 * @param messageKey
	 * @param request
	 * @param throwableInstance
	 * @return
	 */
	public Result handleError(String messageKey , HttpServletRequest request,Throwable throwableInstance){
		String detailedMessage = getMessageForKey(messageKey, null);
		Result result = new Result();
		result.setSuccess(false);
		result.setMessageKey(messageKey);
		result.setDetailedMessage(detailedMessage);
		result.setReturnCode(AppConstants.RESULT_CODE_APPLICATION_ERROR);
		result.setSessionId(request.getSession(true).getId());
		result.setException(throwableInstance.getMessage());
		result.setOperatingSystem(HttpUtil.getClientOperatingSystem(request));
		result.setBrowser(HttpUtil.getBrowserInfo(request));
		logger.debug(result.toString());
		logger.error(messageKey , throwableInstance);
		return result;
	}
	
	public Result handleSuccess(String messageKey , HttpServletRequest request,Object[] args){
		String detailedMessage = getMessageForKey(messageKey, args);
		Result result = new Result();
		result.setSuccess(true);
		result.setMessageKey(messageKey);
		result.setDetailedMessage(detailedMessage);
		result.setReturnCode(AppConstants.RESULT_CODE_SUCCESS);
		result.setSessionId(request.getSession(true).getId());
		result.setOperatingSystem(HttpUtil.getClientOperatingSystem(request));
		result.setBrowser(HttpUtil.getBrowserInfo(request));
		return result;
	}
	
	protected String getMessageForKey(String messageKey, Object[] args) {
		Map<String,String> messageMap = null;
		return CommonUtil.getMessageForKey(messageKey, args, messageMap, getApplicationContextObject().getMessageSource());
	}
	
	public ModelAndView invalidCMD(HttpServletRequest request , HttpServletResponse response){
		return new ModelAndView(getView(), "model" , "Invalid CMD");
	}
	/**
	 * 
	 * @return CustomViewResolver
	 */
	public CustomViewResolver getView(){
		return new CustomViewResolver();
	}
	
	public boolean isSessionAuthenticated(){
		HttpServletRequest request  = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		if(getApplicationContextObject().getSessionRegistry() != null ){
			SessionInformation sessionInformation = getApplicationContextObject().getSessionRegistry().getSessionInformation(request.getSession().getId());
			if(sessionInformation != null && sessionInformation.getPrincipal() != null){
				//if(request.isUserInRole(String.valueOf(AuthConstants.ROLE_AUTH_USER))){
					logger.info("User is already logged in, with username " + ((UserPrincipalImpl)sessionInformation.getPrincipal()).getUsername());
					return true;
				//}
			}
		}
		return false;
	}
	
	public String getRedirectUrlIsSessionAuthenticate(){
		HttpServletRequest request  = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		SessionInformation sessionInformation = getApplicationContextObject().getSessionRegistry().getSessionInformation(request.getSession().getId());
		User lUser = ((UserPrincipalImpl)sessionInformation.getPrincipal()).getUser();
		  
		if(lUser.getIsAdmin().equalsIgnoreCase("Y")){
			return "/user.do";
		}else{
			return "/home.do";
		}
		
		
	}
	
	
	
	/**
	 * 
	 * @param loginForm
	 * @param messageKey
	 * @return
	 */
	protected ModelAndView loginPageView(LoginForm loginForm, String messageKey){
		loginForm.setDebugUI(getApplicationContextObject().getAppProperties().isDebugUI());
		String detailedMessage = getMessageForKey(messageKey, null);
		loginForm.setDetailedMessage(detailedMessage);
		Map<String, Object> modelMap = new HashMap<String,Object>();
		modelMap.put("loginForm", loginForm);
		return new ModelAndView("login", modelMap);
	}
	
	/**
	 * Method is responsible to build the Result object with Failed information.
	 * @param messageKey
	 * @param request
	 * @param args
	 * @return
	 */
	
	public Result handleFailed(String messageKey , HttpServletRequest request,Object[] args){
		String detailedMessage = getMessageForKey(messageKey, args);
		Result result = new Result();
		result.setSuccess(false);
		result.setMessageKey(messageKey);
		result.setDetailedMessage(detailedMessage);
		result.setReturnCode(AppConstants.RESULT_CODE_FAILED);
		result.setSessionId(request.getSession(true).getId());
		result.setOperatingSystem(HttpUtil.getClientOperatingSystem(request));
		result.setBrowser(HttpUtil.getBrowserInfo(request));
		return result;
	}
}
