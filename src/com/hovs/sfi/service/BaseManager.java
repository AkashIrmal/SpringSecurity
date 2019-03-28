package com.hovs.sfi.service;

import com.hovs.rule14.admin.ws.AdministrationService;
import com.hovs.rule14.sfi.ws.SFIService;
import com.hovs.sfi.config.ApplicationContext;

public interface BaseManager {
  public ApplicationContext getApplicationContext();
  public AdministrationService getSFIAdminWebService();
  public SFIService getSFIWebService();
}
