
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
 *                 'getAgileClass' operation. It contains an array of
 *                 requests named AgileGetClassRequestType to support batch
 *                 operations.                 @requests    -  An array of
 *                 requests of type AgileGetClassRequestType.
 *                 Details of the class whose subclasses are to be
 *                 retrieved is specified in these requests.    
 * 
 * <p>Java class for GetAgileClassRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgileClassRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="requests" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetClassRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgileClassRequestType", propOrder = {
    "requests"
})
public class GetAgileClassRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected List<AgileGetClassRequestType> requests;

    /**
     * Gets the value of the requests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetClassRequestType }
     * 
     * 
     */
    public List<AgileGetClassRequestType> getRequests() {
        if (requests == null) {
            requests = new ArrayList<AgileGetClassRequestType>();
        }
        return this.requests;
    }

}
