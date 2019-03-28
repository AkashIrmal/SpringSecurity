
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUpdateModuleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUpdateModuleRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="moduleLicense" type="{http://ws.admin.rule14.hovs.com/}moduleLicense" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUpdateModuleRequest", propOrder = {
    "moduleLicense"
})
public class SaveUpdateModuleRequest
    extends GlobalRequest
{

    protected ModuleLicense moduleLicense;

    /**
     * Gets the value of the moduleLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleLicense }
     *     
     */
    public ModuleLicense getModuleLicense() {
        return moduleLicense;
    }

    /**
     * Sets the value of the moduleLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleLicense }
     *     
     */
    public void setModuleLicense(ModuleLicense value) {
        this.moduleLicense = value;
    }

}
