
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changePassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changePassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changePasswordRequest" type="{http://ws.admin.rule14.hovs.com/}changePasswordRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePassword", propOrder = {
    "changePasswordRequest"
})
public class ChangePassword {

    protected ChangePasswordRequest changePasswordRequest;

    /**
     * Gets the value of the changePasswordRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordRequest }
     *     
     */
    public ChangePasswordRequest getChangePasswordRequest() {
        return changePasswordRequest;
    }

    /**
     * Sets the value of the changePasswordRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordRequest }
     *     
     */
    public void setChangePasswordRequest(ChangePasswordRequest value) {
        this.changePasswordRequest = value;
    }

}
