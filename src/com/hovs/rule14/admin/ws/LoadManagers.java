
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadManagers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadManagersRequest" type="{http://ws.admin.rule14.hovs.com/}loadManagersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadManagers", propOrder = {
    "loadManagersRequest"
})
public class LoadManagers {

    protected LoadManagersRequest loadManagersRequest;

    /**
     * Gets the value of the loadManagersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadManagersRequest }
     *     
     */
    public LoadManagersRequest getLoadManagersRequest() {
        return loadManagersRequest;
    }

    /**
     * Sets the value of the loadManagersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadManagersRequest }
     *     
     */
    public void setLoadManagersRequest(LoadManagersRequest value) {
        this.loadManagersRequest = value;
    }

}
