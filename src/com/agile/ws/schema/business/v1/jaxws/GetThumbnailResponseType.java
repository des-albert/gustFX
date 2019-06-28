
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *                  Response
 *                 object for the 'getThumbnail' operation. It contains an
 *                 element             holding an array of responses.
 *                 @responses           -  An array of responses of type
 *                 AgileGetThumbnailResponse.
 *                 The details of thumbnail url retrieved by the webservice
 *                 are specified in these responses.               
 * 
 * <p>Java class for GetThumbnailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetThumbnailResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileGetThumbnailResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetThumbnailResponseType", propOrder = {
    "responses"
})
public class GetThumbnailResponseType
    extends AbstractResponseType
{

    protected List<AgileGetThumbnailResponse> responses;

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
     * {@link AgileGetThumbnailResponse }
     * 
     * 
     */
    public List<AgileGetThumbnailResponse> getResponses() {
        if (responses == null) {
            responses = new ArrayList<AgileGetThumbnailResponse>();
        }
        return this.responses;
    }

}
