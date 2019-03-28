
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateW9FormDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateW9FormDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="W9FormRequest" type="{http://ws.sfi.rule14.hovs.com/}w9FormRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateW9FormDetails", propOrder = {
    "w9FormRequest"
})
public class SaveOrUpdateW9FormDetails {

    @XmlElement(name = "W9FormRequest")
    protected W9FormRequest w9FormRequest;

    /**
     * Gets the value of the w9FormRequest property.
     * 
     * @return
     *     possible object is
     *     {@link W9FormRequest }
     *     
     */
    public W9FormRequest getW9FormRequest() {
        return w9FormRequest;
    }

    /**
     * Sets the value of the w9FormRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9FormRequest }
     *     
     */
    public void setW9FormRequest(W9FormRequest value) {
        this.w9FormRequest = value;
    }

}
