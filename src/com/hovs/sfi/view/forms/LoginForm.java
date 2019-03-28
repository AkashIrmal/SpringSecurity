package com.hovs.sfi.view.forms;

public class LoginForm {
	private String detailedMessage;
	private String msgKey;
	private boolean debugUI;
	private String uiStatePath;
	private String token;
	public String getDetailedMessage() {
		return detailedMessage;
	}
	public void setDetailedMessage(String detailedMessage) {
		this.detailedMessage = detailedMessage;
	}
	public String getMsgKey() {
		return msgKey;
	}
	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}
	public boolean isDebugUI() {
		return debugUI;
	}
	public void setDebugUI(boolean debugUI) {
		this.debugUI = debugUI;
	}
	public String getUiStatePath() {
		return uiStatePath;
	}
	public void setUiStatePath(String uiStatePath) {
		this.uiStatePath = uiStatePath;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
