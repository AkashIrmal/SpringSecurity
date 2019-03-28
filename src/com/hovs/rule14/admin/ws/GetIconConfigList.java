
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIconConfigList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIconConfigList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadIconConfigRequest" type="{http://ws.admin.rule14.hovs.com/}loadIconConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIconConfigList", propOrder = {
    "loadIconConfigRequest"
})
public class GetIconConfigList {

    protected LoadIconConfigRequest loadIconConfigRequest;

    /**
     * Gets the value of the loadIconConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadIconConfigRequest }
     *     
     */
    public LoadIconConfigRequest getLoadIconConfigRequest() {
        return loadIconConfigRequest;
    }

    /**
     * Sets the value of the loadIconConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadIconConfigRequest }
     *     
     */
    public void setLoadIconConfigRequest(LoadIconConfigRequest value) {
        this.loadIconConfigRequest = value;
    }

}
