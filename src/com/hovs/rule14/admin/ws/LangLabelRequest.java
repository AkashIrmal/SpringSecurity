
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for langLabelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="langLabelRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="langId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="langName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langLabelRequest", propOrder = {
    "langId",
    "langName"
})
public class LangLabelRequest
    extends GlobalRequest
{

    protected Integer langId;
    protected String langName;

    /**
     * Gets the value of the langId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLangId() {
        return langId;
    }

    /**
     * Sets the value of the langId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLangId(Integer value) {
        this.langId = value;
    }

    /**
     * Gets the value of the langName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangName() {
        return langName;
    }

    /**
     * Sets the value of the langName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangName(String value) {
        this.langName = value;
    }

}
