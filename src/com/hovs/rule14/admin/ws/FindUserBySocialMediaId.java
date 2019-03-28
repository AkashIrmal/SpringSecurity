
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findUserBySocialMediaId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findUserBySocialMediaId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findUserBySocialMediaRequest" type="{http://ws.admin.rule14.hovs.com/}findUserBySocialMediaRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findUserBySocialMediaId", propOrder = {
    "findUserBySocialMediaRequest"
})
public class FindUserBySocialMediaId {

    protected FindUserBySocialMediaRequest findUserBySocialMediaRequest;

    /**
     * Gets the value of the findUserBySocialMediaRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FindUserBySocialMediaRequest }
     *     
     */
    public FindUserBySocialMediaRequest getFindUserBySocialMediaRequest() {
        return findUserBySocialMediaRequest;
    }

    /**
     * Sets the value of the findUserBySocialMediaRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindUserBySocialMediaRequest }
     *     
     */
    public void setFindUserBySocialMediaRequest(FindUserBySocialMediaRequest value) {
        this.findUserBySocialMediaRequest = value;
    }

}
