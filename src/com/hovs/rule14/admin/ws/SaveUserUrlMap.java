
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUserUrlMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUserUrlMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUserURLMapRequest" type="{http://ws.admin.rule14.hovs.com/}saveUserURLMapRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUserUrlMap", propOrder = {
    "saveUserURLMapRequest"
})
public class SaveUserUrlMap {

    protected SaveUserURLMapRequest saveUserURLMapRequest;

    /**
     * Gets the value of the saveUserURLMapRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUserURLMapRequest }
     *     
     */
    public SaveUserURLMapRequest getSaveUserURLMapRequest() {
        return saveUserURLMapRequest;
    }

    /**
     * Sets the value of the saveUserURLMapRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUserURLMapRequest }
     *     
     */
    public void setSaveUserURLMapRequest(SaveUserURLMapRequest value) {
        this.saveUserURLMapRequest = value;
    }

}
