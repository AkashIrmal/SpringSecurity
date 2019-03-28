
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadDtsTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadDtsTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downloadDtsTemplateRequest" type="{http://ws.admin.rule14.hovs.com/}downloadDtsTemplateRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadDtsTemplate", propOrder = {
    "downloadDtsTemplateRequest"
})
public class DownloadDtsTemplate {

    protected DownloadDtsTemplateRequest downloadDtsTemplateRequest;

    /**
     * Gets the value of the downloadDtsTemplateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadDtsTemplateRequest }
     *     
     */
    public DownloadDtsTemplateRequest getDownloadDtsTemplateRequest() {
        return downloadDtsTemplateRequest;
    }

    /**
     * Sets the value of the downloadDtsTemplateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadDtsTemplateRequest }
     *     
     */
    public void setDownloadDtsTemplateRequest(DownloadDtsTemplateRequest value) {
        this.downloadDtsTemplateRequest = value;
    }

}
