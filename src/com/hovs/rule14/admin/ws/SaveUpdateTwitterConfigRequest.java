
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUpdateTwitterConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUpdateTwitterConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="twitterConfig" type="{http://ws.admin.rule14.hovs.com/}clientTwitterConfigForm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUpdateTwitterConfigRequest", propOrder = {
    "twitterConfig"
})
public class SaveUpdateTwitterConfigRequest
    extends GlobalRequest
{

    protected ClientTwitterConfigForm twitterConfig;

    /**
     * Gets the value of the twitterConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTwitterConfigForm }
     *     
     */
    public ClientTwitterConfigForm getTwitterConfig() {
        return twitterConfig;
    }

    /**
     * Sets the value of the twitterConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTwitterConfigForm }
     *     
     */
    public void setTwitterConfig(ClientTwitterConfigForm value) {
        this.twitterConfig = value;
    }

}
