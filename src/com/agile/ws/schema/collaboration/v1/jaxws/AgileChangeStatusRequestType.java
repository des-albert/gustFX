
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
 *                 requests for the changeStatus web service are of this
 *                 type. This    request identifies the object whose status
 *                 has to be changed.                 @classIdentifier
 *                 -  ClassIdentifier is used for determining the type of
 *                 object whose                                      status
 *                 is being changed. The input could be a number as defined
 *                 in                                     one of the
 *                 constant files in SDK or the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"             @objectNumber        -  It
 *                 is the unique Object number which identifies an object
 *                 in Agile                                     system.
 *                 Eg:- P00001             @statusIdentifier    -  This
 *                 field determines the status for which the specified
 *                 changes in                                     status
 *                 are to be effected. The input can be a status number
 *                 constant                                     or an
 *                 APIName.             @newStatusIdentifier -  Specifies
 *                 the new status for which approver list is queried. The
 *                 input can be a status number constant or an APIName.
 *                 @approvers           -  An array of IUser or IUserGroup
 *                 objects to add to the Approvers list.
 *                 If null is passed, default approvers are not used. To
 *                 specify the                                      list of
 *                 default approvers, it must be passed explicitly as an
 *                 array.             @observers           -  An array of
 *                 IUser or IUserGroup objects, denoting observers to be
 *                 added to the Observers list.  If null is passed, default
 *                 observers                                     will not
 *                 be used.  To specify the list of default observers, the
 *                 same                                     must be passed
 *                 explicitly as an array.    @acknowledgers       -  An
 *                 array of IUser or IUserGroup objects, denoting
 *                 acknowledgers to be
 *                 added to the Acknowledgers list.  If null is passed,
 *                 default acknowledgers
 *                 will not be used.  To specify the list of default
 *                 acknowledgers, the same
 *                 must be passed explicitly as an array.
 *                 @notifiers           -  An array of IUser or IUserGroup
 *                 objects to notify that the routable
 *                 object has changed status. To use the default
 *                 notification list for
 *                 the workflow status, specify a null value. To indicate
 *                 that no users                                     should
 *                 be notified, specify an empty array (new IUser[0]).
 *                 @comment             -  A string providing comments
 *                 about the routable object
 *                 The maximum length permitted is 4000 characters.
 *                 @auditRelease        -  Set this value to 'true' to
 *                 audit the release or set it to 'false' to
 *                 audit the present status before changing the status. If
 *                 'true' is
 *                 specified, the method checks whether the routable object
 *                 is ready to                                     be
 *                 released, making that the following requirements are
 *                 conformed to:
 *                 Required fields are completed, SmartRules are complied
 *                 with, revisions                                     do
 *                 not conflict with each other and that attachments are
 *                 not checked                                     out on
 *                 any of the affected Items. If 'false' is specified, the
 *                 method                                      makes
 *                 ensures that all the required fields are completed. If
 *                 an error          is detected during the audit, the
 *                 method fails.              @urgent              -  Set
 *                 this to 'true' to add an icon flag denoting 'urgent' to
 *                 the mail                                     message.
 *                 @notifyOriginator    - Set this to 'true' if it is
 *                 desired to notify the originator of the
 *                 routable object.             @notifyChangeAnalyst -  Set
 *                 this to 'true' to notify the Change Analyst; Set this to
 *                 'false'           if such a notification is not
 *                 required.             @notifyCCB           -  Set this
 *                 to 'true' to notify the members of the Change Control
 *                 Board.                                      Set this to
 *                 'false' is such a notification is not necessary.
 *                 @inputParameters   -  Optional name,value pair for
 *                 addressing future requirements.             
 * 
 * <p>Java class for AgileChangeStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileChangeStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newStatusIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approvers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="observers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="acknowledgers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notifiers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOriginator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyChangeAnalyst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyCCB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileChangeStatusRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "newStatusIdentifier",
    "approvers",
    "observers",
    "acknowledgers",
    "notifiers",
    "comment",
    "password",
    "auditRelease",
    "urgent",
    "notifyOriginator",
    "notifyChangeAnalyst",
    "notifyCCB",
    "inputParameters"
})
public class AgileChangeStatusRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, nillable = true)
    protected String newStatusIdentifier;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> approvers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> observers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> acknowledgers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> notifiers;
    @XmlElement(nillable = true)
    protected String comment;
    @XmlElement(nillable = true)
    protected String password;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean auditRelease;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean urgent;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyOriginator;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyChangeAnalyst;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyCCB;
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
     * Gets the value of the newStatusIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatusIdentifier() {
        return newStatusIdentifier;
    }

    /**
     * Sets the value of the newStatusIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatusIdentifier(String value) {
        this.newStatusIdentifier = value;
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
     * Gets the value of the acknowledgers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getAcknowledgers() {
        if (acknowledgers == null) {
            acknowledgers = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.acknowledgers;
    }

    /**
     * Gets the value of the notifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getNotifiers() {
        if (notifiers == null) {
            notifiers = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.notifiers;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the auditRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditRelease() {
        return auditRelease;
    }

    /**
     * Sets the value of the auditRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditRelease(Boolean value) {
        this.auditRelease = value;
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
     * Gets the value of the notifyOriginator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyOriginator() {
        return notifyOriginator;
    }

    /**
     * Sets the value of the notifyOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyOriginator(Boolean value) {
        this.notifyOriginator = value;
    }

    /**
     * Gets the value of the notifyChangeAnalyst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyChangeAnalyst() {
        return notifyChangeAnalyst;
    }

    /**
     * Sets the value of the notifyChangeAnalyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyChangeAnalyst(Boolean value) {
        this.notifyChangeAnalyst = value;
    }

    /**
     * Gets the value of the notifyCCB property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyCCB() {
        return notifyCCB;
    }

    /**
     * Sets the value of the notifyCCB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyCCB(Boolean value) {
        this.notifyCCB = value;
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
