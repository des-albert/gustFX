
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileListEntryType contains
 *                 a string named listName and a set of selectionTypes
 *                 named 'selection'             that together define the
 *                 AgileListEntryType.                 @listName
 *                 -  A string referring to the name of the list for a
 *                 particular
 *                 AgileListEntryType             @selection           -
 *                 Refers to a collection of selectionType entities which
 *                 constitute                                     a list of
 *                 selections.             
 * 
 * <p>Java class for AgileListEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selection" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}SelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileListEntryType", propOrder = {
    "listName",
    "selection"
})
public class AgileListEntryType {

    @XmlElement(nillable = true)
    protected String listName;
    @XmlElement(nillable = true)
    protected List<SelectionType> selection;

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionType }
     * 
     * 
     */
    public List<SelectionType> getSelection() {
        if (selection == null) {
            selection = new ArrayList<SelectionType>();
        }
        return this.selection;
    }

}
