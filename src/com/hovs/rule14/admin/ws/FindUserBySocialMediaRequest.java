
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findUserBySocialMediaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findUserBySocialMediaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socialMediaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialMediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findUserBySocialMediaRequest", propOrder = {
    "socialMediaId",
    "socialMediaType"
})
public class FindUserBySocialMediaRequest {

    protected String socialMediaId;
    protected String socialMediaType;

    /**
     * Gets the value of the socialMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialMediaId() {
        return socialMediaId;
    }

    /**
     * Sets the value of the socialMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialMediaId(String value) {
        this.socialMediaId = value;
    }

    /**
     * Gets the value of the socialMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialMediaType() {
        return socialMediaType;
    }

    /**
     * Sets the value of the socialMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialMediaType(String value) {
        this.socialMediaType = value;
    }

}
