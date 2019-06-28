
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'acknowledgeROObject' operation. It contains an array
 *                 of requests named acknowledgeRObject to support batch
 *                 operations.                 @acknowledgeRObject  -  An
 *                 array of requests of type
 *                 AgileAcknowledgeRObjectRequestType.
 *                 Details of the object being acknowledgeed are specified
 *                 in                                      these requests.    
 * 
 * <p>Java class for AcknowledgeRObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgeRObjectRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="acknowledgeRObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Collaboration/V1}AgileAcknowledgeRObjectRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgeRObjectRequestType", propOrder = {
    "acknowledgeRObject"
})
public class AcknowledgeRObjectRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileAcknowledgeRObjectRequestType> acknowledgeRObject;

    /**
     * Gets the value of the acknowledgeRObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgeRObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgeRObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileAcknowledgeRObjectRequestType }
     * 
     * 
     */
    public List<AgileAcknowledgeRObjectRequestType> getAcknowledgeRObject() {
        if (acknowledgeRObject == null) {
            acknowledgeRObject = new ArrayList<AgileAcknowledgeRObjectRequestType>();
        }
        return this.acknowledgeRObject;
    }

}
