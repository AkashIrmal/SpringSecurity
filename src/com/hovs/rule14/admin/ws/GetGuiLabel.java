
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGuiLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGuiLabel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="langLabelRequest" type="{http://ws.admin.rule14.hovs.com/}langLabelRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGuiLabel", propOrder = {
    "langLabelRequest"
})
public class GetGuiLabel {

    protected LangLabelRequest langLabelRequest;

    /**
     * Gets the value of the langLabelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LangLabelRequest }
     *     
     */
    public LangLabelRequest getLangLabelRequest() {
        return langLabelRequest;
    }

    /**
     * Sets the value of the langLabelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangLabelRequest }
     *     
     */
    public void setLangLabelRequest(LangLabelRequest value) {
        this.langLabelRequest = value;
    }

}
