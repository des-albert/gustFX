
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
 *                 'getLists' operation. It contains an array
 *                 of requests named listsRequest to support batch
 *                 operations.                 @listsRequest        -  An
 *                 array of requests of type AgileGetListsRequestType.
 *                 Details of the lists to be retrieved by the operation
 *                 are specified in these requests.    
 * 
 * <p>Java class for GetListsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="listsRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetListsRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListsRequestType", propOrder = {
    "listsRequest"
})
public class GetListsRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected List<AgileGetListsRequestType> listsRequest;

    /**
     * Gets the value of the listsRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listsRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListsRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetListsRequestType }
     * 
     * 
     */
    public List<AgileGetListsRequestType> getListsRequest() {
        if (listsRequest == null) {
            listsRequest = new ArrayList<AgileGetListsRequestType>();
        }
        return this.listsRequest;
    }

}
