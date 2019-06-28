
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="children" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ChildrenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentType", propOrder = {
    "id",
    "children"
})
public class ParentType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType id;
    protected ChildrenType children;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setId(AgileObjectIdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ChildrenType }
     *     
     */
    public ChildrenType getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildrenType }
     *     
     */
    public void setChildren(ChildrenType value) {
        this.children = value;
    }

}
