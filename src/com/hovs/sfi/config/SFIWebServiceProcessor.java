package com.hovs.sfi.config;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.ws.BindingProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hovs.rule14.admin.ws.Administration;
import com.hovs.rule14.admin.ws.AdministrationService;
import com.hovs.rule14.sfi.ws.SFI;
import com.hovs.rule14.sfi.ws.SFIService;

public class SFIWebServiceProcessor {

	private static SFIWebServiceProcessor mSfiWebServiceProcessor;
	private AdministrationService mAdministrationService;
	private SFIService mSFIService;
	protected Log mLogger = LogFactory.getLog(getClass());
    private static final String PROPERTIES_FOLDER = "properties";
	
	private static final String PROPERTIES_FILE = "application.properties";
	
	private SFIWebServiceProcessor() {
		try{
			
			Properties properties = new Properties();
			properties.load(SFIWebServiceProcessor.class.getClassLoader().getResourceAsStream(PROPERTIES_FOLDER + File.separator + PROPERTIES_FILE));
			// Set up SFI Administration web service client.
			configureEFileAdminWebService(properties);
			// Set up SFI Administration web service client.
			configureSFIWebService(properties);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			mLogger.error("E File Web service invocation error" , e);
		} catch (IOException e) {
			e.printStackTrace();
			mLogger.error("Erorr while reading the file : properties"+File.separator+"application.properties" , e);
		}
	}
	
	private void configureSFIWebService(Properties properties)throws MalformedURLException {
		URL lSFIWSDLURL = new URL(properties.get("app.sfiwebservice_wsdl").toString());
		SFI lSFI = new SFI(lSFIWSDLURL);
		mSFIService = lSFI.getSFIServicePort();
		BindingProvider provAdminWebService = (BindingProvider) mSFIService;
		provAdminWebService.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,properties.get("webservice.username").toString());
		provAdminWebService.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, properties.get("webservice.password").toString());
	}

	private void configureEFileAdminWebService(Properties properties) throws MalformedURLException{
		URL lSFIAdminWSDLURL = new URL(properties.get("app.sfiadminwebservice.wsdl").toString());
		Administration SFIAdminWS = new Administration(lSFIAdminWSDLURL);
		mAdministrationService = SFIAdminWS.getAdministrationServicePort();
		BindingProvider provAdminWebService = (BindingProvider) mAdministrationService;
		provAdminWebService.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, properties.get("webservice.username").toString());
		provAdminWebService.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, properties.get("webservice.password").toString());
	}

	public AdministrationService getAdministrationService() {
		return mAdministrationService;
	}

	public SFIService getSFIService() {
		return mSFIService;
	}
	public static SFIWebServiceProcessor getSFIWebServiceProcessor(){
		 if(mSfiWebServiceProcessor == null){
			 mSfiWebServiceProcessor = new SFIWebServiceProcessor();
		 }
		 return mSfiWebServiceProcessor;
	}
}
