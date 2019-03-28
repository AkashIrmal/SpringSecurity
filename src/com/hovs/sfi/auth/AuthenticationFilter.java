package com.hovs.sfi.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter{

	public AuthenticationFilter() {
        setPostOnly(true);
        setUsernameParameter("loginName");
        setPasswordParameter("password");
	}

	
	@Override
	protected String obtainUsername(HttpServletRequest request) {
		String username  = request.getParameter(getUsernameParameter());
		return username;
	}
	
	@Override
	protected String obtainPassword(HttpServletRequest request) {
		String password = request.getParameter(getPasswordParameter());
		return password;
	}
	
	
}
