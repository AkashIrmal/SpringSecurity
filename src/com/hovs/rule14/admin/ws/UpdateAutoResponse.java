
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAutoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateAutoResponseTwitterConfigRequest" type="{http://ws.admin.rule14.hovs.com/}updateAutoReponseTwitterConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAutoResponse", propOrder = {
    "updateAutoResponseTwitterConfigRequest"
})
public class UpdateAutoResponse {

    protected UpdateAutoReponseTwitterConfigRequest updateAutoResponseTwitterConfigRequest;

    /**
     * Gets the value of the updateAutoResponseTwitterConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAutoReponseTwitterConfigRequest }
     *     
     */
    public UpdateAutoReponseTwitterConfigRequest getUpdateAutoResponseTwitterConfigRequest() {
        return updateAutoResponseTwitterConfigRequest;
    }

    /**
     * Sets the value of the updateAutoResponseTwitterConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAutoReponseTwitterConfigRequest }
     *     
     */
    public void setUpdateAutoResponseTwitterConfigRequest(UpdateAutoReponseTwitterConfigRequest value) {
        this.updateAutoResponseTwitterConfigRequest = value;
    }

}
