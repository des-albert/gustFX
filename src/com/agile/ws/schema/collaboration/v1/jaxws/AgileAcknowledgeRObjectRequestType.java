
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
 *              Each of the batched
 *                 responses for the 'acknowledgeROObject' webservice are
 *                 of this type.              This response object contains
 *                 information that identifies the object queried upon
 *                 and the mandatory details for the acknowledgment
 *                 process.              @classIdentifier     -
 *                 ClassIdentifier is for determining the type of object
 *                 which is being audited. The input could be a number as
 *                 defined in one of the constant files in SDK or the
 *                 APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"             @objectNumber        -  It
 *                 is the unique Object number which identifies an
 *                 object in the Agile system. Eg:- P00001
 *                 @password            -  The user's password for the
 *                 acknowledgment process.             @comment
 *                 -  A string providing user comments. A maximum length of
 *                 4000 characters is permitted.
 *                 @secondSignature     -  The user's second signature for
 *                 the acknowledgment process.             @notifiers
 *                 -  List of users and user groups to notify
 *                 @escalations         -  Escalations from other users and
 *                 user groups in the
 *                 acknowledgment process.             @transfers
 *                 -  Transfer from other users and user groups in the
 *                 acknowledgment process.
 *                 @acknowledgeForGroups   -  List of user groups to for
 *                 the acknowledgment process.             @signoffForSelf
 *                 -  Set this to 'true' to signoff for self; false
 *                 otherwise     @notifyOriginator    -  Set this to 'true'
 *                 to notify originator; false otherwise    @notifyCCB
 *                 -  Set this to 'true' to notify CCB; false otherwise
 *                 @notifyChangeAnalyst -  Set this to 'true' to notify
 *                 Change Analyst; false otherwise    @urgent        -  Set
 *                 this to 'true' to add an icon denoting 'urgent' to the
 *                 mail                                     message; Set
 *                 this to 'false' if this is not needed.
 *                 @inputParameters   -  Optional name,value pair for
 *                 addressing future requirements.         
 * 
 * <p>Java class for AgileAcknowledgeRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAcknowledgeRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notifiers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="escalations" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transfers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="acknowledgeForGroups" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signoffForSelf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyOriginator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyCCB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyChangeAnalyst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="urgent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileAcknowledgeRObjectRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "password",
    "comment",
    "secondSignature",
    "notifiers",
    "escalations",
    "transfers",
    "acknowledgeForGroups",
    "signoffForSelf",
    "notifyOriginator",
    "notifyCCB",
    "notifyChangeAnalyst",
    "urgent",
    "inputParameters"
})
public class AgileAcknowledgeRObjectRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(nillable = true)
    protected String secondSignature;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> notifiers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> escalations;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> transfers;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> acknowledgeForGroups;
    @XmlElement(nillable = true)
    protected Boolean signoffForSelf;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyOriginator;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyCCB;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyChangeAnalyst;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean urgent;
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
     * Gets the value of the secondSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSignature() {
        return secondSignature;
    }

    /**
     * Sets the value of the secondSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSignature(String value) {
        this.secondSignature = value;
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
     * Gets the value of the escalations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escalations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscalations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getEscalations() {
        if (escalations == null) {
            escalations = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.escalations;
    }

    /**
     * Gets the value of the transfers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transfers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransfers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getTransfers() {
        if (transfers == null) {
            transfers = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.transfers;
    }

    /**
     * Gets the value of the acknowledgeForGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgeForGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgeForGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getAcknowledgeForGroups() {
        if (acknowledgeForGroups == null) {
            acknowledgeForGroups = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.acknowledgeForGroups;
    }

    /**
     * Gets the value of the signoffForSelf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignoffForSelf() {
        return signoffForSelf;
    }

    /**
     * Sets the value of the signoffForSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignoffForSelf(Boolean value) {
        this.signoffForSelf = value;
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
