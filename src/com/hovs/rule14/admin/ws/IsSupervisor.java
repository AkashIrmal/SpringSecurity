
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isSupervisor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isSupervisor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSupervisorRequest" type="{http://ws.admin.rule14.hovs.com/}isSupervisorRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isSupervisor", propOrder = {
    "isSupervisorRequest"
})
public class IsSupervisor {

    protected IsSupervisorRequest isSupervisorRequest;

    /**
     * Gets the value of the isSupervisorRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsSupervisorRequest }
     *     
     */
    public IsSupervisorRequest getIsSupervisorRequest() {
        return isSupervisorRequest;
    }

    /**
     * Sets the value of the isSupervisorRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSupervisorRequest }
     *     
     */
    public void setIsSupervisorRequest(IsSupervisorRequest value) {
        this.isSupervisorRequest = value;
    }

}
