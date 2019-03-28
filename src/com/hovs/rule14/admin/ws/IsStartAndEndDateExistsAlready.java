
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isStartAndEndDateExistsAlready complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isStartAndEndDateExistsAlready">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isStartAndEndDateExistsAlready" type="{http://ws.admin.rule14.hovs.com/}treasuryMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isStartAndEndDateExistsAlready", propOrder = {
    "isStartAndEndDateExistsAlready"
})
public class IsStartAndEndDateExistsAlready {

    protected TreasuryMessageRequest isStartAndEndDateExistsAlready;

    /**
     * Gets the value of the isStartAndEndDateExistsAlready property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public TreasuryMessageRequest getIsStartAndEndDateExistsAlready() {
        return isStartAndEndDateExistsAlready;
    }

    /**
     * Sets the value of the isStartAndEndDateExistsAlready property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public void setIsStartAndEndDateExistsAlready(TreasuryMessageRequest value) {
        this.isStartAndEndDateExistsAlready = value;
    }

}
