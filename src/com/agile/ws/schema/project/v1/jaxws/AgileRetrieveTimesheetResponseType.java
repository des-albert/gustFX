
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileTableType;


/**
 * <p>Java class for AgileRetrieveTimesheetResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileRetrieveTimesheetResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableContents" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileTableType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileRetrieveTimesheetResponseType", propOrder = {
    "tableContents"
})
public class AgileRetrieveTimesheetResponseType {

    @XmlElement(nillable = true)
    protected AgileTableType tableContents;

    /**
     * Gets the value of the tableContents property.
     * 
     * @return
     *     possible object is
     *     {@link AgileTableType }
     *     
     */
    public AgileTableType getTableContents() {
        return tableContents;
    }

    /**
     * Sets the value of the tableContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileTableType }
     *     
     */
    public void setTableContents(AgileTableType value) {
        this.tableContents = value;
    }

}
