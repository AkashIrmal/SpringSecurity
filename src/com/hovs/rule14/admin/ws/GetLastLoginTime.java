
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLastLoginTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLastLoginTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLastLoginTimeRequest" type="{http://ws.admin.rule14.hovs.com/}getLastLoginTimeRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastLoginTime", propOrder = {
    "getLastLoginTimeRequest"
})
public class GetLastLoginTime {

    protected GetLastLoginTimeRequest getLastLoginTimeRequest;

    /**
     * Gets the value of the getLastLoginTimeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetLastLoginTimeRequest }
     *     
     */
    public GetLastLoginTimeRequest getGetLastLoginTimeRequest() {
        return getLastLoginTimeRequest;
    }

    /**
     * Sets the value of the getLastLoginTimeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLastLoginTimeRequest }
     *     
     */
    public void setGetLastLoginTimeRequest(GetLastLoginTimeRequest value) {
        this.getLastLoginTimeRequest = value;
    }

}
