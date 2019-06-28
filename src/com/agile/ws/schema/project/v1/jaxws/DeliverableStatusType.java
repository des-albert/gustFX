
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;


/**
 *              DeliverableStatusType
 *                 contains an AgileListEntryType element statusType which
 *                 has information              about the status type and a
 *                 boolean element statusMet to indicate if the status can
 *                 be met.                          @statusType
 *                 -   An AgileListEntryType element which has the details
 *                 about the status type.
 *                 @statusMet                      -   A boolean element to
 *                 indicate if the status can be met.             
 * 
 * <p>Java class for DeliverableStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverableStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusType" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="statusMet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverableStatusType", propOrder = {
    "statusType",
    "statusMet"
})
public class DeliverableStatusType {

    @XmlElement(required = true)
    protected AgileListEntryType statusType;
    protected Boolean statusMet;

    /**
     * Gets the value of the statusType property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setStatusType(AgileListEntryType value) {
        this.statusType = value;
    }

    /**
     * Gets the value of the statusMet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusMet() {
        return statusMet;
    }

    /**
     * Sets the value of the statusMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusMet(Boolean value) {
        this.statusMet = value;
    }

}
