
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserKBASecurityQuestionListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserKBASecurityQuestionListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.admin.rule14.hovs.com/}kbaQuestionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserKBASecurityQuestionListResponse", propOrder = {
    "_return"
})
public class GetUserKBASecurityQuestionListResponse {

    @XmlElement(name = "return")
    protected KbaQuestionResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link KbaQuestionResult }
     *     
     */
    public KbaQuestionResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link KbaQuestionResult }
     *     
     */
    public void setReturn(KbaQuestionResult value) {
        this._return = value;
    }

}
