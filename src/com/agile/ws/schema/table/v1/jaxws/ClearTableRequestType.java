
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
 *                 'clearTable' operation. It contains an array of requests
 *                 named clearTable to support batch operations.
 *                 @clearTable             -  An array of requests of type
 *                 AgileClearTableRequestType.
 *                 Details of the Agile table whose contents are to be
 *                 cleared                                        is
 *                 specified in these requests.   
 * 
 * <p>Java class for ClearTableRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="clearTable" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileClearTableRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearTableRequestType", propOrder = {
    "clearTable"
})
public class ClearTableRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected List<AgileClearTableRequestType> clearTable;

    /**
     * Gets the value of the clearTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileClearTableRequestType }
     * 
     * 
     */
    public List<AgileClearTableRequestType> getClearTable() {
        if (clearTable == null) {
            clearTable = new ArrayList<AgileClearTableRequestType>();
        }
        return this.clearTable;
    }

}
