
package com.hovs.rule14.admin.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadMenusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadMenusResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}responseMessage">
 *       &lt;sequence>
 *         &lt;element name="childMenuList" type="{http://ws.admin.rule14.hovs.com/}menu" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="menu" type="{http://ws.admin.rule14.hovs.com/}menu" minOccurs="0"/>
 *         &lt;element name="parentMenuList" type="{http://ws.admin.rule14.hovs.com/}menu" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadMenusResult", propOrder = {
    "childMenuList",
    "menu",
    "parentMenuList"
})
public class LoadMenusResult
    extends ResponseMessage
{

    @XmlElement(nillable = true)
    protected List<Menu> childMenuList;
    protected Menu menu;
    @XmlElement(nillable = true)
    protected List<Menu> parentMenuList;

    /**
     * Gets the value of the childMenuList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childMenuList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildMenuList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Menu }
     * 
     * 
     */
    public List<Menu> getChildMenuList() {
        if (childMenuList == null) {
            childMenuList = new ArrayList<Menu>();
        }
        return this.childMenuList;
    }

    /**
     * Gets the value of the menu property.
     * 
     * @return
     *     possible object is
     *     {@link Menu }
     *     
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Sets the value of the menu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Menu }
     *     
     */
    public void setMenu(Menu value) {
        this.menu = value;
    }

    /**
     * Gets the value of the parentMenuList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentMenuList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentMenuList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Menu }
     * 
     * 
     */
    public List<Menu> getParentMenuList() {
        if (parentMenuList == null) {
            parentMenuList = new ArrayList<Menu>();
        }
        return this.parentMenuList;
    }

}
