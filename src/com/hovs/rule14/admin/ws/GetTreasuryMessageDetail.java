
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTreasuryMessageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTreasuryMessageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTreasuryMessageDetail" type="{http://ws.admin.rule14.hovs.com/}treasuryMessageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTreasuryMessageDetail", propOrder = {
    "getTreasuryMessageDetail"
})
public class GetTreasuryMessageDetail {

    protected TreasuryMessageRequest getTreasuryMessageDetail;

    /**
     * Gets the value of the getTreasuryMessageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public TreasuryMessageRequest getGetTreasuryMessageDetail() {
        return getTreasuryMessageDetail;
    }

    /**
     * Sets the value of the getTreasuryMessageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryMessageRequest }
     *     
     */
    public void setGetTreasuryMessageDetail(TreasuryMessageRequest value) {
        this.getTreasuryMessageDetail = value;
    }

}
