package com.hovs.sfi.auth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;


public class AuthenticationPasswordEncoder extends MessageDigestPasswordEncoder {
	protected final Log logger = LogFactory.getLog(getClass());
	
	private static final String MD5_ALGORITHM = "MD5";
	 
	public AuthenticationPasswordEncoder() {
		super(MD5_ALGORITHM);
	}
	
	@Override
	public String encodePassword(String rawPass, Object salt) {
	   String encryptPassword = super.encodePassword(rawPass, salt);
	   logger.debug("Entered encrypted password  is :" + encryptPassword);
	   return super.encodePassword(rawPass, salt);
	}
	@Override
	public boolean isPasswordValid(String encPass, String rawPass, Object salt) {
		return super.isPasswordValid(encPass, rawPass, salt);
	}
	
	
	public static void main(String[] args) {
		AuthenticationPasswordEncoder l = new AuthenticationPasswordEncoder();
		
		System.out.println(l.encodePassword("Pa$$w0rd", "AkashAdmin365"));
	}
}
