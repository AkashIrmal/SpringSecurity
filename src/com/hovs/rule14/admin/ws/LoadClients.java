
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadClients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadClients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadClientsRequest" type="{http://ws.admin.rule14.hovs.com/}loadClientsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadClients", propOrder = {
    "loadClientsRequest"
})
public class LoadClients {

    protected LoadClientsRequest loadClientsRequest;

    /**
     * Gets the value of the loadClientsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadClientsRequest }
     *     
     */
    public LoadClientsRequest getLoadClientsRequest() {
        return loadClientsRequest;
    }

    /**
     * Sets the value of the loadClientsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadClientsRequest }
     *     
     */
    public void setLoadClientsRequest(LoadClientsRequest value) {
        this.loadClientsRequest = value;
    }

}
