
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateQuestionListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateQuestionListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="answerId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerId5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionId1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="questionId2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="questionId3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="questionId4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="questionId5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateQuestionListRequest", propOrder = {
    "answerId1",
    "answerId2",
    "answerId3",
    "answerId4",
    "answerId5",
    "questionId1",
    "questionId2",
    "questionId3",
    "questionId4",
    "questionId5"
})
public class UpdateQuestionListRequest
    extends GlobalRequest
{

    protected String answerId1;
    protected String answerId2;
    protected String answerId3;
    protected String answerId4;
    protected String answerId5;
    protected int questionId1;
    protected int questionId2;
    protected int questionId3;
    protected int questionId4;
    protected int questionId5;

    /**
     * Gets the value of the answerId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId1() {
        return answerId1;
    }

    /**
     * Sets the value of the answerId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId1(String value) {
        this.answerId1 = value;
    }

    /**
     * Gets the value of the answerId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId2() {
        return answerId2;
    }

    /**
     * Sets the value of the answerId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId2(String value) {
        this.answerId2 = value;
    }

    /**
     * Gets the value of the answerId3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId3() {
        return answerId3;
    }

    /**
     * Sets the value of the answerId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId3(String value) {
        this.answerId3 = value;
    }

    /**
     * Gets the value of the answerId4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId4() {
        return answerId4;
    }

    /**
     * Sets the value of the answerId4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId4(String value) {
        this.answerId4 = value;
    }

    /**
     * Gets the value of the answerId5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerId5() {
        return answerId5;
    }

    /**
     * Sets the value of the answerId5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerId5(String value) {
        this.answerId5 = value;
    }

    /**
     * Gets the value of the questionId1 property.
     * 
     */
    public int getQuestionId1() {
        return questionId1;
    }

    /**
     * Sets the value of the questionId1 property.
     * 
     */
    public void setQuestionId1(int value) {
        this.questionId1 = value;
    }

    /**
     * Gets the value of the questionId2 property.
     * 
     */
    public int getQuestionId2() {
        return questionId2;
    }

    /**
     * Sets the value of the questionId2 property.
     * 
     */
    public void setQuestionId2(int value) {
        this.questionId2 = value;
    }

    /**
     * Gets the value of the questionId3 property.
     * 
     */
    public int getQuestionId3() {
        return questionId3;
    }

    /**
     * Sets the value of the questionId3 property.
     * 
     */
    public void setQuestionId3(int value) {
        this.questionId3 = value;
    }

    /**
     * Gets the value of the questionId4 property.
     * 
     */
    public int getQuestionId4() {
        return questionId4;
    }

    /**
     * Sets the value of the questionId4 property.
     * 
     */
    public void setQuestionId4(int value) {
        this.questionId4 = value;
    }

    /**
     * Gets the value of the questionId5 property.
     * 
     */
    public int getQuestionId5() {
        return questionId5;
    }

    /**
     * Sets the value of the questionId5 property.
     * 
     */
    public void setQuestionId5(int value) {
        this.questionId5 = value;
    }

}
