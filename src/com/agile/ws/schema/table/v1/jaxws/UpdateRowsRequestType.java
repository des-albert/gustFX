
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *              Request object for the
 *                 'updateRows' operation. It contains an array of requests
 *                 named data to support batch operations.
 *                 @data                -  An array of requests of type
 *                 AgileUpdateRowsRequest. Details
 *                 of the table into which rows are to be updated and the
 *                 content                                     of these
 *                 rows are specified in these requests.   
 * 
 * <p>Java class for UpdateRowsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRowsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileUpdateRowsRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRowsRequestType", propOrder = {
    "data"
})
public class UpdateRowsRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileUpdateRowsRequest> data;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUpdateRowsRequest }
     * 
     * 
     */
    public List<AgileUpdateRowsRequest> getData() {
        if (data == null) {
            data = new ArrayList<AgileUpdateRowsRequest>();
        }
        return this.data;
    }

}
