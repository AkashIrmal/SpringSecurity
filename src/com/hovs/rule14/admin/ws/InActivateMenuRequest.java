
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inActivateMenuRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inActivateMenuRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="activeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inActivateMenuRequest", propOrder = {
    "activeStatus",
    "menuId"
})
public class InActivateMenuRequest
    extends GlobalRequest
{

    protected String activeStatus;
    protected int menuId;

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStatus(String value) {
        this.activeStatus = value;
    }

    /**
     * Gets the value of the menuId property.
     * 
     */
    public int getMenuId() {
        return menuId;
    }

    /**
     * Sets the value of the menuId property.
     * 
     */
    public void setMenuId(int value) {
        this.menuId = value;
    }

}
