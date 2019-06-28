
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.ObjectReferentIdType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Response object for the
 *                 'isLocked' operation.          This response object
 *                 contains information denoting whether the project
 *                 specified in the request was locked.          @isLocked
 *                 -        A boolean value denoting whether the project is
 *                 locked         @outputParameters -        Optional
 *                 name,value pair for addressing future requirement.         
 * 
 * <p>Java class for AgileIsLockedResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileIsLockedResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="project" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType" minOccurs="0"/>
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
@XmlType(name = "AgileIsLockedResponseType", propOrder = {
    "isLocked",
    "project",
    "outputParameters"
})
public class AgileIsLockedResponseType {

    @XmlElement(nillable = true)
    protected Boolean isLocked;
    @XmlElement(nillable = true)
    protected ObjectReferentIdType project;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public ObjectReferentIdType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectReferentIdType }
     *     
     */
    public void setProject(ObjectReferentIdType value) {
        this.project = value;
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
