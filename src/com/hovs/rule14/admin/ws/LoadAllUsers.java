
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadAllUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadAllUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadUsersRequest" type="{http://ws.admin.rule14.hovs.com/}loadUsersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadAllUsers", propOrder = {
    "loadUsersRequest"
})
public class LoadAllUsers {

    protected LoadUsersRequest loadUsersRequest;

    /**
     * Gets the value of the loadUsersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadUsersRequest }
     *     
     */
    public LoadUsersRequest getLoadUsersRequest() {
        return loadUsersRequest;
    }

    /**
     * Sets the value of the loadUsersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadUsersRequest }
     *     
     */
    public void setLoadUsersRequest(LoadUsersRequest value) {
        this.loadUsersRequest = value;
    }

}
