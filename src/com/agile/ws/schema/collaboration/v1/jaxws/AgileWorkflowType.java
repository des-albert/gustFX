
package com.agile.ws.schema.collaboration.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *          AgileWorkflowType defines and
 *                 provides information about any workflow in Agile PLM.
 *                 The response objects of a getWorkflow service will
 *                 contain this element in its response
 *                 @workflowId              -  The internal ID of a
 *                 workflow, this value is used to identify
 *                 a unique workflow.         @workflowName            -
 *                 The APIName of the WorkFlow associated with a certain
 *                 workflowId.         @workflowDisplayName     -  The
 *                 actual display name of a particular WorkFlow, as
 *                 represented                                     in the
 *                 Agile PLM user interface tabs.         
 * 
 * <p>Java class for AgileWorkflowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileWorkflowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileWorkflowType", propOrder = {
    "workflowId",
    "workflowName",
    "workflowDisplayName"
})
public class AgileWorkflowType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer workflowId;
    @XmlElement(required = true, nillable = true)
    protected String workflowName;
    @XmlElement(required = true, nillable = true)
    protected String workflowDisplayName;

    /**
     * Gets the value of the workflowId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkflowId(Integer value) {
        this.workflowId = value;
    }

    /**
     * Gets the value of the workflowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Sets the value of the workflowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
    }

    /**
     * Gets the value of the workflowDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowDisplayName() {
        return workflowDisplayName;
    }

    /**
     * Sets the value of the workflowDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowDisplayName(String value) {
        this.workflowDisplayName = value;
    }

}
