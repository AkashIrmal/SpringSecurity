
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotificationToUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotificationToUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendNotificationToUsersRequest" type="{http://ws.admin.rule14.hovs.com/}sendNotificationToUsersRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotificationToUsers", propOrder = {
    "sendNotificationToUsersRequest"
})
public class SendNotificationToUsers {

    protected SendNotificationToUsersRequest sendNotificationToUsersRequest;

    /**
     * Gets the value of the sendNotificationToUsersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SendNotificationToUsersRequest }
     *     
     */
    public SendNotificationToUsersRequest getSendNotificationToUsersRequest() {
        return sendNotificationToUsersRequest;
    }

    /**
     * Sets the value of the sendNotificationToUsersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendNotificationToUsersRequest }
     *     
     */
    public void setSendNotificationToUsersRequest(SendNotificationToUsersRequest value) {
        this.sendNotificationToUsersRequest = value;
    }

}
