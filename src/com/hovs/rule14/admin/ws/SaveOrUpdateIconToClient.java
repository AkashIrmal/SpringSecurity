
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateIconToClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateIconToClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateIconConfigByClientRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateIconConfigByClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateIconToClient", propOrder = {
    "saveUpdateIconConfigByClientRequest"
})
public class SaveOrUpdateIconToClient {

    protected SaveUpdateIconConfigByClientRequest saveUpdateIconConfigByClientRequest;

    /**
     * Gets the value of the saveUpdateIconConfigByClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateIconConfigByClientRequest }
     *     
     */
    public SaveUpdateIconConfigByClientRequest getSaveUpdateIconConfigByClientRequest() {
        return saveUpdateIconConfigByClientRequest;
    }

    /**
     * Sets the value of the saveUpdateIconConfigByClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateIconConfigByClientRequest }
     *     
     */
    public void setSaveUpdateIconConfigByClientRequest(SaveUpdateIconConfigByClientRequest value) {
        this.saveUpdateIconConfigByClientRequest = value;
    }

}
