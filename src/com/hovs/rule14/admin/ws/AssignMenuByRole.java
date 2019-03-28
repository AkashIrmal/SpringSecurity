
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignMenuByRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignMenuByRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignMenuByRoleRequest" type="{http://ws.admin.rule14.hovs.com/}assignMenuByRoleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignMenuByRole", propOrder = {
    "assignMenuByRoleRequest"
})
public class AssignMenuByRole {

    protected AssignMenuByRoleRequest assignMenuByRoleRequest;

    /**
     * Gets the value of the assignMenuByRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssignMenuByRoleRequest }
     *     
     */
    public AssignMenuByRoleRequest getAssignMenuByRoleRequest() {
        return assignMenuByRoleRequest;
    }

    /**
     * Sets the value of the assignMenuByRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignMenuByRoleRequest }
     *     
     */
    public void setAssignMenuByRoleRequest(AssignMenuByRoleRequest value) {
        this.assignMenuByRoleRequest = value;
    }

}
