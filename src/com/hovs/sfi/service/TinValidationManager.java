package com.hovs.sfi.service;

import com.hovs.rule14.sfi.ws.GetSfiW9FormRequest;
import com.hovs.rule14.sfi.ws.GetSfiW9FormResponse;
import com.hovs.rule14.sfi.ws.GetSfiW9PdfResponse;
import com.hovs.rule14.sfi.ws.SaveOrUpdateResponse;
import com.hovs.rule14.sfi.ws.W9FormGetRequest;
import com.hovs.rule14.sfi.ws.W9FormGetResponse;
import com.hovs.rule14.sfi.ws.W9FormRequest;
import com.hovs.rule14.sfi.ws.WsException_Exception;

public interface TinValidationManager {

	SaveOrUpdateResponse saveOrUpdateW9FromDetails(W9FormRequest lW9FormRequest)throws WsException_Exception;

	W9FormGetResponse getW9FormDetails(W9FormGetRequest lW9FormGetRequest)throws WsException_Exception;
	
	 GetSfiW9FormResponse getTINPayerData(GetSfiW9FormRequest getSfiW9FormRequest) throws WsException_Exception;
	 GetSfiW9PdfResponse getW9PdfData(GetSfiW9FormRequest getSfiW9FormRequest) throws WsException_Exception;
}
