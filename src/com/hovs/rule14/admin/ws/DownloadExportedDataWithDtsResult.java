
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadExportedDataWithDtsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadExportedDataWithDtsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="fileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportFileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="reportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadExportedDataWithDtsResult", propOrder = {
    "fileUrl",
    "reportFileContent",
    "reportFileName"
})
public class DownloadExportedDataWithDtsResult
    extends ResponseMessage
{

    protected String fileUrl;
    protected byte[] reportFileContent;
    protected String reportFileName;

    /**
     * Gets the value of the fileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets the value of the fileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUrl(String value) {
        this.fileUrl = value;
    }

    /**
     * Gets the value of the reportFileContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportFileContent() {
        return reportFileContent;
    }

    /**
     * Sets the value of the reportFileContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportFileContent(byte[] value) {
        this.reportFileContent = value;
    }

    /**
     * Gets the value of the reportFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFileName() {
        return reportFileName;
    }

    /**
     * Sets the value of the reportFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFileName(String value) {
        this.reportFileName = value;
    }

}
