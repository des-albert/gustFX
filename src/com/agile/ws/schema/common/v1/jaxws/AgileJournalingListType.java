
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
 * <p>Java class for AgileJournalingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileJournalingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}JournalingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileJournalingListType", propOrder = {
    "list"
})
public class AgileJournalingListType {

    @XmlElement(nillable = true)
    protected List<JournalingType> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalingType }
     * 
     * 
     */
    public List<JournalingType> getList() {
        if (list == null) {
            list = new ArrayList<JournalingType>();
        }
        return this.list;
    }

}
