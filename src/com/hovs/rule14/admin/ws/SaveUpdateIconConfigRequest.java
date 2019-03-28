
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUpdateIconConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUpdateIconConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="iconConfig" type="{http://ws.admin.rule14.hovs.com/}iconConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUpdateIconConfigRequest", propOrder = {
    "iconConfig"
})
public class SaveUpdateIconConfigRequest
    extends GlobalRequest
{

    protected IconConfig iconConfig;

    /**
     * Gets the value of the iconConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IconConfig }
     *     
     */
    public IconConfig getIconConfig() {
        return iconConfig;
    }

    /**
     * Sets the value of the iconConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconConfig }
     *     
     */
    public void setIconConfig(IconConfig value) {
        this.iconConfig = value;
    }

}
