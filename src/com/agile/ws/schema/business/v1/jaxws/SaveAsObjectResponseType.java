
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
 *                 'saveAsObject' operation. It contains an element
 *                 holding an array of responses.
 *                 @saveAsObjectResponse  -  An array of responses of type
 *                 AgileSaveAsObjectResponseType    
 * 
 * <p>Java class for SaveAsObjectResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAsObjectResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="saveAsObjectResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileSaveAsObjectResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAsObjectResponseType", propOrder = {
    "saveAsObjectResponse"
})
public class SaveAsObjectResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileSaveAsObjectResponseType> saveAsObjectResponse;

    /**
     * Gets the value of the saveAsObjectResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveAsObjectResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveAsObjectResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileSaveAsObjectResponseType }
     * 
     * 
     */
    public List<AgileSaveAsObjectResponseType> getSaveAsObjectResponse() {
        if (saveAsObjectResponse == null) {
            saveAsObjectResponse = new ArrayList<AgileSaveAsObjectResponseType>();
        }
        return this.saveAsObjectResponse;
    }

}
