package com.hovs.sfi.config;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4jFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ApplicationPlatformConfigurer extends PropertyPlaceholderConfigurer {

	protected final Log logger = Log4jFactory.getLog(getClass());
	
	/**
	 * Overridden the method of PropertyPlaceholderConfigurer.resolvePlaceholder to resolve
	 * each property in properties file to the log. 
	 */
	@Override
	protected String resolvePlaceholder(String placeholder, Properties props) {
		String propertyValue = super.resolvePlaceholder(placeholder, props);
		logger.info(placeholder + " : " + propertyValue ); 
		return propertyValue;
	}
}
