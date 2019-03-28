
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadMenus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadMenus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadMenusRequest" type="{http://ws.admin.rule14.hovs.com/}loadMenusRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadMenus", propOrder = {
    "loadMenusRequest"
})
public class LoadMenus {

    protected LoadMenusRequest loadMenusRequest;

    /**
     * Gets the value of the loadMenusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadMenusRequest }
     *     
     */
    public LoadMenusRequest getLoadMenusRequest() {
        return loadMenusRequest;
    }

    /**
     * Sets the value of the loadMenusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadMenusRequest }
     *     
     */
    public void setLoadMenusRequest(LoadMenusRequest value) {
        this.loadMenusRequest = value;
    }

}
