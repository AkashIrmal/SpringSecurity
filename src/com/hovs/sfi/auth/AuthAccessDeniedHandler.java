package com.hovs.sfi.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class AuthAccessDeniedHandler implements AccessDeniedHandler {

	private String accessDeniedUrl;

	public AuthAccessDeniedHandler() {
	}
	
	AuthAccessDeniedHandler(String accessDeniedUrl){
		this.accessDeniedUrl = accessDeniedUrl;
	}
	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
	    request.getSession().setAttribute("message", " Sorry,You don't have privileges to view this page!!!"); 
	    request.getSession().invalidate();
	    response.sendRedirect(request.getContextPath()+accessDeniedUrl);
	}
	
	public String getAccessDeniedUrl() {
		return accessDeniedUrl;
	}

	public void setAccessDeniedUrl(String accessDeniedUrl) {
		this.accessDeniedUrl = accessDeniedUrl;
	}

}