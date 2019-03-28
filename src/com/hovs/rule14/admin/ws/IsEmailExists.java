
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isEmailExists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isEmailExists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEmailExistRequest" type="{http://ws.admin.rule14.hovs.com/}isEmailExistRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isEmailExists", propOrder = {
    "isEmailExistRequest"
})
public class IsEmailExists {

    protected IsEmailExistRequest isEmailExistRequest;

    /**
     * Gets the value of the isEmailExistRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsEmailExistRequest }
     *     
     */
    public IsEmailExistRequest getIsEmailExistRequest() {
        return isEmailExistRequest;
    }

    /**
     * Sets the value of the isEmailExistRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsEmailExistRequest }
     *     
     */
    public void setIsEmailExistRequest(IsEmailExistRequest value) {
        this.isEmailExistRequest = value;
    }

}
