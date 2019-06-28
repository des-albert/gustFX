
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'saveAsObject' operation. It contains an array of
 *                 requests             named requests to support batch
 *                 operations.                  @requests           -  An
 *                 array of requests of type AgileSaveAsObjectRequestType.
 *                 Details of the Agile object to be saved, tables to
 *                 copied                                    are specified
 *                 in these requests.             
 * 
 * <p>Java class for SaveAsObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAsObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="saveAsObjectRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileSaveAsObjectRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAsObjectRequestType", propOrder = {
    "saveAsObjectRequest"
})
public class SaveAsObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileSaveAsObjectRequestType> saveAsObjectRequest;

    /**
     * Gets the value of the saveAsObjectRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveAsObjectRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveAsObjectRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileSaveAsObjectRequestType }
     * 
     * 
     */
    public List<AgileSaveAsObjectRequestType> getSaveAsObjectRequest() {
        if (saveAsObjectRequest == null) {
            saveAsObjectRequest = new ArrayList<AgileSaveAsObjectRequestType>();
        }
        return this.saveAsObjectRequest;
    }

}
