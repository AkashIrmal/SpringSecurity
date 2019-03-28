package com.hovs.sfi.auth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.authentication.event.LoggerListener;

public class AuthenticationLoggerListener extends LoggerListener {
   
	private Log logger = LogFactory.getLog(getClass());
	
	@Override
	public void onApplicationEvent(AbstractAuthenticationEvent event) {
		if (event instanceof AuthenticationSuccessEvent) {
			logger.info("Authenitcation Success....");
		} else if (event instanceof AuthenticationFailureBadCredentialsEvent) {
			logger.info("Authenitcation Failed Bad Credentials....");
		}
		super.onApplicationEvent(event);
	}

}
