
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *              AttributeType consists of
 *                 specifications that together constitute an attribute.
 *                 These             include dataType, possible values and
 *                 other details that defines an attribute.
 *                 @dataType            -  An integer that represents the
 *                 data type of the attribute.             @possibleValues
 *                 -  A list of possible values of type AdminListType.
 *                 @searchable          -  A boolean value that indicates
 *                 whether the attribute is a
 *                 searchable entity.             @visible             -
 *                 Refers to the visibility of the attribute in the user
 *                 interface.                                      This
 *                 element uses a boolean value to denote this
 *                 characteristic.             @required            -  A
 *                 boolean value denoting whether an attribute of type
 *                 AttributeType is a mandatory entity.
 *                 @maxLength           -  Refers to the maximum
 *                 permissible length of the attribute details.
 *                 This is expressed as an integer value.
 *                 @properties          -  A collection of properties of
 *                 type AdminPropertyType, relating
 *                 to properties for any attribute of type AttributeType.
 *                 @relationalOperators -  A collection of relational
 *                 operators for the attribute, each
 *                 of type OperatorsType.             
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="possibleValues" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdminListType" minOccurs="0"/>
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="properties" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdminPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relationalOperators" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}OperatorsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "dataType",
    "possibleValues",
    "searchable",
    "visible",
    "required",
    "maxLength",
    "properties",
    "relationalOperators"
})
public class AttributeType
    extends BaseNodeType
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dataType;
    @XmlElement(nillable = true)
    protected AdminListType possibleValues;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean searchable;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean visible;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean required;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxLength;
    @XmlElement(nillable = true)
    protected List<AdminPropertyType> properties;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<OperatorsType> relationalOperators;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataType(Integer value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the possibleValues property.
     * 
     * @return
     *     possible object is
     *     {@link AdminListType }
     *     
     */
    public AdminListType getPossibleValues() {
        return possibleValues;
    }

    /**
     * Sets the value of the possibleValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminListType }
     *     
     */
    public void setPossibleValues(AdminListType value) {
        this.possibleValues = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchable(Boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLength(Integer value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdminPropertyType }
     * 
     * 
     */
    public List<AdminPropertyType> getProperties() {
        if (properties == null) {
            properties = new ArrayList<AdminPropertyType>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the relationalOperators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationalOperators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationalOperators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorsType }
     * 
     * 
     */
    public List<OperatorsType> getRelationalOperators() {
        if (relationalOperators == null) {
            relationalOperators = new ArrayList<OperatorsType>();
        }
        return this.relationalOperators;
    }

}
