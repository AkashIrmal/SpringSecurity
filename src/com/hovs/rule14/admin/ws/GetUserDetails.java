
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticateRequest" type="{http://ws.admin.rule14.hovs.com/}userRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserDetails", propOrder = {
    "authenticateRequest"
})
public class GetUserDetails {

    protected UserRequest authenticateRequest;

    /**
     * Gets the value of the authenticateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserRequest }
     *     
     */
    public UserRequest getAuthenticateRequest() {
        return authenticateRequest;
    }

    /**
     * Sets the value of the authenticateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRequest }
     *     
     */
    public void setAuthenticateRequest(UserRequest value) {
        this.authenticateRequest = value;
    }

}
