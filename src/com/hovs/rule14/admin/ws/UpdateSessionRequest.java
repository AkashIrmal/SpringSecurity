
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSessionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSessionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="sessionBean" type="{http://ws.admin.rule14.hovs.com/}sessionLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSessionRequest", propOrder = {
    "sessionBean"
})
public class UpdateSessionRequest
    extends GlobalRequest
{

    protected SessionLog sessionBean;

    /**
     * Gets the value of the sessionBean property.
     * 
     * @return
     *     possible object is
     *     {@link SessionLog }
     *     
     */
    public SessionLog getSessionBean() {
        return sessionBean;
    }

    /**
     * Sets the value of the sessionBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionLog }
     *     
     */
    public void setSessionBean(SessionLog value) {
        this.sessionBean = value;
    }

}
