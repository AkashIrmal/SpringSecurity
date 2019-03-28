
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inActivateClientRequest" type="{http://ws.admin.rule14.hovs.com/}inActivateClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateClient", propOrder = {
    "inActivateClientRequest"
})
public class InActivateClient {

    protected InActivateClientRequest inActivateClientRequest;

    /**
     * Gets the value of the inActivateClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InActivateClientRequest }
     *     
     */
    public InActivateClientRequest getInActivateClientRequest() {
        return inActivateClientRequest;
    }

    /**
     * Sets the value of the inActivateClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InActivateClientRequest }
     *     
     */
    public void setInActivateClientRequest(InActivateClientRequest value) {
        this.inActivateClientRequest = value;
    }

}
