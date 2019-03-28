
package com.hovs.rule14.sfi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSfiW9FormResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSfiW9FormResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="sfiw9formList" type="{http://ws.sfi.rule14.hovs.com/}sfiW9Form" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSfiW9FormResponse", propOrder = {
    "sfiw9FormList"
})
public class GetSfiW9FormResponse
    extends ResponseMessage
{

    @XmlElement(name = "sfiw9formList", nillable = true)
    protected List<SfiW9Form> sfiw9FormList;

    /**
     * Gets the value of the sfiw9FormList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfiw9FormList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfiw9FormList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SfiW9Form }
     * 
     * 
     */
    public List<SfiW9Form> getSfiw9FormList() {
        if (sfiw9FormList == null) {
            sfiw9FormList = new ArrayList<SfiW9Form>();
        }
        return this.sfiw9FormList;
    }

}
