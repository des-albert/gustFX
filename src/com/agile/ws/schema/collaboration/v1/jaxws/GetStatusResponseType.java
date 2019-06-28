
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response Object for the
 *                 GetStatus operation,  It contains an element
 *                 holding an array of responses.
 *                 @statusResponse       -  An array of responses of type
 *                 AgileGetStatusResponseType     
 * 
 * <p>Java class for GetStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="statusResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileGetStatusResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStatusResponseType", propOrder = {
    "statusResponse"
})
public class GetStatusResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileGetStatusResponseType> statusResponse;

    /**
     * Gets the value of the statusResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileGetStatusResponseType }
     * 
     * 
     */
    public List<AgileGetStatusResponseType> getStatusResponse() {
        if (statusResponse == null) {
            statusResponse = new ArrayList<AgileGetStatusResponseType>();
        }
        return this.statusResponse;
    }

}
