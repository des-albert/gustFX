
package com.agile.ws.schema.search.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for the
 *                 'executeSaved' operation. It contains an element
 *                 holding an array of responses.
 *                 @responses           -  An array of responses of type
 *                 AgileExecuteSavedQueryResponseType.
 *                 The details of the objects created by the webservice
 *                 are specified in these responses.    
 * 
 * <p>Java class for ExecuteSavedQueryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecuteSavedQueryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="responses" type="{http://xmlns.oracle.com/AgileObjects/Core/Search/V1}AgileExecuteSavedQueryResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteSavedQueryResponseType", propOrder = {
    "responses"
})
public class ExecuteSavedQueryResponseType
    extends AbstractResponseType
{

    protected List<AgileExecuteSavedQueryResponseType> responses;

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
     * {@link AgileExecuteSavedQueryResponseType }
     * 
     * 
     */
    public List<AgileExecuteSavedQueryResponseType> getResponses() {
        if (responses == null) {
            responses = new ArrayList<AgileExecuteSavedQueryResponseType>();
        }
        return this.responses;
    }

}
