
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 getWorkflow operation. It contains an element
 *                 holding an array of responses.
 *                 @workflowResponse    -  An array of responses of type
 *                 AgileGetWorkflowsResponseType    
 * 
 * <p>Java class for GetWorkflowsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWorkflowsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="workflowResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetWorkflowsResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkflowsResponseType", propOrder = {
    "workflowResponse"
})
public class GetWorkflowsResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetWorkflowsResponseType> workflowResponse;

    /**
     * Gets the value of the workflowResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetWorkflowsResponseType }
     * 
     * 
     */
    public List<AgileGetWorkflowsResponseType> getWorkflowResponse() {
        if (workflowResponse == null) {
            workflowResponse = new ArrayList<AgileGetWorkflowsResponseType>();
        }
        return this.workflowResponse;
    }

}
