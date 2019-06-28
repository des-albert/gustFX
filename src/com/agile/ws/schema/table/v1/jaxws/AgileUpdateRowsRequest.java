
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
 *                 requests for the 'updateRows' web service are of this
 *                 type.    This request identifies the table that has to
 *                 be updated.                 @objectInfo          -
 *                 objectInfo is used to identify any table in the Agile
 *                 system into                                     which
 *                 rows will be upated by the 'updateRows' web service
 *                 opereation.                                     This
 *                 field is of type RequestTableType which has been
 *                 documented                                     in the
 *                 Table schema.             @row                 -
 *                 Identifies a row with which the specified Agile table
 *                 shall be updated.          This element is of type
 *                 'AgileUpdateRow'.    @inputParameters -  Optional
 *                 name,value pair for addressing future requirement.                   
 * 
 * <p>Java class for AgileUpdateRowsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileUpdateRowsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectInfo" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}RequestTableType"/>
 *         &lt;element name="row" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileUpdateRow" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileUpdateRowsRequest", propOrder = {
    "objectInfo",
    "row",
    "inputParameters"
})
public class AgileUpdateRowsRequest {

    @XmlElement(required = true, nillable = true)
    protected RequestTableType objectInfo;
    @XmlElement(nillable = true)
    protected List<AgileUpdateRow> row;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the objectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTableType }
     *     
     */
    public RequestTableType getObjectInfo() {
        return objectInfo;
    }

    /**
     * Sets the value of the objectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTableType }
     *     
     */
    public void setObjectInfo(RequestTableType value) {
        this.objectInfo = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUpdateRow }
     * 
     * 
     */
    public List<AgileUpdateRow> getRow() {
        if (row == null) {
            row = new ArrayList<AgileUpdateRow>();
        }
        return this.row;
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
