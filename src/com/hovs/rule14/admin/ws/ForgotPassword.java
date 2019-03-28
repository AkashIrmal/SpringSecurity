
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forgotPassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forgotPassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forgotPasswordRequest" type="{http://ws.admin.rule14.hovs.com/}forgotPasswordRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forgotPassword", propOrder = {
    "forgotPasswordRequest"
})
public class ForgotPassword {

    protected ForgotPasswordRequest forgotPasswordRequest;

    /**
     * Gets the value of the forgotPasswordRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPasswordRequest }
     *     
     */
    public ForgotPasswordRequest getForgotPasswordRequest() {
        return forgotPasswordRequest;
    }

    /**
     * Sets the value of the forgotPasswordRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPasswordRequest }
     *     
     */
    public void setForgotPasswordRequest(ForgotPasswordRequest value) {
        this.forgotPasswordRequest = value;
    }

}
