
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for w9FormRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="w9FormRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemptPayeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatcaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="individule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitLibCom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitLibComTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="otherTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requesterAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trustOrEsate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "w9FormRequest", propOrder = {
    "accountType",
    "active",
    "addressNumber",
    "apt",
    "businessName",
    "city",
    "ein",
    "emailId",
    "exemptPayeeCode",
    "fatcaCode",
    "firstName",
    "id",
    "individule",
    "lastName",
    "legalName",
    "limitLibCom",
    "limitLibComTxt",
    "listAccNo",
    "loginName",
    "middleName",
    "other",
    "otherTxt",
    "partnership",
    "requesterAddress",
    "requesterName",
    "ssn",
    "state",
    "street",
    "submitFlag",
    "suitNo",
    "trustOrEsate",
    "url",
    "zipcode",
    "cCorporation",
    "sCorporation"
})
public class W9FormRequest
    extends GlobalRequest
{

    protected String accountType;
    protected boolean active;
    protected String addressNumber;
    protected String apt;
    protected String businessName;
    protected String city;
    protected String ein;
    protected String emailId;
    protected String exemptPayeeCode;
    protected String fatcaCode;
    protected String firstName;
    protected long id;
    protected boolean individule;
    protected String lastName;
    protected String legalName;
    protected boolean limitLibCom;
    protected String limitLibComTxt;
    protected String listAccNo;
    protected String loginName;
    protected String middleName;
    protected boolean other;
    protected String otherTxt;
    protected boolean partnership;
    protected String requesterAddress;
    protected String requesterName;
    protected String ssn;
    protected String state;
    protected String street;
    protected String submitFlag;
    protected String suitNo;
    protected boolean trustOrEsate;
    protected String url;
    protected String zipcode;
    protected boolean cCorporation;
    protected boolean sCorporation;

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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the apt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApt() {
        return apt;
    }

    /**
     * Sets the value of the apt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApt(String value) {
        this.apt = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
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
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEin() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEin(String value) {
        this.ein = value;
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
     * Gets the value of the exemptPayeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptPayeeCode() {
        return exemptPayeeCode;
    }

    /**
     * Sets the value of the exemptPayeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptPayeeCode(String value) {
        this.exemptPayeeCode = value;
    }

    /**
     * Gets the value of the fatcaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatcaCode() {
        return fatcaCode;
    }

    /**
     * Sets the value of the fatcaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatcaCode(String value) {
        this.fatcaCode = value;
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
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the individule property.
     * 
     */
    public boolean isIndividule() {
        return individule;
    }

    /**
     * Sets the value of the individule property.
     * 
     */
    public void setIndividule(boolean value) {
        this.individule = value;
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
     * Gets the value of the limitLibCom property.
     * 
     */
    public boolean isLimitLibCom() {
        return limitLibCom;
    }

    /**
     * Sets the value of the limitLibCom property.
     * 
     */
    public void setLimitLibCom(boolean value) {
        this.limitLibCom = value;
    }

    /**
     * Gets the value of the limitLibComTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitLibComTxt() {
        return limitLibComTxt;
    }

    /**
     * Sets the value of the limitLibComTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitLibComTxt(String value) {
        this.limitLibComTxt = value;
    }

    /**
     * Gets the value of the listAccNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAccNo() {
        return listAccNo;
    }

    /**
     * Sets the value of the listAccNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAccNo(String value) {
        this.listAccNo = value;
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
     * Gets the value of the other property.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

    /**
     * Gets the value of the otherTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherTxt() {
        return otherTxt;
    }

    /**
     * Sets the value of the otherTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherTxt(String value) {
        this.otherTxt = value;
    }

    /**
     * Gets the value of the partnership property.
     * 
     */
    public boolean isPartnership() {
        return partnership;
    }

    /**
     * Sets the value of the partnership property.
     * 
     */
    public void setPartnership(boolean value) {
        this.partnership = value;
    }

    /**
     * Gets the value of the requesterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterAddress() {
        return requesterAddress;
    }

    /**
     * Sets the value of the requesterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterAddress(String value) {
        this.requesterAddress = value;
    }

    /**
     * Gets the value of the requesterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterName() {
        return requesterName;
    }

    /**
     * Sets the value of the requesterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterName(String value) {
        this.requesterName = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the submitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitFlag() {
        return submitFlag;
    }

    /**
     * Sets the value of the submitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitFlag(String value) {
        this.submitFlag = value;
    }

    /**
     * Gets the value of the suitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuitNo() {
        return suitNo;
    }

    /**
     * Sets the value of the suitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuitNo(String value) {
        this.suitNo = value;
    }

    /**
     * Gets the value of the trustOrEsate property.
     * 
     */
    public boolean isTrustOrEsate() {
        return trustOrEsate;
    }

    /**
     * Sets the value of the trustOrEsate property.
     * 
     */
    public void setTrustOrEsate(boolean value) {
        this.trustOrEsate = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the cCorporation property.
     * 
     */
    public boolean isCCorporation() {
        return cCorporation;
    }

    /**
     * Sets the value of the cCorporation property.
     * 
     */
    public void setCCorporation(boolean value) {
        this.cCorporation = value;
    }

    /**
     * Gets the value of the sCorporation property.
     * 
     */
    public boolean isSCorporation() {
        return sCorporation;
    }

    /**
     * Sets the value of the sCorporation property.
     * 
     */
    public void setSCorporation(boolean value) {
        this.sCorporation = value;
    }

}
