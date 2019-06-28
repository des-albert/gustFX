
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *              Every response object in
 *                 Agile is characterized by an AbstractResponseType, which
 *                 in             turn displays base characteristics of
 *                 AgileResponseHeaderType.                @messageId
 *                 -  An identification number for the message, used in
 *                 asynchronous                                     calls
 *                 for differentiating messages from each other. This
 *                 element                                     is currently
 *                 not utilized in Agile 9.3 webservices
 *                 @messageName         -  A name associated with a
 *                 particular messageId. This element is
 *                 currently not utilized in Agile 9.3 webservices.
 *                 @statusCode          -  This status code contains
 *                 information about the result of
 *                 execution of the webservice operation, denoting either
 *                 succesful                                     execution
 *                 or any of the failed states.
 *                 @sessionParameters   -  Parameters pertaining to a
 *                 particular session. These values
 *                 are expressed as PropertyListTypes. This element is
 *                 currently                                     not
 *                 utilized in Agile 9.3 webservices.
 *                 @generalParameters   -  General parameters pertaining to
 *                 the request. These values
 *                 are expressed as PropertyListTypes. This element is
 *                 currently                                     not
 *                 utilized in Agile 9.3 webservices.
 *                 @notes               -  Information sent to the client
 *                 as a message, is expressed in
 *                 the form of notes of type AgileProcessNoteListType. This
 *                 element                                     is currently
 *                 not utilized in Agile 9.3 webservices.
 *                 @exceptions          -  Contains a list of exceptions
 *                 associated with the execution
 *                 of a webservice operation.             @warnings
 *                 -  Consists of a list of warnings associated with the
 *                 execution                                     of a
 *                 webservice operation.             
 * 
 * <p>Java class for AgileResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileResponseHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ResponseStatusCode"/>
 *         &lt;element name="sessionParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generalParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileProcessNoteListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptions" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileExceptionListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warnings" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileResponseHeaderType", propOrder = {
    "messageId",
    "messageName",
    "statusCode",
    "sessionParameters",
    "generalParameters",
    "notes",
    "exceptions",
    "warnings"
})
@XmlSeeAlso({
    AbstractResponseType.class
})
public class AgileResponseHeaderType {

    @XmlElement(required = true, nillable = true)
    protected String messageId;
    @XmlElement(required = true, nillable = true)
    protected String messageName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ResponseStatusCode statusCode;
    @XmlElement(nillable = true)
    protected List<PropertyListType> sessionParameters;
    @XmlElement(nillable = true)
    protected List<PropertyListType> generalParameters;
    @XmlElement(nillable = true)
    protected List<AgileProcessNoteListType> notes;
    @XmlElement(nillable = true)
    protected List<AgileExceptionListType> exceptions;
    @XmlElement(nillable = true)
    protected List<AgileWarningListType> warnings;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusCode }
     *     
     */
    public ResponseStatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusCode }
     *     
     */
    public void setStatusCode(ResponseStatusCode value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the sessionParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getSessionParameters() {
        if (sessionParameters == null) {
            sessionParameters = new ArrayList<PropertyListType>();
        }
        return this.sessionParameters;
    }

    /**
     * Gets the value of the generalParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getGeneralParameters() {
        if (generalParameters == null) {
            generalParameters = new ArrayList<PropertyListType>();
        }
        return this.generalParameters;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileProcessNoteListType }
     * 
     * 
     */
    public List<AgileProcessNoteListType> getNotes() {
        if (notes == null) {
            notes = new ArrayList<AgileProcessNoteListType>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileExceptionListType }
     * 
     * 
     */
    public List<AgileExceptionListType> getExceptions() {
        if (exceptions == null) {
            exceptions = new ArrayList<AgileExceptionListType>();
        }
        return this.exceptions;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarnings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWarningListType }
     * 
     * 
     */
    public List<AgileWarningListType> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<AgileWarningListType>();
        }
        return this.warnings;
    }

}
