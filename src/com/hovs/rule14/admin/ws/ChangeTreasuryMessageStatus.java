
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeTreasuryMessageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeTreasuryMessageStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeTreasuryMessageStatus" type="{http://ws.admin.rule14.hovs.com/}treasuryMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeTreasuryMessageStatus", propOrder = {
    "changeTreasuryMessageStatus"
})
public class ChangeTreasuryMessageStatus {

    protected TreasuryMessageRequest changeTreasuryMessageStatus;

    /**
     * Gets the value of the changeTreasuryMessageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public TreasuryMessageRequest getChangeTreasuryMessageStatus() {
        return changeTreasuryMessageStatus;
    }

    /**
     * Sets the value of the changeTreasuryMessageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public void setChangeTreasuryMessageStatus(TreasuryMessageRequest value) {
        this.changeTreasuryMessageStatus = value;
    }

}
