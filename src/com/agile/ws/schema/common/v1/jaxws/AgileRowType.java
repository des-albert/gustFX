
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 *              AgileRowType is used to
 *                 define a row of any table of an Agile Object in the
 *                 Agile PLM system.             This row type may be used
 *                 the part of several web service requests that
 *                 necessitate the              relevant details of the
 *                 Agile row.                @objectReferentId    -  The
 *                 field 'objectReferentId' provides comprehensive
 *                 information                                     about an
 *                 Agile object and is defined by ObjectIdentifierType.
 *                 @level               -  Used to identify the bom level
 *                 for the rows returned from BOM table.    @parent
 *                 -  Used to identify the parent for the referent object
 *                 of a particular                            BOM row.
 *                 @site                -  Used to identify a site specific
 *                 row             @any                 -  The unbounded
 *                 element contains the attributes and their values
 *                 for each cell in the Agile row.             @rowId
 *                 -  'rowId' is an integer and is that unique attribute by
 *                 which                                     rows of type
 *                 AgileRowType are differentiated.             
 * 
 * <p>Java class for AgileRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectReferentId" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="additionalRowInfo" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AdditionalInfoType" minOccurs="0"/>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rowId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileRowType", propOrder = {
    "objectReferentId",
    "additionalRowInfo",
    "any"
})
public class AgileRowType {

    @XmlElement(nillable = true)
    protected ObjectIdentifierType objectReferentId;
    @XmlElement(nillable = true)
    protected AdditionalInfoType additionalRowInfo;
    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "rowId", required = true)
    protected int rowId;

    /**
     * Gets the value of the objectReferentId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getObjectReferentId() {
        return objectReferentId;
    }

    /**
     * Sets the value of the objectReferentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setObjectReferentId(ObjectIdentifierType value) {
        this.objectReferentId = value;
    }

    /**
     * Gets the value of the additionalRowInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoType }
     *     
     */
    public AdditionalInfoType getAdditionalRowInfo() {
        return additionalRowInfo;
    }

    /**
     * Sets the value of the additionalRowInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoType }
     *     
     */
    public void setAdditionalRowInfo(AdditionalInfoType value) {
        this.additionalRowInfo = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

}
