
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserTypeListByClientId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserTypeListByClientId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getUserTypeListByClientIdRequest" type="{http://ws.admin.rule14.hovs.com/}getUserTypeListByClientIdRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserTypeListByClientId", propOrder = {
    "getUserTypeListByClientIdRequest"
})
public class GetUserTypeListByClientId {

    protected GetUserTypeListByClientIdRequest getUserTypeListByClientIdRequest;

    /**
     * Gets the value of the getUserTypeListByClientIdRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserTypeListByClientIdRequest }
     *     
     */
    public GetUserTypeListByClientIdRequest getGetUserTypeListByClientIdRequest() {
        return getUserTypeListByClientIdRequest;
    }

    /**
     * Sets the value of the getUserTypeListByClientIdRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserTypeListByClientIdRequest }
     *     
     */
    public void setGetUserTypeListByClientIdRequest(GetUserTypeListByClientIdRequest value) {
        this.getUserTypeListByClientIdRequest = value;
    }

}
