
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forgotLoginName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forgotLoginName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forgotLoginNameRequest" type="{http://ws.admin.rule14.hovs.com/}forgotLoginNameRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forgotLoginName", propOrder = {
    "forgotLoginNameRequest"
})
public class ForgotLoginName {

    protected ForgotLoginNameRequest forgotLoginNameRequest;

    /**
     * Gets the value of the forgotLoginNameRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotLoginNameRequest }
     *     
     */
    public ForgotLoginNameRequest getForgotLoginNameRequest() {
        return forgotLoginNameRequest;
    }

    /**
     * Sets the value of the forgotLoginNameRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotLoginNameRequest }
     *     
     */
    public void setForgotLoginNameRequest(ForgotLoginNameRequest value) {
        this.forgotLoginNameRequest = value;
    }

}
