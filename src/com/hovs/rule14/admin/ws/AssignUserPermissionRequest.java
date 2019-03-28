
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignUserPermissionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignUserPermissionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="assignedMenus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignUserPermissionRequest", propOrder = {
    "assignedMenus",
    "managerId"
})
public class AssignUserPermissionRequest
    extends GlobalRequest
{

    protected String assignedMenus;
    protected int managerId;

    /**
     * Gets the value of the assignedMenus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedMenus() {
        return assignedMenus;
    }

    /**
     * Sets the value of the assignedMenus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedMenus(String value) {
        this.assignedMenus = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     */
    public int getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     */
    public void setManagerId(int value) {
        this.managerId = value;
    }

}