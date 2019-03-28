
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activateUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activateUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userActivateRequest" type="{http://ws.admin.rule14.hovs.com/}userActivateRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activateUser", propOrder = {
    "userActivateRequest"
})
public class ActivateUser {

    protected UserActivateRequest userActivateRequest;

    /**
     * Gets the value of the userActivateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserActivateRequest }
     *     
     */
    public UserActivateRequest getUserActivateRequest() {
        return userActivateRequest;
    }

    /**
     * Sets the value of the userActivateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserActivateRequest }
     *     
     */
    public void setUserActivateRequest(UserActivateRequest value) {
        this.userActivateRequest = value;
    }

}
