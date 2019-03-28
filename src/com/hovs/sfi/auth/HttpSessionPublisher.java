package com.hovs.sfi.auth;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class HttpSessionPublisher implements HttpSessionListener {

	Log log = LogFactory.getLog(getClass());

	
	ApplicationContext getContext(ServletContext servletContext) {
		return WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent paramHttpSessionEvent) {
		HttpSessionCreatedEvent e = new HttpSessionCreatedEvent(
				paramHttpSessionEvent.getSession());

		if (log.isDebugEnabled()) {
			log.debug("Publishing event: " + e);
		}
		getContext(paramHttpSessionEvent.getSession().getServletContext()).publishEvent(e);

	}

	

	@Override
	public void sessionDestroyed(HttpSessionEvent paramHttpSessionEvent) {
		HttpSessionDestroyedEvent e = new HttpSessionDestroyedEvent(
				paramHttpSessionEvent.getSession());
	

		if (log.isDebugEnabled()) {
			log.debug("Publishing event: " + e);
		}

		getContext(paramHttpSessionEvent.getSession().getServletContext()).publishEvent(e);
	}

}
