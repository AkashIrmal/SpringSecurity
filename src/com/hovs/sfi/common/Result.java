package com.hovs.sfi.common;

import java.util.List;
import java.util.Map;

public class Result {
	private boolean success;
	private int returnCode;
	private String messageKey;
	private String detailedMessage;
	private String exception;
	private String sessionId;
	private Map<String, Object> customParams;
	private String operatingSystem;
	private String browser;
	private List<String> validationErrorMessages;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getMessageKey() {
		return messageKey;
	}
	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
	public String getDetailedMessage() {
		return detailedMessage;
	}
	public void setDetailedMessage(String detailedMessage) {
		this.detailedMessage = detailedMessage;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Map<String, Object> getCustomParams() {
		return customParams;
	}
	public void setCustomParams(Map<String, Object> customParams) {
		this.customParams = customParams;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public List<String> getValidationErrorMessages() {
		return validationErrorMessages;
	}
	public void setValidationErrorMessages(List<String> validationErrorMessages) {
		this.validationErrorMessages = validationErrorMessages;
	}
	@Override
	public String toString() {
		return "{ success:"+success+",returnCode:"+returnCode+",messageKey:"+messageKey+",detailedMessage:"+detailedMessage+",exception:"+exception+",sessionId:"+sessionId+",browser:"+browser+",operatingSystem:"+operatingSystem+"}";
	}
}
