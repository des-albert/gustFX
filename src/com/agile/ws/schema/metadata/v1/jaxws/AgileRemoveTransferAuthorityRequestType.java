
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *          Request object for
 *                 the 'RemoveTransferAuthority' web service. It contains
 *                 information relating         to the criteria using which
 *                 a transfer authority record will be removed from the
 *                 transfer authority manager.          @transferRecordId
 *                 -  A unique identifier with which transfer authority
 *                 records are identified. This value
 *                 may be obtained from the ObjectIdentifierType
 *                 information obtained while retrieving the record
 *                 earlier.         @inputParameters   -  Optional
 *                 name,value pair for addressing future requirements.       
 * 
 * <p>Java class for AgileRemoveTransferAuthorityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileRemoveTransferAuthorityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferRecordId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileRemoveTransferAuthorityRequestType", propOrder = {
    "transferRecordId",
    "inputParameters"
})
public class AgileRemoveTransferAuthorityRequestType {

    @XmlElement(required = true, nillable = true)
    protected String transferRecordId;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the transferRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRecordId() {
        return transferRecordId;
    }

    /**
     * Sets the value of the transferRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferRecordId(String value) {
        this.transferRecordId = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<PropertyListType>();
        }
        return this.inputParameters;
    }

}
