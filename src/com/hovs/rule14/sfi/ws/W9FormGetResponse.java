
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for w9FormGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="w9FormGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="lW9FormDto" type="{http://ws.sfi.rule14.hovs.com/}w9FormDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "w9FormGetResponse", propOrder = {
    "lw9FormDto"
})
public class W9FormGetResponse
    extends ResponseMessage
{

    @XmlElement(name = "lW9FormDto")
    protected W9FormDto lw9FormDto;

    /**
     * Gets the value of the lw9FormDto property.
     * 
     * @return
     *     possible object is
     *     {@link W9FormDto }
     *     
     */
    public W9FormDto getLW9FormDto() {
        return lw9FormDto;
    }

    /**
     * Sets the value of the lw9FormDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9FormDto }
     *     
     */
    public void setLW9FormDto(W9FormDto value) {
        this.lw9FormDto = value;
    }

}
