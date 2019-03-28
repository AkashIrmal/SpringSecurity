
package com.hovs.rule14.sfi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrUpdateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.sfi.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="returnId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="saveOrUpdateStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrUpdateResponse", propOrder = {
    "returnId",
    "saveOrUpdateStatus"
})
public class SaveOrUpdateResponse
    extends ResponseMessage
{

    protected long returnId;
    protected boolean saveOrUpdateStatus;

    /**
     * Gets the value of the returnId property.
     * 
     */
    public long getReturnId() {
        return returnId;
    }

    /**
     * Sets the value of the returnId property.
     * 
     */
    public void setReturnId(long value) {
        this.returnId = value;
    }

    /**
     * Gets the value of the saveOrUpdateStatus property.
     * 
     */
    public boolean isSaveOrUpdateStatus() {
        return saveOrUpdateStatus;
    }

    /**
     * Sets the value of the saveOrUpdateStatus property.
     * 
     */
    public void setSaveOrUpdateStatus(boolean value) {
        this.saveOrUpdateStatus = value;
    }

}
