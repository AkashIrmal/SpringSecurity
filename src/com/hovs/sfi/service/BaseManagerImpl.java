package com.hovs.sfi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hovs.rule14.admin.ws.AdministrationService;
import com.hovs.rule14.sfi.ws.SFIService;
import com.hovs.sfi.config.ApplicationContext;
import com.hovs.sfi.config.SFIWebServiceProcessor;

@Service
public class BaseManagerImpl implements BaseManager {

	@Autowired
	ApplicationContext mApplicationContext;
	
	@Override
	public ApplicationContext getApplicationContext() {
		return mApplicationContext;
	}

	@Override
	public AdministrationService getSFIAdminWebService() {
		return SFIWebServiceProcessor.getSFIWebServiceProcessor().getAdministrationService();
	}

	@Override
	public SFIService getSFIWebService() {
		return SFIWebServiceProcessor.getSFIWebServiceProcessor().getSFIService();
	}

}
