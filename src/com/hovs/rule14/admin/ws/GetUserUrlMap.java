
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserUrlMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserUrlMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userURLMapRequest" type="{http://ws.admin.rule14.hovs.com/}userURLMapRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserUrlMap", propOrder = {
    "userURLMapRequest"
})
public class GetUserUrlMap {

    protected UserURLMapRequest userURLMapRequest;

    /**
     * Gets the value of the userURLMapRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UserURLMapRequest }
     *     
     */
    public UserURLMapRequest getUserURLMapRequest() {
        return userURLMapRequest;
    }

    /**
     * Sets the value of the userURLMapRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserURLMapRequest }
     *     
     */
    public void setUserURLMapRequest(UserURLMapRequest value) {
        this.userURLMapRequest = value;
    }

}
