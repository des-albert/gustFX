
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
 *                 'getTransferAuthority' operation.          This response
 *                 object contains information about the transfer authority
 *                 records retrieved.          @transferAuthorityRecord -
 *                 An element of type TransferAuthorityResponseType
 *                 describing the transfer authority record request for.
 *                 @outputParameters -         Optional name,value pair for
 *                 addressing future requirement.        
 * 
 * <p>Java class for GetTransferAuthorityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransferAuthorityResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="transferAuthorityRecords" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}TransferAuthorityResponseType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GetTransferAuthorityResponseType", propOrder = {
    "transferAuthorityRecords",
    "outputParameters"
})
public class GetTransferAuthorityResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<TransferAuthorityResponseType> transferAuthorityRecords;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the transferAuthorityRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferAuthorityRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferAuthorityRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferAuthorityResponseType }
     * 
     * 
     */
    public List<TransferAuthorityResponseType> getTransferAuthorityRecords() {
        if (transferAuthorityRecords == null) {
            transferAuthorityRecords = new ArrayList<TransferAuthorityResponseType>();
        }
        return this.transferAuthorityRecords;
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
