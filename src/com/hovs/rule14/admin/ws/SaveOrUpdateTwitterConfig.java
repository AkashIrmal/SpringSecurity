
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateTwitterConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateTwitterConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateTwitterConfigRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateTwitterConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateTwitterConfig", propOrder = {
    "saveUpdateTwitterConfigRequest"
})
public class SaveOrUpdateTwitterConfig {

    protected SaveUpdateTwitterConfigRequest saveUpdateTwitterConfigRequest;

    /**
     * Gets the value of the saveUpdateTwitterConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateTwitterConfigRequest }
     *     
     */
    public SaveUpdateTwitterConfigRequest getSaveUpdateTwitterConfigRequest() {
        return saveUpdateTwitterConfigRequest;
    }

    /**
     * Sets the value of the saveUpdateTwitterConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateTwitterConfigRequest }
     *     
     */
    public void setSaveUpdateTwitterConfigRequest(SaveUpdateTwitterConfigRequest value) {
        this.saveUpdateTwitterConfigRequest = value;
    }

}
