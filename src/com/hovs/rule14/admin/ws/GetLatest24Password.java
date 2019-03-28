
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLatest24Password complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLatest24Password">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PasswordListRequest" type="{http://ws.admin.rule14.hovs.com/}passwordListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLatest24Password", propOrder = {
    "passwordListRequest"
})
public class GetLatest24Password {

    @XmlElement(name = "PasswordListRequest")
    protected PasswordListRequest passwordListRequest;

    /**
     * Gets the value of the passwordListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordListRequest }
     *     
     */
    public PasswordListRequest getPasswordListRequest() {
        return passwordListRequest;
    }

    /**
     * Sets the value of the passwordListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordListRequest }
     *     
     */
    public void setPasswordListRequest(PasswordListRequest value) {
        this.passwordListRequest = value;
    }

}
