
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadAllExportedDataWithDtsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadAllExportedDataWithDtsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.admin.rule14.hovs.com/}downloadExportedDataWithDtsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadAllExportedDataWithDtsResponse", propOrder = {
    "_return"
})
public class DownloadAllExportedDataWithDtsResponse {

    @XmlElement(name = "return")
    protected DownloadExportedDataWithDtsResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadExportedDataWithDtsResult }
     *     
     */
    public DownloadExportedDataWithDtsResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadExportedDataWithDtsResult }
     *     
     */
    public void setReturn(DownloadExportedDataWithDtsResult value) {
        this._return = value;
    }

}
