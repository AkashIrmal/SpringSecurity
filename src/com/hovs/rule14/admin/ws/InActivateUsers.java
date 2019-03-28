
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateUserRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateUserRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateUsers", propOrder = {
    "inActivateUserRequest"
})
public class InActivateUsers {

    protected InActivateUserRequest inActivateUserRequest;

    /**
     * Gets the value of the inActivateUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateUserRequest }
     *     
     */
    public InActivateUserRequest getInActivateUserRequest() {
        return inActivateUserRequest;
    }

    /**
     * Sets the value of the inActivateUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateUserRequest }
     *     
     */
    public void setInActivateUserRequest(InActivateUserRequest value) {
        this.inActivateUserRequest = value;
    }

}
