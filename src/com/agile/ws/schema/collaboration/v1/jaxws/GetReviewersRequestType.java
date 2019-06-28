
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
 *                 'getReviewers' operation. It contains an array
 *                 of requests named reviewersRequest to support batch
 *                 operations.                 @reviewersRequest    -  An
 *                 array of requests of type AgileGetReviewersRequestType.
 *                 This includes details about the object for whose
 *                 workflow                                      the sign
 *                 off reviewers are to be retrieved.    
 * 
 * <p>Java class for GetReviewersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetReviewersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="reviewersRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetReviewersRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReviewersRequestType", propOrder = {
    "reviewersRequest"
})
public class GetReviewersRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileGetReviewersRequestType> reviewersRequest;

    /**
     * Gets the value of the reviewersRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewersRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewersRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetReviewersRequestType }
     * 
     * 
     */
    public List<AgileGetReviewersRequestType> getReviewersRequest() {
        if (reviewersRequest == null) {
            reviewersRequest = new ArrayList<AgileGetReviewersRequestType>();
        }
        return this.reviewersRequest;
    }

}
