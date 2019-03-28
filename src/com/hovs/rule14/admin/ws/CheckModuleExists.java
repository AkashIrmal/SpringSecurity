
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkModuleExists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkModuleExists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isModuleExistsRequest" type="{http://ws.admin.rule14.hovs.com/}isModuleExistsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkModuleExists", propOrder = {
    "isModuleExistsRequest"
})
public class CheckModuleExists {

    protected IsModuleExistsRequest isModuleExistsRequest;

    /**
     * Gets the value of the isModuleExistsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsModuleExistsRequest }
     *     
     */
    public IsModuleExistsRequest getIsModuleExistsRequest() {
        return isModuleExistsRequest;
    }

    /**
     * Sets the value of the isModuleExistsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsModuleExistsRequest }
     *     
     */
    public void setIsModuleExistsRequest(IsModuleExistsRequest value) {
        this.isModuleExistsRequest = value;
    }

}
