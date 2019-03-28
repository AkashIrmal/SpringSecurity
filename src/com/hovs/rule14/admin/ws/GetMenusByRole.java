
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMenusByRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMenusByRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMenuByRoleRequest" type="{http://ws.admin.rule14.hovs.com/}getMenuByRoleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMenusByRole", propOrder = {
    "getMenuByRoleRequest"
})
public class GetMenusByRole {

    protected GetMenuByRoleRequest getMenuByRoleRequest;

    /**
     * Gets the value of the getMenuByRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetMenuByRoleRequest }
     *     
     */
    public GetMenuByRoleRequest getGetMenuByRoleRequest() {
        return getMenuByRoleRequest;
    }

    /**
     * Sets the value of the getMenuByRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMenuByRoleRequest }
     *     
     */
    public void setGetMenuByRoleRequest(GetMenuByRoleRequest value) {
        this.getMenuByRoleRequest = value;
    }

}
