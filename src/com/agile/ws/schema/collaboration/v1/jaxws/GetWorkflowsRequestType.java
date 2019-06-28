
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *          Request object for the
 *                 'getWorkflow' operation. It contains an array         of
 *                 requests named workflowRequest to support batch
 *                 operations.            @workflowRequest     -  An array
 *                 of requests of type AgileGetWorkflowsRequestType.
 *                 Details of the object whose workflow is to be retrieved
 *                 are specified in these requests.   
 * 
 * <p>Java class for GetWorkflowsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWorkflowsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="workflowRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetWorkflowsRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkflowsRequestType", propOrder = {
    "workflowRequest"
})
public class GetWorkflowsRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileGetWorkflowsRequestType> workflowRequest;

    /**
     * Gets the value of the workflowRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetWorkflowsRequestType }
     * 
     * 
     */
    public List<AgileGetWorkflowsRequestType> getWorkflowRequest() {
        if (workflowRequest == null) {
            workflowRequest = new ArrayList<AgileGetWorkflowsRequestType>();
        }
        return this.workflowRequest;
    }

}
