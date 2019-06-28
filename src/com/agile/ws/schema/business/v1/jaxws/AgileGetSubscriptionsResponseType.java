
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.ObjectReferentIdType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.SubscriptionType;


/**
 *              Each of the batched
 *                 responses for the 'getSubscriptions' webservice are of
 *                 this type.              This response object contains
 *                 information that identifies the subscriptions obtained
 *                 by the webservice operation.              @subscriptions
 *                 - list of subscription for the given data object
 *                 @outputParameters -  Optional name,value pair for
 *                 addressing future requirements.               
 * 
 * <p>Java class for AgileGetSubscriptionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetSubscriptionsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectReferent" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType" minOccurs="0"/>
 *         &lt;element name="subscriptions" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}SubscriptionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileGetSubscriptionsResponseType", propOrder = {
    "objectReferent",
    "subscriptions",
    "outputParameters"
})
public class AgileGetSubscriptionsResponseType {

    @XmlElement(nillable = true)
    protected ObjectReferentIdType objectReferent;
    @XmlElement(nillable = true)
    protected List<SubscriptionType> subscriptions;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the objectReferent property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public ObjectReferentIdType getObjectReferent() {
        return objectReferent;
    }

    /**
     * Sets the value of the objectReferent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public void setObjectReferent(ObjectReferentIdType value) {
        this.objectReferent = value;
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
