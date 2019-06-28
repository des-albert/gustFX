
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileObjectListEntryType
 *                 consists of a listName which is a string value, and a
 *                 selection             of type ObjectReferendIdType.
 *                 @listName            -  A string referring to the name
 *                 of the list for a particular
 *                 AgileObjectListEntryType             @selection
 *                 -  Refers to a collection of ObjectReferentIdType
 *                 entities which
 *                 constitute a list of selections.                      
 * 
 * <p>Java class for AgileObjectListEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileObjectListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selection" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectReferentIdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileObjectListEntryType", propOrder = {
    "listName",
    "selection"
})
public class AgileObjectListEntryType {

    @XmlElement(nillable = true)
    protected String listName;
    @XmlElement(nillable = true)
    protected List<ObjectReferentIdType> selection;

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
     * {@link ObjectReferentIdType }
     * 
     * 
     */
    public List<ObjectReferentIdType> getSelection() {
        if (selection == null) {
            selection = new ArrayList<ObjectReferentIdType>();
        }
        return this.selection;
    }

}
