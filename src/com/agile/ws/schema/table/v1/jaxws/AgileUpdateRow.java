
package com.agile.ws.schema.table.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileRowType;


/**
 *               Each of the batched rows in
 *                 the request 'AgileUpdateRowsRequest' are of this type.
 *                 This request identifies a row with which a particular
 *                 Agile table may be updated.
 *                 @rowId               -  Refers to the internal rowId of
 *                 a row belonging to a specific table          that has to
 *                 be updated in Agile PLM. rowID identifies a unique row.
 *                 @row                 -  Identifies a row which shall be
 *                 updated into the table specified in           the
 *                 request. The input xml element is expected to contain an
 *                 attribte          "id" used to identify the
 *                 attribute which is being passed as the          element
 *                 value. Additionally, the user can specify revision,
 *                 site, etc          as attributes in the input.                      
 * 
 * <p>Java class for AgileUpdateRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileUpdateRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="row" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRowType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileUpdateRow", propOrder = {
    "rowId",
    "row"
})
public class AgileUpdateRow {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rowId;
    @XmlElement(required = true, nillable = true)
    protected AgileRowType row;

    /**
     * Gets the value of the rowId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowId(Integer value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link AgileRowType }
     *     
     */
    public AgileRowType getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileRowType }
     *     
     */
    public void setRow(AgileRowType value) {
        this.row = value;
    }

}
