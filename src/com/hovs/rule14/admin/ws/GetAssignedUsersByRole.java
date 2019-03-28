
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAssignedUsersByRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAssignedUsersByRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAssignedUsersByRoleRequest" type="{http://ws.admin.rule14.hovs.com/}getAssignedUsersByRoleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAssignedUsersByRole", propOrder = {
    "getAssignedUsersByRoleRequest"
})
public class GetAssignedUsersByRole {

    protected GetAssignedUsersByRoleRequest getAssignedUsersByRoleRequest;

    /**
     * Gets the value of the getAssignedUsersByRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedUsersByRoleRequest }
     *     
     */
    public GetAssignedUsersByRoleRequest getGetAssignedUsersByRoleRequest() {
        return getAssignedUsersByRoleRequest;
    }

    /**
     * Sets the value of the getAssignedUsersByRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedUsersByRoleRequest }
     *     
     */
    public void setGetAssignedUsersByRoleRequest(GetAssignedUsersByRoleRequest value) {
        this.getAssignedUsersByRoleRequest = value;
    }

}
