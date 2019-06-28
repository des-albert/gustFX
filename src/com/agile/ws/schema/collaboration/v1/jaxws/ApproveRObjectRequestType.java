
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
 *                 approve routable object  operation. It contains an
 *                 array of requests named approveRObject to support batch
 *                 operations.                 @approveRObject     -  An
 *                 array of requests of type
 *                 AgileApproveRObjectRequestType.
 *                 Details of the object approved, are are specified in
 *                 these                                     requests.   
 * 
 * <p>Java class for ApproveRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproveRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="approveRObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileApproveRObjectRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproveRObjectRequestType", propOrder = {
    "approveRObject"
})
public class ApproveRObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileApproveRObjectRequestType> approveRObject;

    /**
     * Gets the value of the approveRObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approveRObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproveRObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileApproveRObjectRequestType }
     * 
     * 
     */
    public List<AgileApproveRObjectRequestType> getApproveRObject() {
        if (approveRObject == null) {
            approveRObject = new ArrayList<AgileApproveRObjectRequestType>();
        }
        return this.approveRObject;
    }

}
