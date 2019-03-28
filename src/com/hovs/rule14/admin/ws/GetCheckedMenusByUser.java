
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedMenusByUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedMenusByUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCheckedMenuByUserRequest" type="{http://ws.admin.rule14.hovs.com/}getCheckedMenuByUserRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedMenusByUser", propOrder = {
    "getCheckedMenuByUserRequest"
})
public class GetCheckedMenusByUser {

    protected GetCheckedMenuByUserRequest getCheckedMenuByUserRequest;

    /**
     * Gets the value of the getCheckedMenuByUserRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetCheckedMenuByUserRequest }
     *     
     */
    public GetCheckedMenuByUserRequest getGetCheckedMenuByUserRequest() {
        return getCheckedMenuByUserRequest;
    }

    /**
     * Sets the value of the getCheckedMenuByUserRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCheckedMenuByUserRequest }
     *     
     */
    public void setGetCheckedMenuByUserRequest(GetCheckedMenuByUserRequest value) {
        this.getCheckedMenuByUserRequest = value;
    }

}
