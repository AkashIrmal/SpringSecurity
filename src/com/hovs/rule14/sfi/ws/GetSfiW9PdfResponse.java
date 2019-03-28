
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSfiW9PdfResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSfiW9PdfResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="base64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfiw9pdf" type="{http://ws.sfi.rule14.hovs.com/}w9FormDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSfiW9PdfResponse", propOrder = {
    "base64String",
    "firstName",
    "sfiw9Pdf"
})
public class GetSfiW9PdfResponse
    extends ResponseMessage
{

    protected String base64String;
    protected String firstName;
    @XmlElement(name = "sfiw9pdf")
    protected W9FormDto sfiw9Pdf;

    /**
     * Gets the value of the base64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64String() {
        return base64String;
    }

    /**
     * Sets the value of the base64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64String(String value) {
        this.base64String = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the sfiw9Pdf property.
     * 
     * @return
     *     possible object is
     *     {@link W9FormDto }
     *     
     */
    public W9FormDto getSfiw9Pdf() {
        return sfiw9Pdf;
    }

    /**
     * Sets the value of the sfiw9Pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9FormDto }
     *     
     */
    public void setSfiw9Pdf(W9FormDto value) {
        this.sfiw9Pdf = value;
    }

}
