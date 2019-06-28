
package com.agile.ws.schema.collaboration.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileStatusType is a generic
 *                 representation of any workflow status among the list of
 *                 valid             workflows associated with a particular
 *                 Agile Object. This type contains information relating to
 *                 and defining the workflow, inclusive of its status Id
 *                 and API, display names.                 @statusId
 *                 -  This element refers to the internal ID of a status
 *                 corresponding                                     to any
 *                 workflow in the Agile system.             @statusName
 *                 -  StatusName refers to the API name of a given status
 *                 corresponding to                                     any
 *                 workflow in the Agile system.
 *                 @statusDisplayName   -  StatusName refers to the display
 *                 name of a given status corresponding
 *                 to any workflow in the Agile system.         
 * 
 * <p>Java class for AgileStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileStatusType", propOrder = {
    "statusId",
    "statusName",
    "statusDisplayName"
})
public class AgileStatusType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer statusId;
    @XmlElement(required = true, nillable = true)
    protected String statusName;
    @XmlElement(required = true, nillable = true)
    protected String statusDisplayName;

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusId(Integer value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the statusDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDisplayName() {
        return statusDisplayName;
    }

    /**
     * Sets the value of the statusDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDisplayName(String value) {
        this.statusDisplayName = value;
    }

}
