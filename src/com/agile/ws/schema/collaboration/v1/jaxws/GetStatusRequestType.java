
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for GetStatus
 *                 operation. It contains an array of requests
 *                 to support batch operations.
 *                 @statusRequest       -  An array of requests of type
 *                 AgileGetStatusRequestType    
 * 
 * <p>Java class for GetStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="statusRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetStatusRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatusRequestType", propOrder = {
    "statusRequest"
})
public class GetStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileGetStatusRequestType> statusRequest;

    /**
     * Gets the value of the statusRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetStatusRequestType }
     * 
     * 
     */
    public List<AgileGetStatusRequestType> getStatusRequest() {
        if (statusRequest == null) {
            statusRequest = new ArrayList<AgileGetStatusRequestType>();
        }
        return this.statusRequest;
    }

}
