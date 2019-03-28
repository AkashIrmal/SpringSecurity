
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiW9Form complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiW9Form">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfiRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxpayerW9Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="w9Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiW9Form", propOrder = {
    "createdOn",
    "emailId",
    "name",
    "sfiRefNo",
    "tin",
    "taxpayerW9Id",
    "totalRowCount",
    "w9Year"
})
public class SfiW9Form {

    protected String createdOn;
    protected String emailId;
    protected String name;
    protected String sfiRefNo;
    @XmlElement(name = "TIN")
    protected String tin;
    protected long taxpayerW9Id;
    protected long totalRowCount;
    protected Integer w9Year;

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
     * Gets the value of the sfiRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfiRefNo() {
        return sfiRefNo;
    }

    /**
     * Sets the value of the sfiRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfiRefNo(String value) {
        this.sfiRefNo = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIN() {
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
    public void setTIN(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the taxpayerW9Id property.
     * 
     */
    public long getTaxpayerW9Id() {
        return taxpayerW9Id;
    }

    /**
     * Sets the value of the taxpayerW9Id property.
     * 
     */
    public void setTaxpayerW9Id(long value) {
        this.taxpayerW9Id = value;
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

}
