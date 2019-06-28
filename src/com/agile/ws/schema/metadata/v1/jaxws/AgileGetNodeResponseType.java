
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AdminNodeType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Each of the batched responses
 *                 for the 'getNode' webservice are of this type. This
 *                 response object contains information about the nodes
 *                 that were retrieved by the         webservice.
 *                 @node                    -  Refers to the node that was
 *                 retrieved by the operation.
 *                 If the option 'recursive' set to true in the request,
 *                 then this field will also include the child of this
 *                 node.   @outputParameters -  Optional name,value pair
 *                 for addressing future requirement.                  
 * 
 * <p>Java class for AgileGetNodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetNodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdminNodeType"/>
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
@XmlType(name = "AgileGetNodeResponseType", propOrder = {
    "node",
    "outputParameters"
})
public class AgileGetNodeResponseType {

    @XmlElement(required = true, nillable = true)
    protected AdminNodeType node;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link AdminNodeType }
     *     
     */
    public AdminNodeType getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminNodeType }
     *     
     */
    public void setNode(AdminNodeType value) {
        this.node = value;
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
