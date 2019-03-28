
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientTwitterConfigForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientTwitterConfigForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accesTokenSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apiSectret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTwitterConfigId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replayMessageHandler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialMediaHeaderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="socialMediaSearchId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="topics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "clientTwitterConfigForm", propOrder = {
    "accesTokenSecret",
    "accessToken",
    "active",
    "apiSectret",
    "appKey",
    "appName",
    "autoResponse",
    "clientId",
    "clientName",
    "clientTwitterConfigId",
    "createdOn",
    "id",
    "ownerId",
    "ownerName",
    "password",
    "replayMessageHandler",
    "socialMediaHeaderId",
    "socialMediaSearchId",
    "topics",
    "userId",
    "userName"
})
public class ClientTwitterConfigForm {

    protected String accesTokenSecret;
    protected String accessToken;
    protected String active;
    protected String apiSectret;
    protected String appKey;
    protected String appName;
    protected String autoResponse;
    protected int clientId;
    protected String clientName;
    protected int clientTwitterConfigId;
    protected String createdOn;
    protected int id;
    protected String ownerId;
    protected String ownerName;
    protected String password;
    protected String replayMessageHandler;
    protected int socialMediaHeaderId;
    protected int socialMediaSearchId;
    protected String topics;
    protected int userId;
    protected String userName;

    /**
     * Gets the value of the accesTokenSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesTokenSecret() {
        return accesTokenSecret;
    }

    /**
     * Sets the value of the accesTokenSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesTokenSecret(String value) {
        this.accesTokenSecret = value;
    }

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the apiSectret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiSectret() {
        return apiSectret;
    }

    /**
     * Sets the value of the apiSectret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiSectret(String value) {
        this.apiSectret = value;
    }

    /**
     * Gets the value of the appKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets the value of the appKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the autoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoResponse() {
        return autoResponse;
    }

    /**
     * Sets the value of the autoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoResponse(String value) {
        this.autoResponse = value;
    }

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
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the clientTwitterConfigId property.
     * 
     */
    public int getClientTwitterConfigId() {
        return clientTwitterConfigId;
    }

    /**
     * Sets the value of the clientTwitterConfigId property.
     * 
     */
    public void setClientTwitterConfigId(int value) {
        this.clientTwitterConfigId = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the replayMessageHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplayMessageHandler() {
        return replayMessageHandler;
    }

    /**
     * Sets the value of the replayMessageHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplayMessageHandler(String value) {
        this.replayMessageHandler = value;
    }

    /**
     * Gets the value of the socialMediaHeaderId property.
     * 
     */
    public int getSocialMediaHeaderId() {
        return socialMediaHeaderId;
    }

    /**
     * Sets the value of the socialMediaHeaderId property.
     * 
     */
    public void setSocialMediaHeaderId(int value) {
        this.socialMediaHeaderId = value;
    }

    /**
     * Gets the value of the socialMediaSearchId property.
     * 
     */
    public int getSocialMediaSearchId() {
        return socialMediaSearchId;
    }

    /**
     * Sets the value of the socialMediaSearchId property.
     * 
     */
    public void setSocialMediaSearchId(int value) {
        this.socialMediaSearchId = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopics() {
        return topics;
    }

    /**
     * Sets the value of the topics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopics(String value) {
        this.topics = value;
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
