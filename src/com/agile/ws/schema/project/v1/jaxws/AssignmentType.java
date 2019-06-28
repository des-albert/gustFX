
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;
import com.agile.ws.schema.common.v1.jaxws.AgileMoneyType;


/**
 * <p>Java class for AssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskID" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="actualHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysEffort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileIdentifierType"/>
 *         &lt;element name="laborCostValue" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="allocation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="assignedFrom" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="rejectedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="roles" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentType", propOrder = {
    "taskID",
    "actualHours",
    "daysEffort",
    "id",
    "laborCostValue",
    "allocation",
    "assignedFrom",
    "rejectedFlag",
    "name",
    "roles"
})
public class AssignmentType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType taskID;
    protected Integer actualHours;
    protected Long daysEffort;
    @XmlElement(required = true)
    protected AgileIdentifierType id;
    protected AgileMoneyType laborCostValue;
    protected Double allocation;
    protected AgileObjectIdentifierType assignedFrom;
    protected Boolean rejectedFlag;
    @XmlElement(required = true)
    protected AgileObjectIdentifierType name;
    protected AgileListEntryType roles;

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setTaskID(AgileObjectIdentifierType value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the actualHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualHours() {
        return actualHours;
    }

    /**
     * Sets the value of the actualHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualHours(Integer value) {
        this.actualHours = value;
    }

    /**
     * Gets the value of the daysEffort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysEffort() {
        return daysEffort;
    }

    /**
     * Sets the value of the daysEffort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysEffort(Long value) {
        this.daysEffort = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AgileIdentifierType }
     *     
     */
    public AgileIdentifierType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileIdentifierType }
     *     
     */
    public void setId(AgileIdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the laborCostValue property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getLaborCostValue() {
        return laborCostValue;
    }

    /**
     * Sets the value of the laborCostValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setLaborCostValue(AgileMoneyType value) {
        this.laborCostValue = value;
    }

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAllocation(Double value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the assignedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getAssignedFrom() {
        return assignedFrom;
    }

    /**
     * Sets the value of the assignedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setAssignedFrom(AgileObjectIdentifierType value) {
        this.assignedFrom = value;
    }

    /**
     * Gets the value of the rejectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectedFlag() {
        return rejectedFlag;
    }

    /**
     * Sets the value of the rejectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectedFlag(Boolean value) {
        this.rejectedFlag = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setName(AgileObjectIdentifierType value) {
        this.name = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setRoles(AgileListEntryType value) {
        this.roles = value;
    }

}
