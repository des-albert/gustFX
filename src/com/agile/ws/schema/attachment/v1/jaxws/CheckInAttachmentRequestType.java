
package com.agile.ws.schema.attachment.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for
 *                 CheckIntAttachment operation. It contains an array of
 *                 requests to support batch operations
 *                 @requests -  An array of requests of type
 *                 AgileCheckInAttachmentRequestType    
 * 
 * <p>Java class for CheckInAttachmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckInAttachmentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://xmlns.oracle.com/AgileObjects/Core/Attachment/V1}AgileCheckInAttachmentRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInAttachmentRequestType", propOrder = {
    "request"
})
public class CheckInAttachmentRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileCheckInAttachmentRequestType> request;

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileCheckInAttachmentRequestType }
     * 
     * 
     */
    public List<AgileCheckInAttachmentRequestType> getRequest() {
        if (request == null) {
            request = new ArrayList<AgileCheckInAttachmentRequestType>();
        }
        return this.request;
    }

}
