
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AttributeType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Each of the batched responses
 *                 for the 'getTableMetaData' webservice are of this type.
 *                 This         response object contains information that
 *                 identifies table meta data retrieved by the
 *                 webservice call.          @attributes              -  An
 *                 array of attributes of type AttributeType, retrieved by
 *                 the webservice operation.         @tableIdentifier
 *                 -  The Id of the table whose meta data information was
 *                 retrieved                                     by the
 *                 webservice operation.         @tableAPIName            -
 *                 The API name of the table whose meta data information
 *                 was                                     retrieved by the
 *                 webservice operation.
 *                 @tableName               -  The display name of the
 *                 table whose meta data information was
 *                 retrieved by the webservice operation.
 *                 @outputParameters -  Optional name,value pair for
 *                 addressing future requirement.                                             
 * 
 * <p>Java class for AgileGetTableMetadataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetTableMetadataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableAPIName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AgileGetTableMetadataResponseType", propOrder = {
    "attributes",
    "classIdentifier",
    "tableIdentifier",
    "tableName",
    "tableAPIName",
    "outputParameters"
})
public class AgileGetTableMetadataResponseType {

    @XmlElement(nillable = true)
    protected List<AttributeType> attributes;
    @XmlElement(required = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String tableIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String tableName;
    @XmlElement(required = true, nillable = true)
    protected String tableAPIName;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<AttributeType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the classIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassIdentifier() {
        return classIdentifier;
    }

    /**
     * Sets the value of the classIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassIdentifier(String value) {
        this.classIdentifier = value;
    }

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
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the tableAPIName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableAPIName() {
        return tableAPIName;
    }

    /**
     * Sets the value of the tableAPIName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableAPIName(String value) {
        this.tableAPIName = value;
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
