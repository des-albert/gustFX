
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
 *                 'getApprovers' operation. It contains an array
 *                 of requests named approversRequest to support batch
 *                 operations.                 @approversRequest    -  An
 *                 array of requests of type AgileGetApproversRequestType.
 *                 This includes details about the object for whose
 *                 workflow                                      the
 *                 approvers are to be retrieved.    
 * 
 * <p>Java class for GetApproversRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApproversRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="approversRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetApproversRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApproversRequestType", propOrder = {
    "approversRequest"
})
public class GetApproversRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileGetApproversRequestType> approversRequest;

    /**
     * Gets the value of the approversRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approversRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproversRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetApproversRequestType }
     * 
     * 
     */
    public List<AgileGetApproversRequestType> getApproversRequest() {
        if (approversRequest == null) {
            approversRequest = new ArrayList<AgileGetApproversRequestType>();
        }
        return this.approversRequest;
    }

}
