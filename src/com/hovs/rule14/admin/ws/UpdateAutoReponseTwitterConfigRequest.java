
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAutoReponseTwitterConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAutoReponseTwitterConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="twitterConfigList" type="{http://ws.admin.rule14.hovs.com/}clientTwitterConfigForm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAutoReponseTwitterConfigRequest", propOrder = {
    "twitterConfigList"
})
public class UpdateAutoReponseTwitterConfigRequest
    extends GlobalRequest
{

    @XmlElement(nillable = true)
    protected List<ClientTwitterConfigForm> twitterConfigList;

    /**
     * Gets the value of the twitterConfigList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twitterConfigList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwitterConfigList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientTwitterConfigForm }
     * 
     * 
     */
    public List<ClientTwitterConfigForm> getTwitterConfigList() {
        if (twitterConfigList == null) {
            twitterConfigList = new ArrayList<ClientTwitterConfigForm>();
        }
        return this.twitterConfigList;
    }

}
