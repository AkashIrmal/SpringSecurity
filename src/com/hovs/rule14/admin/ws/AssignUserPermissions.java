
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignUserPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignUserPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignUserPermissionRequest" type="{http://ws.admin.rule14.hovs.com/}assignUserPermissionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignUserPermissions", propOrder = {
    "assignUserPermissionRequest"
})
public class AssignUserPermissions {

    protected AssignUserPermissionRequest assignUserPermissionRequest;

    /**
     * Gets the value of the assignUserPermissionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssignUserPermissionRequest }
     *     
     */
    public AssignUserPermissionRequest getAssignUserPermissionRequest() {
        return assignUserPermissionRequest;
    }

    /**
     * Sets the value of the assignUserPermissionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignUserPermissionRequest }
     *     
     */
    public void setAssignUserPermissionRequest(AssignUserPermissionRequest value) {
        this.assignUserPermissionRequest = value;
    }

}
