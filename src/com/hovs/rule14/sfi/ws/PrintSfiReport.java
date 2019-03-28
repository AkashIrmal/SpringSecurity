
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for printSfiReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="printSfiReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SfiReportRequest" type="{http://ws.sfi.rule14.hovs.com/}sfiReportRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printSfiReport", propOrder = {
    "sfiReportRequest"
})
public class PrintSfiReport {

    @XmlElement(name = "SfiReportRequest")
    protected SfiReportRequest sfiReportRequest;

    /**
     * Gets the value of the sfiReportRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SfiReportRequest }
     *     
     */
    public SfiReportRequest getSfiReportRequest() {
        return sfiReportRequest;
    }

    /**
     * Sets the value of the sfiReportRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfiReportRequest }
     *     
     */
    public void setSfiReportRequest(SfiReportRequest value) {
        this.sfiReportRequest = value;
    }

}
