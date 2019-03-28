
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateMenus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateMenus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateMenuRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateMenuRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateMenus", propOrder = {
    "inActivateMenuRequest"
})
public class InActivateMenus {

    protected InActivateMenuRequest inActivateMenuRequest;

    /**
     * Gets the value of the inActivateMenuRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateMenuRequest }
     *     
     */
    public InActivateMenuRequest getInActivateMenuRequest() {
        return inActivateMenuRequest;
    }

    /**
     * Sets the value of the inActivateMenuRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateMenuRequest }
     *     
     */
    public void setInActivateMenuRequest(InActivateMenuRequest value) {
        this.inActivateMenuRequest = value;
    }

}
