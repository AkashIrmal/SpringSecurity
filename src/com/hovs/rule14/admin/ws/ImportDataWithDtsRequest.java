
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importDataWithDtsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importDataWithDtsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="dtsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileByteData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileLogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importFileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="modelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importDataWithDtsRequest", propOrder = {
    "dtsCode",
    "dtsId",
    "fileByteData",
    "fileLogId",
    "fileName",
    "fileType",
    "fileTypeCode",
    "importFileData",
    "modelDate",
    "projectGroupId"
})
public class ImportDataWithDtsRequest
    extends GlobalRequest
{

    protected String dtsCode;
    protected Integer dtsId;
    protected String fileByteData;
    protected String fileLogId;
    protected String fileName;
    protected String fileType;
    protected String fileTypeCode;
    protected byte[] importFileData;
    protected String modelDate;
    protected Integer projectGroupId;

    /**
     * Gets the value of the dtsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtsCode() {
        return dtsCode;
    }

    /**
     * Sets the value of the dtsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtsCode(String value) {
        this.dtsCode = value;
    }

    /**
     * Gets the value of the dtsId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDtsId() {
        return dtsId;
    }

    /**
     * Sets the value of the dtsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDtsId(Integer value) {
        this.dtsId = value;
    }

    /**
     * Gets the value of the fileByteData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileByteData() {
        return fileByteData;
    }

    /**
     * Sets the value of the fileByteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileByteData(String value) {
        this.fileByteData = value;
    }

    /**
     * Gets the value of the fileLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLogId() {
        return fileLogId;
    }

    /**
     * Sets the value of the fileLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLogId(String value) {
        this.fileLogId = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTypeCode() {
        return fileTypeCode;
    }

    /**
     * Sets the value of the fileTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTypeCode(String value) {
        this.fileTypeCode = value;
    }

    /**
     * Gets the value of the importFileData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImportFileData() {
        return importFileData;
    }

    /**
     * Sets the value of the importFileData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImportFileData(byte[] value) {
        this.importFileData = value;
    }

    /**
     * Gets the value of the modelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDate() {
        return modelDate;
    }

    /**
     * Sets the value of the modelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDate(String value) {
        this.modelDate = value;
    }

    /**
     * Gets the value of the projectGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectGroupId() {
        return projectGroupId;
    }

    /**
     * Sets the value of the projectGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectGroupId(Integer value) {
        this.projectGroupId = value;
    }

}
