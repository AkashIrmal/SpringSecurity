
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateSocialAccountDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateSocialAccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveOrUpdateSocialAccountRequest" type="{http://ws.admin.rule14.hovs.com/}saveOrUpdateSocialAccountRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateSocialAccountDetails", propOrder = {
    "saveOrUpdateSocialAccountRequest"
})
public class SaveOrUpdateSocialAccountDetails {

    protected SaveOrUpdateSocialAccountRequest saveOrUpdateSocialAccountRequest;

    /**
     * Gets the value of the saveOrUpdateSocialAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveOrUpdateSocialAccountRequest }
     *     
     */
    public SaveOrUpdateSocialAccountRequest getSaveOrUpdateSocialAccountRequest() {
        return saveOrUpdateSocialAccountRequest;
    }

    /**
     * Sets the value of the saveOrUpdateSocialAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOrUpdateSocialAccountRequest }
     *     
     */
    public void setSaveOrUpdateSocialAccountRequest(SaveOrUpdateSocialAccountRequest value) {
        this.saveOrUpdateSocialAccountRequest = value;
    }

}
