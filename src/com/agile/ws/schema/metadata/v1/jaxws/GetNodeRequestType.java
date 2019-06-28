
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'getNode' operation. It contains an array             of
 *                 requests named nodeRequest to support batch operations.
 *                 @nodeRequest         -  An array of requests of type
 *                 AgileGetNodeRequestType.
 *                 Details of the webservice operations including the
 *                 node and options for recursion are specified in these
 *                 requests.    
 * 
 * <p>Java class for GetNodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNodeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="nodeRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetNodeRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNodeRequestType", propOrder = {
    "nodeRequest"
})
public class GetNodeRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected List<AgileGetNodeRequestType> nodeRequest;

    /**
     * Gets the value of the nodeRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetNodeRequestType }
     * 
     * 
     */
    public List<AgileGetNodeRequestType> getNodeRequest() {
        if (nodeRequest == null) {
            nodeRequest = new ArrayList<AgileGetNodeRequestType>();
        }
        return this.nodeRequest;
    }

}
