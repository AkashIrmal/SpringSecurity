
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUniqueClientName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUniqueClientName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isUniqueClientNameRequest" type="{http://ws.admin.rule14.hovs.com/}isUniqueClientNameRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUniqueClientName", propOrder = {
    "isUniqueClientNameRequest"
})
public class IsUniqueClientName {

    protected IsUniqueClientNameRequest isUniqueClientNameRequest;

    /**
     * Gets the value of the isUniqueClientNameRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsUniqueClientNameRequest }
     *     
     */
    public IsUniqueClientNameRequest getIsUniqueClientNameRequest() {
        return isUniqueClientNameRequest;
    }

    /**
     * Sets the value of the isUniqueClientNameRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsUniqueClientNameRequest }
     *     
     */
    public void setIsUniqueClientNameRequest(IsUniqueClientNameRequest value) {
        this.isUniqueClientNameRequest = value;
    }

}
