
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateIconConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateIconConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateIconConfigRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateIconConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateIconConfig", propOrder = {
    "inActivateIconConfigRequest"
})
public class InActivateIconConfig {

    protected InActivateIconConfigRequest inActivateIconConfigRequest;

    /**
     * Gets the value of the inActivateIconConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateIconConfigRequest }
     *     
     */
    public InActivateIconConfigRequest getInActivateIconConfigRequest() {
        return inActivateIconConfigRequest;
    }

    /**
     * Sets the value of the inActivateIconConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateIconConfigRequest }
     *     
     */
    public void setInActivateIconConfigRequest(InActivateIconConfigRequest value) {
        this.inActivateIconConfigRequest = value;
    }

}
