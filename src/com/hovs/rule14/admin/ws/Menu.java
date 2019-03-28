
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for menu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i18nLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="managerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="menuId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="menuName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentMenuId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentMenuName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsivePageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menu", propOrder = {
    "active",
    "hasChild",
    "i18NLabel",
    "isNode",
    "managerId",
    "managerName",
    "menuId",
    "menuName",
    "pageName",
    "parentMenuId",
    "parentMenuName",
    "responsivePageName",
    "sequenceNumber"
})
public class Menu {

    protected String active;
    protected String hasChild;
    @XmlElement(name = "i18nLabel")
    protected String i18NLabel;
    protected String isNode;
    protected int managerId;
    protected String managerName;
    protected int menuId;
    protected String menuName;
    protected String pageName;
    protected int parentMenuId;
    protected String parentMenuName;
    protected String responsivePageName;
    protected int sequenceNumber;

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
     * Gets the value of the hasChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasChild() {
        return hasChild;
    }

    /**
     * Sets the value of the hasChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasChild(String value) {
        this.hasChild = value;
    }

    /**
     * Gets the value of the i18NLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI18NLabel() {
        return i18NLabel;
    }

    /**
     * Sets the value of the i18NLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI18NLabel(String value) {
        this.i18NLabel = value;
    }

    /**
     * Gets the value of the isNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNode() {
        return isNode;
    }

    /**
     * Sets the value of the isNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNode(String value) {
        this.isNode = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     */
    public int getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     */
    public void setManagerId(int value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerName(String value) {
        this.managerName = value;
    }

    /**
     * Gets the value of the menuId property.
     * 
     */
    public int getMenuId() {
        return menuId;
    }

    /**
     * Sets the value of the menuId property.
     * 
     */
    public void setMenuId(int value) {
        this.menuId = value;
    }

    /**
     * Gets the value of the menuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * Sets the value of the menuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenuName(String value) {
        this.menuName = value;
    }

    /**
     * Gets the value of the pageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * Sets the value of the pageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageName(String value) {
        this.pageName = value;
    }

    /**
     * Gets the value of the parentMenuId property.
     * 
     */
    public int getParentMenuId() {
        return parentMenuId;
    }

    /**
     * Sets the value of the parentMenuId property.
     * 
     */
    public void setParentMenuId(int value) {
        this.parentMenuId = value;
    }

    /**
     * Gets the value of the parentMenuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMenuName() {
        return parentMenuName;
    }

    /**
     * Sets the value of the parentMenuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMenuName(String value) {
        this.parentMenuName = value;
    }

    /**
     * Gets the value of the responsivePageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsivePageName() {
        return responsivePageName;
    }

    /**
     * Sets the value of the responsivePageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsivePageName(String value) {
        this.responsivePageName = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

}
