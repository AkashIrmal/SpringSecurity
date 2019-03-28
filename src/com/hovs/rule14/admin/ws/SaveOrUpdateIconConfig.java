
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateIconConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateIconConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateIconConfigRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateIconConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateIconConfig", propOrder = {
    "saveUpdateIconConfigRequest"
})
public class SaveOrUpdateIconConfig {

    protected SaveUpdateIconConfigRequest saveUpdateIconConfigRequest;

    /**
     * Gets the value of the saveUpdateIconConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateIconConfigRequest }
     *     
     */
    public SaveUpdateIconConfigRequest getSaveUpdateIconConfigRequest() {
        return saveUpdateIconConfigRequest;
    }

    /**
     * Sets the value of the saveUpdateIconConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateIconConfigRequest }
     *     
     */
    public void setSaveUpdateIconConfigRequest(SaveUpdateIconConfigRequest value) {
        this.saveUpdateIconConfigRequest = value;
    }

}
