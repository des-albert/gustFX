
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *       @transferRecordId  -
 *                 A unique identifier with which transfer authority
 *                 records are identified. This value          must be used
 *                 in the request object while removing a transfer
 *                 authority record that was retrieved earlier.
 *                 @inputParameters   -  Optional name,value pair for
 *                 addressing future requirements.       
 * 
 * <p>Java class for AgileCreateTransferAuthorityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCreateTransferAuthorityRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferAuthorityRecord" type="{http://xmlns.oracle.com/AgileObjects/Core/AdminMetadata/V1}TransferAuthorityRequestType"/>
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
@XmlType(name = "AgileCreateTransferAuthorityRequestType", propOrder = {
    "transferAuthorityRecord",
    "inputParameters"
})
public class AgileCreateTransferAuthorityRequestType {

    @XmlElement(required = true, nillable = true)
    protected TransferAuthorityRequestType transferAuthorityRecord;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the transferAuthorityRecord property.
     * 
     * @return
     *     possible object is
     *     {@link TransferAuthorityRequestType }
     *     
     */
    public TransferAuthorityRequestType getTransferAuthorityRecord() {
        return transferAuthorityRecord;
    }

    /**
     * Sets the value of the transferAuthorityRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferAuthorityRequestType }
     *     
     */
    public void setTransferAuthorityRecord(TransferAuthorityRequestType value) {
        this.transferAuthorityRecord = value;
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
