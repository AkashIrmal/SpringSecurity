
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationRequest" type="{http://ws.admin.rule14.hovs.com/}sendNotificationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotification", propOrder = {
    "notificationRequest"
})
public class SendNotification {

    protected SendNotificationRequest notificationRequest;

    /**
     * Gets the value of the notificationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SendNotificationRequest }
     *     
     */
    public SendNotificationRequest getNotificationRequest() {
        return notificationRequest;
    }

    /**
     * Sets the value of the notificationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendNotificationRequest }
     *     
     */
    public void setNotificationRequest(SendNotificationRequest value) {
        this.notificationRequest = value;
    }

}
