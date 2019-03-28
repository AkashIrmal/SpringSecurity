package com.hovs.sfi.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

public class AuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	protected Log mLogger = LogFactory.getLog(getClass());
	
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
	
		if(exception instanceof DisabledException){
			request.getSession().setAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE,AuthConstants.USER_ACCOUNT_DISABLED);
			logger.debug("Account disabled exception occured.");
		}else if(exception instanceof LockedException){
			request.getSession().setAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE,AuthConstants.USER_ACCOUNT_NOT_ACTIVATED);
			logger.debug("Account disabled exception occured.");
		}else if(exception instanceof BadCredentialsException){
			request.getSession().setAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE,AuthConstants.USER_ACCOUNT_BAD_CREDENTIALS);
		}else if(exception instanceof SessionAuthenticationException){
			request.getSession().setAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE,AuthConstants.USER_MAXIMUM_SESSION);
		}
		super.onAuthenticationFailure(request, response, exception);
	}
	
	
}
