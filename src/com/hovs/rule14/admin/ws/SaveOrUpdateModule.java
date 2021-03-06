
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateModule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateModuleRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateModuleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateModule", propOrder = {
    "saveUpdateModuleRequest"
})
public class SaveOrUpdateModule {

    protected SaveUpdateModuleRequest saveUpdateModuleRequest;

    /**
     * Gets the value of the saveUpdateModuleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateModuleRequest }
     *     
     */
    public SaveUpdateModuleRequest getSaveUpdateModuleRequest() {
        return saveUpdateModuleRequest;
    }

    /**
     * Sets the value of the saveUpdateModuleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateModuleRequest }
     *     
     */
    public void setSaveUpdateModuleRequest(SaveUpdateModuleRequest value) {
        this.saveUpdateModuleRequest = value;
    }

}
