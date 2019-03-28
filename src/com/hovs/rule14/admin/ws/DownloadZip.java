
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadZip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadZip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtsFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="generatedReportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadZip", propOrder = {
    "dtsFilePath",
    "dtsId",
    "generatedReportFileName"
})
public class DownloadZip {

    protected String dtsFilePath;
    protected Integer dtsId;
    protected String generatedReportFileName;

    /**
     * Gets the value of the dtsFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtsFilePath() {
        return dtsFilePath;
    }

    /**
     * Sets the value of the dtsFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtsFilePath(String value) {
        this.dtsFilePath = value;
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
     * Gets the value of the generatedReportFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedReportFileName() {
        return generatedReportFileName;
    }

    /**
     * Sets the value of the generatedReportFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedReportFileName(String value) {
        this.generatedReportFileName = value;
    }

}
