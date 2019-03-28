
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserProfileRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lawFirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserProfileRequest", propOrder = {
    "accountTypeId",
    "lawFirm",
    "userId"
})
public class GetUserProfileRequest {

    protected int accountTypeId;
    protected String lawFirm;
    protected int userId;

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

}
