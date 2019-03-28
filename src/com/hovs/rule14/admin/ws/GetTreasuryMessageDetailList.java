
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTreasuryMessageDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTreasuryMessageDetailList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTreasuryMessageDetailList" type="{http://ws.admin.rule14.hovs.com/}treasuryMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTreasuryMessageDetailList", propOrder = {
    "getTreasuryMessageDetailList"
})
public class GetTreasuryMessageDetailList {

    protected TreasuryMessageRequest getTreasuryMessageDetailList;

    /**
     * Gets the value of the getTreasuryMessageDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public TreasuryMessageRequest getGetTreasuryMessageDetailList() {
        return getTreasuryMessageDetailList;
    }

    /**
     * Sets the value of the getTreasuryMessageDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public void setGetTreasuryMessageDetailList(TreasuryMessageRequest value) {
        this.getTreasuryMessageDetailList = value;
    }

}
