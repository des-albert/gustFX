
package com.agile.ws.schema.collaboration.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AuditRObjectResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responses"
})
@XmlRootElement(name = "auditRObjectResponse")
public class AuditRObjectResponse {

    @XmlElement(required = true, nillable = true)
    protected AuditRObjectResponseType responses;

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link AuditRObjectResponseType }
     *     
     */
    public AuditRObjectResponseType getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRObjectResponseType }
     *     
     */
    public void setResponses(AuditRObjectResponseType value) {
        this.responses = value;
    }

}
