
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedMenuByUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedMenuByUserResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="menuList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedMenuByUserResult", propOrder = {
    "menuList"
})
public class GetCheckedMenuByUserResult
    extends ResponseMessage
{

    protected String menuList;

    /**
     * Gets the value of the menuList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuList() {
        return menuList;
    }

    /**
     * Sets the value of the menuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuList(String value) {
        this.menuList = value;
    }

}
