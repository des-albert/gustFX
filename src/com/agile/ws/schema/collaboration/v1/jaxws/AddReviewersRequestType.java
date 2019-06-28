
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
 *                 'addReviewers' operation. It contains an array
 *                 of requests named addReviewersRequest to support batch
 *                 operations.                 @addReviewersRequest -  An
 *                 array of requests of type AgileAddReviewersRequestType.
 *                 Details of the Reviewers to be added to a workflow
 *                 are specified in these requests.    
 * 
 * <p>Java class for AddReviewersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddReviewersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="addReviewersRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileAddReviewersRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddReviewersRequestType", propOrder = {
    "addReviewersRequest"
})
public class AddReviewersRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileAddReviewersRequestType> addReviewersRequest;

    /**
     * Gets the value of the addReviewersRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addReviewersRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddReviewersRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileAddReviewersRequestType }
     * 
     * 
     */
    public List<AgileAddReviewersRequestType> getAddReviewersRequest() {
        if (addReviewersRequest == null) {
            addReviewersRequest = new ArrayList<AgileAddReviewersRequestType>();
        }
        return this.addReviewersRequest;
    }

}
