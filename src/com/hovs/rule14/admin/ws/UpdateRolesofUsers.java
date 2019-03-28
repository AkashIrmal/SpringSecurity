
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRolesofUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRolesofUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateRolesofUsersRequest" type="{http://ws.admin.rule14.hovs.com/}updateRolesofUsersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRolesofUsers", propOrder = {
    "updateRolesofUsersRequest"
})
public class UpdateRolesofUsers {

    protected UpdateRolesofUsersRequest updateRolesofUsersRequest;

    /**
     * Gets the value of the updateRolesofUsersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRolesofUsersRequest }
     *     
     */
    public UpdateRolesofUsersRequest getUpdateRolesofUsersRequest() {
        return updateRolesofUsersRequest;
    }

    /**
     * Sets the value of the updateRolesofUsersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRolesofUsersRequest }
     *     
     */
    public void setUpdateRolesofUsersRequest(UpdateRolesofUsersRequest value) {
        this.updateRolesofUsersRequest = value;
    }

}
