
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActiveIconConfigList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActiveIconConfigList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadAllIconConfigRequest" type="{http://ws.admin.rule14.hovs.com/}loadAllIconConfigRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActiveIconConfigList", propOrder = {
    "loadAllIconConfigRequest"
})
public class GetActiveIconConfigList {

    protected LoadAllIconConfigRequest loadAllIconConfigRequest;

    /**
     * Gets the value of the loadAllIconConfigRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadAllIconConfigRequest }
     *     
     */
    public LoadAllIconConfigRequest getLoadAllIconConfigRequest() {
        return loadAllIconConfigRequest;
    }

    /**
     * Sets the value of the loadAllIconConfigRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadAllIconConfigRequest }
     *     
     */
    public void setLoadAllIconConfigRequest(LoadAllIconConfigRequest value) {
        this.loadAllIconConfigRequest = value;
    }

}
