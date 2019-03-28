
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRoleRequest" type="{http://ws.admin.rule14.hovs.com/}getRoleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoles", propOrder = {
    "getRoleRequest"
})
public class GetRoles {

    protected GetRoleRequest getRoleRequest;

    /**
     * Gets the value of the getRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetRoleRequest }
     *     
     */
    public GetRoleRequest getGetRoleRequest() {
        return getRoleRequest;
    }

    /**
     * Sets the value of the getRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRoleRequest }
     *     
     */
    public void setGetRoleRequest(GetRoleRequest value) {
        this.getRoleRequest = value;
    }

}
