
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isSsnExists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isSsnExists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSsnRequest" type="{http://ws.admin.rule14.hovs.com/}isSsnExistRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isSsnExists", propOrder = {
    "isSsnRequest"
})
public class IsSsnExists {

    protected IsSsnExistRequest isSsnRequest;

    /**
     * Gets the value of the isSsnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsSsnExistRequest }
     *     
     */
    public IsSsnExistRequest getIsSsnRequest() {
        return isSsnRequest;
    }

    /**
     * Sets the value of the isSsnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSsnExistRequest }
     *     
     */
    public void setIsSsnRequest(IsSsnExistRequest value) {
        this.isSsnRequest = value;
    }

}
