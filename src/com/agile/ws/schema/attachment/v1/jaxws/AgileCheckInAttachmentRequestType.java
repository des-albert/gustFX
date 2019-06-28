
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.PropertyType;


/**
 *                 Each of the batched
 *                 requests for the CheckOutAttachment operation are of
 *                 this type. This request defines the file that has to be
 *                 checked in based             on the specifications of
 *                 the parent object containing the attachment and
 *                 the rowId or file Ids of the particular attachment
 *                 @classIdentifier -  This field is used for determining
 *                 the type of object
 *                 whose attachments are to be checked in. The input could
 *                 be a number as defined in one of the constant files in
 *                 SDK or the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @ObjectNumber    -  It
 *                 is the unique Object number which identifies an object
 *                 in the Agile system. Eg:- P00001                  @rowId
 *                 -  Refers to the row id of any file present in
 *                 attachment tab                                 of an
 *                 Agile object, on which the check in operation will be
 *                 performed.    @attachments     -  This element is of
 *                 type CheckInAttachmentType and contains
 *                 information about a file whose content will be checked
 *                 in.    @attachmentRefs  -  This element is of type
 *                 CheckInAttachmentType and contains
 *                 information about a file whose content will be checked
 *                 in. This         only contains the file refernce
 *                 information and not the actual file         content. We
 *                 use this when the file has already been uploaded to the
 *                 DFM.             @options         -  Optional name-value
 *                 pair reserved for addressing future requirements and any
 *                 special handling.       @inputParameters -  Optional
 *                 name,value pair for addressing future requirements.       
 * 
 * <p>Java class for AgileCheckInAttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCheckInAttachmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attachments" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}CheckInAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachmentRefs" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}CheckInAttachmentRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileCheckInAttachmentRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "rowId",
    "attachments",
    "attachmentRefs",
    "options",
    "inputParameters"
})
public class AgileCheckInAttachmentRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rowId;
    @XmlElement(nillable = true)
    protected List<CheckInAttachmentType> attachments;
    @XmlElement(nillable = true)
    protected List<CheckInAttachmentRefType> attachmentRefs;
    @XmlElement(nillable = true)
    protected List<PropertyType> options;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the classIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassIdentifier() {
        return classIdentifier;
    }

    /**
     * Sets the value of the classIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassIdentifier(String value) {
        this.classIdentifier = value;
    }

    /**
     * Gets the value of the objectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Sets the value of the objectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowId(Integer value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInAttachmentType }
     * 
     * 
     */
    public List<CheckInAttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<CheckInAttachmentType>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the attachmentRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckInAttachmentRefType }
     * 
     * 
     */
    public List<CheckInAttachmentRefType> getAttachmentRefs() {
        if (attachmentRefs == null) {
            attachmentRefs = new ArrayList<CheckInAttachmentRefType>();
        }
        return this.attachmentRefs;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getOptions() {
        if (options == null) {
            options = new ArrayList<PropertyType>();
        }
        return this.options;
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
