
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generatePassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generatePassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatePasswordRequest" type="{http://ws.admin.rule14.hovs.com/}generatePasswordRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatePassword", propOrder = {
    "generatePasswordRequest"
})
public class GeneratePassword {

    protected GeneratePasswordRequest generatePasswordRequest;

    /**
     * Gets the value of the generatePasswordRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratePasswordRequest }
     *     
     */
    public GeneratePasswordRequest getGeneratePasswordRequest() {
        return generatePasswordRequest;
    }

    /**
     * Sets the value of the generatePasswordRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratePasswordRequest }
     *     
     */
    public void setGeneratePasswordRequest(GeneratePasswordRequest value) {
        this.generatePasswordRequest = value;
    }

}
