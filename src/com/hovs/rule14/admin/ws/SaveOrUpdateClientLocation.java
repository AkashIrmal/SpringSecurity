
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateClientLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateClientLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveOrUpdateClientLocationRequest" type="{http://ws.admin.rule14.hovs.com/}saveOrUpdateClientLocationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateClientLocation", propOrder = {
    "saveOrUpdateClientLocationRequest"
})
public class SaveOrUpdateClientLocation {

    protected SaveOrUpdateClientLocationRequest saveOrUpdateClientLocationRequest;

    /**
     * Gets the value of the saveOrUpdateClientLocationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveOrUpdateClientLocationRequest }
     *     
     */
    public SaveOrUpdateClientLocationRequest getSaveOrUpdateClientLocationRequest() {
        return saveOrUpdateClientLocationRequest;
    }

    /**
     * Sets the value of the saveOrUpdateClientLocationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveOrUpdateClientLocationRequest }
     *     
     */
    public void setSaveOrUpdateClientLocationRequest(SaveOrUpdateClientLocationRequest value) {
        this.saveOrUpdateClientLocationRequest = value;
    }

}
