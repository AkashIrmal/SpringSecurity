
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedIconsByClientResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedIconsByClientResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="iconList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedIconsByClientResult", propOrder = {
    "iconList"
})
public class GetCheckedIconsByClientResult
    extends ResponseMessage
{

    protected String iconList;

    /**
     * Gets the value of the iconList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconList() {
        return iconList;
    }

    /**
     * Sets the value of the iconList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconList(String value) {
        this.iconList = value;
    }

}
