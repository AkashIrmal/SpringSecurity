
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateClientRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateClient", propOrder = {
    "saveUpdateClientRequest"
})
public class SaveOrUpdateClient {

    protected SaveUpdateClientRequest saveUpdateClientRequest;

    /**
     * Gets the value of the saveUpdateClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateClientRequest }
     *     
     */
    public SaveUpdateClientRequest getSaveUpdateClientRequest() {
        return saveUpdateClientRequest;
    }

    /**
     * Sets the value of the saveUpdateClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateClientRequest }
     *     
     */
    public void setSaveUpdateClientRequest(SaveUpdateClientRequest value) {
        this.saveUpdateClientRequest = value;
    }

}
