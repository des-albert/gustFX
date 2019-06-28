
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 'getAttributes' operation. It contains an element
 *                 holding an array of responses.
 *                 @attributesResponses -  An array of responses of type
 *                 AgileGetAttributesResponseType    
 * 
 * <p>Java class for GetAttributesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAttributesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="attributesResponses" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetAttributesResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributesResponseType", propOrder = {
    "attributesResponses"
})
public class GetAttributesResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetAttributesResponseType> attributesResponses;

    /**
     * Gets the value of the attributesResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributesResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributesResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetAttributesResponseType }
     * 
     * 
     */
    public List<AgileGetAttributesResponseType> getAttributesResponses() {
        if (attributesResponses == null) {
            attributesResponses = new ArrayList<AgileGetAttributesResponseType>();
        }
        return this.attributesResponses;
    }

}
