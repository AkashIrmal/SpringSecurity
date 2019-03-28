package com.hovs.sfi.util;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.hovs.rule14.sfi.ws.W9FormRequest;

public class CommonUtil {

	private static Log logger = LogFactory.getLog(CommonUtil.class); 
	private static final String MM_DD_YYYY_HH_mm_ss = "MM/dd/yyyy HH:mm:ss";  
	private static final String yyyy_MM_dd_HH_mm_ss_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
	private static SimpleDateFormat DF_MM_DD_YYYY_HH_mm_ss = new SimpleDateFormat(MM_DD_YYYY_HH_mm_ss);

	
	public static String getMessageForKey(String messageKey ,Object[] args, Map<String,String> messageMap ,ResourceBundleMessageSource messageSource){
		String detailedMessage = null;
		if(messageKey == null){
			return "Message key is null/empty.";
		}
		if(messageSource != null && detailedMessage == null){
			try{
				detailedMessage = messageSource.getMessage(messageKey, args, Locale.getDefault());
			}catch(NoSuchMessageException noSuchMessageException){
				logger.error("There is no message for the key '" + messageKey + "' in properties file.");
			}
		} else {
			return "ResourceBundleMessageSource object is null.";
		}
		return detailedMessage;
	}
	
	
	/**
	 * Displays the logger context with Start prefix.
	 * @param logger
	 * @param loggingContext
	 */
	public static void startLogger(Log logger,String loggingContext){
		logger.debug("Start ==> " + loggingContext);
	}
	
	
	/**
	 * Displays the logger context with End prefix.
	 * @param logger
	 * @param loggingContext
	 */
	public static void endLogger(Log logger,String loggingContext){
		logger.debug("End ==> " + loggingContext);
	}


	/**
	 * Populates the Java bean properties from the request parameters.
	 * @param sourceObject
	 * @param targetObject
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public static void populateBeans(HttpServletRequest request , Object targetObject) throws IllegalAccessException, InvocationTargetException{
		org.apache.commons.beanutils.BeanUtils.populate(targetObject, request.getParameterMap());
	}


	/**
	 * Method returns current date + numberOfHours added date in MM/dd/yyyy HH:mm:ss.
	 * @param numberOfHours
	 * @return
	 */
	public static String getNextAddedHourDate(int numberOfHours){
		Date today = new Date();
		Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * numberOfHours));
		return DF_MM_DD_YYYY_HH_mm_ss.format(tomorrow);
	}


	/**
	 * Converts the string date to formated java.util.Date.
	 * @param stringDate
	 * @return
	 */
	public static Date convertToDate(String stringDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return dateFormat.parse(stringDate);
		} catch (ParseException e) {
			logger.error("Error while parsing the date using format :" + MM_DD_YYYY_HH_mm_ss );
		}
		return null;
	}
}
