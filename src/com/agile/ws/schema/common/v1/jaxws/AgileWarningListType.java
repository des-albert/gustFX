
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileWarningType contains a
 *                 list of warnings of type AgileWarningType which are
 *                 encountered while executing a webservice.
 *                 @id                  -  A string referring to the
 *                 identification element of the
 *                 Agile warning list.             @warning             -
 *                 A set of warnings, all of which are of type
 *                 AgileWarningType
 *                 Details of the actual warnings are enlisted within these
 *                 elements.                      
 * 
 * <p>Java class for AgileWarningListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileWarningListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="warning" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileWarningListType", propOrder = {
    "id",
    "warning"
})
public class AgileWarningListType {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(nillable = true)
    protected List<AgileWarningType> warning;

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
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWarningType }
     * 
     * 
     */
    public List<AgileWarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<AgileWarningType>();
        }
        return this.warning;
    }

}
