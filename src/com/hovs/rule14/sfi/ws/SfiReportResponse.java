
package com.hovs.rule14.sfi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sfiReportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sfiReportResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lSfiReportDto" type="{http://ws.sfi.rule14.hovs.com/}sfiReportDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lSortCriteriaForReportDto" type="{http://ws.sfi.rule14.hovs.com/}sortCriteriaForReportDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sfiReportResponse", propOrder = {
    "reportType",
    "lSfiReportDto",
    "lSortCriteriaForReportDto"
})
public class SfiReportResponse
    extends ResponseMessage
{

    protected String reportType;
    @XmlElement(nillable = true)
    protected List<SfiReportDto> lSfiReportDto;
    @XmlElement(nillable = true)
    protected List<SortCriteriaForReportDto> lSortCriteriaForReportDto;

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the lSfiReportDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lSfiReportDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLSfiReportDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SfiReportDto }
     * 
     * 
     */
    public List<SfiReportDto> getLSfiReportDto() {
        if (lSfiReportDto == null) {
            lSfiReportDto = new ArrayList<SfiReportDto>();
        }
        return this.lSfiReportDto;
    }

    /**
     * Gets the value of the lSortCriteriaForReportDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lSortCriteriaForReportDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLSortCriteriaForReportDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortCriteriaForReportDto }
     * 
     * 
     */
    public List<SortCriteriaForReportDto> getLSortCriteriaForReportDto() {
        if (lSortCriteriaForReportDto == null) {
            lSortCriteriaForReportDto = new ArrayList<SortCriteriaForReportDto>();
        }
        return this.lSortCriteriaForReportDto;
    }

}
