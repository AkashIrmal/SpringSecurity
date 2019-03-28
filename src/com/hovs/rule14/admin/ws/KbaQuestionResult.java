
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kbaQuestionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kbaQuestionResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kbaSecurityQuestionAnswersValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="questionList" type="{http://ws.admin.rule14.hovs.com/}kbaQuestion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kbaQuestionResult", propOrder = {
    "clientId",
    "errorList",
    "kbaSecurityQuestionAnswersValid",
    "projectId",
    "questionList",
    "userId"
})
public class KbaQuestionResult
    extends ResponseMessage
{

    protected int clientId;
    @XmlElement(nillable = true)
    protected List<String> errorList;
    protected boolean kbaSecurityQuestionAnswersValid;
    protected int projectId;
    @XmlElement(nillable = true)
    protected List<KbaQuestion> questionList;
    protected int userId;

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<String>();
        }
        return this.errorList;
    }

    /**
     * Gets the value of the kbaSecurityQuestionAnswersValid property.
     * 
     */
    public boolean isKbaSecurityQuestionAnswersValid() {
        return kbaSecurityQuestionAnswersValid;
    }

    /**
     * Sets the value of the kbaSecurityQuestionAnswersValid property.
     * 
     */
    public void setKbaSecurityQuestionAnswersValid(boolean value) {
        this.kbaSecurityQuestionAnswersValid = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(int value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the questionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KbaQuestion }
     * 
     * 
     */
    public List<KbaQuestion> getQuestionList() {
        if (questionList == null) {
            questionList = new ArrayList<KbaQuestion>();
        }
        return this.questionList;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

}
