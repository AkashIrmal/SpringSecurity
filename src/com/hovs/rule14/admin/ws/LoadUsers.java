
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadUserRequest" type="{http://ws.admin.rule14.hovs.com/}loadUsersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadUsers", propOrder = {
    "loadUserRequest"
})
public class LoadUsers {

    protected LoadUsersRequest loadUserRequest;

    /**
     * Gets the value of the loadUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadUsersRequest }
     *     
     */
    public LoadUsersRequest getLoadUserRequest() {
        return loadUserRequest;
    }

    /**
     * Sets the value of the loadUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadUsersRequest }
     *     
     */
    public void setLoadUserRequest(LoadUsersRequest value) {
        this.loadUserRequest = value;
    }

}
