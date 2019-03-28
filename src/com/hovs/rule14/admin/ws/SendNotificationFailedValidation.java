
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotificationFailedValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotificationFailedValidation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="failedTinValRequest" type="{http://ws.admin.rule14.hovs.com/}failedTinValRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotificationFailedValidation", propOrder = {
    "failedTinValRequest"
})
public class SendNotificationFailedValidation {

    protected FailedTinValRequest failedTinValRequest;

    /**
     * Gets the value of the failedTinValRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FailedTinValRequest }
     *     
     */
    public FailedTinValRequest getFailedTinValRequest() {
        return failedTinValRequest;
    }

    /**
     * Sets the value of the failedTinValRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedTinValRequest }
     *     
     */
    public void setFailedTinValRequest(FailedTinValRequest value) {
        this.failedTinValRequest = value;
    }

}
