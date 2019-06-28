
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Request object for
 *                 the 'createTransferAuthority' web service. It contains
 *                 information relating         to the authority to be
 *                 transferred and the users involved, based on which
 *                 transfer of authority will be initiated.
 *                 @fromUser          -  The user from whom authority will
 *                 be transferred.         @toUser            -  The user
 *                 who will acquire possession of the transferred
 *                 authority.         @fromDate          -  The date from
 *                 which the transfer of authority will take effect
 *                 @toDate            -  The date upto which the
 *                 transferred authority will remain active.
 *                 @criteria          -  The criteria which will specify
 *                 the authority to be transferred. Eg: Global.All Change
 *                 Orders                            For an exhaustive list
 *                 of various criterion that may be used, refer to the Java
 *                 Client         @affectChanges     -  This field has two
 *                 possible input values corresponding to the
 *                 types 'AFFECT_CHANGES_ALL' or AFFECT_CHANGES_IN_PERIOD
 *                 @inputParameters   -  Optional name,value pair for
 *                 addressing future requirements.       
 * 
 * <p>Java class for TransferAuthorityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAuthorityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="affectChanges" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAuthorityRequestType", propOrder = {
    "fromUser",
    "toUser",
    "fromDate",
    "toDate",
    "criteria",
    "affectChanges",
    "inputParameters"
})
public class TransferAuthorityRequestType {

    @XmlElement(required = true)
    protected String fromUser;
    @XmlElement(required = true)
    protected String toUser;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(required = true)
    protected String criteria;
    protected int affectChanges;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

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
     * Gets the value of the affectChanges property.
     * 
     */
    public int getAffectChanges() {
        return affectChanges;
    }

    /**
     * Sets the value of the affectChanges property.
     * 
     */
    public void setAffectChanges(int value) {
        this.affectChanges = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<PropertyListType>();
        }
        return this.inputParameters;
    }

}
