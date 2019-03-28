package com.hovs.sfi.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.hovs.rule14.sfi.ws.SfiPrintReportResponse;
import com.hovs.rule14.sfi.ws.SfiReportRequest;
import com.hovs.rule14.sfi.ws.SfiReportResponse;
import com.hovs.rule14.sfi.ws.WsException_Exception;

@Service
public class ReportSfiManagerImpl extends BaseManagerImpl implements ReportSfiManager {

	protected Log logger = LogFactory.getLog(getClass());
	
	@Override
	public SfiReportResponse getReportDetails(SfiReportRequest aRequest) throws com.hovs.rule14.sfi.ws.WsException_Exception {
			
		return getSFIWebService().sfiReportDetails(aRequest);
	
	}

	@Override
	public SfiPrintReportResponse printSfiReport(SfiReportRequest aRequest)throws WsException_Exception {
		
		return getSFIWebService().printSfiReport(aRequest);
		
	}

	

}
