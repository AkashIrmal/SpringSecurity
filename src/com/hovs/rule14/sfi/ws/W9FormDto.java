
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for w9FormDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="w9FormDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="addressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemptPayeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatcaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="individule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitLibCom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="limitLibComTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listAccNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modifiedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="otherTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requesterAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trustOrEsate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="w9Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sCorporation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "w9FormDto", propOrder = {
    "accountType",
    "active",
    "addressNumber",
    "apt",
    "businessName",
    "city",
    "createdBy",
    "createdOn",
    "ein",
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
    "middleName",
    "modifiedBy",
    "modifiedOn",
    "other",
    "otherTxt",
    "partnership",
    "requesterAddress",
    "requesterName",
    "ssn",
    "state",
    "street",
    "suitNo",
    "tinVerifiedDate",
    "trustOrEsate",
    "userId",
    "w9Year",
    "zipcode",
    "cCorporation",
    "sCorporation"
})
public class W9FormDto {

    protected String accountType;
    protected boolean active;
    protected String addressNumber;
    protected String apt;
    protected String businessName;
    protected String city;
    protected long createdBy;
    protected String createdOn;
    protected String ein;
    protected String exemptPayeeCode;
    protected String fatcaCode;
    protected String firstName;
    protected int id;
    protected boolean individule;
    protected String lastName;
    protected String legalName;
    protected boolean limitLibCom;
    protected String limitLibComTxt;
    protected String listAccNo;
    protected String middleName;
    protected long modifiedBy;
    protected String modifiedOn;
    protected boolean other;
    protected String otherTxt;
    protected boolean partnership;
    protected String requesterAddress;
    protected String requesterName;
    protected String ssn;
    protected String state;
    protected String street;
    protected String suitNo;
    protected String tinVerifiedDate;
    protected boolean trustOrEsate;
    protected long userId;
    protected int w9Year;
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
     * Gets the value of the createdBy property.
     * 
     */
    public long getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     */
    public void setCreatedBy(long value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
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
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
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
     * Gets the value of the modifiedBy property.
     * 
     */
    public long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     */
    public void setModifiedBy(long value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Sets the value of the modifiedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedOn(String value) {
        this.modifiedOn = value;
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
     * Gets the value of the tinVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinVerifiedDate() {
        return tinVerifiedDate;
    }

    /**
     * Sets the value of the tinVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinVerifiedDate(String value) {
        this.tinVerifiedDate = value;
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
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the w9Year property.
     * 
     */
    public int getW9Year() {
        return w9Year;
    }

    /**
     * Sets the value of the w9Year property.
     * 
     */
    public void setW9Year(int value) {
        this.w9Year = value;
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
