
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileProcessNoteType uses an
 *                 identifier of type AgileIdentifierType, a message and
 *                 reference to define an AgileProcessNoteType, to define a
 *                 note which might be returned             to a client in
 *                 the course of a webservice operation.
 *                 @identifier          -  This element is of type
 *                 AgileIdentifierType and is used to
 *                 identify a single AgileProcessNoteType.
 *                 @message             -  Refers to the content of the
 *                 actual note which constitutes
 *                 an AgileProcessNoteType.             @reference
 *                 -  Reference is a string value denoting the base
 *                 reference value                                     for
 *                 the underlying process note.             
 * 
 * <p>Java class for AgileProcessNoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileProcessNoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileIdentifierType" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileProcessNoteType", propOrder = {
    "identifier",
    "message",
    "reference"
})
public class AgileProcessNoteType {

    @XmlElement(nillable = true)
    protected AgileIdentifierType identifier;
    @XmlElement(nillable = true)
    protected String message;
    @XmlElement(nillable = true)
    protected String reference;

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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
