
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *              ProjectBaseline provides
 *                 comprehensive information a Project baseline.
 *                 @version                        -
 *                 @description      -  It specifies the description of the
 *                 baseline.             @kickoffBaseline  -  It specifies
 *                 if this baseline is a kickoff baseline.
 *                 @planOfRecord     -  It specifies if this baseline is a
 *                 Plan of record.             @milestone        -  It
 *                 specifies the name of the milestone. Milestone is
 *                 the name of the gate. Milestone can be set only if
 *                 planOfRecord is true.             @createDate       -
 *                 The date when this baseline was created.             
 * 
 * <p>Java class for ProjectBaseline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectBaseline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="milestone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kickoffBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="planOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectBaseline", propOrder = {
    "version",
    "description",
    "milestone",
    "kickoffBaseline",
    "planOfRecord",
    "createDate"
})
public class ProjectBaseline {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer version;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String milestone;
    @XmlElement(nillable = true)
    protected Boolean kickoffBaseline;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean planOfRecord;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
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
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

}
