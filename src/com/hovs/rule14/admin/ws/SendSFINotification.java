
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendSFINotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSFINotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aNotificationRequest" type="{http://ws.admin.rule14.hovs.com/}sfiNotificationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSFINotification", propOrder = {
    "aNotificationRequest"
})
public class SendSFINotification {

    protected SfiNotificationRequest aNotificationRequest;

    /**
     * Gets the value of the aNotificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SfiNotificationRequest }
     *     
     */
    public SfiNotificationRequest getANotificationRequest() {
        return aNotificationRequest;
    }

    /**
     * Sets the value of the aNotificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfiNotificationRequest }
     *     
     */
    public void setANotificationRequest(SfiNotificationRequest value) {
        this.aNotificationRequest = value;
    }

}
