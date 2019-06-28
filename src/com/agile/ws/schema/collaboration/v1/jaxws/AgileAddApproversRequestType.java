
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileUserUserGroupIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'addApprovers' web service are of this
 *                 type.             This request specifies the details of
 *                 the approvers to be added to a workflow
 *                 associated with a partiuclar Agile Object.
 *                 @classIdentifier     -  ClassIdentifier is for
 *                 determining the type of object to whose
 *                 workflow approvers will be added. The input could be a
 *                 number                                      as defined
 *                 in one of the constant files in SDK or the APIName
 *                 of the class. Eg:- ChangeConstants.CLASS_ECO.toString()
 *                 or "ECO"             @objectNumber        -
 *                 It is the unique Object number which identifies an
 *                 object                                     in the Agile
 *                 system. Eg:- P00001             @statusIdentifier    -
 *                 Determines the desired workflow status on which
 *                 approvers are to                                     be
 *                 added. The input can be a status number constant or an
 *                 APIName.             @approvers           -  An array of
 *                 users to add to the Approvers list. Pass null if
 *                 you do not want to add any approvers.
 *                 @observers           - An array of users to add to the
 *                 Observers list. Pass null if
 *                 you don't want to add any observers.             @urgent
 *                 - Set this to 'true' to add an icon denoting 'urgent' to
 *                 the mail                                     message;
 *                 Set this to 'false' if this is not needed.
 *                 @comment             - A string describing comments. A
 *                 maximum of 4000 characters is
 *                 permitted.    @inputParameters -  Optional name,value
 *                 pair for addressing future requirements.                   
 * 
 * <p>Java class for AgileAddApproversRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAddApproversRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="observers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AgileAddApproversRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "statusIdentifier",
    "approvers",
    "observers",
    "urgent",
    "comment",
    "inputParameters"
})
public class AgileAddApproversRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, nillable = true)
    protected String statusIdentifier;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> approvers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> observers;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean urgent;
    @XmlElement(required = true, nillable = true)
    protected String comment;
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
     * Gets the value of the statusIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusIdentifier() {
        return statusIdentifier;
    }

    /**
     * Sets the value of the statusIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusIdentifier(String value) {
        this.statusIdentifier = value;
    }

    /**
     * Gets the value of the approvers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getApprovers() {
        if (approvers == null) {
            approvers = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.approvers;
    }

    /**
     * Gets the value of the observers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getObservers() {
        if (observers == null) {
            observers = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.observers;
    }

    /**
     * Gets the value of the urgent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgent() {
        return urgent;
    }

    /**
     * Sets the value of the urgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgent(Boolean value) {
        this.urgent = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
