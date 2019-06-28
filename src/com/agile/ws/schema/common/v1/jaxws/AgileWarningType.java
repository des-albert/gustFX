
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileWarningType defines a
 *                 warning in the Agile system and is used to identify any
 *                 warning encountered while executing a webservice.
 *                 @identifier          -  This element is of type
 *                 AgileIdentifierType and is used to
 *                 identify the object that caused this warning.
 *                 @message             -  Refers to the actual content of
 *                 the warning message.             @warningId           -
 *                 Warning ID refers to the ID of the underlying warning.
 *                 Please refer to SDK guide for all warning IDs supported
 *                 by Agile System.             
 * 
 * <p>Java class for AgileWarningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileWarningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileIdentifierType" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileWarningType", propOrder = {
    "identifier",
    "message",
    "warningId"
})
public class AgileWarningType {

    @XmlElement(nillable = true)
    protected AgileIdentifierType identifier;
    @XmlElement(nillable = true)
    protected String message;
    @XmlElement(nillable = true)
    protected String warningId;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link AgileIdentifierType }
     *     
     */
    public AgileIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileIdentifierType }
     *     
     */
    public void setIdentifier(AgileIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the warningId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningId() {
        return warningId;
    }

    /**
     * Sets the value of the warningId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningId(String value) {
        this.warningId = value;
    }

}
