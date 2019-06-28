
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AdminNodeType defines a node
 *                 in the Agile system and identifies it with its child
 *                 nodes             and properties, which are of type
 *                 AgilePropertyType.              @childNode           -
 *                 Refers to the children of a given AdminNodeType, each
 *                 child                                      node
 *                 represented by another entity of AdminNodeType.
 *                 @Properties          -  A collection of properties, each
 *                 of type AdminPropertyType.                
 * 
 * <p>Java class for AdminNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="childNode" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdminNodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdminPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminNodeType", propOrder = {
    "childNode",
    "properties"
})
public class AdminNodeType
    extends BaseNodeType
{

    @XmlElement(nillable = true)
    protected List<AdminNodeType> childNode;
    @XmlElement(name = "Properties", nillable = true)
    protected List<AdminPropertyType> properties;

    /**
     * Gets the value of the childNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdminNodeType }
     * 
     * 
     */
    public List<AdminNodeType> getChildNode() {
        if (childNode == null) {
            childNode = new ArrayList<AdminNodeType>();
        }
        return this.childNode;
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

}
