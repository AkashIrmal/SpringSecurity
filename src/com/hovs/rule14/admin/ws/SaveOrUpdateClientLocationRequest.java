
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateClientLocationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateClientLocationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="clientLocation" type="{http://ws.admin.rule14.hovs.com/}clientLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateClientLocationRequest", propOrder = {
    "clientLocation"
})
public class SaveOrUpdateClientLocationRequest
    extends GlobalRequest
{

    protected ClientLocation clientLocation;

    /**
     * Gets the value of the clientLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ClientLocation }
     *     
     */
    public ClientLocation getClientLocation() {
        return clientLocation;
    }

    /**
     * Sets the value of the clientLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientLocation }
     *     
     */
    public void setClientLocation(ClientLocation value) {
        this.clientLocation = value;
    }

}
