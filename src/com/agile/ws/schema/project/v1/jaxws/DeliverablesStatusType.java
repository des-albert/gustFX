
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *                  DeliverablesStatusType
 *                 is a container element of an array of elements of
 *                 type DeliverableStatusType which has the deliverable
 *                 status for each status type.
 *                 @status                     -   An array of element of
 *                 type DeliverableStatusType which contains
 *                 the deliverable status for each status type.             
 * 
 * <p>Java class for DeliverablesStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverablesStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}DeliverableStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverablesStatusType", propOrder = {
    "status"
})
public class DeliverablesStatusType {

    protected List<DeliverableStatusType> status;

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliverableStatusType }
     * 
     * 
     */
    public List<DeliverableStatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<DeliverableStatusType>();
        }
        return this.status;
    }

}
