
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 TaskDeliverablesStatusesType is a container element of
 *                 an array of elements of type
 *                 TaskDeliverablesStatusType. Details of the task and
 *                 deliverable status is contained in this.
 *                 @taskDeliverablesStatus     -   An array of elements of
 *                 type TaskDeliverablesStatusType which
 *                 contains task and its deliverable statuses.             
 * 
 * <p>Java class for TaskDeliverablesStatusesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskDeliverablesStatusesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskDeliverablesStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}TaskDeliverablesStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDeliverablesStatusesType", propOrder = {
    "taskDeliverablesStatus"
})
public class TaskDeliverablesStatusesType {

    protected List<TaskDeliverablesStatusType> taskDeliverablesStatus;

    /**
     * Gets the value of the taskDeliverablesStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskDeliverablesStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskDeliverablesStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskDeliverablesStatusType }
     * 
     * 
     */
    public List<TaskDeliverablesStatusType> getTaskDeliverablesStatus() {
        if (taskDeliverablesStatus == null) {
            taskDeliverablesStatus = new ArrayList<TaskDeliverablesStatusType>();
        }
        return this.taskDeliverablesStatus;
    }

}
