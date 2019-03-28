
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAutoResponseTwitterConfigTopicsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAutoResponseTwitterConfigTopicsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="endPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAutoResponseTwitterConfigTopicsRequest", propOrder = {
    "endPage",
    "orderBy",
    "startPage"
})
public class GetAutoResponseTwitterConfigTopicsRequest
    extends GlobalRequest
{

    protected int endPage;
    protected String orderBy;
    protected int startPage;

    /**
     * Gets the value of the endPage property.
     * 
     */
    public int getEndPage() {
        return endPage;
    }

    /**
     * Sets the value of the endPage property.
     * 
     */
    public void setEndPage(int value) {
        this.endPage = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the startPage property.
     * 
     */
    public int getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     */
    public void setStartPage(int value) {
        this.startPage = value;
    }

}
