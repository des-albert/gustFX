
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileTableType defines a
 *                 Table in the Agile system and identifies it using a
 *                 table identifier             and a row of type
 *                 AgileRowType.              @tableIdentifier     -
 *                 'tableIdentifier' is an element of type
 *                 TableIdentifierType
 *                 and is used to identify a unique table of type
 *                 AgileTableType.             @row                 -
 *                 Refers to a collection of rows of type AgileRowType
 *                 which                                     together
 *                 constitute the data     @options             -
 *                 Optional name,value pair reserved for addressing future
 *                 requirements.                  
 * 
 * <p>Java class for AgileTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}TableIdentifierType"/>
 *         &lt;element name="row" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRowType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileTableType", propOrder = {
    "tableIdentifier",
    "row",
    "options"
})
public class AgileTableType {

    @XmlElement(required = true, nillable = true)
    protected TableIdentifierType tableIdentifier;
    @XmlElement(nillable = true)
    protected List<AgileRowType> row;
    @XmlElement(nillable = true)
    protected List<PropertyListType> options;

    /**
     * Gets the value of the tableIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TableIdentifierType }
     *     
     */
    public TableIdentifierType getTableIdentifier() {
        return tableIdentifier;
    }

    /**
     * Sets the value of the tableIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableIdentifierType }
     *     
     */
    public void setTableIdentifier(TableIdentifierType value) {
        this.tableIdentifier = value;
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
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOptions() {
        if (options == null) {
            options = new ArrayList<PropertyListType>();
        }
        return this.options;
    }

}
