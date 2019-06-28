
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Request object for the
 *                 'loadTable' web service is of this type. This request
 *                 specifies             information about the table that
 *                 will be loaded and relevant options for the operation.
 *                 @tableRequest        -  tableRequest is used to identify
 *                 any table in the Agile system
 *                 which will be loaded by the 'loadTable' web service
 *                 opereation.                                     This
 *                 field is of type RequestTableType which has been
 *                 documented                                     in the
 *                 Table schema.    @inputParameters -  Optional name,value
 *                 pair for addressing future requirement.             
 * 
 * <p>Java class for LoadTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="tableRequest" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}RequestTableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTableRequestType", propOrder = {
    "tableRequest",
    "inputParameters"
})
public class LoadTableRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<RequestTableType> tableRequest;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the tableRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestTableType }
     * 
     * 
     */
    public List<RequestTableType> getTableRequest() {
        if (tableRequest == null) {
            tableRequest = new ArrayList<RequestTableType>();
        }
        return this.tableRequest;
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
