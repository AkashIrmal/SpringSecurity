
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoringSocialAccountsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoringSocialAccountsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="facebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instagram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="twitter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoringSocialAccountsRequest", propOrder = {
    "facebook",
    "instagram",
    "linkedin",
    "twitter"
})
public class MonitoringSocialAccountsRequest
    extends GlobalRequest
{

    protected String facebook;
    protected String instagram;
    protected String linkedin;
    protected String twitter;

    /**
     * Gets the value of the facebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Sets the value of the facebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebook(String value) {
        this.facebook = value;
    }

    /**
     * Gets the value of the instagram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * Sets the value of the instagram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstagram(String value) {
        this.instagram = value;
    }

    /**
     * Gets the value of the linkedin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * Sets the value of the linkedin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedin(String value) {
        this.linkedin = value;
    }

    /**
     * Gets the value of the twitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * Sets the value of the twitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitter(String value) {
        this.twitter = value;
    }

}
