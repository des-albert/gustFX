
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 *              AgileObjectType is defined
 *                 by an objectIdentifier of type ObjectIdentifierType, a
 *                 set of             tables of type AgileTableType and
 *                 elementds of xsd:any type which together provide
 *                 comprehensive information about an object. ComplexTypes
 *                 such as the response object of    getObject webservice
 *                 operation retrieve an Agile Object as an
 *                 'AgileObjectType'                @objectIdentifier    -
 *                 The field 'objectIdentifier' provides comprehensive
 *                 information                                     about an
 *                 Agile object and is defined by ObjectIdentifierType.
 *                 @any                 -  The unbounded element contains
 *                 the attributes and their values
 *                 for CoverPage, PageTwo and PageThree tables.
 *                 @table               -  Refers to a collection of tables
 *                 pertaining to the Agile object, these tables are of type
 *                 AgileTableType.                 
 * 
 * <p>Java class for AgileObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType"/>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="table" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileTableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileObjectType", propOrder = {
    "objectIdentifier",
    "any",
    "table"
})
@XmlSeeAlso({
    AgileUserGroupType.class,
    AgileUserType.class
})
public class AgileObjectType {

    @XmlElement(required = true, nillable = true)
    protected ObjectIdentifierType objectIdentifier;
    @XmlAnyElement
    protected List<Element> any;
    @XmlElement(nillable = true)
    protected List<AgileTableType> table;

    /**
     * Gets the value of the objectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Sets the value of the objectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setObjectIdentifier(ObjectIdentifierType value) {
        this.objectIdentifier = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileTableType }
     * 
     * 
     */
    public List<AgileTableType> getTable() {
        if (table == null) {
            table = new ArrayList<AgileTableType>();
        }
        return this.table;
    }

}
