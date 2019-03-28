
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getModuleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getModuleList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getModulesRequest" type="{http://ws.admin.rule14.hovs.com/}getModulesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getModuleList", propOrder = {
    "getModulesRequest"
})
public class GetModuleList {

    protected GetModulesRequest getModulesRequest;

    /**
     * Gets the value of the getModulesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetModulesRequest }
     *     
     */
    public GetModulesRequest getGetModulesRequest() {
        return getModulesRequest;
    }

    /**
     * Sets the value of the getModulesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetModulesRequest }
     *     
     */
    public void setGetModulesRequest(GetModulesRequest value) {
        this.getModulesRequest = value;
    }

}
