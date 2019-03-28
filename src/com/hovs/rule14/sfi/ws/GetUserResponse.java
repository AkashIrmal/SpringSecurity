
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="sfiUser" type="{http://ws.sfi.rule14.hovs.com/}sfiUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", propOrder = {
    "sfiUser"
})
public class GetUserResponse
    extends ResponseMessage
{

    protected SfiUser sfiUser;

    /**
     * Gets the value of the sfiUser property.
     * 
     * @return
     *     possible object is
     *     {@link SfiUser }
     *     
     */
    public SfiUser getSfiUser() {
        return sfiUser;
    }

    /**
     * Sets the value of the sfiUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfiUser }
     *     
     */
    public void setSfiUser(SfiUser value) {
        this.sfiUser = value;
    }

}
