
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAutoResponseTwitterTopics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAutoResponseTwitterTopics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAutoResponseTwitterConfigTopicsRequest" type="{http://ws.admin.rule14.hovs.com/}getAutoResponseTwitterConfigTopicsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAutoResponseTwitterTopics", propOrder = {
    "getAutoResponseTwitterConfigTopicsRequest"
})
public class GetAutoResponseTwitterTopics {

    protected GetAutoResponseTwitterConfigTopicsRequest getAutoResponseTwitterConfigTopicsRequest;

    /**
     * Gets the value of the getAutoResponseTwitterConfigTopicsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetAutoResponseTwitterConfigTopicsRequest }
     *     
     */
    public GetAutoResponseTwitterConfigTopicsRequest getGetAutoResponseTwitterConfigTopicsRequest() {
        return getAutoResponseTwitterConfigTopicsRequest;
    }

    /**
     * Sets the value of the getAutoResponseTwitterConfigTopicsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAutoResponseTwitterConfigTopicsRequest }
     *     
     */
    public void setGetAutoResponseTwitterConfigTopicsRequest(GetAutoResponseTwitterConfigTopicsRequest value) {
        this.getAutoResponseTwitterConfigTopicsRequest = value;
    }

}
