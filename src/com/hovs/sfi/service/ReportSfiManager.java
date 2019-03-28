package com.hovs.sfi.service;

import com.hovs.rule14.sfi.ws.SfiPrintReportResponse;
import com.hovs.rule14.sfi.ws.SfiReportRequest;
import com.hovs.rule14.sfi.ws.SfiReportResponse;

public interface ReportSfiManager {
	
	public SfiReportResponse getReportDetails(SfiReportRequest aRequest) throws com.hovs.rule14.sfi.ws.WsException_Exception;
	public SfiPrintReportResponse printSfiReport(SfiReportRequest aRequest) throws com.hovs.rule14.sfi.ws.WsException_Exception;
	

}
