
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedMenuByRoleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedMenuByRoleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="checkedMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedMenuByRoleResult", propOrder = {
    "checkedMenu"
})
public class GetCheckedMenuByRoleResult
    extends ResponseMessage
{

    protected String checkedMenu;

    /**
     * Gets the value of the checkedMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedMenu() {
        return checkedMenu;
    }

    /**
     * Sets the value of the checkedMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedMenu(String value) {
        this.checkedMenu = value;
    }

}
