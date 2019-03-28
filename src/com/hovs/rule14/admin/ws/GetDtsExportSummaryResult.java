
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDtsExportSummaryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDtsExportSummaryResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="exportDataSummaries" type="{http://ws.admin.rule14.hovs.com/}exportDataSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDtsExportSummaryResult", propOrder = {
    "exportDataSummaries"
})
public class GetDtsExportSummaryResult
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<ExportDataSummary> exportDataSummaries;

    /**
     * Gets the value of the exportDataSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportDataSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportDataSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDataSummary }
     * 
     * 
     */
    public List<ExportDataSummary> getExportDataSummaries() {
        if (exportDataSummaries == null) {
            exportDataSummaries = new ArrayList<ExportDataSummary>();
        }
        return this.exportDataSummaries;
    }

}
