
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiPrintReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiPrintReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="base64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiPrintReportResponse", propOrder = {
    "base64String",
    "dataAvailable",
    "result"
})
public class SfiPrintReportResponse
    extends ResponseMessage
{

    protected String base64String;
    protected boolean dataAvailable;
    protected boolean result;

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
     * Gets the value of the dataAvailable property.
     * 
     */
    public boolean isDataAvailable() {
        return dataAvailable;
    }

    /**
     * Sets the value of the dataAvailable property.
     * 
     */
    public void setDataAvailable(boolean value) {
        this.dataAvailable = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

}
