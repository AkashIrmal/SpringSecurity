
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentLoginTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrentLoginTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCurrentLoginTimeRequest" type="{http://ws.admin.rule14.hovs.com/}getLastLoginTimeRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentLoginTime", propOrder = {
    "getCurrentLoginTimeRequest"
})
public class GetCurrentLoginTime {

    protected GetLastLoginTimeRequest getCurrentLoginTimeRequest;

    /**
     * Gets the value of the getCurrentLoginTimeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetLastLoginTimeRequest }
     *     
     */
    public GetLastLoginTimeRequest getGetCurrentLoginTimeRequest() {
        return getCurrentLoginTimeRequest;
    }

    /**
     * Sets the value of the getCurrentLoginTimeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLastLoginTimeRequest }
     *     
     */
    public void setGetCurrentLoginTimeRequest(GetLastLoginTimeRequest value) {
        this.getCurrentLoginTimeRequest = value;
    }

}
