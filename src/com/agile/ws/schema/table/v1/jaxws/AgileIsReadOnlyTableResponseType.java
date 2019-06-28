
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.TableIdentifierType;


/**
 *              Each of the batched
 *                 responses for the 'isReadOnly' webservice are of this
 *                 type. This response             object contains
 *                 information that identifies the read-only status of a
 *                 table specified in the             request object.
 *                 @agileTable           -  Identifies the Agile table
 *                 which was queried upon by the 'isReadOnly'
 *                 webservice.             @isReadOnlyTable      -  A
 *                 boolean flag that that identifies the read-only status
 *                 of an Agile                                       table
 *                 specified in the request object.    @outputParameters -
 *                 Optional name,value pair for addressing future
 *                 requirement.                                           
 * 
 * <p>Java class for AgileIsReadOnlyTableResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileIsReadOnlyTableResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agileTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}TableIdentifierType"/>
 *         &lt;element name="isReadOnlyTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileIsReadOnlyTableResponseType", propOrder = {
    "agileTable",
    "isReadOnlyTable",
    "outputParameters"
})
public class AgileIsReadOnlyTableResponseType {

    @XmlElement(required = true, nillable = true)
    protected TableIdentifierType agileTable;
    @XmlElement(nillable = true)
    protected Boolean isReadOnlyTable;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the agileTable property.
     * 
     * @return
     *     possible object is
     *     {@link TableIdentifierType }
     *     
     */
    public TableIdentifierType getAgileTable() {
        return agileTable;
    }

    /**
     * Sets the value of the agileTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableIdentifierType }
     *     
     */
    public void setAgileTable(TableIdentifierType value) {
        this.agileTable = value;
    }

    /**
     * Gets the value of the isReadOnlyTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadOnlyTable() {
        return isReadOnlyTable;
    }

    /**
     * Sets the value of the isReadOnlyTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadOnlyTable(Boolean value) {
        this.isReadOnlyTable = value;
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
