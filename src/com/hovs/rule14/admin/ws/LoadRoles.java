
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadRoles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadRoleRequest" type="{http://ws.admin.rule14.hovs.com/}loadRoleRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadRoles", propOrder = {
    "loadRoleRequest"
})
public class LoadRoles {

    protected LoadRoleRequest loadRoleRequest;

    /**
     * Gets the value of the loadRoleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadRoleRequest }
     *     
     */
    public LoadRoleRequest getLoadRoleRequest() {
        return loadRoleRequest;
    }

    /**
     * Sets the value of the loadRoleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadRoleRequest }
     *     
     */
    public void setLoadRoleRequest(LoadRoleRequest value) {
        this.loadRoleRequest = value;
    }

}
