
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllLabels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllLabels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadAllLabelsRequest" type="{http://ws.admin.rule14.hovs.com/}loadAllLabelsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllLabels", propOrder = {
    "loadAllLabelsRequest"
})
public class GetAllLabels {

    protected LoadAllLabelsRequest loadAllLabelsRequest;

    /**
     * Gets the value of the loadAllLabelsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadAllLabelsRequest }
     *     
     */
    public LoadAllLabelsRequest getLoadAllLabelsRequest() {
        return loadAllLabelsRequest;
    }

    /**
     * Sets the value of the loadAllLabelsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadAllLabelsRequest }
     *     
     */
    public void setLoadAllLabelsRequest(LoadAllLabelsRequest value) {
        this.loadAllLabelsRequest = value;
    }

}
