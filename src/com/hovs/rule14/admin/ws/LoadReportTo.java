
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadReportTo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadReportTo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadReportTo" type="{http://ws.admin.rule14.hovs.com/}reportToMappingRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadReportTo", propOrder = {
    "loadReportTo"
})
public class LoadReportTo {

    protected ReportToMappingRequest loadReportTo;

    /**
     * Gets the value of the loadReportTo property.
     * 
     * @return
     *     possible object is
     *     {@link ReportToMappingRequest }
     *     
     */
    public ReportToMappingRequest getLoadReportTo() {
        return loadReportTo;
    }

    /**
     * Sets the value of the loadReportTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportToMappingRequest }
     *     
     */
    public void setLoadReportTo(ReportToMappingRequest value) {
        this.loadReportTo = value;
    }

}
