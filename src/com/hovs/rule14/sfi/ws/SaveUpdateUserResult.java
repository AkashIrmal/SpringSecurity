
package com.hovs.rule14.sfi.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUpdateUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUpdateUserResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="errorList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="saveOrUpdateStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUpdateUserResult", propOrder = {
    "errorList",
    "id",
    "saveOrUpdateStatus"
})
public class SaveUpdateUserResult
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<String> errorList;
    protected long id;
    protected boolean saveOrUpdateStatus;

    /**
     * Gets the value of the errorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<String>();
        }
        return this.errorList;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the saveOrUpdateStatus property.
     * 
     */
    public boolean isSaveOrUpdateStatus() {
        return saveOrUpdateStatus;
    }

    /**
     * Sets the value of the saveOrUpdateStatus property.
     * 
     */
    public void setSaveOrUpdateStatus(boolean value) {
        this.saveOrUpdateStatus = value;
    }

}
