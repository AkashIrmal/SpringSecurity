
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sessionLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logouttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.admin.rule14.hovs.com/}user" minOccurs="0"/>
 *         &lt;element name="userSessionInfo" type="{http://ws.admin.rule14.hovs.com/}userSessionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionLog", propOrder = {
    "elapsedTime",
    "loginTime",
    "logoutTime",
    "logouttype",
    "sessionId",
    "user",
    "userSessionInfo"
})
public class SessionLog {

    protected String elapsedTime;
    protected String loginTime;
    protected String logoutTime;
    protected String logouttype;
    protected String sessionId;
    protected User user;
    protected UserSessionInfo userSessionInfo;

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElapsedTime(String value) {
        this.elapsedTime = value;
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
     * Gets the value of the logoutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutTime() {
        return logoutTime;
    }

    /**
     * Sets the value of the logoutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutTime(String value) {
        this.logoutTime = value;
    }

    /**
     * Gets the value of the logouttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogouttype() {
        return logouttype;
    }

    /**
     * Sets the value of the logouttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogouttype(String value) {
        this.logouttype = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the userSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserSessionInfo }
     *     
     */
    public UserSessionInfo getUserSessionInfo() {
        return userSessionInfo;
    }

    /**
     * Sets the value of the userSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSessionInfo }
     *     
     */
    public void setUserSessionInfo(UserSessionInfo value) {
        this.userSessionInfo = value;
    }

}
