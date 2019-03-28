
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUserMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUserMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUserMenuRequest" type="{http://ws.admin.rule14.hovs.com/}saveUserMenuRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUserMenu", propOrder = {
    "saveUserMenuRequest"
})
public class SaveUserMenu {

    protected SaveUserMenuRequest saveUserMenuRequest;

    /**
     * Gets the value of the saveUserMenuRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUserMenuRequest }
     *     
     */
    public SaveUserMenuRequest getSaveUserMenuRequest() {
        return saveUserMenuRequest;
    }

    /**
     * Sets the value of the saveUserMenuRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUserMenuRequest }
     *     
     */
    public void setSaveUserMenuRequest(SaveUserMenuRequest value) {
        this.saveUserMenuRequest = value;
    }

}
