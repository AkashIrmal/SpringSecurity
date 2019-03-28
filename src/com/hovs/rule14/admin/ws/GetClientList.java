
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getClientListRequest" type="{http://ws.admin.rule14.hovs.com/}getClientListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientList", propOrder = {
    "getClientListRequest"
})
public class GetClientList {

    protected GetClientListRequest getClientListRequest;

    /**
     * Gets the value of the getClientListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientListRequest }
     *     
     */
    public GetClientListRequest getGetClientListRequest() {
        return getClientListRequest;
    }

    /**
     * Sets the value of the getClientListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientListRequest }
     *     
     */
    public void setGetClientListRequest(GetClientListRequest value) {
        this.getClientListRequest = value;
    }

}
