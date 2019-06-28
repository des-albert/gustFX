
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
 *                 'removeReviewers' operation. It contains an array
 *                 of requests named removeReviewersRequest to support
 *                 batch operations.
 *                 @removeReviewersRequest -  An array of requests of type
 *                 AgileRemoveReviewersRequestType.
 *                 Details of the Reviewers to be removed to a workflow
 *                 are specified in these requests.    
 * 
 * <p>Java class for RemoveReviewersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveReviewersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="removeReviewersRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileRemoveReviewersRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveReviewersRequestType", propOrder = {
    "removeReviewersRequest"
})
public class RemoveReviewersRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileRemoveReviewersRequestType> removeReviewersRequest;

    /**
     * Gets the value of the removeReviewersRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeReviewersRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveReviewersRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileRemoveReviewersRequestType }
     * 
     * 
     */
    public List<AgileRemoveReviewersRequestType> getRemoveReviewersRequest() {
        if (removeReviewersRequest == null) {
            removeReviewersRequest = new ArrayList<AgileRemoveReviewersRequestType>();
        }
        return this.removeReviewersRequest;
    }

}
