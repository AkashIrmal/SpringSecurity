
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUniqueClientCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUniqueClientCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isUniqueClientCodeRequest" type="{http://ws.admin.rule14.hovs.com/}isUniqueClientCodeRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUniqueClientCode", propOrder = {
    "isUniqueClientCodeRequest"
})
public class IsUniqueClientCode {

    protected IsUniqueClientCodeRequest isUniqueClientCodeRequest;

    /**
     * Gets the value of the isUniqueClientCodeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsUniqueClientCodeRequest }
     *     
     */
    public IsUniqueClientCodeRequest getIsUniqueClientCodeRequest() {
        return isUniqueClientCodeRequest;
    }

    /**
     * Sets the value of the isUniqueClientCodeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsUniqueClientCodeRequest }
     *     
     */
    public void setIsUniqueClientCodeRequest(IsUniqueClientCodeRequest value) {
        this.isUniqueClientCodeRequest = value;
    }

}
