
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'copyTable' web service are of this
 *                 type.    This request identifies the source and target
 *                 tables to be copied.                 @sourceTable
 *                 -  sourceTable is used to identify any table in the
 *                 Agile system that acts
 *                 as the source for copying contents of one table to
 *                 another. This field
 *                 is of type RequestTableType which has been documented in
 *                 the Table schema.             @targetTable         -
 *                 targetTable is used to identify any table in the Agile
 *                 system that acts                                      as
 *                 the target into which contents from the source table
 *                 will be copied.                                     This
 *                 field is of type RequestTableType which has been
 *                 documented in the
 *                 Table schema.              @inputParameters -  Optional
 *                 name,value pair for addressing future requirement.                   
 * 
 * <p>Java class for AgileCopyTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCopyTableRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}RequestTableType"/>
 *         &lt;element name="targetTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}RequestTableType"/>
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
@XmlType(name = "AgileCopyTableRequestType", propOrder = {
    "sourceTable",
    "targetTable",
    "inputParameters"
})
public class AgileCopyTableRequestType {

    @XmlElement(required = true, nillable = true)
    protected RequestTableType sourceTable;
    @XmlElement(required = true, nillable = true)
    protected RequestTableType targetTable;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the sourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTableType }
     *     
     */
    public RequestTableType getSourceTable() {
        return sourceTable;
    }

    /**
     * Sets the value of the sourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTableType }
     *     
     */
    public void setSourceTable(RequestTableType value) {
        this.sourceTable = value;
    }

    /**
     * Gets the value of the targetTable property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTableType }
     *     
     */
    public RequestTableType getTargetTable() {
        return targetTable;
    }

    /**
     * Sets the value of the targetTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTableType }
     *     
     */
    public void setTargetTable(RequestTableType value) {
        this.targetTable = value;
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
