
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
 *         &lt;element name="response" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AcknowledgeRObjectResponseType"/>
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
    "response"
})
@XmlRootElement(name = "acknowledgeRObjectResponse")
public class AcknowledgeRObjectResponse {

    @XmlElement(required = true, nillable = true)
    protected AcknowledgeRObjectResponseType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeRObjectResponseType }
     *     
     */
    public AcknowledgeRObjectResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeRObjectResponseType }
     *     
     */
    public void setResponse(AcknowledgeRObjectResponseType value) {
        this.response = value;
    }

}
