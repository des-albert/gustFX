
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 getApprovers operation. It contains an element
 *                 holding an array of responses.
 *                 @approversResponse    -  An array of responses of type
 *                 AgileGetApproversResponseType   
 * 
 * <p>Java class for GetApproversResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApproversResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="approversResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetApproversResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApproversResponseType", propOrder = {
    "approversResponse"
})
public class GetApproversResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetApproversResponseType> approversResponse;

    /**
     * Gets the value of the approversResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approversResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproversResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetApproversResponseType }
     * 
     * 
     */
    public List<AgileGetApproversResponseType> getApproversResponse() {
        if (approversResponse == null) {
            approversResponse = new ArrayList<AgileGetApproversResponseType>();
        }
        return this.approversResponse;
    }

}
