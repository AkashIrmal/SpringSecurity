

package com.hovs.sfi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("applicationProperties")
public class ApplicationProperties {

	private @Value("${app.sessionTimeoutInMinutes}") int sessionTimeoutInMinutes;
	private @Value("${app.debugUI}") boolean debugUI;
	
	
	public int getSessionTimeoutInMinutes() {
		return sessionTimeoutInMinutes;
	}

	public boolean isDebugUI() {
		return debugUI;
	}
}
