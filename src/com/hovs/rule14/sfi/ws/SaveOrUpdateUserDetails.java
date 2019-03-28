
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateUserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateUserDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveUpdateUserProfileRequest" type="{http://ws.sfi.rule14.hovs.com/}saveUpdateUserProfileRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateUserDetails", propOrder = {
    "saveUpdateUserProfileRequest"
})
public class SaveOrUpdateUserDetails {

    @XmlElement(name = "SaveUpdateUserProfileRequest")
    protected SaveUpdateUserProfileRequest saveUpdateUserProfileRequest;

    /**
     * Gets the value of the saveUpdateUserProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateUserProfileRequest }
     *     
     */
    public SaveUpdateUserProfileRequest getSaveUpdateUserProfileRequest() {
        return saveUpdateUserProfileRequest;
    }

    /**
     * Sets the value of the saveUpdateUserProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateUserProfileRequest }
     *     
     */
    public void setSaveUpdateUserProfileRequest(SaveUpdateUserProfileRequest value) {
        this.saveUpdateUserProfileRequest = value;
    }

}
