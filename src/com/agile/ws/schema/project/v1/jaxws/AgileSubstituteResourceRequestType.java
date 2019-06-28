
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileUserUserGroupIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'SubstituteResource' web service are of
 *                 this type.                         This request
 *                 identifies the project for which a resource has to be
 *                 substituted and the                          current
 *                 resource and new resource. These resources can be either
 *                 users or usergroups.
 *                 @projectIdentifier  -   It is the unique Object number
 *                 which identifies a project
 *                 in the Agile system. Eg:- T00012
 *                 @currentResource     -  Refers to the current resource,
 *                 a user or a user group, which
 *                 must be substituted with a new resource.
 *                 @newResource         -  Refers to the new resource with
 *                 which the current resource will be
 *                 substituted. The new resource can be a user or a user
 *                 group.             @applyToChildren    -   If this is
 *                 set to true, ownership will be delegated for the
 *                 project's children also
 *                 requirements and any special handling.
 *                 @inputParameters     -  Optional name,value pair for
 *                 addressing future requirements.                                                         
 * 
 * <p>Java class for AgileSubstituteResourceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileSubstituteResourceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentResource" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType"/>
 *         &lt;element name="newResource" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType"/>
 *         &lt;element name="applyToChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileSubstituteResourceRequestType", propOrder = {
    "projectIdentifier",
    "currentResource",
    "newResource",
    "applyToChildren",
    "inputParameters"
})
public class AgileSubstituteResourceRequestType {

    @XmlElement(required = true, nillable = true)
    protected String projectIdentifier;
    @XmlElement(required = true, nillable = true)
    protected AgileUserUserGroupIdentifierType currentResource;
    @XmlElement(required = true, nillable = true)
    protected AgileUserUserGroupIdentifierType newResource;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean applyToChildren;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the currentResource property.
     * 
     * @return
     *     possible object is
     *     {@link AgileUserUserGroupIdentifierType }
     *     
     */
    public AgileUserUserGroupIdentifierType getCurrentResource() {
        return currentResource;
    }

    /**
     * Sets the value of the currentResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileUserUserGroupIdentifierType }
     *     
     */
    public void setCurrentResource(AgileUserUserGroupIdentifierType value) {
        this.currentResource = value;
    }

    /**
     * Gets the value of the newResource property.
     * 
     * @return
     *     possible object is
     *     {@link AgileUserUserGroupIdentifierType }
     *     
     */
    public AgileUserUserGroupIdentifierType getNewResource() {
        return newResource;
    }

    /**
     * Sets the value of the newResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileUserUserGroupIdentifierType }
     *     
     */
    public void setNewResource(AgileUserUserGroupIdentifierType value) {
        this.newResource = value;
    }

    /**
     * Gets the value of the applyToChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Sets the value of the applyToChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChildren(Boolean value) {
        this.applyToChildren = value;
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
