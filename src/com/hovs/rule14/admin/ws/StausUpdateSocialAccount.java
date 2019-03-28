
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stausUpdateSocialAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stausUpdateSocialAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusUpdateSocialAccountRequest" type="{http://ws.admin.rule14.hovs.com/}statusUpdateSocialAccountRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stausUpdateSocialAccount", propOrder = {
    "statusUpdateSocialAccountRequest"
})
public class StausUpdateSocialAccount {

    protected StatusUpdateSocialAccountRequest statusUpdateSocialAccountRequest;

    /**
     * Gets the value of the statusUpdateSocialAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StatusUpdateSocialAccountRequest }
     *     
     */
    public StatusUpdateSocialAccountRequest getStatusUpdateSocialAccountRequest() {
        return statusUpdateSocialAccountRequest;
    }

    /**
     * Sets the value of the statusUpdateSocialAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusUpdateSocialAccountRequest }
     *     
     */
    public void setStatusUpdateSocialAccountRequest(StatusUpdateSocialAccountRequest value) {
        this.statusUpdateSocialAccountRequest = value;
    }

}
