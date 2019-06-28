
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.ObjectIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Each of the batched
 *                 responses for the 'getApprovers' webservice are of this
 *                 type.             This response object contains
 *                 information that identifies the object queried upon
 *                 and the list of approvers associated with an input
 *                 status for that object.                @identifier
 *                 -  Identifies the Agile object whose workflows were
 *                 queried                                      to obtain
 *                 the results.             @approvers           -  The
 *                 list of approvers associated with the specified input
 *                 status for a certain workflow of the Agile Object. This
 *                 element is of  type AgileIdentifierType.
 *                 @outputParameters -  Optional name,value pair for
 *                 addressing future requirements.          
 * 
 * <p>Java class for AgileGetApproversResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetApproversResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="approvers" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileGetApproversResponseType", propOrder = {
    "identifier",
    "approvers",
    "outputParameters"
})
public class AgileGetApproversResponseType {

    @XmlElement(nillable = true)
    protected ObjectIdentifierType identifier;
    @XmlElement(nillable = true)
    protected List<AgileIdentifierType> approvers;
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
     * {@link AgileIdentifierType }
     * 
     * 
     */
    public List<AgileIdentifierType> getApprovers() {
        if (approvers == null) {
            approvers = new ArrayList<AgileIdentifierType>();
        }
        return this.approvers;
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
