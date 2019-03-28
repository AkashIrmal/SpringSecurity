package com.hovs.sfi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.stereotype.Component;

import com.hovs.sfi.auth.AuthenticationManager;
import com.hovs.sfi.auth.UserPrincipal;
import com.hovs.sfi.service.DtsManager;
import com.hovs.sfi.service.ReportSfiManager;
import com.hovs.sfi.service.RoleManager;
import com.hovs.sfi.service.TinValidationManager;
import com.hovs.sfi.service.UserManager;

@Component
public class ApplicationContext{
	
	@Autowired
	private ResourceBundleMessageSource mMessageSource;

	
	@Autowired
	private UserManager mUserManager;
	
	
	@Autowired
	private RoleManager roleManager;
	

	@Autowired
	private ApplicationProperties mAppProperties;
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private SessionRegistryImpl sessionRegistry;
	
	@Autowired
	private TinValidationManager mTinValidationManager;
	
	@Autowired
	private ReportSfiManager reportSfiManager;
	
	

	@Autowired
	private DtsManager dtsManager;
	
	
	public ResourceBundleMessageSource getMessageSource() {
		return mMessageSource;
	}

	public UserManager getUserManager() {
		return mUserManager;
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}
  
	public UserPrincipal getUserPrincipal(){
		return getAuthenticationManager().getUserPrincipal();
	}

	public ApplicationProperties getAppProperties() {
		return mAppProperties;
	}

	public SessionRegistryImpl getSessionRegistry() {
		return sessionRegistry;
	}

	public TinValidationManager getTinValidationManager() {
		return mTinValidationManager;
	}

	public RoleManager getRoleManager() {
		return roleManager;
	}

	public void setRoleManager(RoleManager roleManager) {
		this.roleManager = roleManager;
	}
	
	public ReportSfiManager getReportSfiManager() {
		return reportSfiManager;
	}

	public void setReportSfiManager(ReportSfiManager reportSfiManager) {
		this.reportSfiManager = reportSfiManager;
	}
	
	public DtsManager getDtsManager() {
		return dtsManager;
	}

	public void setDtsManager(DtsManager dtsManager) {
		this.dtsManager = dtsManager;
	}
}
