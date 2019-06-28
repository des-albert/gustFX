
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *              Every request object in
 *                 Agile extends AbstractRequestType, which in
 *                 turn extends AgileRequestHeaderType. The class is a
 *                 repository of header information             applicable
 *                 to each request.                   @messageId
 *                 -  An identification number for the message, used in
 *                 asynchronous                                     calls
 *                 for differentiating messages from each other. This
 *                 element                                     is currently
 *                 not utilized in Agile 9.3 webservices
 *                 @messageName         -  A name associated with a
 *                 particular messageId. This element
 *                 is currently not utilized in Agile 9.3 webservices.
 *                 @sender              -  Details of the sender, obtained
 *                 as a string value. This element
 *                 is currently not utilized in Agile 9.3 webservices.
 *                 @timestamp           -  A timestamp of type dateTime
 *                 referring to the time when the
 *                 Details of the table whose read-only status is to be
 *                 verified.                                      This
 *                 element is currently not utilized in Agile 9.3
 *                 webservices.             @target              -  Details
 *                 of the recepient or target to which the message is sent.
 *                 This element is currently not utilized in Agile 9.3
 *                 webservices.             @disableAllWarnings  -  Set
 *                 this to 'true' to disable all warning messages any
 *                 operation                                     associated
 *                 with the request object. Default value is
 *                 "false".             @warningResolution   -
 *                 An array of requests of type AgileWarningResolutionType.
 *                 You                             can control warning
 *                 resolution using this and "disableAllWarnings"
 *                 elements (e.g. if "disableAllWarnings" is true
 *                 you can choose to           enable a few warnings using
 *                 "warningResolution" and visa versa).
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
 * 
 * <p>Java class for AgileRequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileRequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableAllWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="warningResolution" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningResolutionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sessionParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="generalParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileRequestHeaderType", propOrder = {
    "messageId",
    "messageName",
    "sender",
    "timestamp",
    "target",
    "disableAllWarnings",
    "warningResolution",
    "sessionParameters",
    "generalParameters"
})
@XmlSeeAlso({
    AbstractRequestType.class
})
public class AgileRequestHeaderType {

    @XmlElement(nillable = true)
    protected String messageId;
    @XmlElement(nillable = true)
    protected String messageName;
    @XmlElement(nillable = true)
    protected String sender;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(nillable = true)
    protected String target;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean disableAllWarnings;
    @XmlElement(nillable = true)
    protected List<AgileWarningResolutionType> warningResolution;
    @XmlElement(nillable = true)
    protected List<PropertyListType> sessionParameters;
    @XmlElement(nillable = true)
    protected List<PropertyListType> generalParameters;

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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the disableAllWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAllWarnings() {
        return disableAllWarnings;
    }

    /**
     * Sets the value of the disableAllWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAllWarnings(Boolean value) {
        this.disableAllWarnings = value;
    }

    /**
     * Gets the value of the warningResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWarningResolutionType }
     * 
     * 
     */
    public List<AgileWarningResolutionType> getWarningResolution() {
        if (warningResolution == null) {
            warningResolution = new ArrayList<AgileWarningResolutionType>();
        }
        return this.warningResolution;
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

}
