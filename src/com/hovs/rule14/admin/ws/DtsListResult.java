
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtsListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtsListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="dtsList" type="{http://ws.admin.rule14.hovs.com/}dtsDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtsListResult", propOrder = {
    "dtsList"
})
public class DtsListResult
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<DtsDetail> dtsList;

    /**
     * Gets the value of the dtsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtsDetail }
     * 
     * 
     */
    public List<DtsDetail> getDtsList() {
        if (dtsList == null) {
            dtsList = new ArrayList<DtsDetail>();
        }
        return this.dtsList;
    }

}
