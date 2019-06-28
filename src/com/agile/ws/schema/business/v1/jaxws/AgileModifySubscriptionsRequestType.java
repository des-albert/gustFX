
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.SubscriptionType;


/**
 *               Each of the batched
 *                 requests for the 'modifySubscriptions' web service are
 *                 of this type. This request identifies the object for
 *                 which the subscription to be retrieved.
 *                 @classIdentifier   -    classIdentifier is for
 *                 determining the type of the object for which the
 *                 Subscription to be retrieved. The input could be a
 *                 number as  defined in one of the constant files in SDK
 *                 orthe APIName of the class. Eg:-
 *                 ChangeConstants.CLASS_ECO.toString() or "ECO"
 *                 @objectNumber     -  It is the unique Object number
 *                 which identifies an object in the Agile system, in this
 *                 case, the parent object.Eg:- P00001
 *                 @subscriptions - list of subscription to be modified for
 *                 the given data object        @applyToChildren -  true if
 *                 the action should be propagated to child objects in the
 *                 object hierarchy; false otherwise.
 *                 @inputParameters -  Optional name-value pair for
 *                 addressing any special handling.                 
 * 
 * <p>Java class for AgileModifySubscriptionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileModifySubscriptionsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subscriptions" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}SubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applyToChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileModifySubscriptionsRequestType", propOrder = {
    "classIdentifier",
    "objectNumber",
    "subscriptions",
    "applyToChildren",
    "inputParameters"
})
public class AgileModifySubscriptionsRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    @XmlElement(nillable = true)
    protected List<SubscriptionType> subscriptions;
    @XmlElement(nillable = true)
    protected Boolean applyToChildren;
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
     * Gets the value of the subscriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionType }
     * 
     * 
     */
    public List<SubscriptionType> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new ArrayList<SubscriptionType>();
        }
        return this.subscriptions;
    }

    /**
     * Gets the value of the applyToChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Sets the value of the applyToChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChildren(Boolean value) {
        this.applyToChildren = value;
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
