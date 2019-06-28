
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *              BaseNodeType is a
 *                 complexType consisting of an integer nodeId, a string
 *                 for the apiName             display name and a
 *                 NodeTypeEnum type. It serves as a base for defining a
 *                 node in the             Agile system.
 *                 @nodeId              -  Refers to the unique
 *                 identification integer of a node.             @apiName
 *                 -  Refers to the API name of a given node.
 *                 @type                -  This field is of type
 *                 NodeTypeEnum, which contains a list of
 *                 enumerated values to determine the type of the node.
 *                 @displayName         -  Refers to the display type of a
 *                 node.    @options            -   Optional name,value
 *                 pair reserved for addressing future requirements.             
 * 
 * <p>Java class for BaseNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}NodeTypeEnum"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BaseNodeType", propOrder = {
    "nodeId",
    "apiName",
    "type",
    "displayName",
    "options"
})
@XmlSeeAlso({
    AttributeType.class,
    AutoNumberType.class,
    TableType.class,
    ClassType.class,
    AdminNodeType.class
})
public class BaseNodeType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nodeId;
    @XmlElement(required = true, nillable = true)
    protected String apiName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NodeTypeEnum type;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(nillable = true)
    protected List<PropertyListType> options;

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNodeId(Integer value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the apiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * Sets the value of the apiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiName(String value) {
        this.apiName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NodeTypeEnum }
     *     
     */
    public NodeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeTypeEnum }
     *     
     */
    public void setType(NodeTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
