
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
 *                 'changeStatus' operation. It contains an array
 *                 of requests named changeStatusRequest to support batch
 *                 operations.                 @changeStatusRequest -  An
 *                 array of requests of type AgileChangeStatusRequestType.
 *                 Details of the object whose status is to be changed
 *                 are specified in these requests.    
 * 
 * <p>Java class for ChangeStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="changeStatusRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileChangeStatusRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeStatusRequestType", propOrder = {
    "changeStatusRequest"
})
public class ChangeStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileChangeStatusRequestType> changeStatusRequest;

    /**
     * Gets the value of the changeStatusRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeStatusRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeStatusRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileChangeStatusRequestType }
     * 
     * 
     */
    public List<AgileChangeStatusRequestType> getChangeStatusRequest() {
        if (changeStatusRequest == null) {
            changeStatusRequest = new ArrayList<AgileChangeStatusRequestType>();
        }
        return this.changeStatusRequest;
    }

}
