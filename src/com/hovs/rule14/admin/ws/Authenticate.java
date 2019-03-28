
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticateRequest" type="{http://ws.admin.rule14.hovs.com/}authenticateRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticate", propOrder = {
    "authenticateRequest"
})
public class Authenticate {

    protected AuthenticateRequest authenticateRequest;

    /**
     * Gets the value of the authenticateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticateRequest }
     *     
     */
    public AuthenticateRequest getAuthenticateRequest() {
        return authenticateRequest;
    }

    /**
     * Sets the value of the authenticateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticateRequest }
     *     
     */
    public void setAuthenticateRequest(AuthenticateRequest value) {
        this.authenticateRequest = value;
    }

}
