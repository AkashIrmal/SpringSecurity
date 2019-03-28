package com.hovs.sfi.controller;

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

import com.hovs.rule14.admin.ws.ChangePasswordRequest;
import com.hovs.rule14.admin.ws.ChangePasswordResult;
import com.hovs.sfi.auth.AuthenticationPasswordEncoder;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.common.Result;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.view.forms.UserBean;

@Controller("tier2AdminAuthController")
public class Tier2AdminAuthController extends BaseController {


	private Log mLogger = LogFactory.getLog(getClass());
	
	@Override
	@RequestMapping(value="/tier2Admin.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		String cmd = ServletRequestUtils.getStringParameter(aRequest, "cmd", AppConstants.UNKNOWN_REQUEST_CMD);
		switch(cmd){
		case AppConstants.VERIFY_PASSWORD : return verifyCurrentPassword(aRequest,aResponse);
		case AppConstants.CMD_SET_NEW_PASSWORD : return updatePassword(aRequest,aResponse);
		}
		return displayTier2Page(aRequest,aResponse);
	}

	private ModelAndView updatePassword(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		try {

			ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest();
			CommonUtil.populateBeans(aRequest, changePasswordRequest);
			changePasswordRequest.setLoginName(getApplicationContextObject().getUserPrincipal().getUser().getLoginName());
			changePasswordRequest.setOldPassword(getApplicationContextObject().getUserPrincipal().getUser().getPassword());
			
			AuthenticationPasswordEncoder authPassEncoder = new AuthenticationPasswordEncoder();
			String encodedNewPassword = authPassEncoder.encodePassword(changePasswordRequest.getNewPassword(),changePasswordRequest.getLoginName());
			changePasswordRequest.setNewPassword(encodedNewPassword);
			changePasswordRequest.setConfirmPassword(encodedNewPassword);

			// Call change password method of web service layer.
			ChangePasswordResult lChangePasswordResult = getApplicationContextObject().getUserManager().changePasswordAdminUser(changePasswordRequest);

			if (lChangePasswordResult.getResponseCode() == AppConstants.ResponseCode.Success.value()) {
				Result result = handleSuccess("msg_success_set_new_password",aRequest, null);
				return new ModelAndView(getView(), "model", result);
			} else {
				Result result = handleError(lChangePasswordResult.getResponseMessage(), aRequest, null);
				return new ModelAndView(getView(), "model", result);
			}

		} catch (Throwable throwableInstance) {
			Result result = handleError("msg_error_setNewPassword", aRequest,
					throwableInstance);
			return new ModelAndView(getView(), "model", result);
		}

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

	private ModelAndView displayTier2Page(HttpServletRequest aRequest,
		   HttpServletResponse aResponse) {
		   UserBean lUserBean =  new UserBean();
		   lUserBean.setEmailId(getApplicationContextObject().getUserPrincipal().getUser().getEmailId());
		   lUserBean.setLoginName(getApplicationContextObject().getUserPrincipal().getUser().getLoginName());
		   lUserBean.setUserTypeCode(getApplicationContextObject().getUserPrincipal().getUser().getUserTypeCode());
		   Map<String,Object> infoMap = new HashMap<String, Object>();
		   infoMap.put("tier2Bean", lUserBean);		
		   return new ModelAndView("tier2Admin",infoMap);
	}
	
	private void grantAuthority(int userAuthRole) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(auth.getAuthorities());
	    authorities.add(new SimpleGrantedAuthority(String.valueOf( userAuthRole)));
	    Authentication newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(), authorities);
	    SecurityContextHolder.getContext().setAuthentication(newAuth);
	}

}
