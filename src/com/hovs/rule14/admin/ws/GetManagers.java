
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getManagers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getManagers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getManagersRequest" type="{http://ws.admin.rule14.hovs.com/}getManagersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getManagers", propOrder = {
    "getManagersRequest"
})
public class GetManagers {

    protected GetManagersRequest getManagersRequest;

    /**
     * Gets the value of the getManagersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetManagersRequest }
     *     
     */
    public GetManagersRequest getGetManagersRequest() {
        return getManagersRequest;
    }

    /**
     * Sets the value of the getManagersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetManagersRequest }
     *     
     */
    public void setGetManagersRequest(GetManagersRequest value) {
        this.getManagersRequest = value;
    }

}
