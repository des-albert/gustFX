
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="treeLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="projectId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="selectedRootId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="projectVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calendars" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}CalendarsType" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}TasksType"/>
 *         &lt;element name="resources" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ResourcesType"/>
 *         &lt;element name="assignments" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AssignmentsType"/>
 *         &lt;element name="dependencies" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}DependenciesType" minOccurs="0"/>
 *         &lt;element name="treeInfo" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}TreeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectType", propOrder = {
    "treeLocked",
    "readOnly",
    "projectId",
    "selectedRootId",
    "projectVersion",
    "languageCode",
    "calendars",
    "tasks",
    "resources",
    "assignments",
    "dependencies",
    "treeInfo"
})
public class ProjectType {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean treeLocked;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean readOnly;
    @XmlElement(required = true, nillable = true)
    protected AgileObjectIdentifierType projectId;
    @XmlElement(required = true, nillable = true)
    protected AgileObjectIdentifierType selectedRootId;
    protected int projectVersion;
    @XmlElement(required = true, nillable = true)
    protected String languageCode;
    protected CalendarsType calendars;
    @XmlElement(required = true)
    protected TasksType tasks;
    @XmlElement(required = true)
    protected ResourcesType resources;
    @XmlElement(required = true)
    protected AssignmentsType assignments;
    protected DependenciesType dependencies;
    protected TreeType treeInfo;

    /**
     * Gets the value of the treeLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreeLocked() {
        return treeLocked;
    }

    /**
     * Sets the value of the treeLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreeLocked(Boolean value) {
        this.treeLocked = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setProjectId(AgileObjectIdentifierType value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the selectedRootId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getSelectedRootId() {
        return selectedRootId;
    }

    /**
     * Sets the value of the selectedRootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setSelectedRootId(AgileObjectIdentifierType value) {
        this.selectedRootId = value;
    }

    /**
     * Gets the value of the projectVersion property.
     * 
     */
    public int getProjectVersion() {
        return projectVersion;
    }

    /**
     * Sets the value of the projectVersion property.
     * 
     */
    public void setProjectVersion(int value) {
        this.projectVersion = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the calendars property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarsType }
     *     
     */
    public CalendarsType getCalendars() {
        return calendars;
    }

    /**
     * Sets the value of the calendars property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarsType }
     *     
     */
    public void setCalendars(CalendarsType value) {
        this.calendars = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link TasksType }
     *     
     */
    public TasksType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasksType }
     *     
     */
    public void setTasks(TasksType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the assignments property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentsType }
     *     
     */
    public AssignmentsType getAssignments() {
        return assignments;
    }

    /**
     * Sets the value of the assignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentsType }
     *     
     */
    public void setAssignments(AssignmentsType value) {
        this.assignments = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link DependenciesType }
     *     
     */
    public DependenciesType getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependenciesType }
     *     
     */
    public void setDependencies(DependenciesType value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the treeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TreeType }
     *     
     */
    public TreeType getTreeInfo() {
        return treeInfo;
    }

    /**
     * Sets the value of the treeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreeType }
     *     
     */
    public void setTreeInfo(TreeType value) {
        this.treeInfo = value;
    }

}
