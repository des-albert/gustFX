
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileProcessNoteListType
 *                 contains a list of AgileProcessNoteTypes containing an
 *                 id             and set of process notes.
 *                 @id                  -  A string referring to the
 *                 identification element of the
 *                 Agile process note.             @processNote         -
 *                 A set of process notes, all of which are of type
 *                 AgileProcessNoteType.
 *                 Details of the actual process notes are enlisted within
 *                 these                                     elements.                             
 * 
 * <p>Java class for AgileProcessNoteListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileProcessNoteListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processNote" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileProcessNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileProcessNoteListType", propOrder = {
    "id",
    "processNote"
})
public class AgileProcessNoteListType {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected List<AgileProcessNoteType> processNote;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the processNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileProcessNoteType }
     * 
     * 
     */
    public List<AgileProcessNoteType> getProcessNote() {
        if (processNote == null) {
            processNote = new ArrayList<AgileProcessNoteType>();
        }
        return this.processNote;
    }

}
