
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiW9Pdf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiW9Pdf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemptPayEECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatcaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="individual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasttName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ltdLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ltdLiabilitytext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requesterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxPayerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tinVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trustEstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="w9Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiW9Pdf", propOrder = {
    "accountNumber",
    "active",
    "addrNumber",
    "apt",
    "businessName",
    "ccorporation",
    "city",
    "ein",
    "exemptPayEECode",
    "fatcaCode",
    "firstName",
    "individual",
    "lasttName",
    "ltdLiability",
    "ltdLiabilitytext",
    "middleName",
    "other",
    "otherTxt",
    "partnership",
    "requesterAddr",
    "requesterName",
    "scorporation",
    "ssn",
    "state",
    "street",
    "suitNo",
    "taxPayerId",
    "tinVerifiedDate",
    "trustEstate",
    "userId",
    "w9Year",
    "zipCode"
})
public class SfiW9Pdf {

    protected String accountNumber;
    protected String active;
    protected String addrNumber;
    protected String apt;
    protected String businessName;
    protected String ccorporation;
    protected String city;
    protected String ein;
    protected String exemptPayEECode;
    protected String fatcaCode;
    protected String firstName;
    protected String individual;
    protected String lasttName;
    protected String ltdLiability;
    protected String ltdLiabilitytext;
    protected String middleName;
    protected String other;
    protected String otherTxt;
    protected String partnership;
    protected String requesterAddr;
    protected String requesterName;
    protected String scorporation;
    protected String ssn;
    protected String state;
    protected String street;
    protected String suitNo;
    protected Integer taxPayerId;
    protected String tinVerifiedDate;
    protected String trustEstate;
    protected Integer userId;
    protected Integer w9Year;
    protected Integer zipCode;

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
     * Gets the value of the addrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrNumber() {
        return addrNumber;
    }

    /**
     * Sets the value of the addrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrNumber(String value) {
        this.addrNumber = value;
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
     * Gets the value of the ccorporation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcorporation() {
        return ccorporation;
    }

    /**
     * Sets the value of the ccorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcorporation(String value) {
        this.ccorporation = value;
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
     * Gets the value of the exemptPayEECode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptPayEECode() {
        return exemptPayEECode;
    }

    /**
     * Sets the value of the exemptPayEECode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptPayEECode(String value) {
        this.exemptPayEECode = value;
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
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividual(String value) {
        this.individual = value;
    }

    /**
     * Gets the value of the lasttName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLasttName() {
        return lasttName;
    }

    /**
     * Sets the value of the lasttName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasttName(String value) {
        this.lasttName = value;
    }

    /**
     * Gets the value of the ltdLiability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdLiability() {
        return ltdLiability;
    }

    /**
     * Sets the value of the ltdLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtdLiability(String value) {
        this.ltdLiability = value;
    }

    /**
     * Gets the value of the ltdLiabilitytext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdLiabilitytext() {
        return ltdLiabilitytext;
    }

    /**
     * Sets the value of the ltdLiabilitytext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtdLiabilitytext(String value) {
        this.ltdLiabilitytext = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnership() {
        return partnership;
    }

    /**
     * Sets the value of the partnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnership(String value) {
        this.partnership = value;
    }

    /**
     * Gets the value of the requesterAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterAddr() {
        return requesterAddr;
    }

    /**
     * Sets the value of the requesterAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterAddr(String value) {
        this.requesterAddr = value;
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
     * Gets the value of the scorporation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorporation() {
        return scorporation;
    }

    /**
     * Sets the value of the scorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorporation(String value) {
        this.scorporation = value;
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
     * Gets the value of the taxPayerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxPayerId() {
        return taxPayerId;
    }

    /**
     * Sets the value of the taxPayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxPayerId(Integer value) {
        this.taxPayerId = value;
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
     * Gets the value of the trustEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustEstate() {
        return trustEstate;
    }

    /**
     * Sets the value of the trustEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustEstate(String value) {
        this.trustEstate = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the w9Year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getW9Year() {
        return w9Year;
    }

    /**
     * Sets the value of the w9Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setW9Year(Integer value) {
        this.w9Year = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZipCode(Integer value) {
        this.zipCode = value;
    }

}
