
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.ObjectIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Each of the batched
 *                 responses for the getStatus web service are of this
 *                 type.              This response contains information
 *                 about the current status of the Agile Object.
 *                 @identifier            -  This identifier is used to
 *                 identify the unique Agile object
 *                 whose status has been returned within the response.
 *                 @currentStatus         -  The current status of the
 *                 routable object in the workflow
 *                 assigned to it.             @nextValidStatuses     -
 *                 The next valid statuses of the object in the workflow
 *                 assigned to it.             @nextDefaultStatus     -
 *                 For any workflow, among the list of next valid statuses,
 *                 a                                       particular
 *                 status signifies the next status, denoting the
 *                 default status to which the workflow would naturally
 *                 proceed                                       with a
 *                 change of status, if the workflow is expedited as
 *                 intended.                                       This
 *                 default next status is denoted by the element
 *                 'nextDefaultStatus'    @outputParameters -  Optional
 *                 name,value pair for addressing future requirements.                     
 * 
 * <p>Java class for AgileGetStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="currentStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileStatusType" minOccurs="0"/>
 *         &lt;element name="nextDefaultStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileStatusType" minOccurs="0"/>
 *         &lt;element name="nextStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileGetStatusResponseType", propOrder = {
    "identifier",
    "currentStatus",
    "nextDefaultStatus",
    "nextStatus",
    "outputParameters"
})
public class AgileGetStatusResponseType {

    @XmlElement(nillable = true)
    protected ObjectIdentifierType identifier;
    @XmlElement(nillable = true)
    protected AgileStatusType currentStatus;
    @XmlElement(nillable = true)
    protected AgileStatusType nextDefaultStatus;
    @XmlElement(nillable = true)
    protected List<AgileStatusType> nextStatus;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setIdentifier(ObjectIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileStatusType }
     *     
     */
    public AgileStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileStatusType }
     *     
     */
    public void setCurrentStatus(AgileStatusType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the nextDefaultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileStatusType }
     *     
     */
    public AgileStatusType getNextDefaultStatus() {
        return nextDefaultStatus;
    }

    /**
     * Sets the value of the nextDefaultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileStatusType }
     *     
     */
    public void setNextDefaultStatus(AgileStatusType value) {
        this.nextDefaultStatus = value;
    }

    /**
     * Gets the value of the nextStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileStatusType }
     * 
     * 
     */
    public List<AgileStatusType> getNextStatus() {
        if (nextStatus == null) {
            nextStatus = new ArrayList<AgileStatusType>();
        }
        return this.nextStatus;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
