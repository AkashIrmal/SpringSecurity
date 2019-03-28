
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isValidModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isValidModule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validModuleRequest" type="{http://ws.admin.rule14.hovs.com/}validModuleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isValidModule", propOrder = {
    "validModuleRequest"
})
public class IsValidModule {

    protected ValidModuleRequest validModuleRequest;

    /**
     * Gets the value of the validModuleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ValidModuleRequest }
     *     
     */
    public ValidModuleRequest getValidModuleRequest() {
        return validModuleRequest;
    }

    /**
     * Sets the value of the validModuleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidModuleRequest }
     *     
     */
    public void setValidModuleRequest(ValidModuleRequest value) {
        this.validModuleRequest = value;
    }

}
