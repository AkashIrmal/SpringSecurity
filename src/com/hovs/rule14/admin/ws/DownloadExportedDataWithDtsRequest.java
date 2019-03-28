
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadExportedDataWithDtsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadExportedDataWithDtsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="dtsDetails" type="{http://ws.admin.rule14.hovs.com/}downloadZip" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dtsFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="generatedReportFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadExportedDataWithDtsRequest", propOrder = {
    "dtsDetails",
    "dtsFilePath",
    "dtsId",
    "generatedReportFileName"
})
public class DownloadExportedDataWithDtsRequest
    extends GlobalRequest
{

    @XmlElement(nillable = true)
    protected List<DownloadZip> dtsDetails;
    protected String dtsFilePath;
    protected Integer dtsId;
    protected String generatedReportFileName;

    /**
     * Gets the value of the dtsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadZip }
     * 
     * 
     */
    public List<DownloadZip> getDtsDetails() {
        if (dtsDetails == null) {
            dtsDetails = new ArrayList<DownloadZip>();
        }
        return this.dtsDetails;
    }

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
