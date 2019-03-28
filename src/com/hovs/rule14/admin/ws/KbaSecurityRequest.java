
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kbaSecurityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kbaSecurityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedKBAAnswer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedKBAAnswer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedKBAQuestionId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectedKBAQuestionId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kbaSecurityRequest", propOrder = {
    "emailId",
    "loginName",
    "selectedKBAAnswer1",
    "selectedKBAAnswer2",
    "selectedKBAQuestionId1",
    "selectedKBAQuestionId2"
})
public class KbaSecurityRequest
    extends GlobalRequest
{

    protected String emailId;
    protected String loginName;
    protected String selectedKBAAnswer1;
    protected String selectedKBAAnswer2;
    protected int selectedKBAQuestionId1;
    protected int selectedKBAQuestionId2;

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the selectedKBAAnswer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedKBAAnswer1() {
        return selectedKBAAnswer1;
    }

    /**
     * Sets the value of the selectedKBAAnswer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedKBAAnswer1(String value) {
        this.selectedKBAAnswer1 = value;
    }

    /**
     * Gets the value of the selectedKBAAnswer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedKBAAnswer2() {
        return selectedKBAAnswer2;
    }

    /**
     * Sets the value of the selectedKBAAnswer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedKBAAnswer2(String value) {
        this.selectedKBAAnswer2 = value;
    }

    /**
     * Gets the value of the selectedKBAQuestionId1 property.
     * 
     */
    public int getSelectedKBAQuestionId1() {
        return selectedKBAQuestionId1;
    }

    /**
     * Sets the value of the selectedKBAQuestionId1 property.
     * 
     */
    public void setSelectedKBAQuestionId1(int value) {
        this.selectedKBAQuestionId1 = value;
    }

    /**
     * Gets the value of the selectedKBAQuestionId2 property.
     * 
     */
    public int getSelectedKBAQuestionId2() {
        return selectedKBAQuestionId2;
    }

    /**
     * Sets the value of the selectedKBAQuestionId2 property.
     * 
     */
    public void setSelectedKBAQuestionId2(int value) {
        this.selectedKBAQuestionId2 = value;
    }

}
