
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
 *                 'removeApprovers' operation. It contains an array
 *                 of requests named removeApproversRequest to support
 *                 batch operations.
 *                 @removeApproversRequest -  An array of requests of type
 *                 AgileRemoveApproversRequestType.
 *                 Details of the object whose approvers are to be removed
 *                 are specified in these requests.    
 * 
 * <p>Java class for RemoveApproversRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveApproversRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="removeApproversRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileRemoveApproversRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveApproversRequestType", propOrder = {
    "removeApproversRequest"
})
public class RemoveApproversRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileRemoveApproversRequestType> removeApproversRequest;

    /**
     * Gets the value of the removeApproversRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeApproversRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveApproversRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileRemoveApproversRequestType }
     * 
     * 
     */
    public List<AgileRemoveApproversRequestType> getRemoveApproversRequest() {
        if (removeApproversRequest == null) {
            removeApproversRequest = new ArrayList<AgileRemoveApproversRequestType>();
        }
        return this.removeApproversRequest;
    }

}
