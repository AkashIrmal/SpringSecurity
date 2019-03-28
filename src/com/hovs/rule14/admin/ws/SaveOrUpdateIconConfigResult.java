
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateIconConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateIconConfigResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
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
@XmlType(name = "saveOrUpdateIconConfigResult", propOrder = {
    "iconConfig"
})
public class SaveOrUpdateIconConfigResult
    extends ResponseMessage
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
