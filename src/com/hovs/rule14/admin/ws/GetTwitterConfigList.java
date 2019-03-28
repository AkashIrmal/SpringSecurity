
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTwitterConfigList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTwitterConfigList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTwitterConfigListRequest" type="{http://ws.admin.rule14.hovs.com/}getTwitterConfigListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTwitterConfigList", propOrder = {
    "getTwitterConfigListRequest"
})
public class GetTwitterConfigList {

    protected GetTwitterConfigListRequest getTwitterConfigListRequest;

    /**
     * Gets the value of the getTwitterConfigListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTwitterConfigListRequest }
     *     
     */
    public GetTwitterConfigListRequest getGetTwitterConfigListRequest() {
        return getTwitterConfigListRequest;
    }

    /**
     * Sets the value of the getTwitterConfigListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTwitterConfigListRequest }
     *     
     */
    public void setGetTwitterConfigListRequest(GetTwitterConfigListRequest value) {
        this.getTwitterConfigListRequest = value;
    }

}
