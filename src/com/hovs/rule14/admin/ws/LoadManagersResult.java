
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadManagersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagersResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="manager" type="{http://ws.admin.rule14.hovs.com/}manager" minOccurs="0"/>
 *         &lt;element name="managers" type="{http://ws.admin.rule14.hovs.com/}manager" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadManagersResult", propOrder = {
    "manager",
    "managers"
})
public class LoadManagersResult
    extends ResponseMessage
{

    protected Manager manager;
    @XmlElement(nillable = true)
    protected List<Manager> managers;

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link Manager }
     *     
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Manager }
     *     
     */
    public void setManager(Manager value) {
        this.manager = value;
    }

    /**
     * Gets the value of the managers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Manager }
     * 
     * 
     */
    public List<Manager> getManagers() {
        if (managers == null) {
            managers = new ArrayList<Manager>();
        }
        return this.managers;
    }

}
