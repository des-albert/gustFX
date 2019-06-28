
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileRowType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'addRows' web service are of this type.
 *                 This request identifies the table that has to be
 *                 cleared.                 @objectInfo          -
 *                 objectInfo is used to identify any table in the Agile
 *                 system into                                     which
 *                 rows will be added by the 'addRows' web service
 *                 opereation.                                     This
 *                 field is of type RequestTableType which has been
 *                 documented                                     in the
 *                 Table schema.             @row                 -
 *                 Identifies a row which shall be added into the table
 *                 specified in           the request. The input xml
 *                 element is expected to contain an attribte
 *                 "id" used to identify the attribute which is
 *                 being passed as the          element value.
 *                 Additionally, the user can specify revision, site, etc
 *                 as attributes in the input.             @inputParameters
 *                 -  Optional name,value pair for addressing future
 *                 requirement.                 Sample Code:
 *                 AgileRowType[] row = new AgileRowType[1];
 *                 row[0] = new AgileRowType();
 *                 MessageElement[] message = new MessageElement[1];
 *                 MessageElement dataCell = new
 *                 MessageElement(namespaceUri, "number" );
 *                 dataCell.setValue("P00305");
 *                 dataCell.addAttribute(namespaceUri,
 *                 SchemaConstants.id.getValue(),
 *                 String.valueOf(ChangeConstants.ATT_AFFECTED_ITEMS_ITEM_NUMBER));
 *                 dataCell.addAttribute(namespaceUri,
 *                 SchemaConstants.revision.getValue(), "A");
 *                 message[0] = dataCell;
 *                 row[0].set_any(message);                      
 * 
 * <p>Java class for AgileAddRowsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAddRowsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectInfo" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}RequestTableType"/>
 *         &lt;element name="row" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRowType" maxOccurs="unbounded"/>
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
@XmlType(name = "AgileAddRowsRequest", propOrder = {
    "objectInfo",
    "row",
    "inputParameters"
})
public class AgileAddRowsRequest {

    @XmlElement(required = true, nillable = true)
    protected RequestTableType objectInfo;
    @XmlElement(required = true, nillable = true)
    protected List<AgileRowType> row;
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
     * {@link AgileRowType }
     * 
     * 
     */
    public List<AgileRowType> getRow() {
        if (row == null) {
            row = new ArrayList<AgileRowType>();
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
