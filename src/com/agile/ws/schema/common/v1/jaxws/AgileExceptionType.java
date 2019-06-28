
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileExceptionType defines
 *                 an Exception in the Agile system. Any exception
 *                 encountered             while executing a webservice is
 *                 represented by this type.                @identifier
 *                 -  'identifier' is of type AgileIdentifierType and is
 *                 used to                                      identify
 *                 the object that caused this warning.
 *                 @exceptionId         -  A string denoting the exception
 *                 Id of an exception.             @message             -
 *                 This field details the actual content and message of the
 *                 exception.             @cause               -  Refers to
 *                 the root cause of the exception.             
 * 
 * <p>Java class for AgileExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileIdentifierType" minOccurs="0"/>
 *         &lt;element name="exceptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileExceptionType", propOrder = {
    "identifier",
    "exceptionId",
    "message",
    "cause"
})
public class AgileExceptionType {

    @XmlElement(nillable = true)
    protected AgileIdentifierType identifier;
    @XmlElement(required = true, nillable = true)
    protected String exceptionId;
    @XmlElement(nillable = true)
    protected String message;
    @XmlElement(nillable = true)
    protected String cause;

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
     * Gets the value of the exceptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionId() {
        return exceptionId;
    }

    /**
     * Sets the value of the exceptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionId(String value) {
        this.exceptionId = value;
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
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

}
