
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUserProfileRequest" type="{http://ws.sfi.rule14.hovs.com/}getUserProfileRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserProfile", propOrder = {
    "getUserProfileRequest"
})
public class GetUserProfile {

    @XmlElement(name = "GetUserProfileRequest")
    protected GetUserProfileRequest getUserProfileRequest;

    /**
     * Gets the value of the getUserProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserProfileRequest }
     *     
     */
    public GetUserProfileRequest getGetUserProfileRequest() {
        return getUserProfileRequest;
    }

    /**
     * Sets the value of the getUserProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserProfileRequest }
     *     
     */
    public void setGetUserProfileRequest(GetUserProfileRequest value) {
        this.getUserProfileRequest = value;
    }

}
