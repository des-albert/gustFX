
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Response object for the
 *                 'modifyTransferAuthority' operation.          This
 *                 response object contains information about the transfer
 *                 authority records retrieved.          @outputParameters
 *                 -         Optional name,value pair for addressing future
 *                 requirement.        
 * 
 * <p>Java class for ModifyTransferAuthorityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyTransferAuthorityResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="modifyTAResponse" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}AgileModifyTransferAuthorityResponseType" maxOccurs="unbounded"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyTransferAuthorityResponseType", propOrder = {
    "modifyTAResponse",
    "outputParameters"
})
public class ModifyTransferAuthorityResponseType
    extends AbstractResponseType
{

    @XmlElement(required = true, nillable = true)
    protected List<AgileModifyTransferAuthorityResponseType> modifyTAResponse;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the modifyTAResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifyTAResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifyTAResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileModifyTransferAuthorityResponseType }
     * 
     * 
     */
    public List<AgileModifyTransferAuthorityResponseType> getModifyTAResponse() {
        if (modifyTAResponse == null) {
            modifyTAResponse = new ArrayList<AgileModifyTransferAuthorityResponseType>();
        }
        return this.modifyTAResponse;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
