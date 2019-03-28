
package com.hovs.rule14.sfi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiReportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiReportDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityStateZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateMailSent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateUserRegisteredOnSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateW9Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileTransDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgCountIngestedDocDNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgCountStorage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgCountStorageFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgCountStoredDocDNAFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTinVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lawFirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listSortCriteria" type="{http://ws.sfi.rule14.hovs.com/}sortCriteriaForReportDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputFileDocDNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portalMaintainanceFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousDbaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfiReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shovReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suitNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalImgCountStoredDocDNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNoOfW9recordsUpdated" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalNoofNewCustomers" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalRows" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiReportDto", propOrder = {
    "accountType",
    "addressLine1",
    "apt",
    "city",
    "cityStateZipcode",
    "dateAdded",
    "dateMailSent",
    "dateUserRegisteredOnSite",
    "dateW9Updated",
    "dbaName",
    "fileTransDate",
    "imgCountIngestedDocDNA",
    "imgCountStorage",
    "imgCountStorageFees",
    "imgCountStoredDocDNAFees",
    "lastTinVerifiedDate",
    "lawFirm",
    "legalName",
    "listSortCriteria",
    "name",
    "outputFileDocDNA",
    "portalMaintainanceFees",
    "previousAddressLine1",
    "previousCity",
    "previousDbaName",
    "previousLegalName",
    "previousState",
    "previousTin",
    "previousZipcode",
    "registrationDate",
    "role",
    "sfiReferenceNo",
    "shovReceiptDate",
    "state",
    "status",
    "street",
    "suitNo",
    "tin",
    "tinVerifiedDate",
    "totalFees",
    "totalImgCountStoredDocDNA",
    "totalNoOfW9RecordsUpdated",
    "totalNoofNewCustomers",
    "totalRows",
    "typeOfBusiness",
    "userId",
    "validationStatus",
    "zipcode"
})
public class SfiReportDto {

    protected String accountType;
    protected String addressLine1;
    protected String apt;
    protected String city;
    protected String cityStateZipcode;
    protected String dateAdded;
    protected String dateMailSent;
    protected String dateUserRegisteredOnSite;
    protected String dateW9Updated;
    protected String dbaName;
    protected String fileTransDate;
    protected String imgCountIngestedDocDNA;
    protected String imgCountStorage;
    protected String imgCountStorageFees;
    protected String imgCountStoredDocDNAFees;
    protected String lastTinVerifiedDate;
    protected String lawFirm;
    protected String legalName;
    @XmlElement(nillable = true)
    protected List<SortCriteriaForReportDto> listSortCriteria;
    protected String name;
    protected String outputFileDocDNA;
    protected String portalMaintainanceFees;
    protected String previousAddressLine1;
    protected String previousCity;
    protected String previousDbaName;
    protected String previousLegalName;
    protected String previousState;
    protected String previousTin;
    protected String previousZipcode;
    protected String registrationDate;
    protected String role;
    protected String sfiReferenceNo;
    protected String shovReceiptDate;
    protected String state;
    protected String status;
    protected String street;
    protected String suitNo;
    protected String tin;
    protected String tinVerifiedDate;
    protected String totalFees;
    protected String totalImgCountStoredDocDNA;
    @XmlElement(name = "totalNoOfW9recordsUpdated")
    protected long totalNoOfW9RecordsUpdated;
    protected long totalNoofNewCustomers;
    protected long totalRows;
    protected String typeOfBusiness;
    protected String userId;
    protected String validationStatus;
    protected String zipcode;

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
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
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
     * Gets the value of the cityStateZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityStateZipcode() {
        return cityStateZipcode;
    }

    /**
     * Sets the value of the cityStateZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityStateZipcode(String value) {
        this.cityStateZipcode = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAdded(String value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the dateMailSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateMailSent() {
        return dateMailSent;
    }

    /**
     * Sets the value of the dateMailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateMailSent(String value) {
        this.dateMailSent = value;
    }

    /**
     * Gets the value of the dateUserRegisteredOnSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateUserRegisteredOnSite() {
        return dateUserRegisteredOnSite;
    }

    /**
     * Sets the value of the dateUserRegisteredOnSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUserRegisteredOnSite(String value) {
        this.dateUserRegisteredOnSite = value;
    }

    /**
     * Gets the value of the dateW9Updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateW9Updated() {
        return dateW9Updated;
    }

    /**
     * Sets the value of the dateW9Updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateW9Updated(String value) {
        this.dateW9Updated = value;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbaName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbaName(String value) {
        this.dbaName = value;
    }

    /**
     * Gets the value of the fileTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTransDate() {
        return fileTransDate;
    }

    /**
     * Sets the value of the fileTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTransDate(String value) {
        this.fileTransDate = value;
    }

    /**
     * Gets the value of the imgCountIngestedDocDNA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgCountIngestedDocDNA() {
        return imgCountIngestedDocDNA;
    }

    /**
     * Sets the value of the imgCountIngestedDocDNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgCountIngestedDocDNA(String value) {
        this.imgCountIngestedDocDNA = value;
    }

    /**
     * Gets the value of the imgCountStorage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgCountStorage() {
        return imgCountStorage;
    }

    /**
     * Sets the value of the imgCountStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgCountStorage(String value) {
        this.imgCountStorage = value;
    }

    /**
     * Gets the value of the imgCountStorageFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgCountStorageFees() {
        return imgCountStorageFees;
    }

    /**
     * Sets the value of the imgCountStorageFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgCountStorageFees(String value) {
        this.imgCountStorageFees = value;
    }

    /**
     * Gets the value of the imgCountStoredDocDNAFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgCountStoredDocDNAFees() {
        return imgCountStoredDocDNAFees;
    }

    /**
     * Sets the value of the imgCountStoredDocDNAFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgCountStoredDocDNAFees(String value) {
        this.imgCountStoredDocDNAFees = value;
    }

    /**
     * Gets the value of the lastTinVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTinVerifiedDate() {
        return lastTinVerifiedDate;
    }

    /**
     * Sets the value of the lastTinVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTinVerifiedDate(String value) {
        this.lastTinVerifiedDate = value;
    }

    /**
     * Gets the value of the lawFirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawFirm() {
        return lawFirm;
    }

    /**
     * Sets the value of the lawFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawFirm(String value) {
        this.lawFirm = value;
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
     * Gets the value of the listSortCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listSortCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListSortCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortCriteriaForReportDto }
     * 
     * 
     */
    public List<SortCriteriaForReportDto> getListSortCriteria() {
        if (listSortCriteria == null) {
            listSortCriteria = new ArrayList<SortCriteriaForReportDto>();
        }
        return this.listSortCriteria;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the outputFileDocDNA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFileDocDNA() {
        return outputFileDocDNA;
    }

    /**
     * Sets the value of the outputFileDocDNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFileDocDNA(String value) {
        this.outputFileDocDNA = value;
    }

    /**
     * Gets the value of the portalMaintainanceFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalMaintainanceFees() {
        return portalMaintainanceFees;
    }

    /**
     * Sets the value of the portalMaintainanceFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalMaintainanceFees(String value) {
        this.portalMaintainanceFees = value;
    }

    /**
     * Gets the value of the previousAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousAddressLine1() {
        return previousAddressLine1;
    }

    /**
     * Sets the value of the previousAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousAddressLine1(String value) {
        this.previousAddressLine1 = value;
    }

    /**
     * Gets the value of the previousCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCity() {
        return previousCity;
    }

    /**
     * Sets the value of the previousCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCity(String value) {
        this.previousCity = value;
    }

    /**
     * Gets the value of the previousDbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDbaName() {
        return previousDbaName;
    }

    /**
     * Sets the value of the previousDbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDbaName(String value) {
        this.previousDbaName = value;
    }

    /**
     * Gets the value of the previousLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousLegalName() {
        return previousLegalName;
    }

    /**
     * Sets the value of the previousLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousLegalName(String value) {
        this.previousLegalName = value;
    }

    /**
     * Gets the value of the previousState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousState() {
        return previousState;
    }

    /**
     * Sets the value of the previousState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousState(String value) {
        this.previousState = value;
    }

    /**
     * Gets the value of the previousTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousTin() {
        return previousTin;
    }

    /**
     * Sets the value of the previousTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousTin(String value) {
        this.previousTin = value;
    }

    /**
     * Gets the value of the previousZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousZipcode() {
        return previousZipcode;
    }

    /**
     * Sets the value of the previousZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousZipcode(String value) {
        this.previousZipcode = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the sfiReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfiReferenceNo() {
        return sfiReferenceNo;
    }

    /**
     * Sets the value of the sfiReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfiReferenceNo(String value) {
        this.sfiReferenceNo = value;
    }

    /**
     * Gets the value of the shovReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShovReceiptDate() {
        return shovReceiptDate;
    }

    /**
     * Sets the value of the shovReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShovReceiptDate(String value) {
        this.shovReceiptDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
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
     * Gets the value of the totalFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFees() {
        return totalFees;
    }

    /**
     * Sets the value of the totalFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFees(String value) {
        this.totalFees = value;
    }

    /**
     * Gets the value of the totalImgCountStoredDocDNA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImgCountStoredDocDNA() {
        return totalImgCountStoredDocDNA;
    }

    /**
     * Sets the value of the totalImgCountStoredDocDNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImgCountStoredDocDNA(String value) {
        this.totalImgCountStoredDocDNA = value;
    }

    /**
     * Gets the value of the totalNoOfW9RecordsUpdated property.
     * 
     */
    public long getTotalNoOfW9RecordsUpdated() {
        return totalNoOfW9RecordsUpdated;
    }

    /**
     * Sets the value of the totalNoOfW9RecordsUpdated property.
     * 
     */
    public void setTotalNoOfW9RecordsUpdated(long value) {
        this.totalNoOfW9RecordsUpdated = value;
    }

    /**
     * Gets the value of the totalNoofNewCustomers property.
     * 
     */
    public long getTotalNoofNewCustomers() {
        return totalNoofNewCustomers;
    }

    /**
     * Sets the value of the totalNoofNewCustomers property.
     * 
     */
    public void setTotalNoofNewCustomers(long value) {
        this.totalNoofNewCustomers = value;
    }

    /**
     * Gets the value of the totalRows property.
     * 
     */
    public long getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalRows property.
     * 
     */
    public void setTotalRows(long value) {
        this.totalRows = value;
    }

    /**
     * Gets the value of the typeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    /**
     * Sets the value of the typeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfBusiness(String value) {
        this.typeOfBusiness = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
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

}
