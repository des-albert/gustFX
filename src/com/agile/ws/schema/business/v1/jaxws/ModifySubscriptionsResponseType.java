
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
 *                 'modifySubscriptions' operation. It contains an element
 *                 holding an array of responses.
 *                 @responses  -  An array of responses of type
 *                 AgileModifySubscriptionsResponseType    
 * 
 * <p>Java class for ModifySubscriptionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySubscriptionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileModifySubscriptionsResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySubscriptionsResponseType", propOrder = {
    "responses"
})
public class ModifySubscriptionsResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileModifySubscriptionsResponseType> responses;

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
     * {@link AgileModifySubscriptionsResponseType }
     * 
     * 
     */
    public List<AgileModifySubscriptionsResponseType> getResponses() {
        if (responses == null) {
            responses = new ArrayList<AgileModifySubscriptionsResponseType>();
        }
        return this.responses;
    }

}
