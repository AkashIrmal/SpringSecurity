
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadDTSList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadDTSList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadDTSList" type="{http://ws.admin.rule14.hovs.com/}dtsListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadDTSList", propOrder = {
    "loadDTSList"
})
public class LoadDTSList {

    protected DtsListRequest loadDTSList;

    /**
     * Gets the value of the loadDTSList property.
     * 
     * @return
     *     possible object is
     *     {@link DtsListRequest }
     *     
     */
    public DtsListRequest getLoadDTSList() {
        return loadDTSList;
    }

    /**
     * Sets the value of the loadDTSList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtsListRequest }
     *     
     */
    public void setLoadDTSList(DtsListRequest value) {
        this.loadDTSList = value;
    }

}
