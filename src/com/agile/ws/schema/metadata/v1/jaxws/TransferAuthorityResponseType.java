
package com.agile.ws.schema.metadata.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *              Request object
 *                 for the 'createTransferAuthority' web service. It
 *                 contains information relating             to the
 *                 authority to be transferred and the users involved,
 *                 based on which transfer of authority will be initiated.
 *                 @transferRecordId  -  A unique identifier with which
 *                 transfer authority records are identified. This value
 *                 must be used in the request object while removing a
 *                 transfer authority record that was retrieved earlier.
 *                 @creator           -  The user who initiated the
 *                 transfer of authority.             @fromUser          -
 *                 The user from whom authority was transferred.
 *                 @toUser            -  The user who acquired possession
 *                 of the transferred authority.             @fromDate
 *                 -  The date from which the transfer of authority took
 *                 effect             @toDate            -  The date upto
 *                 which the transferred authority will remain active.
 *                 @criteria          -  The API name corresponding to the
 *                 criteria for which authority was transferred. Eg:
 *                 Global.AllChangeOrders             @affectedChanges   -
 *                 This field has two possible values, namely
 *                 'AFFECT_CHANGES_ALL' which will affect all changes
 *                 and AFFECT_CHANGES_IN_PERIOD which will only affect
 *                 changes in the specified timeperiod    @lastChangeUser             
 * 
 * <p>Java class for TransferAuthorityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAuthorityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferRecordId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="affectedChanges" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastChangeUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAuthorityResponseType", propOrder = {
    "transferRecordId",
    "creator",
    "fromUser",
    "toUser",
    "fromDate",
    "toDate",
    "criteria",
    "affectedChanges",
    "lastChangeUser"
})
public class TransferAuthorityResponseType {

    @XmlElement(required = true, nillable = true)
    protected String transferRecordId;
    @XmlElement(required = true, nillable = true)
    protected String creator;
    @XmlElement(required = true, nillable = true)
    protected String fromUser;
    @XmlElement(required = true, nillable = true)
    protected String toUser;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(required = true, nillable = true)
    protected String criteria;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer affectedChanges;
    @XmlElement(required = true, nillable = true)
    protected String lastChangeUser;

    /**
     * Gets the value of the transferRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRecordId() {
        return transferRecordId;
    }

    /**
     * Sets the value of the transferRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferRecordId(String value) {
        this.transferRecordId = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the fromUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromUser() {
        return fromUser;
    }

    /**
     * Sets the value of the fromUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromUser(String value) {
        this.fromUser = value;
    }

    /**
     * Gets the value of the toUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUser() {
        return toUser;
    }

    /**
     * Sets the value of the toUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUser(String value) {
        this.toUser = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the affectedChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAffectedChanges() {
        return affectedChanges;
    }

    /**
     * Sets the value of the affectedChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAffectedChanges(Integer value) {
        this.affectedChanges = value;
    }

    /**
     * Gets the value of the lastChangeUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeUser() {
        return lastChangeUser;
    }

    /**
     * Sets the value of the lastChangeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeUser(String value) {
        this.lastChangeUser = value;
    }

}
