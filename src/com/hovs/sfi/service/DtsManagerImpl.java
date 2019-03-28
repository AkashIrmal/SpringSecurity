package com.hovs.sfi.service;

import org.springframework.stereotype.Service;

import com.hovs.rule14.admin.ws.DtsListRequest;
import com.hovs.rule14.admin.ws.DtsListResult;
import com.hovs.rule14.admin.ws.ImportDataWithDtsRequest;
import com.hovs.rule14.admin.ws.ImportDataWithDtsResult;
import com.hovs.rule14.admin.ws.WsException_Exception;

@Service
public class DtsManagerImpl extends BaseManagerImpl implements DtsManager {

	@Override
	public ImportDataWithDtsResult importDataWithDts(
			ImportDataWithDtsRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().importDataWithDts(request);
	}

	@Override
	public DtsListResult loadDTSList(DtsListRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().loadDTSList(request);
	}

}
