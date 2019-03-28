
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckedLabelByClientandLanguage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckedLabelByClientandLanguage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCheckedLabelsByClientLanguageRequest" type="{http://ws.admin.rule14.hovs.com/}getCheckedLabelsByClientLanguageRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckedLabelByClientandLanguage", propOrder = {
    "getCheckedLabelsByClientLanguageRequest"
})
public class GetCheckedLabelByClientandLanguage {

    protected GetCheckedLabelsByClientLanguageRequest getCheckedLabelsByClientLanguageRequest;

    /**
     * Gets the value of the getCheckedLabelsByClientLanguageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetCheckedLabelsByClientLanguageRequest }
     *     
     */
    public GetCheckedLabelsByClientLanguageRequest getGetCheckedLabelsByClientLanguageRequest() {
        return getCheckedLabelsByClientLanguageRequest;
    }

    /**
     * Sets the value of the getCheckedLabelsByClientLanguageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCheckedLabelsByClientLanguageRequest }
     *     
     */
    public void setGetCheckedLabelsByClientLanguageRequest(GetCheckedLabelsByClientLanguageRequest value) {
        this.getCheckedLabelsByClientLanguageRequest = value;
    }

}
