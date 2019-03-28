package com.hovs.sfi.model;

import java.io.Serializable;


public class User  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int clientId;
	private String loginName;
	private String password;
	private String state;
	private String lastLoginTime;
	private UserRole userRole;
	private long poiId;
	private String webServiceSessionId;
	private String isAdmin;
	private String clientLogo;
	private String firstName;
	private String lastName;
    private String passwordChangeFirstTime;
	private String isSupervisor;
	private String emailId;
	private String accountType;
	private String accountTypeCode;
	private String userTypeCode;
	

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
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPasswordChangeFirstTime() {
		return passwordChangeFirstTime;
	}
	public void setPasswordChangeFirstTime(String passwordChangeFirstTime) {
		this.passwordChangeFirstTime = passwordChangeFirstTime;
	}
	public String getIsSupervisor() {
		return isSupervisor;
	}
	public void setIsSupervisor(String isSupervisor) {
		this.isSupervisor = isSupervisor;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountTypeCode() {
		return accountTypeCode;
	}
	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}
	
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
}
