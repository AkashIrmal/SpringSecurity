
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignMenuPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignMenuPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignMenuPermissionRequest" type="{http://ws.admin.rule14.hovs.com/}assignMenuPermissionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignMenuPermissions", propOrder = {
    "assignMenuPermissionRequest"
})
public class AssignMenuPermissions {

    protected AssignMenuPermissionRequest assignMenuPermissionRequest;

    /**
     * Gets the value of the assignMenuPermissionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssignMenuPermissionRequest }
     *     
     */
    public AssignMenuPermissionRequest getAssignMenuPermissionRequest() {
        return assignMenuPermissionRequest;
    }

    /**
     * Sets the value of the assignMenuPermissionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignMenuPermissionRequest }
     *     
     */
    public void setAssignMenuPermissionRequest(AssignMenuPermissionRequest value) {
        this.assignMenuPermissionRequest = value;
    }

}
