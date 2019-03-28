package com.hovs.sfi.auth;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import com.hovs.rule14.admin.ws.SessionLog;
import com.hovs.rule14.admin.ws.UpdateSessionRequest;
import com.hovs.rule14.admin.ws.UserSessionInfo;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.config.ApplicationContext;

public class AuthenticationLogoutHandler extends SimpleUrlLogoutSuccessHandler{

	protected Log mLogger = LogFactory.getLog(getClass()); 
	
	@Autowired
	ApplicationContext mApplicationContext;

	
	public ApplicationContext getApplicationContext() {
		return mApplicationContext;
	}
	
	private String logoutSuccessUrl;
	
	public AuthenticationLogoutHandler(String logoutSuccessUrl) {
		this.logoutSuccessUrl = logoutSuccessUrl;
	}
	
	@Override
	public void setDefaultTargetUrl(String defaultTargetUrl) {
		super.setDefaultTargetUrl(this.logoutSuccessUrl);
	}

	@Override
	public void onLogoutSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
	   
	   UpdateSessionRequest updateSessionRequest = null;
   if(authentication != null){
	   mLogger.info("Logout sucessfully - ");
	   updateSessionRequest = new UpdateSessionRequest();
		updateSessionRequest.setUserId(((UserPrincipal)authentication.getPrincipal()).getUser().getId());
		SessionLog sessionLog = new SessionLog();
		sessionLog.setLogoutTime(new Date().toString());
		sessionLog.setSessionId(((UserPrincipal)authentication.getPrincipal()).getUser().getWebServiceSessionId());
		UserSessionInfo userSessionInfo = new UserSessionInfo();
		userSessionInfo.setUserId(((UserPrincipal)authentication.getPrincipal()).getUser().getId());
		userSessionInfo.setUserName(((UserPrincipal)authentication.getPrincipal()).getUser().getLoginName());
		sessionLog.setUserSessionInfo(userSessionInfo);
		sessionLog.setLogouttype("1");
		updateSessionRequest.setSessionBean(sessionLog);
   
		try {
			getApplicationContext().getUserManager().updateSessionLog(updateSessionRequest);
		} catch (WsException_Exception e) {
			e.printStackTrace();
		}
   }	
		super.onLogoutSuccess(request, response, authentication);
	}
	
}
