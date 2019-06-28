
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 TaskDeliverablesStatusType contains the details about
 *                 the task and deliverable status.
 *                 @taskId                     -   Identifies the Agile
 *                 object whose deliverable status is loaded.
 *                 @deliverablesStatus         -   An element of type
 *                 DeliverablesStatusType which contains an
 *                 array of elements of type DeliverableStatusType which
 *                 has the
 *                 deliverable status for each status type.             
 * 
 * <p>Java class for TaskDeliverablesStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskDeliverablesStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="deliverablesStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}DeliverablesStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDeliverablesStatusType", propOrder = {
    "taskId",
    "deliverablesStatus"
})
public class TaskDeliverablesStatusType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType taskId;
    protected DeliverablesStatusType deliverablesStatus;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setTaskId(AgileObjectIdentifierType value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the deliverablesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverablesStatusType }
     *     
     */
    public DeliverablesStatusType getDeliverablesStatus() {
        return deliverablesStatus;
    }

    /**
     * Sets the value of the deliverablesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverablesStatusType }
     *     
     */
    public void setDeliverablesStatus(DeliverablesStatusType value) {
        this.deliverablesStatus = value;
    }

}
