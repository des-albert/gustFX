
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *     Request object for the
 *                 Update Object webservice. It contains information
 *                 relating              to the class type and object
 *                 number for updating a unique Agile Object and
 *                 additional atrributes specifying the fields which are to
 *                 be updated.                  @tableIdentifier    -  Each
 *                 information tab of an Agile Object has a particular
 *                 tableId associated with it. For example, the cover page
 *                 of                                    the object will be
 *                 defined by its distinct tableId, as will
 *                 attachment or BOM tables.             @loadCellMetaData
 *                 -  Data is an element of type 'AgileRowType', through
 *                 which                                    comprehensive
 *                 information about an object's details may be
 *                 declared via attribute/value mappings. This information
 *                 is                                     used to update
 *                 the object using the web service.    @inputParameters
 *                 -  Optional name,value pair for addressing future
 *                 requirements.                        
 * 
 * <p>Java class for AgileDataTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileDataTableRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loadCellMetaData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "AgileDataTableRequestType", propOrder = {
    "tableIdentifier",
    "loadCellMetaData",
    "inputParameters"
})
public class AgileDataTableRequestType {

    @XmlElement(required = true, nillable = true)
    protected String tableIdentifier;
    @XmlElement(required = true, type = Boolean.class, defaultValue = "false", nillable = true)
    protected Boolean loadCellMetaData;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the tableIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableIdentifier() {
        return tableIdentifier;
    }

    /**
     * Sets the value of the tableIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableIdentifier(String value) {
        this.tableIdentifier = value;
    }

    /**
     * Gets the value of the loadCellMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoadCellMetaData() {
        return loadCellMetaData;
    }

    /**
     * Sets the value of the loadCellMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoadCellMetaData(Boolean value) {
        this.loadCellMetaData = value;
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
