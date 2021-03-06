
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runAndProcessUploadedFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runAndProcessUploadedFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importDataWithDtsRequest" type="{http://ws.admin.rule14.hovs.com/}importDataWithDtsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runAndProcessUploadedFile", propOrder = {
    "importDataWithDtsRequest"
})
public class RunAndProcessUploadedFile {

    protected ImportDataWithDtsRequest importDataWithDtsRequest;

    /**
     * Gets the value of the importDataWithDtsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDataWithDtsRequest }
     *     
     */
    public ImportDataWithDtsRequest getImportDataWithDtsRequest() {
        return importDataWithDtsRequest;
    }

    /**
     * Sets the value of the importDataWithDtsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDataWithDtsRequest }
     *     
     */
    public void setImportDataWithDtsRequest(ImportDataWithDtsRequest value) {
        this.importDataWithDtsRequest = value;
    }

}
