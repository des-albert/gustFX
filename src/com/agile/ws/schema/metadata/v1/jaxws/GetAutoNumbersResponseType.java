
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
 *                 getAutoNumbers operation. It contains an element
 *                 holding an array of responses.
 *                 @autoNumberResponses   -  An array of responses of type
 *                 AgileGetAutoNumbersResponseType    
 * 
 * <p>Java class for GetAutoNumbersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAutoNumbersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="autoNumberResponses" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetAutoNumbersResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAutoNumbersResponseType", propOrder = {
    "autoNumberResponses"
})
public class GetAutoNumbersResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetAutoNumbersResponseType> autoNumberResponses;

    /**
     * Gets the value of the autoNumberResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoNumberResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoNumberResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetAutoNumbersResponseType }
     * 
     * 
     */
    public List<AgileGetAutoNumbersResponseType> getAutoNumberResponses() {
        if (autoNumberResponses == null) {
            autoNumberResponses = new ArrayList<AgileGetAutoNumbersResponseType>();
        }
        return this.autoNumberResponses;
    }

}
