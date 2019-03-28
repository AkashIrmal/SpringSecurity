package com.hovs.sfi.config;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



@Configuration
@ImportResource({"classpath:configuration/business.xml","classpath:configuration/authentication.xml","classpath:configuration/aop.xml"})
public class ConfigurationProperties {

	private static final String PROPERTIES_FOLDER = "properties";
	private static final String PROPERTIES_FILE = "application.properties";
	
	@Bean(name="propertyConfigurer")
	public static ApplicationPlatformConfigurer platFormPropertyConfigurer(){
		ApplicationPlatformConfigurer platformConfigurer = new ApplicationPlatformConfigurer();
		Resource [] locations = {new ClassPathResource(PROPERTIES_FOLDER + File.separator + PROPERTIES_FILE )};
		platformConfigurer.setLocations(locations);
		return platformConfigurer;
	}
}
