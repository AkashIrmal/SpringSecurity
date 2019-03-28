
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getClientLocationRequest" type="{http://ws.admin.rule14.hovs.com/}getClientLocationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientLocation", propOrder = {
    "getClientLocationRequest"
})
public class GetClientLocation {

    protected GetClientLocationRequest getClientLocationRequest;

    /**
     * Gets the value of the getClientLocationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientLocationRequest }
     *     
     */
    public GetClientLocationRequest getGetClientLocationRequest() {
        return getClientLocationRequest;
    }

    /**
     * Sets the value of the getClientLocationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientLocationRequest }
     *     
     */
    public void setGetClientLocationRequest(GetClientLocationRequest value) {
        this.getClientLocationRequest = value;
    }

}
