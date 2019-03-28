
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDtsExportSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDtsExportSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDtsExportSummaryRequest" type="{http://ws.admin.rule14.hovs.com/}getDtsExportSummaryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDtsExportSummary", propOrder = {
    "getDtsExportSummaryRequest"
})
public class GetDtsExportSummary {

    protected GetDtsExportSummaryRequest getDtsExportSummaryRequest;

    /**
     * Gets the value of the getDtsExportSummaryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetDtsExportSummaryRequest }
     *     
     */
    public GetDtsExportSummaryRequest getGetDtsExportSummaryRequest() {
        return getDtsExportSummaryRequest;
    }

    /**
     * Sets the value of the getDtsExportSummaryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDtsExportSummaryRequest }
     *     
     */
    public void setGetDtsExportSummaryRequest(GetDtsExportSummaryRequest value) {
        this.getDtsExportSummaryRequest = value;
    }

}
