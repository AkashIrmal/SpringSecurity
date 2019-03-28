
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDtsTemplateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDtsTemplateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDtsTemplateDetailsRequest" type="{http://ws.admin.rule14.hovs.com/}getDtsTemplateDetailsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDtsTemplateDetails", propOrder = {
    "getDtsTemplateDetailsRequest"
})
public class GetDtsTemplateDetails {

    protected GetDtsTemplateDetailsRequest getDtsTemplateDetailsRequest;

    /**
     * Gets the value of the getDtsTemplateDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetDtsTemplateDetailsRequest }
     *     
     */
    public GetDtsTemplateDetailsRequest getGetDtsTemplateDetailsRequest() {
        return getDtsTemplateDetailsRequest;
    }

    /**
     * Sets the value of the getDtsTemplateDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDtsTemplateDetailsRequest }
     *     
     */
    public void setGetDtsTemplateDetailsRequest(GetDtsTemplateDetailsRequest value) {
        this.getDtsTemplateDetailsRequest = value;
    }

}
