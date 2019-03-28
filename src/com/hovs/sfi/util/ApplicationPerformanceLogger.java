package com.hovs.sfi.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

public class ApplicationPerformanceLogger {

	private static final ApplicationPerformanceLogger mInstance = new ApplicationPerformanceLogger();
	
	private static int totalRequests;
	private static int totalActiveRequests;
	private int slowMethodPerformanceTimeSeconds;
	private Log logger = LogFactory.getLog(getClass());
	
	
	public int getSlowMethodPerformanceTimeSeconds() {
		return slowMethodPerformanceTimeSeconds;
	}

	public void setSlowMethodPerformanceTimeSeconds(
			int lSlowMethodPerformanceTimeSeconds) {
		this.slowMethodPerformanceTimeSeconds = lSlowMethodPerformanceTimeSeconds;
	}
	
	public static synchronized ApplicationPerformanceLogger getInstance(){
		return  mInstance;
	}
	public static synchronized void incrementTotalActiveRequest(){
		totalActiveRequests++;
	}
	public static synchronized void decrementTotalActiveRequest(){
		totalActiveRequests--;
	}
	public static synchronized void incrementTotalRequest(){
		totalRequests++;
	}
	
	public static synchronized int getTotalActiveRequests(){
		return totalActiveRequests;
	}
	public static synchronized int getTotalRequests(){
		return totalRequests;
	}

	/**
	 * Method is responsible to log the total time taken by the request to complete.
	 * With extra information such as Total active request, request path infor i.e. request URI , 
	 * browser information and etc.
	 * @param request
	 * @param methodName
	 * @param startTime
	 */
	public void logRequestExecutionTime(HttpServletRequest request , String methodName , long startTime) {
		logMethodExecutionTime(methodName, startTime);
		long totalSeconds = ( System.currentTimeMillis() - startTime ) / 1000;
		StringBuffer performanceLogBuffer = new StringBuffer();
		performanceLogBuffer.append("URI : ");
		performanceLogBuffer.append(request.getRequestURI());
		performanceLogBuffer.append(" Total Requests ");
		performanceLogBuffer.append(getTotalRequests());
		performanceLogBuffer.append(" Total Active Requests ");
		performanceLogBuffer.append(getTotalActiveRequests());
		performanceLogBuffer.append("/");
		performanceLogBuffer.append(totalSeconds);
		performanceLogBuffer.append(" Seconds ,");
		performanceLogBuffer.append(" Browser : ");
		performanceLogBuffer.append(HttpUtil.getBrowserInfo(request));
		logger.info(performanceLogBuffer.toString());
	}
	
	/**
	 * Method is responsible to log the total time taken by the method to complete its business logic.
	 * @param methodName
	 * @param startTime
	 */
	public void logMethodExecutionTime(String methodName, long startTime)  {
		long totalSeconds = ( System.currentTimeMillis() - startTime) / 1000;
		if(totalSeconds > getSlowMethodPerformanceTimeSeconds()){
			StringBuffer performanceLogBuffer = new StringBuffer();
			performanceLogBuffer.append("SLOW PERFORMANCE by method ");
			performanceLogBuffer.append(methodName);
			performanceLogBuffer.append(" = ");
			performanceLogBuffer.append(totalSeconds);
			performanceLogBuffer.append(" Seconds");
			logger.info(performanceLogBuffer.toString());
		}
	}
	

	// ProceedingJoinPoint handler method for AOP.
	public Object logRequestExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime = System.currentTimeMillis();
		try {
			Object businessObject = joinPoint.proceed();
			return businessObject;
		}  finally {
			long durationMilliSeconds = System.currentTimeMillis() - startTime;
			logTimeDuration(joinPoint, durationMilliSeconds / 1000);
		}
	}
	
	// ProceedingJoinPoint handler method for AOP.
		public Object logMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
			long startTime = System.currentTimeMillis();
			try {
				Object businessObject = joinPoint.proceed();
				return businessObject;
			}  finally {
				long durationMilliSeconds = System.currentTimeMillis() - startTime;
				logTimeDuration(joinPoint, durationMilliSeconds / 1000);
			}
		}
	
	public void logTimeDuration(ProceedingJoinPoint joinPoint , long durationMilliSeconds){
		 StringBuffer loggingExecutionTimeBuffer = new StringBuffer();
		 if(durationMilliSeconds > getSlowMethodPerformanceTimeSeconds()){
			 loggingExecutionTimeBuffer.append("SLOW METHOD PERFORMANCE ");
			 loggingExecutionTimeBuffer.append(joinPoint.getSignature().getDeclaringTypeName());
			 loggingExecutionTimeBuffer.append(".");
			 loggingExecutionTimeBuffer.append(joinPoint.getSignature().getName());
			 loggingExecutionTimeBuffer.append("(");
			 // retrieve the runtime method arguments (dynamic)
			 String prefix = "";
		     for(final Object argument : joinPoint.getArgs()){
		    	  loggingExecutionTimeBuffer.append(prefix);
		    	  prefix = ",";
		    	  loggingExecutionTimeBuffer.append(argument);
		     }
		     loggingExecutionTimeBuffer.append(");");
		     loggingExecutionTimeBuffer.append(" Total Seconds Taken = ");
		     loggingExecutionTimeBuffer.append(durationMilliSeconds);
		     loggingExecutionTimeBuffer.append(" Seconds");
		     logger.info(loggingExecutionTimeBuffer.toString());
		 } 
	}
	
	
}
