
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateModule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateModuleRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateModuleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateModule", propOrder = {
    "inActivateModuleRequest"
})
public class InActivateModule {

    protected InActivateModuleRequest inActivateModuleRequest;

    /**
     * Gets the value of the inActivateModuleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateModuleRequest }
     *     
     */
    public InActivateModuleRequest getInActivateModuleRequest() {
        return inActivateModuleRequest;
    }

    /**
     * Sets the value of the inActivateModuleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateModuleRequest }
     *     
     */
    public void setInActivateModuleRequest(InActivateModuleRequest value) {
        this.inActivateModuleRequest = value;
    }

}
