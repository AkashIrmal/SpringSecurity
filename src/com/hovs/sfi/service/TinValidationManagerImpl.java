package com.hovs.sfi.service;

import org.springframework.stereotype.Service;

import com.hovs.rule14.sfi.ws.GetSfiW9FormRequest;
import com.hovs.rule14.sfi.ws.GetSfiW9FormResponse;
import com.hovs.rule14.sfi.ws.GetSfiW9PdfResponse;
import com.hovs.rule14.sfi.ws.SaveOrUpdateResponse;
import com.hovs.rule14.sfi.ws.W9FormGetRequest;
import com.hovs.rule14.sfi.ws.W9FormGetResponse;
import com.hovs.rule14.sfi.ws.W9FormRequest;
import com.hovs.rule14.sfi.ws.WsException_Exception;

@Service
public class TinValidationManagerImpl extends BaseManagerImpl implements TinValidationManager{

	@Override
	public SaveOrUpdateResponse saveOrUpdateW9FromDetails(
			W9FormRequest lW9FormRequest) throws WsException_Exception {
		return getSFIWebService().saveOrUpdateW9FormDetails(lW9FormRequest);
	}

	@Override
	public W9FormGetResponse getW9FormDetails(W9FormGetRequest lW9FormGetRequest)
			throws WsException_Exception {
		
		return getSFIWebService().getW9FormDetails(lW9FormGetRequest);
	}

	@Override
	public GetSfiW9FormResponse getTINPayerData(
			GetSfiW9FormRequest getSfiW9FormRequest)
			throws WsException_Exception {
		
		return getSFIWebService().getTINPayerData(getSfiW9FormRequest);
	}

	@Override
	public GetSfiW9PdfResponse getW9PdfData(
			GetSfiW9FormRequest getSfiW9FormRequest)
			throws WsException_Exception {
		
		return getSFIWebService().getW9PdfData(getSfiW9FormRequest);
	}

}
