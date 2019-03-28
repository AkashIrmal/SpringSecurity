
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isExistsAppNameByClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isExistsAppNameByClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isExistsAppNameByClientRequest" type="{http://ws.admin.rule14.hovs.com/}isExistAppNameByClientRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isExistsAppNameByClient", propOrder = {
    "isExistsAppNameByClientRequest"
})
public class IsExistsAppNameByClient {

    protected IsExistAppNameByClientRequest isExistsAppNameByClientRequest;

    /**
     * Gets the value of the isExistsAppNameByClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link IsExistAppNameByClientRequest }
     *     
     */
    public IsExistAppNameByClientRequest getIsExistsAppNameByClientRequest() {
        return isExistsAppNameByClientRequest;
    }

    /**
     * Sets the value of the isExistsAppNameByClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsExistAppNameByClientRequest }
     *     
     */
    public void setIsExistsAppNameByClientRequest(IsExistAppNameByClientRequest value) {
        this.isExistsAppNameByClientRequest = value;
    }

}
