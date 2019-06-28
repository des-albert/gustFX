
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
 *                 'copyTable' operation. It contains an array of requests
 *                 named copyTable to support batch operations.
 *                 @copyTable           -  An array of requests of type
 *                 AgileCopyTableRequestType.
 *                 Details of the Agile table to be copied are specified
 *                 in these requests.   
 * 
 * <p>Java class for CopyTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="copyTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileCopyTableRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyTableRequestType", propOrder = {
    "copyTable"
})
public class CopyTableRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileCopyTableRequestType> copyTable;

    /**
     * Gets the value of the copyTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileCopyTableRequestType }
     * 
     * 
     */
    public List<AgileCopyTableRequestType> getCopyTable() {
        if (copyTable == null) {
            copyTable = new ArrayList<AgileCopyTableRequestType>();
        }
        return this.copyTable;
    }

}
