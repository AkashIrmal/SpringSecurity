
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActiveTwitterConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActiveTwitterConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateTwitterConfigRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateTwitterConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActiveTwitterConfig", propOrder = {
    "inActivateTwitterConfigRequest"
})
public class InActiveTwitterConfig {

    protected InActivateTwitterConfigRequest inActivateTwitterConfigRequest;

    /**
     * Gets the value of the inActivateTwitterConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateTwitterConfigRequest }
     *     
     */
    public InActivateTwitterConfigRequest getInActivateTwitterConfigRequest() {
        return inActivateTwitterConfigRequest;
    }

    /**
     * Sets the value of the inActivateTwitterConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateTwitterConfigRequest }
     *     
     */
    public void setInActivateTwitterConfigRequest(InActivateTwitterConfigRequest value) {
        this.inActivateTwitterConfigRequest = value;
    }

}
