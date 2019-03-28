
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedIconByClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedIconByClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCheckedIconByClientRequest" type="{http://ws.admin.rule14.hovs.com/}getCheckedIconByClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedIconByClient", propOrder = {
    "getCheckedIconByClientRequest"
})
public class GetCheckedIconByClient {

    protected GetCheckedIconByClientRequest getCheckedIconByClientRequest;

    /**
     * Gets the value of the getCheckedIconByClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetCheckedIconByClientRequest }
     *     
     */
    public GetCheckedIconByClientRequest getGetCheckedIconByClientRequest() {
        return getCheckedIconByClientRequest;
    }

    /**
     * Sets the value of the getCheckedIconByClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCheckedIconByClientRequest }
     *     
     */
    public void setGetCheckedIconByClientRequest(GetCheckedIconByClientRequest value) {
        this.getCheckedIconByClientRequest = value;
    }

}
