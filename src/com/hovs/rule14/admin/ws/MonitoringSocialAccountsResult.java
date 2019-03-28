
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoringSocialAccountsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoringSocialAccountsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="saveUpdateStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoringSocialAccountsResult", propOrder = {
    "saveUpdateStatus"
})
public class MonitoringSocialAccountsResult
    extends ResponseMessage
{

    protected boolean saveUpdateStatus;

    /**
     * Gets the value of the saveUpdateStatus property.
     * 
     */
    public boolean isSaveUpdateStatus() {
        return saveUpdateStatus;
    }

    /**
     * Sets the value of the saveUpdateStatus property.
     * 
     */
    public void setSaveUpdateStatus(boolean value) {
        this.saveUpdateStatus = value;
    }

}
