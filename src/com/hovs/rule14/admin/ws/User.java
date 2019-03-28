
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountInActiveReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyVendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowChat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attemptFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cellNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changePwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dmv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filerSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filersSSN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filersSSN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filersSSN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inCareAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAdmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAuditor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSupervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSystemUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loginCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordExpire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordExpiryDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passwordchangenxttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwords" type="{http://ws.admin.rule14.hovs.com/}password" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="poiId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportToEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportToId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resetPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoutEmailNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoutSMSNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentryEmailNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentrySMSNotification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseDMV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseDob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseIssuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseSSN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseSSN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseSSN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateCodeIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="uniqueIdSSN" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "accountInActiveReason",
    "accountNumber",
    "accountType",
    "accountTypeCode",
    "accountTypeId",
    "active",
    "address1",
    "address2",
    "adminFlag",
    "agencyVendorName",
    "allowChat",
    "allowEmail",
    "attemptFlag",
    "cellNumber",
    "changePwd",
    "city",
    "clientId",
    "clientLocationId",
    "clientLogo",
    "clientName",
    "countryCode",
    "createdBy",
    "day",
    "dmv",
    "dob",
    "email",
    "emailId",
    "expirationDate",
    "expiryDays",
    "filerFirstName",
    "filerLastName",
    "filerMiddleName",
    "filerSSN",
    "filersSSN1",
    "filersSSN2",
    "filersSSN3",
    "firstName",
    "fullAddress",
    "homePhone",
    "inCareAddress",
    "isAdmin",
    "isAuditor",
    "isSupervisor",
    "isSystemUser",
    "issuedDate",
    "lastName",
    "legalName",
    "loginAttempts",
    "loginCounter",
    "loginName",
    "middleName",
    "month",
    "notificationEmail",
    "notificationEmailId",
    "notificationMobile",
    "password",
    "passwordExpire",
    "passwordExpiryDays",
    "passwordchangenxttm",
    "passwords",
    "poiId",
    "reportToEmailId",
    "reportToId",
    "reportToName",
    "resetPassword",
    "scoutEmailNotification",
    "scoutSMSNotification",
    "sentryEmailNotification",
    "sentrySMSNotification",
    "skillType",
    "socialId",
    "socialType",
    "spouseDMV",
    "spouseDob",
    "spouseExpirationDate",
    "spouseFirstName",
    "spouseHomePhone",
    "spouseIssuedDate",
    "spouseLastName",
    "spouseMiddleName",
    "spouseSSN",
    "spouseSSN1",
    "spouseSSN2",
    "spouseSSN3",
    "spouseStateCode",
    "state",
    "stateCodeIssued",
    "taxPayerId",
    "totalRowCount",
    "uniqueIdSSN",
    "userId",
    "userName",
    "userType",
    "userTypeId",
    "userTypeName",
    "year",
    "zipcode"
})
public class User {

    protected String accountInActiveReason;
    protected String accountNumber;
    protected String accountType;
    protected String accountTypeCode;
    protected int accountTypeId;
    protected String active;
    protected String address1;
    protected String address2;
    protected String adminFlag;
    protected String agencyVendorName;
    protected String allowChat;
    protected String allowEmail;
    protected String attemptFlag;
    protected String cellNumber;
    protected String changePwd;
    protected String city;
    protected int clientId;
    protected int clientLocationId;
    protected String clientLogo;
    protected String clientName;
    protected String countryCode;
    protected int createdBy;
    protected int day;
    protected String dmv;
    protected String dob;
    protected String email;
    protected String emailId;
    protected String expirationDate;
    protected int expiryDays;
    protected String filerFirstName;
    protected String filerLastName;
    protected String filerMiddleName;
    protected String filerSSN;
    protected String filersSSN1;
    protected String filersSSN2;
    protected String filersSSN3;
    protected String firstName;
    protected String fullAddress;
    protected String homePhone;
    protected String inCareAddress;
    protected String isAdmin;
    protected String isAuditor;
    protected String isSupervisor;
    protected String isSystemUser;
    protected String issuedDate;
    protected String lastName;
    protected String legalName;
    protected int loginAttempts;
    protected int loginCounter;
    protected String loginName;
    protected String middleName;
    protected int month;
    protected String notificationEmail;
    protected String notificationEmailId;
    protected String notificationMobile;
    protected String password;
    protected String passwordExpire;
    protected int passwordExpiryDays;
    protected String passwordchangenxttm;
    @XmlElement(nillable = true)
    protected List<Password> passwords;
    protected int poiId;
    protected String reportToEmailId;
    protected String reportToId;
    protected String reportToName;
    protected String resetPassword;
    protected String scoutEmailNotification;
    protected String scoutSMSNotification;
    protected String sentryEmailNotification;
    protected String sentrySMSNotification;
    protected String skillType;
    protected String socialId;
    protected String socialType;
    protected String spouseDMV;
    protected String spouseDob;
    protected String spouseExpirationDate;
    protected String spouseFirstName;
    protected String spouseHomePhone;
    protected String spouseIssuedDate;
    protected String spouseLastName;
    protected String spouseMiddleName;
    protected String spouseSSN;
    protected String spouseSSN1;
    protected String spouseSSN2;
    protected String spouseSSN3;
    protected String spouseStateCode;
    protected String state;
    protected String stateCodeIssued;
    protected long taxPayerId;
    protected long totalRowCount;
    protected long uniqueIdSSN;
    protected int userId;
    protected String userName;
    protected String userType;
    protected int userTypeId;
    protected String userTypeName;
    protected int year;
    protected long zipcode;

    /**
     * Gets the value of the accountInActiveReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountInActiveReason() {
        return accountInActiveReason;
    }

    /**
     * Sets the value of the accountInActiveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountInActiveReason(String value) {
        this.accountInActiveReason = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountTypeId property.
     * 
     */
    public int getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * Sets the value of the accountTypeId property.
     * 
     */
    public void setAccountTypeId(int value) {
        this.accountTypeId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the adminFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminFlag() {
        return adminFlag;
    }

    /**
     * Sets the value of the adminFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminFlag(String value) {
        this.adminFlag = value;
    }

    /**
     * Gets the value of the agencyVendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyVendorName() {
        return agencyVendorName;
    }

    /**
     * Sets the value of the agencyVendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyVendorName(String value) {
        this.agencyVendorName = value;
    }

    /**
     * Gets the value of the allowChat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowChat() {
        return allowChat;
    }

    /**
     * Sets the value of the allowChat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowChat(String value) {
        this.allowChat = value;
    }

    /**
     * Gets the value of the allowEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowEmail() {
        return allowEmail;
    }

    /**
     * Sets the value of the allowEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowEmail(String value) {
        this.allowEmail = value;
    }

    /**
     * Gets the value of the attemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttemptFlag() {
        return attemptFlag;
    }

    /**
     * Sets the value of the attemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttemptFlag(String value) {
        this.attemptFlag = value;
    }

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellNumber(String value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the changePwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePwd() {
        return changePwd;
    }

    /**
     * Sets the value of the changePwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePwd(String value) {
        this.changePwd = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientLocationId property.
     * 
     */
    public int getClientLocationId() {
        return clientLocationId;
    }

    /**
     * Sets the value of the clientLocationId property.
     * 
     */
    public void setClientLocationId(int value) {
        this.clientLocationId = value;
    }

    /**
     * Gets the value of the clientLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLogo() {
        return clientLogo;
    }

    /**
     * Sets the value of the clientLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLogo(String value) {
        this.clientLogo = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     */
    public void setCreatedBy(int value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the dmv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmv() {
        return dmv;
    }

    /**
     * Sets the value of the dmv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmv(String value) {
        this.dmv = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expiryDays property.
     * 
     */
    public int getExpiryDays() {
        return expiryDays;
    }

    /**
     * Sets the value of the expiryDays property.
     * 
     */
    public void setExpiryDays(int value) {
        this.expiryDays = value;
    }

    /**
     * Gets the value of the filerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilerFirstName() {
        return filerFirstName;
    }

    /**
     * Sets the value of the filerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilerFirstName(String value) {
        this.filerFirstName = value;
    }

    /**
     * Gets the value of the filerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilerLastName() {
        return filerLastName;
    }

    /**
     * Sets the value of the filerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilerLastName(String value) {
        this.filerLastName = value;
    }

    /**
     * Gets the value of the filerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilerMiddleName() {
        return filerMiddleName;
    }

    /**
     * Sets the value of the filerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilerMiddleName(String value) {
        this.filerMiddleName = value;
    }

    /**
     * Gets the value of the filerSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilerSSN() {
        return filerSSN;
    }

    /**
     * Sets the value of the filerSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilerSSN(String value) {
        this.filerSSN = value;
    }

    /**
     * Gets the value of the filersSSN1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilersSSN1() {
        return filersSSN1;
    }

    /**
     * Sets the value of the filersSSN1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilersSSN1(String value) {
        this.filersSSN1 = value;
    }

    /**
     * Gets the value of the filersSSN2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilersSSN2() {
        return filersSSN2;
    }

    /**
     * Sets the value of the filersSSN2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilersSSN2(String value) {
        this.filersSSN2 = value;
    }

    /**
     * Gets the value of the filersSSN3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilersSSN3() {
        return filersSSN3;
    }

    /**
     * Sets the value of the filersSSN3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilersSSN3(String value) {
        this.filersSSN3 = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the inCareAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCareAddress() {
        return inCareAddress;
    }

    /**
     * Sets the value of the inCareAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCareAddress(String value) {
        this.inCareAddress = value;
    }

    /**
     * Gets the value of the isAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdmin() {
        return isAdmin;
    }

    /**
     * Sets the value of the isAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdmin(String value) {
        this.isAdmin = value;
    }

    /**
     * Gets the value of the isAuditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAuditor() {
        return isAuditor;
    }

    /**
     * Sets the value of the isAuditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAuditor(String value) {
        this.isAuditor = value;
    }

    /**
     * Gets the value of the isSupervisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSupervisor() {
        return isSupervisor;
    }

    /**
     * Sets the value of the isSupervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSupervisor(String value) {
        this.isSupervisor = value;
    }

    /**
     * Gets the value of the isSystemUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSystemUser() {
        return isSystemUser;
    }

    /**
     * Sets the value of the isSystemUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSystemUser(String value) {
        this.isSystemUser = value;
    }

    /**
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedDate(String value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the loginAttempts property.
     * 
     */
    public int getLoginAttempts() {
        return loginAttempts;
    }

    /**
     * Sets the value of the loginAttempts property.
     * 
     */
    public void setLoginAttempts(int value) {
        this.loginAttempts = value;
    }

    /**
     * Gets the value of the loginCounter property.
     * 
     */
    public int getLoginCounter() {
        return loginCounter;
    }

    /**
     * Sets the value of the loginCounter property.
     * 
     */
    public void setLoginCounter(int value) {
        this.loginCounter = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the notificationEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmailId() {
        return notificationEmailId;
    }

    /**
     * Sets the value of the notificationEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmailId(String value) {
        this.notificationEmailId = value;
    }

    /**
     * Gets the value of the notificationMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMobile() {
        return notificationMobile;
    }

    /**
     * Sets the value of the notificationMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMobile(String value) {
        this.notificationMobile = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordExpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordExpire() {
        return passwordExpire;
    }

    /**
     * Sets the value of the passwordExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordExpire(String value) {
        this.passwordExpire = value;
    }

    /**
     * Gets the value of the passwordExpiryDays property.
     * 
     */
    public int getPasswordExpiryDays() {
        return passwordExpiryDays;
    }

    /**
     * Sets the value of the passwordExpiryDays property.
     * 
     */
    public void setPasswordExpiryDays(int value) {
        this.passwordExpiryDays = value;
    }

    /**
     * Gets the value of the passwordchangenxttm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordchangenxttm() {
        return passwordchangenxttm;
    }

    /**
     * Sets the value of the passwordchangenxttm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordchangenxttm(String value) {
        this.passwordchangenxttm = value;
    }

    /**
     * Gets the value of the passwords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Password }
     * 
     * 
     */
    public List<Password> getPasswords() {
        if (passwords == null) {
            passwords = new ArrayList<Password>();
        }
        return this.passwords;
    }

    /**
     * Gets the value of the poiId property.
     * 
     */
    public int getPoiId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     */
    public void setPoiId(int value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the reportToEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportToEmailId() {
        return reportToEmailId;
    }

    /**
     * Sets the value of the reportToEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportToEmailId(String value) {
        this.reportToEmailId = value;
    }

    /**
     * Gets the value of the reportToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportToId() {
        return reportToId;
    }

    /**
     * Sets the value of the reportToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportToId(String value) {
        this.reportToId = value;
    }

    /**
     * Gets the value of the reportToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportToName() {
        return reportToName;
    }

    /**
     * Sets the value of the reportToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportToName(String value) {
        this.reportToName = value;
    }

    /**
     * Gets the value of the resetPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetPassword() {
        return resetPassword;
    }

    /**
     * Sets the value of the resetPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetPassword(String value) {
        this.resetPassword = value;
    }

    /**
     * Gets the value of the scoutEmailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoutEmailNotification() {
        return scoutEmailNotification;
    }

    /**
     * Sets the value of the scoutEmailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoutEmailNotification(String value) {
        this.scoutEmailNotification = value;
    }

    /**
     * Gets the value of the scoutSMSNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoutSMSNotification() {
        return scoutSMSNotification;
    }

    /**
     * Sets the value of the scoutSMSNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoutSMSNotification(String value) {
        this.scoutSMSNotification = value;
    }

    /**
     * Gets the value of the sentryEmailNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentryEmailNotification() {
        return sentryEmailNotification;
    }

    /**
     * Sets the value of the sentryEmailNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentryEmailNotification(String value) {
        this.sentryEmailNotification = value;
    }

    /**
     * Gets the value of the sentrySMSNotification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentrySMSNotification() {
        return sentrySMSNotification;
    }

    /**
     * Sets the value of the sentrySMSNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentrySMSNotification(String value) {
        this.sentrySMSNotification = value;
    }

    /**
     * Gets the value of the skillType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillType() {
        return skillType;
    }

    /**
     * Sets the value of the skillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillType(String value) {
        this.skillType = value;
    }

    /**
     * Gets the value of the socialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialId() {
        return socialId;
    }

    /**
     * Sets the value of the socialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialId(String value) {
        this.socialId = value;
    }

    /**
     * Gets the value of the socialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialType() {
        return socialType;
    }

    /**
     * Sets the value of the socialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialType(String value) {
        this.socialType = value;
    }

    /**
     * Gets the value of the spouseDMV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseDMV() {
        return spouseDMV;
    }

    /**
     * Sets the value of the spouseDMV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseDMV(String value) {
        this.spouseDMV = value;
    }

    /**
     * Gets the value of the spouseDob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseDob() {
        return spouseDob;
    }

    /**
     * Sets the value of the spouseDob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseDob(String value) {
        this.spouseDob = value;
    }

    /**
     * Gets the value of the spouseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseExpirationDate() {
        return spouseExpirationDate;
    }

    /**
     * Sets the value of the spouseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseExpirationDate(String value) {
        this.spouseExpirationDate = value;
    }

    /**
     * Gets the value of the spouseFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    /**
     * Sets the value of the spouseFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFirstName(String value) {
        this.spouseFirstName = value;
    }

    /**
     * Gets the value of the spouseHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseHomePhone() {
        return spouseHomePhone;
    }

    /**
     * Sets the value of the spouseHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseHomePhone(String value) {
        this.spouseHomePhone = value;
    }

    /**
     * Gets the value of the spouseIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseIssuedDate() {
        return spouseIssuedDate;
    }

    /**
     * Sets the value of the spouseIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseIssuedDate(String value) {
        this.spouseIssuedDate = value;
    }

    /**
     * Gets the value of the spouseLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseLastName() {
        return spouseLastName;
    }

    /**
     * Sets the value of the spouseLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseLastName(String value) {
        this.spouseLastName = value;
    }

    /**
     * Gets the value of the spouseMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseMiddleName() {
        return spouseMiddleName;
    }

    /**
     * Sets the value of the spouseMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseMiddleName(String value) {
        this.spouseMiddleName = value;
    }

    /**
     * Gets the value of the spouseSSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseSSN() {
        return spouseSSN;
    }

    /**
     * Sets the value of the spouseSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseSSN(String value) {
        this.spouseSSN = value;
    }

    /**
     * Gets the value of the spouseSSN1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseSSN1() {
        return spouseSSN1;
    }

    /**
     * Sets the value of the spouseSSN1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseSSN1(String value) {
        this.spouseSSN1 = value;
    }

    /**
     * Gets the value of the spouseSSN2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseSSN2() {
        return spouseSSN2;
    }

    /**
     * Sets the value of the spouseSSN2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseSSN2(String value) {
        this.spouseSSN2 = value;
    }

    /**
     * Gets the value of the spouseSSN3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseSSN3() {
        return spouseSSN3;
    }

    /**
     * Sets the value of the spouseSSN3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseSSN3(String value) {
        this.spouseSSN3 = value;
    }

    /**
     * Gets the value of the spouseStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseStateCode() {
        return spouseStateCode;
    }

    /**
     * Sets the value of the spouseStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseStateCode(String value) {
        this.spouseStateCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateCodeIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCodeIssued() {
        return stateCodeIssued;
    }

    /**
     * Sets the value of the stateCodeIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCodeIssued(String value) {
        this.stateCodeIssued = value;
    }

    /**
     * Gets the value of the taxPayerId property.
     * 
     */
    public long getTaxPayerId() {
        return taxPayerId;
    }

    /**
     * Sets the value of the taxPayerId property.
     * 
     */
    public void setTaxPayerId(long value) {
        this.taxPayerId = value;
    }

    /**
     * Gets the value of the totalRowCount property.
     * 
     */
    public long getTotalRowCount() {
        return totalRowCount;
    }

    /**
     * Sets the value of the totalRowCount property.
     * 
     */
    public void setTotalRowCount(long value) {
        this.totalRowCount = value;
    }

    /**
     * Gets the value of the uniqueIdSSN property.
     * 
     */
    public long getUniqueIdSSN() {
        return uniqueIdSSN;
    }

    /**
     * Sets the value of the uniqueIdSSN property.
     * 
     */
    public void setUniqueIdSSN(long value) {
        this.uniqueIdSSN = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the userTypeId property.
     * 
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    /**
     * Sets the value of the userTypeId property.
     * 
     */
    public void setUserTypeId(int value) {
        this.userTypeId = value;
    }

    /**
     * Gets the value of the userTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTypeName() {
        return userTypeName;
    }

    /**
     * Sets the value of the userTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTypeName(String value) {
        this.userTypeName = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     */
    public long getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     */
    public void setZipcode(long value) {
        this.zipcode = value;
    }

}
