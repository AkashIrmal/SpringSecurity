
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadIconConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadIconConfigResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="iconList" type="{http://ws.admin.rule14.hovs.com/}iconConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadIconConfigResult", propOrder = {
    "iconList"
})
public class LoadIconConfigResult
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<IconConfig> iconList;

    /**
     * Gets the value of the iconList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iconList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIconList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IconConfig }
     * 
     * 
     */
    public List<IconConfig> getIconList() {
        if (iconList == null) {
            iconList = new ArrayList<IconConfig>();
        }
        return this.iconList;
    }

}
