
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoringSocialAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoringSocialAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitoringSocialAccountsResult" type="{http://ws.admin.rule14.hovs.com/}monitoringSocialAccountsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoringSocialAccount", propOrder = {
    "monitoringSocialAccountsResult"
})
public class MonitoringSocialAccount {

    protected MonitoringSocialAccountsRequest monitoringSocialAccountsResult;

    /**
     * Gets the value of the monitoringSocialAccountsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringSocialAccountsRequest }
     *     
     */
    public MonitoringSocialAccountsRequest getMonitoringSocialAccountsResult() {
        return monitoringSocialAccountsResult;
    }

    /**
     * Sets the value of the monitoringSocialAccountsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringSocialAccountsRequest }
     *     
     */
    public void setMonitoringSocialAccountsResult(MonitoringSocialAccountsRequest value) {
        this.monitoringSocialAccountsResult = value;
    }

}
