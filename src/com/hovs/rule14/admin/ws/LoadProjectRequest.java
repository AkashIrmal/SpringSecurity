
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadProjectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadProjectRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.admin.rule14.hovs.com/}globalRequest">
 *       &lt;sequence>
 *         &lt;element name="projectCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="projectCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadProjectRequest", propOrder = {
    "projectCategoryCode",
    "projectCategoryId",
    "projectCategoryName"
})
public class LoadProjectRequest
    extends GlobalRequest
{

    protected String projectCategoryCode;
    protected int projectCategoryId;
    protected String projectCategoryName;

    /**
     * Gets the value of the projectCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCategoryCode() {
        return projectCategoryCode;
    }

    /**
     * Sets the value of the projectCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCategoryCode(String value) {
        this.projectCategoryCode = value;
    }

    /**
     * Gets the value of the projectCategoryId property.
     * 
     */
    public int getProjectCategoryId() {
        return projectCategoryId;
    }

    /**
     * Sets the value of the projectCategoryId property.
     * 
     */
    public void setProjectCategoryId(int value) {
        this.projectCategoryId = value;
    }

    /**
     * Gets the value of the projectCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCategoryName() {
        return projectCategoryName;
    }

    /**
     * Sets the value of the projectCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCategoryName(String value) {
        this.projectCategoryName = value;
    }

}
