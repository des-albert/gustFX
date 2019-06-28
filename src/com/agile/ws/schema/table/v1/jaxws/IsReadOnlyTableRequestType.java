
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
 *                 'isReadOnly' operation. It contains an array of requests
 *                 named             isReadOnlyTable to support batch
 *                 operations.                @isReadOnlyTable     -  An
 *                 array of requests of type
 *                 AgileIsReadOnlyTableRequestType.
 *                 Details of the table whose read-only status is to be
 *                 verified                                     are
 *                 specified in these requests.             
 * 
 * <p>Java class for IsReadOnlyTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsReadOnlyTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="isReadOnlyTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileIsReadOnlyTableRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsReadOnlyTableRequestType", propOrder = {
    "isReadOnlyTable"
})
public class IsReadOnlyTableRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileIsReadOnlyTableRequestType> isReadOnlyTable;

    /**
     * Gets the value of the isReadOnlyTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isReadOnlyTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReadOnlyTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileIsReadOnlyTableRequestType }
     * 
     * 
     */
    public List<AgileIsReadOnlyTableRequestType> getIsReadOnlyTable() {
        if (isReadOnlyTable == null) {
            isReadOnlyTable = new ArrayList<AgileIsReadOnlyTableRequestType>();
        }
        return this.isReadOnlyTable;
    }

}
