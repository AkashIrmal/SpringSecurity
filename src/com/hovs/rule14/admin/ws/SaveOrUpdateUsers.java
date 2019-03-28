
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateUserRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateUserRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateUsers", propOrder = {
    "saveUpdateUserRequest"
})
public class SaveOrUpdateUsers {

    protected SaveUpdateUserRequest saveUpdateUserRequest;

    /**
     * Gets the value of the saveUpdateUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateUserRequest }
     *     
     */
    public SaveUpdateUserRequest getSaveUpdateUserRequest() {
        return saveUpdateUserRequest;
    }

    /**
     * Sets the value of the saveUpdateUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateUserRequest }
     *     
     */
    public void setSaveUpdateUserRequest(SaveUpdateUserRequest value) {
        this.saveUpdateUserRequest = value;
    }

}
