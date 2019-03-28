
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusUpdateSocialAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusUpdateSocialAccountResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="statusUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusUpdateSocialAccountResult", propOrder = {
    "statusUpdate"
})
public class StatusUpdateSocialAccountResult
    extends ResponseMessage
{

    protected boolean statusUpdate;

    /**
     * Gets the value of the statusUpdate property.
     * 
     */
    public boolean isStatusUpdate() {
        return statusUpdate;
    }

    /**
     * Sets the value of the statusUpdate property.
     * 
     */
    public void setStatusUpdate(boolean value) {
        this.statusUpdate = value;
    }

}
