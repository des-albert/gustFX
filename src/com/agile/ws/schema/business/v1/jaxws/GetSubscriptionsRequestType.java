
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'getSubscriptions' operation. It contains an array of
 *                 requests named requests to support batch operations.
 *                 @requests           -  An array of requests of type
 *                 AgileGetSubscriptionsRequestType.             Details of
 *                 the Agile object for which the Subscriptions to be
 *                 retrieved is specified in these requests.             
 * 
 * <p>Java class for GetSubscriptionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubscriptionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="requests" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileGetSubscriptionsRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscriptionsRequestType", propOrder = {
    "requests"
})
public class GetSubscriptionsRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileGetSubscriptionsRequestType> requests;

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
     * {@link AgileGetSubscriptionsRequestType }
     * 
     * 
     */
    public List<AgileGetSubscriptionsRequestType> getRequests() {
        if (requests == null) {
            requests = new ArrayList<AgileGetSubscriptionsRequestType>();
        }
        return this.requests;
    }

}
