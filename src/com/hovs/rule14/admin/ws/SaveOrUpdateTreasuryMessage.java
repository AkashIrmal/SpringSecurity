
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateTreasuryMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateTreasuryMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveOrUpdateTreasuryMessage" type="{http://ws.admin.rule14.hovs.com/}treasuryMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateTreasuryMessage", propOrder = {
    "saveOrUpdateTreasuryMessage"
})
public class SaveOrUpdateTreasuryMessage {

    protected TreasuryMessageRequest saveOrUpdateTreasuryMessage;

    /**
     * Gets the value of the saveOrUpdateTreasuryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public TreasuryMessageRequest getSaveOrUpdateTreasuryMessage() {
        return saveOrUpdateTreasuryMessage;
    }

    /**
     * Sets the value of the saveOrUpdateTreasuryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public void setSaveOrUpdateTreasuryMessage(TreasuryMessageRequest value) {
        this.saveOrUpdateTreasuryMessage = value;
    }

}
