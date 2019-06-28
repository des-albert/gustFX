
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;
import com.agile.ws.schema.common.v1.jaxws.AgileObjectListEntryType;


/**
 * <p>Java class for ProjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="agileListEntry" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="agileObjectListEntry" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileObjectListEntryType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectListType", propOrder = {
    "agileListEntry",
    "agileObjectListEntry"
})
public class ProjectListType {

    protected AgileListEntryType agileListEntry;
    protected AgileObjectListEntryType agileObjectListEntry;

    /**
     * Gets the value of the agileListEntry property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getAgileListEntry() {
        return agileListEntry;
    }

    /**
     * Sets the value of the agileListEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setAgileListEntry(AgileListEntryType value) {
        this.agileListEntry = value;
    }

    /**
     * Gets the value of the agileObjectListEntry property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectListEntryType }
     *     
     */
    public AgileObjectListEntryType getAgileObjectListEntry() {
        return agileObjectListEntry;
    }

    /**
     * Sets the value of the agileObjectListEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectListEntryType }
     *     
     */
    public void setAgileObjectListEntry(AgileObjectListEntryType value) {
        this.agileObjectListEntry = value;
    }

}
