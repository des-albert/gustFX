
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
 *                 requests for the 'commentROObject' web service are of
 *                 this type.    This request identifies the object whose
 *                 status has to be queried upon.
 *                 @classIdentifier     -  ClassIdentifier is for
 *                 determining the type of object required
 *                 for the commenting. The input could be a number as
 *                 defined                                     in one of
 *                 the constant files in SDK or the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"             @objectNumber        -  It
 *                 is the unique Object number which identifies an object
 *                 in Agile                                     system.
 *                 Eg:- P00001             @comment             -  A string
 *                 providing comments. A maximum of 4000 characters is
 *                 permitted.             @notifyOriginator    -  Set this
 *                 to 'true' to notify the originator of the routable
 *                 object;                                     Set this to
 *                 'false' otherwise.             @notifyChangeAnalyst -
 *                 Set this to 'true' to notify the Change Analyst of the
 *                 routable object;                                     Set
 *                 this to 'false' otherwise.                @notifyCCB
 *                 -  Set this to 'true' to notify the members of the
 *                 Change Control Board;
 *                 Set this to 'false' otherwise.
 *                 @notifyList          -  List of users and user groups to
 *                 notify      @inputParameters -  Optional name,value pair
 *                 for addressing future requirements.                
 * 
 * <p>Java class for AgileCommentRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCommentRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notifyOriginator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyChangeAnalyst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyCCB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notifyList" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileCommentRObjectRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "comment",
    "notifyOriginator",
    "notifyChangeAnalyst",
    "notifyCCB",
    "notifyList",
    "inputParameters"
})
public class AgileCommentRObjectRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyOriginator;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyChangeAnalyst;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean notifyCCB;
    @XmlElement(nillable = true)
    protected List<AgileUserUserGroupIdentifierType> notifyList;
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
     * Gets the value of the notifyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getNotifyList() {
        if (notifyList == null) {
            notifyList = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.notifyList;
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
