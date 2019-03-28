
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isUserIdExists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isUserIdExists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isUserIdExistRequest" type="{http://ws.admin.rule14.hovs.com/}isUserIdExistRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isUserIdExists", propOrder = {
    "isUserIdExistRequest"
})
public class IsUserIdExists {

    protected IsUserIdExistRequest isUserIdExistRequest;

    /**
     * Gets the value of the isUserIdExistRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsUserIdExistRequest }
     *     
     */
    public IsUserIdExistRequest getIsUserIdExistRequest() {
        return isUserIdExistRequest;
    }

    /**
     * Sets the value of the isUserIdExistRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsUserIdExistRequest }
     *     
     */
    public void setIsUserIdExistRequest(IsUserIdExistRequest value) {
        this.isUserIdExistRequest = value;
    }

}
