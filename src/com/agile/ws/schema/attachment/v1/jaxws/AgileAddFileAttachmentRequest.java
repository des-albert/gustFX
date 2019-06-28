
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
 *              This holds information about
 *                 the file to be added to the attachment tab
 *                 of a particular Agile object.
 *                 @classIdentifier  -  This field refers to the
 *                 classIdentifier and is used
 *                 for determining the type of object to which an
 *                 attachment                                  is to be
 *                 added. The input could be a number as defined in
 *                 one of the constant files in SDK or the APIName of the
 *                 class.                                  Eg:-
 *                 ChangeConstants.CLASS_ECO.toString() or "ECO".
 *                 @ObjectNumber     -  It is the unique Object number
 *                 which identifies an object
 *                 in the Agile system. Eg:- P00001. The file will be added
 *                 to                                  the attachment tab
 *                 of this particular Agile object.
 *                 @singleFolder     -  Set this to "true" if all
 *                 the attachments listed under the
 *                 attachments and attachmentRefs elemnts or urls listed
 *                 under           attachmentUrls must be added to a single
 *                 Agile Folder Object.             @attachments      -
 *                 Refers to information about the file to be added to
 *                 attachment                                   tab of an
 *                 Agile Object.             @attachmentRefs   -  Refers to
 *                 information about the file reference to be added
 *                 to attachment tab of an Agile Object. Used when file has
 *                 already been uploaded into DFM.
 *                 @attachmentUrls   -  Refers to information about the url
 *                 to be added to attachment
 *                 tab of an Agile Object.             @options          -
 *                 Optional name-value pair reserved for addressing future
 *                 requirements                          and any special
 *                 handling.    @inputParameters  -  Optional name,value
 *                 pair for addressing future requirements.    
 * 
 * <p>Java class for AgileAddFileAttachmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAddFileAttachmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="singleFolder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="attachments" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileAddFileAttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachmentRefs" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileAddFileAttachmentReferenceRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachmentUrls" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileAddFileAttachmentUrlRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileAddFileAttachmentRequest", propOrder = {
    "classIdentifier",
    "objectNumber",
    "singleFolder",
    "attachments",
    "attachmentRefs",
    "attachmentUrls",
    "options",
    "inputParameters"
})
public class AgileAddFileAttachmentRequest {

    @XmlElement(nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean singleFolder;
    @XmlElement(nillable = true)
    protected List<AgileAddFileAttachmentRequestType> attachments;
    @XmlElement(nillable = true)
    protected List<AgileAddFileAttachmentReferenceRequestType> attachmentRefs;
    @XmlElement(nillable = true)
    protected List<AgileAddFileAttachmentUrlRequestType> attachmentUrls;
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
     * Gets the value of the singleFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleFolder() {
        return singleFolder;
    }

    /**
     * Sets the value of the singleFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleFolder(Boolean value) {
        this.singleFolder = value;
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
     * {@link AgileAddFileAttachmentRequestType }
     * 
     * 
     */
    public List<AgileAddFileAttachmentRequestType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AgileAddFileAttachmentRequestType>();
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
     * {@link AgileAddFileAttachmentReferenceRequestType }
     * 
     * 
     */
    public List<AgileAddFileAttachmentReferenceRequestType> getAttachmentRefs() {
        if (attachmentRefs == null) {
            attachmentRefs = new ArrayList<AgileAddFileAttachmentReferenceRequestType>();
        }
        return this.attachmentRefs;
    }

    /**
     * Gets the value of the attachmentUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileAddFileAttachmentUrlRequestType }
     * 
     * 
     */
    public List<AgileAddFileAttachmentUrlRequestType> getAttachmentUrls() {
        if (attachmentUrls == null) {
            attachmentUrls = new ArrayList<AgileAddFileAttachmentUrlRequestType>();
        }
        return this.attachmentUrls;
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
