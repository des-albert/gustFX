
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
 *                 'removeRows' operation. It contains an array of requests
 *                 named rows to support batch operations.
 *                 @rows            -  An array of requests of type
 *                 AgileGetWorkflowsRequestType.
 *                 Details of the table from which rows are to be deleted
 *                 is specified in these requests.   
 * 
 * <p>Java class for RemoveRowsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveRowsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="rows" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileRemoveRowsRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveRowsRequestType", propOrder = {
    "rows"
})
public class RemoveRowsRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileRemoveRowsRequest> rows;

    /**
     * Gets the value of the rows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileRemoveRowsRequest }
     * 
     * 
     */
    public List<AgileRemoveRowsRequest> getRows() {
        if (rows == null) {
            rows = new ArrayList<AgileRemoveRowsRequest>();
        }
        return this.rows;
    }

}
