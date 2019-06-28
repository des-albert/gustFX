
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'setWorkflow' operation. It contains an array
 *                 of requests named setWorkFlowRequest to support batch
 *                 operations.                 @setWorkFlowRequest  -  An
 *                 array of requests of type AgileSetWorkFlowRequestType.
 *                 Details of the object whose workflow is to be set are
 *                 specified in these requests.    
 * 
 * <p>Java class for SetWorkFlowRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetWorkFlowRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="setWorkFlowRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileSetWorkFlowRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetWorkFlowRequestType", propOrder = {
    "setWorkFlowRequest"
})
public class SetWorkFlowRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileSetWorkFlowRequestType> setWorkFlowRequest;

    /**
     * Gets the value of the setWorkFlowRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setWorkFlowRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetWorkFlowRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileSetWorkFlowRequestType }
     * 
     * 
     */
    public List<AgileSetWorkFlowRequestType> getSetWorkFlowRequest() {
        if (setWorkFlowRequest == null) {
            setWorkFlowRequest = new ArrayList<AgileSetWorkFlowRequestType>();
        }
        return this.setWorkFlowRequest;
    }

}
