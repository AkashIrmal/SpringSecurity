
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateMenuRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateMenuRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateMenu", propOrder = {
    "saveUpdateMenuRequest"
})
public class SaveOrUpdateMenu {

    protected SaveUpdateMenuRequest saveUpdateMenuRequest;

    /**
     * Gets the value of the saveUpdateMenuRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateMenuRequest }
     *     
     */
    public SaveUpdateMenuRequest getSaveUpdateMenuRequest() {
        return saveUpdateMenuRequest;
    }

    /**
     * Sets the value of the saveUpdateMenuRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateMenuRequest }
     *     
     */
    public void setSaveUpdateMenuRequest(SaveUpdateMenuRequest value) {
        this.saveUpdateMenuRequest = value;
    }

}
