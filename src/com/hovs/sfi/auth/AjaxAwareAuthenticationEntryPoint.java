package com.hovs.sfi.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

public class AjaxAwareAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
    
   public AjaxAwareAuthenticationEntryPoint(String loginUrl) {
        super(loginUrl);
    }
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        if (isAjaxRequest(request) || isWebService(request)) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "SESSION_TIMED_OUT");
    //  	response.sendRedirect(request.getContextPath()+"/login.do");
        } else {
            request.setAttribute("targetUrl", request.getRequestURL());
            super.commence(request, response, authException);
        }
    }
	protected boolean isWebService(HttpServletRequest request){
		return request.getRequestURI().contains("/rest/");
	}
    protected boolean isAjaxRequest(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }
}
