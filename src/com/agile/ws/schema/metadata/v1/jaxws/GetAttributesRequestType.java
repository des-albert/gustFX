
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'getAttributes' operation. It contains an array
 *                 of requests named attributesRequests to support batch
 *                 operations.                 @attributesRequests  -  An
 *                 array of requests of type AgileGetAttributesRequestType.
 *                 Details of the object whose attributes are to be
 *                 retrieved                                     are
 *                 specified in these requests.    
 * 
 * <p>Java class for GetAttributesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAttributesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="attributesRequests" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetAttributesRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributesRequestType", propOrder = {
    "attributesRequests"
})
public class GetAttributesRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected List<AgileGetAttributesRequestType> attributesRequests;

    /**
     * Gets the value of the attributesRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributesRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributesRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetAttributesRequestType }
     * 
     * 
     */
    public List<AgileGetAttributesRequestType> getAttributesRequests() {
        if (attributesRequests == null) {
            attributesRequests = new ArrayList<AgileGetAttributesRequestType>();
        }
        return this.attributesRequests;
    }

}
