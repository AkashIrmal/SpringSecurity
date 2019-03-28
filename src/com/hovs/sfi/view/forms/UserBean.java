package com.hovs.sfi.view.forms;

import java.util.List;

import com.hovs.rule14.admin.ws.AccountType;
import com.hovs.rule14.admin.ws.KbaQuestion;
import com.hovs.rule14.admin.ws.Menu;
import com.hovs.rule14.sfi.ws.W9FormDto;


public class UserBean {

	private int id;
	private int clientId;
	private String loginName;
	private String password;
	private String state;
	private String lastLoginTime;
	private long poiId;
	private String webServiceSessionId;
	private String isAdmin;
	private String clientLogo;
	private List<KbaQuestion> questionList;
	private List<AccountType> accountTypeList;
	private List<Menu> parentList;
	private List<Menu> childtList;
	private String emailId;
	private W9FormDto w9FormDto;
	private boolean autoPopulateDisabled;
	private String reportPath;
	private String accountType;
	private String url;
	private boolean passwordChangeNxtTime;
	private String userTypeCode;
	
	
	
	

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getReportPath() {
		return reportPath;
	}
	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
	public List<AccountType> getAccountTypeList() {
		return accountTypeList;
	}
	public void setAccountTypeList(List<AccountType> accountTypeList) {
		this.accountTypeList = accountTypeList;
	}
	public List<KbaQuestion> getQuestionList() {
		return questionList;
	}
	public void setQuestionList(List<KbaQuestion> questionList) {
		this.questionList = questionList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public long getPoiId() {
		return poiId;
	}
	public void setPoiId(long poiId) {
		this.poiId = poiId;
	}
	public String getWebServiceSessionId() {
		return webServiceSessionId;
	}
	public void setWebServiceSessionId(String webServiceSessionId) {
		this.webServiceSessionId = webServiceSessionId;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public String getClientLogo() {
		return clientLogo;
	}
	public void setClientLogo(String clientLogo) {
		this.clientLogo = clientLogo;
	}
	public List<Menu> getParentList() {
		return parentList;
	}
	public void setParentList(List<Menu> parentList) {
		this.parentList = parentList;
	}
	public List<Menu> getChildtList() {
		return childtList;
	}
	public void setChildtList(List<Menu> childtList) {
		this.childtList = childtList;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public W9FormDto getW9FormDto() {
		return w9FormDto;
	}
	public void setW9FormDto(W9FormDto w9FormDto) {
		this.w9FormDto = w9FormDto;
	}
	public boolean isAutoPopulateDisabled() {
		return autoPopulateDisabled;
	}
	public void setAutoPopulateDisabled(boolean autoPopulateDisabled) {
		this.autoPopulateDisabled = autoPopulateDisabled;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public boolean isPasswordChangeNxtTime() {
		return passwordChangeNxtTime;
	}
	public void setPasswordChangeNxtTime(boolean passwordChangeNxtTime) {
		this.passwordChangeNxtTime = passwordChangeNxtTime;
	}
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
}
