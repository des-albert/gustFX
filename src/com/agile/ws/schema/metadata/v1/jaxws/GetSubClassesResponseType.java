
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
 *                 'getSubClasses' operation. It contains an element
 *                 holding an array of responses.
 *                 @subClassesResponse  -  An array of responses of type
 *                 AgileGetSubClassesResponseType    
 * 
 * <p>Java class for GetSubClassesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubClassesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="subClassesResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileGetSubClassesResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubClassesResponseType", propOrder = {
    "subClassesResponse"
})
public class GetSubClassesResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetSubClassesResponseType> subClassesResponse;

    /**
     * Gets the value of the subClassesResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subClassesResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubClassesResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetSubClassesResponseType }
     * 
     * 
     */
    public List<AgileGetSubClassesResponseType> getSubClassesResponse() {
        if (subClassesResponse == null) {
            subClassesResponse = new ArrayList<AgileGetSubClassesResponseType>();
        }
        return this.subClassesResponse;
    }

}
