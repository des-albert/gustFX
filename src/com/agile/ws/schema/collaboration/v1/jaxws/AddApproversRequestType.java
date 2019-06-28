
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
 *                 'addApprovers' operation. It contains an array
 *                 of requests named addApproversRequest to support batch
 *                 operations.                 @addApproversRequest -  An
 *                 array of requests of type AgileAddApproversRequestType.
 *                 Details of the approvers to be added to a workflow
 *                 are specified in these requests.    
 * 
 * <p>Java class for AddApproversRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddApproversRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="addApproversRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileAddApproversRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddApproversRequestType", propOrder = {
    "addApproversRequest"
})
public class AddApproversRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileAddApproversRequestType> addApproversRequest;

    /**
     * Gets the value of the addApproversRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addApproversRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddApproversRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileAddApproversRequestType }
     * 
     * 
     */
    public List<AgileAddApproversRequestType> getAddApproversRequest() {
        if (addApproversRequest == null) {
            addApproversRequest = new ArrayList<AgileAddApproversRequestType>();
        }
        return this.addApproversRequest;
    }

}
