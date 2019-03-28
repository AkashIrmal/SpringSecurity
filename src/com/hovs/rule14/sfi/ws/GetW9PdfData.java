
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getW9PdfData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getW9PdfData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetSfiW9FormRequest" type="{http://ws.sfi.rule14.hovs.com/}getSfiW9FormRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getW9PdfData", propOrder = {
    "getSfiW9FormRequest"
})
public class GetW9PdfData {

    @XmlElement(name = "GetSfiW9FormRequest")
    protected GetSfiW9FormRequest getSfiW9FormRequest;

    /**
     * Gets the value of the getSfiW9FormRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetSfiW9FormRequest }
     *     
     */
    public GetSfiW9FormRequest getGetSfiW9FormRequest() {
        return getSfiW9FormRequest;
    }

    /**
     * Sets the value of the getSfiW9FormRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSfiW9FormRequest }
     *     
     */
    public void setGetSfiW9FormRequest(GetSfiW9FormRequest value) {
        this.getSfiW9FormRequest = value;
    }

}
