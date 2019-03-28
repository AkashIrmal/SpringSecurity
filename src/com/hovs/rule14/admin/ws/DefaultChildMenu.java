
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for defaultChildMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultChildMenu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultChildMenuRequest" type="{http://ws.admin.rule14.hovs.com/}defaultChildMenuRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultChildMenu", propOrder = {
    "defaultChildMenuRequest"
})
public class DefaultChildMenu {

    protected DefaultChildMenuRequest defaultChildMenuRequest;

    /**
     * Gets the value of the defaultChildMenuRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultChildMenuRequest }
     *     
     */
    public DefaultChildMenuRequest getDefaultChildMenuRequest() {
        return defaultChildMenuRequest;
    }

    /**
     * Sets the value of the defaultChildMenuRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultChildMenuRequest }
     *     
     */
    public void setDefaultChildMenuRequest(DefaultChildMenuRequest value) {
        this.defaultChildMenuRequest = value;
    }

}
