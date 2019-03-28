package com.hovs.sfi.auth;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.hovs.rule14.admin.ws.SaveSessionRequest;
import com.hovs.rule14.admin.ws.SaveSessionResult;
import com.hovs.rule14.admin.ws.SessionLog;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.config.ApplicationContext;
import com.hovs.sfi.model.User;

public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private Log mLogger = LogFactory.getLog(getClass());

	@Autowired
	private ApplicationContext mApplicationContext;

	public ApplicationContext getApplicationContext() {
		return mApplicationContext;
	}
	
	@Override
	public void setUseReferer(boolean useReferer) {
		super.setUseReferer(true);
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		mLogger.debug("Successful Authentication ");
		
		request.getSession().setMaxInactiveInterval(getApplicationContext().getAppProperties().getSessionTimeoutInMinutes() * 60);
		
		SaveSessionRequest lSessionRequest = new SaveSessionRequest();
		SessionLog lSessionLog = new SessionLog();
		lSessionLog.setSessionId(request.getSession().getId());
		
		  com.hovs.rule14.admin.ws.User lUserws = new com.hovs.rule14.admin.ws.User();
		  lUserws.setUserId(getApplicationContext().getUserPrincipal().getUser().getId());
		
		  lSessionLog.setUser(lUserws);
		  lSessionRequest.setSessionBean(lSessionLog);
		
		try {
			SaveSessionResult lSaveSessionResult = getApplicationContext().getUserManager().saveSessionLog(lSessionRequest);
		} catch (WsException_Exception e) {
			mLogger.info("Error While saving session log :");
			e.printStackTrace();
		}
		
		if(authentication == null){
			super.onAuthenticationSuccess(request, response, authentication);
			return;
		}
		
		
		UserPrincipal principal = (UserPrincipalImpl)authentication.getPrincipal();
		if(principal == null){
			super.onAuthenticationSuccess(request, response, authentication);
			return;
		}
		
		principal.getUser().setWebServiceSessionId(request.getSession().getId());
		User lUser = principal.getUser();
		HttpSession session = request.getSession();
		String windowName = lUser.getLoginName() + new Date().getTime();
        session.setAttribute("windowName", windowName);
        session.setAttribute("windowNameToSet", windowName);
		super.onAuthenticationSuccess(request, response, authentication);
	}
	
	@Override
	protected String determineTargetUrl(HttpServletRequest request,
			HttpServletResponse response) {
		
		if(getApplicationContext().getUserPrincipal().getUser().getUserRole().getId() == AuthConstants.ROLE_ADMIN_USER){
			if(getApplicationContext().getUserPrincipal().getUser().getPasswordChangeFirstTime().equalsIgnoreCase("Y")){
				setDefaultTargetUrl("/tier2Admin.do");
			}else{
				//if(getApplicationContext().getUserPrincipal().getUser().getUserTypeCode().equalsIgnoreCase("AD"))
				//	 setDefaultTargetUrl("/view.do");
				//else
				// comment above code for SFI issue id 4074 
				      setDefaultTargetUrl("/user.do");
			}
				  
		}
        else if(getApplicationContext().getUserPrincipal().getUser().getUserRole().getId() == AuthConstants.ROLE_PRE_AUTH_USER)
        	setDefaultTargetUrl("/tier2.do");
        else
        	setDefaultTargetUrl("/home.do");
		return super.determineTargetUrl(request, response);
	}
	
}
