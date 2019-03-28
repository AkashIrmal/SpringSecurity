
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadExportedDataWithDts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadExportedDataWithDts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downloadExportedDataWithDtsRequest" type="{http://ws.admin.rule14.hovs.com/}downloadExportedDataWithDtsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadExportedDataWithDts", propOrder = {
    "downloadExportedDataWithDtsRequest"
})
public class DownloadExportedDataWithDts {

    protected DownloadExportedDataWithDtsRequest downloadExportedDataWithDtsRequest;

    /**
     * Gets the value of the downloadExportedDataWithDtsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadExportedDataWithDtsRequest }
     *     
     */
    public DownloadExportedDataWithDtsRequest getDownloadExportedDataWithDtsRequest() {
        return downloadExportedDataWithDtsRequest;
    }

    /**
     * Sets the value of the downloadExportedDataWithDtsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadExportedDataWithDtsRequest }
     *     
     */
    public void setDownloadExportedDataWithDtsRequest(DownloadExportedDataWithDtsRequest value) {
        this.downloadExportedDataWithDtsRequest = value;
    }

}
