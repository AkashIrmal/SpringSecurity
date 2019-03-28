
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getParentMenus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getParentMenus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getParentMenusRequest" type="{http://ws.admin.rule14.hovs.com/}getParentMenusRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getParentMenus", propOrder = {
    "getParentMenusRequest"
})
public class GetParentMenus {

    protected GetParentMenusRequest getParentMenusRequest;

    /**
     * Gets the value of the getParentMenusRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetParentMenusRequest }
     *     
     */
    public GetParentMenusRequest getGetParentMenusRequest() {
        return getParentMenusRequest;
    }

    /**
     * Sets the value of the getParentMenusRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetParentMenusRequest }
     *     
     */
    public void setGetParentMenusRequest(GetParentMenusRequest value) {
        this.getParentMenusRequest = value;
    }

}
