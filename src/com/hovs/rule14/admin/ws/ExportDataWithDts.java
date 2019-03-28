
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportDataWithDts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportDataWithDts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exportDataWithDtsRequest" type="{http://ws.admin.rule14.hovs.com/}exportDataWithDtsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDataWithDts", propOrder = {
    "exportDataWithDtsRequest"
})
public class ExportDataWithDts {

    protected ExportDataWithDtsRequest exportDataWithDtsRequest;

    /**
     * Gets the value of the exportDataWithDtsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDataWithDtsRequest }
     *     
     */
    public ExportDataWithDtsRequest getExportDataWithDtsRequest() {
        return exportDataWithDtsRequest;
    }

    /**
     * Sets the value of the exportDataWithDtsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDataWithDtsRequest }
     *     
     */
    public void setExportDataWithDtsRequest(ExportDataWithDtsRequest value) {
        this.exportDataWithDtsRequest = value;
    }

}
