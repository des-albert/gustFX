
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              ClassType defines a class
 *                 type in the Agile PLM system. It uses a boolean
 *                 abstractClass             and two BaseNodeTypes
 *                 superClass and subClass.                @abstractClass
 *                 -  'abstractClass' refers to an abstract class in Agile
 *                 PLM.             @superClass          -  Refers to a
 *                 super class in the Agile system.             @subClass
 *                 -  'subClass' refers to a sub class in Agile PLM.             
 * 
 * <p>Java class for ClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="abstractClass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="superClass" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType" minOccurs="0"/>
 *         &lt;element name="subClass" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassType", propOrder = {
    "abstractClass",
    "superClass",
    "subClass"
})
public class ClassType
    extends BaseNodeType
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean abstractClass;
    @XmlElement(nillable = true)
    protected BaseNodeType superClass;
    @XmlElement(nillable = true)
    protected List<BaseNodeType> subClass;

    /**
     * Gets the value of the abstractClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbstractClass() {
        return abstractClass;
    }

    /**
     * Sets the value of the abstractClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstractClass(Boolean value) {
        this.abstractClass = value;
    }

    /**
     * Gets the value of the superClass property.
     * 
     * @return
     *     possible object is
     *     {@link BaseNodeType }
     *     
     */
    public BaseNodeType getSuperClass() {
        return superClass;
    }

    /**
     * Sets the value of the superClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseNodeType }
     *     
     */
    public void setSuperClass(BaseNodeType value) {
        this.superClass = value;
    }

    /**
     * Gets the value of the subClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseNodeType }
     * 
     * 
     */
    public List<BaseNodeType> getSubClass() {
        if (subClass == null) {
            subClass = new ArrayList<BaseNodeType>();
        }
        return this.subClass;
    }

}
