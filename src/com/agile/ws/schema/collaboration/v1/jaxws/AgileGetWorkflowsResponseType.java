
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
 *          Each of the batched responses
 *                 for the 'getWorkflow' webservice are of this type. This
 *                 response object contains information that identifies the
 *                 object queried upon and the         list of workflows
 *                 associated with that object.            @identifier
 *                 -  Identifies the Agile object whose workflows were
 *                 queried                                     to obtain
 *                 the results.         @workflow                -  The
 *                 list of associated workflows associated with the
 *                 specified Agile object. The workflows retrieved are of
 *                 type AgileWorkflowType.   @outputParameters -  Optional
 *                 name,value pair for addressing future requirements.                
 * 
 * <p>Java class for AgileGetWorkflowsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetWorkflowsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="workflow" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileWorkflowType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileGetWorkflowsResponseType", propOrder = {
    "identifier",
    "workflow",
    "outputParameters"
})
public class AgileGetWorkflowsResponseType {

    @XmlElement(nillable = true)
    protected ObjectIdentifierType identifier;
    @XmlElement(nillable = true)
    protected List<AgileWorkflowType> workflow;
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
     * Gets the value of the workflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWorkflowType }
     * 
     * 
     */
    public List<AgileWorkflowType> getWorkflow() {
        if (workflow == null) {
            workflow = new ArrayList<AgileWorkflowType>();
        }
        return this.workflow;
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
