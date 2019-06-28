
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *                  Response object for
 *                 'loadDeliverablesStatus' operation. It contains an
 *                 element of                  TaskDeliverablesStatusesType
 *                 named taskDeliverablesStatuses.
 *                 @taskDeliverablesStatuses   -   An element of type
 *                 TaskDeliverablesStatusesType. Details of the
 *                 task and its deliverable statuses is contained in this.             
 * 
 * <p>Java class for LoadDeliverablesStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadDeliverablesStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="taskDeliverablesStatuses" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}TaskDeliverablesStatusesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadDeliverablesStatusResponseType", propOrder = {
    "taskDeliverablesStatuses"
})
public class LoadDeliverablesStatusResponseType
    extends AbstractResponseType
{

    protected TaskDeliverablesStatusesType taskDeliverablesStatuses;

    /**
     * Gets the value of the taskDeliverablesStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDeliverablesStatusesType }
     *     
     */
    public TaskDeliverablesStatusesType getTaskDeliverablesStatuses() {
        return taskDeliverablesStatuses;
    }

    /**
     * Sets the value of the taskDeliverablesStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDeliverablesStatusesType }
     *     
     */
    public void setTaskDeliverablesStatuses(TaskDeliverablesStatusesType value) {
        this.taskDeliverablesStatuses = value;
    }

}
