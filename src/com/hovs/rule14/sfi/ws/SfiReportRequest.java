
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiReportRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminUserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiReportRequest", propOrder = {
    "accountTypeDescription",
    "accountTypeId",
    "adminUserId",
    "fromDate",
    "fromRow",
    "imode",
    "reportFlag",
    "reportName",
    "reportType",
    "sortSequence",
    "toDate",
    "toRow",
    "validationStatus"
})
public class SfiReportRequest {

    protected String accountTypeDescription;
    protected String accountTypeId;
    protected long adminUserId;
    protected String fromDate;
    protected int fromRow;
    protected int imode;
    protected int reportFlag;
    protected String reportName;
    protected String reportType;
    protected String sortSequence;
    protected String toDate;
    protected int toRow;
    protected String validationStatus;

    /**
     * Gets the value of the accountTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    /**
     * Sets the value of the accountTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeDescription(String value) {
        this.accountTypeDescription = value;
    }

    /**
     * Gets the value of the accountTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * Sets the value of the accountTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeId(String value) {
        this.accountTypeId = value;
    }

    /**
     * Gets the value of the adminUserId property.
     * 
     */
    public long getAdminUserId() {
        return adminUserId;
    }

    /**
     * Sets the value of the adminUserId property.
     * 
     */
    public void setAdminUserId(long value) {
        this.adminUserId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the fromRow property.
     * 
     */
    public int getFromRow() {
        return fromRow;
    }

    /**
     * Sets the value of the fromRow property.
     * 
     */
    public void setFromRow(int value) {
        this.fromRow = value;
    }

    /**
     * Gets the value of the imode property.
     * 
     */
    public int getImode() {
        return imode;
    }

    /**
     * Sets the value of the imode property.
     * 
     */
    public void setImode(int value) {
        this.imode = value;
    }

    /**
     * Gets the value of the reportFlag property.
     * 
     */
    public int getReportFlag() {
        return reportFlag;
    }

    /**
     * Sets the value of the reportFlag property.
     * 
     */
    public void setReportFlag(int value) {
        this.reportFlag = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the sortSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortSequence() {
        return sortSequence;
    }

    /**
     * Sets the value of the sortSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortSequence(String value) {
        this.sortSequence = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the toRow property.
     * 
     */
    public int getToRow() {
        return toRow;
    }

    /**
     * Sets the value of the toRow property.
     * 
     */
    public void setToRow(int value) {
        this.toRow = value;
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

}
