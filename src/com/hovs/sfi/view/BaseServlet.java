package com.hovs.sfi.view;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.DispatcherServlet;

import com.hovs.sfi.common.Result;
import com.hovs.sfi.controller.BaseController;
import com.hovs.sfi.util.ApplicationPerformanceLogger;

public class BaseServlet extends DispatcherServlet {

	private static final long serialVersionUID = 1L;
	protected Log logger = LogFactory.getLog(getClass());
	@Override
	protected void doService(HttpServletRequest aRequest, HttpServletResponse aResponse)
			throws Exception {
	
		long lStartTime = new Date().getTime();
		try{
			beginRequest(aRequest, aResponse);
			super.doService(aRequest, aResponse);
		}catch(Throwable aThrowableInstance){
			logger.info("Error : ",aThrowableInstance);
			BaseController baseController = (BaseController) getController(aRequest);
			Result result = baseController == null ? null : baseController.handleError("error_msg_appError", aRequest, aThrowableInstance);
			aRequest.setAttribute("result", result);
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/applicationError.jsp").forward(aRequest, aResponse);
		}finally{
			endRequest(aRequest,lStartTime);
		}
		
		
	}

	private void endRequest(HttpServletRequest aRequest, long aStartTime) {
		ApplicationPerformanceLogger.decrementTotalActiveRequest();
		ApplicationPerformanceLogger.getInstance().logRequestExecutionTime(aRequest, getClass().getName() +".doService()", aStartTime);
		
	}

	private BaseController getController(HttpServletRequest aRequest) throws Exception {
		Object handlerObject = getHandler(aRequest).getHandler();
		if(handlerObject instanceof BaseController){
			return (BaseController) handlerObject;
		}else{
			return null;
		}
	}

	private void beginRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse2) {
		ApplicationPerformanceLogger.decrementTotalActiveRequest();
		ApplicationPerformanceLogger.incrementTotalActiveRequest();
	}
	
	
}
