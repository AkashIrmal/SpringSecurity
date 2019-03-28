
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userSessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userSessionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessedPageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="browseCloseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginElapsedTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="loginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userSessionInfo", propOrder = {
    "accessedPageName",
    "browseCloseFlag",
    "loginElapsedTime",
    "loginTime",
    "sessionId",
    "userId",
    "userName"
})
public class UserSessionInfo {

    protected String accessedPageName;
    protected String browseCloseFlag;
    protected long loginElapsedTime;
    protected String loginTime;
    protected String sessionId;
    protected Integer userId;
    protected String userName;

    /**
     * Gets the value of the accessedPageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessedPageName() {
        return accessedPageName;
    }

    /**
     * Sets the value of the accessedPageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessedPageName(String value) {
        this.accessedPageName = value;
    }

    /**
     * Gets the value of the browseCloseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowseCloseFlag() {
        return browseCloseFlag;
    }

    /**
     * Sets the value of the browseCloseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowseCloseFlag(String value) {
        this.browseCloseFlag = value;
    }

    /**
     * Gets the value of the loginElapsedTime property.
     * 
     */
    public long getLoginElapsedTime() {
        return loginElapsedTime;
    }

    /**
     * Sets the value of the loginElapsedTime property.
     * 
     */
    public void setLoginElapsedTime(long value) {
        this.loginElapsedTime = value;
    }

    /**
     * Gets the value of the loginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginTime(String value) {
        this.loginTime = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
