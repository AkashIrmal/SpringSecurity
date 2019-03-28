
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMenusByManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMenusByManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMenuByManagerRequest" type="{http://ws.admin.rule14.hovs.com/}getMenuByManagerRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMenusByManager", propOrder = {
    "getMenuByManagerRequest"
})
public class GetMenusByManager {

    protected GetMenuByManagerRequest getMenuByManagerRequest;

    /**
     * Gets the value of the getMenuByManagerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMenuByManagerRequest }
     *     
     */
    public GetMenuByManagerRequest getGetMenuByManagerRequest() {
        return getMenuByManagerRequest;
    }

    /**
     * Sets the value of the getMenuByManagerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMenuByManagerRequest }
     *     
     */
    public void setGetMenuByManagerRequest(GetMenuByManagerRequest value) {
        this.getMenuByManagerRequest = value;
    }

}
