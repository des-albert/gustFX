
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
 *                 'rejectROObject' operation. It contains an array
 *                 of requests named rejectRObject to support batch
 *                 operations.                 @rejectRObject       -  An
 *                 array of requests of type AgileRejectRObjectRequestType.
 *                 Details of the object being rejected are specified in
 *                 these requests.    
 * 
 * <p>Java class for RejectRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="rejectRObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileRejectRObjectRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectRObjectRequestType", propOrder = {
    "rejectRObject"
})
public class RejectRObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileRejectRObjectRequestType> rejectRObject;

    /**
     * Gets the value of the rejectRObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectRObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectRObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileRejectRObjectRequestType }
     * 
     * 
     */
    public List<AgileRejectRObjectRequestType> getRejectRObject() {
        if (rejectRObject == null) {
            rejectRObject = new ArrayList<AgileRejectRObjectRequestType>();
        }
        return this.rejectRObject;
    }

}
