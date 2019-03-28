
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateUserProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateUserProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveUpdateTaxPayerRequest" type="{http://ws.sfi.rule14.hovs.com/}saveUpdateUserProfileRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateUserProfile", propOrder = {
    "saveUpdateTaxPayerRequest"
})
public class SaveOrUpdateUserProfile {

    @XmlElement(name = "SaveUpdateTaxPayerRequest")
    protected SaveUpdateUserProfileRequest saveUpdateTaxPayerRequest;

    /**
     * Gets the value of the saveUpdateTaxPayerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateUserProfileRequest }
     *     
     */
    public SaveUpdateUserProfileRequest getSaveUpdateTaxPayerRequest() {
        return saveUpdateTaxPayerRequest;
    }

    /**
     * Sets the value of the saveUpdateTaxPayerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateUserProfileRequest }
     *     
     */
    public void setSaveUpdateTaxPayerRequest(SaveUpdateUserProfileRequest value) {
        this.saveUpdateTaxPayerRequest = value;
    }

}
