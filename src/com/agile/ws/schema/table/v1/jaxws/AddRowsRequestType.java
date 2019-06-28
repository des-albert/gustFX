
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
 *                 'addRows' operation. It contains an array of requests
 *                 named data to support batch operations.
 *                 @data                -  An array of requests of type
 *                 AgileAddRowsRequest. Details
 *                 of the table into which rows are to be added and the
 *                 content                                     of these
 *                 rows are specified in these requests.   
 * 
 * <p>Java class for AddRowsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRowsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileAddRowsRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRowsRequestType", propOrder = {
    "data"
})
public class AddRowsRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileAddRowsRequest> data;

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
     * {@link AgileAddRowsRequest }
     * 
     * 
     */
    public List<AgileAddRowsRequest> getData() {
        if (data == null) {
            data = new ArrayList<AgileAddRowsRequest>();
        }
        return this.data;
    }

}
