
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 'checkPrivilege' operation. It contains an element
 *                 holding an array of responses.
 *                 @responses           -  An array of responses of type
 *                 AgileCheckPrivilegeResponseType    
 * 
 * <p>Java class for CheckPrivilegeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPrivilegeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileCheckPrivilegeResponseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPrivilegeResponseType", propOrder = {
    "responses"
})
public class CheckPrivilegeResponseType
    extends AbstractResponseType
{

    @XmlElement(required = true)
    protected List<AgileCheckPrivilegeResponseType> responses;

    /**
     * Gets the value of the responses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileCheckPrivilegeResponseType }
     * 
     * 
     */
    public List<AgileCheckPrivilegeResponseType> getResponses() {
        if (responses == null) {
            responses = new ArrayList<AgileCheckPrivilegeResponseType>();
        }
        return this.responses;
    }

}
