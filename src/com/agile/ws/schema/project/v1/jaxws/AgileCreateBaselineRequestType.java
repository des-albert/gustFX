
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Request object for the
 *                 'createBaseline' operation. It contains information
 *                 about the Project Object and the name by which the new
 *                 baseline needs to be created. Baselines can only be
 *                 created on a root project.
 *                 @projectIdentifier       -  It is the unique Object name
 *                 which identifies an object in the Agile system, in this
 *                 case, the Root Project.             @description      -
 *                 It specifies the description of the baseline needs to be
 *                 created.             @kickoffBaseline  -  It specifies
 *                 if this beaseline is a kickoff baseline.
 *                 The kickoff baseline can be used as the preliminary
 *                 version.             @planOfRecord     -  It specifies
 *                 if this beaseline is a Plan of record.
 *                 Plan of record is a special type of baseline which you
 *                 may want to                                   create at
 *                 major milestones during the execution of the project
 *                 @milestone        -  It specifies the name of the
 *                 milestone. This can be specified
 *                 only if the beaseline is a Plan of record.                                  
 * 
 * <p>Java class for AgileCreateBaselineRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCreateBaselineRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kickoffBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="planOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="milestone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AgileCreateBaselineRequestType", propOrder = {
    "projectIdentifier",
    "description",
    "kickoffBaseline",
    "planOfRecord",
    "milestone",
    "inputParameters"
})
public class AgileCreateBaselineRequestType {

    @XmlElement(required = true, nillable = true)
    protected String projectIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    protected Boolean kickoffBaseline;
    @XmlElement(nillable = true)
    protected Boolean planOfRecord;
    @XmlElement(nillable = true)
    protected String milestone;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the kickoffBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKickoffBaseline() {
        return kickoffBaseline;
    }

    /**
     * Sets the value of the kickoffBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKickoffBaseline(Boolean value) {
        this.kickoffBaseline = value;
    }

    /**
     * Gets the value of the planOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanOfRecord() {
        return planOfRecord;
    }

    /**
     * Sets the value of the planOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanOfRecord(Boolean value) {
        this.planOfRecord = value;
    }

    /**
     * Gets the value of the milestone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestone() {
        return milestone;
    }

    /**
     * Sets the value of the milestone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestone(String value) {
        this.milestone = value;
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
