
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getW9FormDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getW9FormDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="W9FormGetRequest" type="{http://ws.sfi.rule14.hovs.com/}w9FormGetRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getW9FormDetails", propOrder = {
    "w9FormGetRequest"
})
public class GetW9FormDetails {

    @XmlElement(name = "W9FormGetRequest")
    protected W9FormGetRequest w9FormGetRequest;

    /**
     * Gets the value of the w9FormGetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link W9FormGetRequest }
     *     
     */
    public W9FormGetRequest getW9FormGetRequest() {
        return w9FormGetRequest;
    }

    /**
     * Sets the value of the w9FormGetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9FormGetRequest }
     *     
     */
    public void setW9FormGetRequest(W9FormGetRequest value) {
        this.w9FormGetRequest = value;
    }

}
