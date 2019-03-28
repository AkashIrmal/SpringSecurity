
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignRolestoCurrentUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignRolestoCurrentUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignRolestoUsersRequest" type="{http://ws.admin.rule14.hovs.com/}assignRolestoUsersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignRolestoCurrentUsers", propOrder = {
    "assignRolestoUsersRequest"
})
public class AssignRolestoCurrentUsers {

    protected AssignRolestoUsersRequest assignRolestoUsersRequest;

    /**
     * Gets the value of the assignRolestoUsersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AssignRolestoUsersRequest }
     *     
     */
    public AssignRolestoUsersRequest getAssignRolestoUsersRequest() {
        return assignRolestoUsersRequest;
    }

    /**
     * Sets the value of the assignRolestoUsersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignRolestoUsersRequest }
     *     
     */
    public void setAssignRolestoUsersRequest(AssignRolestoUsersRequest value) {
        this.assignRolestoUsersRequest = value;
    }

}
