
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadProjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadProjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadProjectRequest" type="{http://ws.admin.rule14.hovs.com/}loadProjectRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadProjects", propOrder = {
    "loadProjectRequest"
})
public class LoadProjects {

    protected LoadProjectRequest loadProjectRequest;

    /**
     * Gets the value of the loadProjectRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadProjectRequest }
     *     
     */
    public LoadProjectRequest getLoadProjectRequest() {
        return loadProjectRequest;
    }

    /**
     * Sets the value of the loadProjectRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadProjectRequest }
     *     
     */
    public void setLoadProjectRequest(LoadProjectRequest value) {
        this.loadProjectRequest = value;
    }

}
