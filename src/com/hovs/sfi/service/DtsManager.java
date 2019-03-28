package com.hovs.sfi.service;

import com.hovs.rule14.admin.ws.DtsListRequest;
import com.hovs.rule14.admin.ws.DtsListResult;
import com.hovs.rule14.admin.ws.ImportDataWithDtsRequest;
import com.hovs.rule14.admin.ws.ImportDataWithDtsResult;
import com.hovs.rule14.admin.ws.WsException_Exception;



public interface DtsManager {
	
	public ImportDataWithDtsResult importDataWithDts(ImportDataWithDtsRequest request)throws WsException_Exception;
	
	public DtsListResult loadDTSList(DtsListRequest request) throws WsException_Exception;

}
