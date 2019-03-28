
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveSessionRequest" type="{http://ws.admin.rule14.hovs.com/}saveSessionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSession", propOrder = {
    "saveSessionRequest"
})
public class SaveSession {

    protected SaveSessionRequest saveSessionRequest;

    /**
     * Gets the value of the saveSessionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveSessionRequest }
     *     
     */
    public SaveSessionRequest getSaveSessionRequest() {
        return saveSessionRequest;
    }

    /**
     * Sets the value of the saveSessionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveSessionRequest }
     *     
     */
    public void setSaveSessionRequest(SaveSessionRequest value) {
        this.saveSessionRequest = value;
    }

}
