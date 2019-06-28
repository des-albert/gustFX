
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *                      Response object for
 *                 the 'exportToAXML' operation does not contain any
 *                 element.                 
 * 
 * <p>Java class for ExportToAXMLResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportToAXMLResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileExportToAXMLResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportToAXMLResponseType", propOrder = {
    "response"
})
public class ExportToAXMLResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileExportToAXMLResponseType> response;

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileExportToAXMLResponseType }
     * 
     * 
     */
    public List<AgileExportToAXMLResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<AgileExportToAXMLResponseType>();
        }
        return this.response;
    }

}
