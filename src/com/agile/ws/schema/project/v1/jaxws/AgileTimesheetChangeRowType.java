
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *      This request includes the info of
 *                 rows to be changed.                                                    
 * 
 * <p>Java class for AgileTimesheetChangeRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileTimesheetChangeRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeCells" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileTimesheetChangeCellType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileTimesheetChangeRowType", propOrder = {
    "projectName",
    "changeCells"
})
public class AgileTimesheetChangeRowType {

    @XmlElement(required = true)
    protected String projectName;
    @XmlElement(required = true)
    protected List<AgileTimesheetChangeCellType> changeCells;

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the changeCells property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeCells property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeCells().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileTimesheetChangeCellType }
     * 
     * 
     */
    public List<AgileTimesheetChangeCellType> getChangeCells() {
        if (changeCells == null) {
            changeCells = new ArrayList<AgileTimesheetChangeCellType>();
        }
        return this.changeCells;
    }

}
