
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateLabels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateLabels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateLabelsByClientRequest" type="{http://ws.admin.rule14.hovs.com/}saveUpdateLabelsByClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateLabels", propOrder = {
    "saveUpdateLabelsByClientRequest"
})
public class SaveOrUpdateLabels {

    protected SaveUpdateLabelsByClientRequest saveUpdateLabelsByClientRequest;

    /**
     * Gets the value of the saveUpdateLabelsByClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SaveUpdateLabelsByClientRequest }
     *     
     */
    public SaveUpdateLabelsByClientRequest getSaveUpdateLabelsByClientRequest() {
        return saveUpdateLabelsByClientRequest;
    }

    /**
     * Sets the value of the saveUpdateLabelsByClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveUpdateLabelsByClientRequest }
     *     
     */
    public void setSaveUpdateLabelsByClientRequest(SaveUpdateLabelsByClientRequest value) {
        this.saveUpdateLabelsByClientRequest = value;
    }

}
