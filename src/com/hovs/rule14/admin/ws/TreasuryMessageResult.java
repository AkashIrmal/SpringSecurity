
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for treasuryMessageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="treasuryMessageResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="isDateExists" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="treasuryMessage" type="{http://ws.admin.rule14.hovs.com/}treasuryMessage" minOccurs="0"/>
 *         &lt;element name="treasuryMessageLists" type="{http://ws.admin.rule14.hovs.com/}treasuryMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "treasuryMessageResult", propOrder = {
    "isDateExists",
    "treasuryMessage",
    "treasuryMessageLists"
})
public class TreasuryMessageResult
    extends ResponseMessage
{

    protected int isDateExists;
    protected TreasuryMessage treasuryMessage;
    @XmlElement(nillable = true)
    protected List<TreasuryMessage> treasuryMessageLists;

    /**
     * Gets the value of the isDateExists property.
     * 
     */
    public int getIsDateExists() {
        return isDateExists;
    }

    /**
     * Sets the value of the isDateExists property.
     * 
     */
    public void setIsDateExists(int value) {
        this.isDateExists = value;
    }

    /**
     * Gets the value of the treasuryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessage }
     *     
     */
    public TreasuryMessage getTreasuryMessage() {
        return treasuryMessage;
    }

    /**
     * Sets the value of the treasuryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessage }
     *     
     */
    public void setTreasuryMessage(TreasuryMessage value) {
        this.treasuryMessage = value;
    }

    /**
     * Gets the value of the treasuryMessageLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treasuryMessageLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreasuryMessageLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TreasuryMessage }
     * 
     * 
     */
    public List<TreasuryMessage> getTreasuryMessageLists() {
        if (treasuryMessageLists == null) {
            treasuryMessageLists = new ArrayList<TreasuryMessage>();
        }
        return this.treasuryMessageLists;
    }

}
