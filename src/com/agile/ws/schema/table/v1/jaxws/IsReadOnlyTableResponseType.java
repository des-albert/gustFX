
package com.agile.ws.schema.table.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *              Response object for
 *                 'isReadOnly' operation. It contains an element holding
 *                 an array             of responses.
 *                 @isTableReadOnly     -  An array of responses of type
 *                 AgileIsReadOnlyTableResponseType    
 * 
 * <p>Java class for IsReadOnlyTableResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsReadOnlyTableResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="isTableReadOnly" type="{http://xmlns.oracle.com/AgileObjects/Core/Table/V1}AgileIsReadOnlyTableResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsReadOnlyTableResponseType", propOrder = {
    "isTableReadOnly"
})
public class IsReadOnlyTableResponseType
    extends AbstractResponseType
{

    @XmlElement(nillable = true)
    protected List<AgileIsReadOnlyTableResponseType> isTableReadOnly;

    /**
     * Gets the value of the isTableReadOnly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isTableReadOnly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsTableReadOnly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileIsReadOnlyTableResponseType }
     * 
     * 
     */
    public List<AgileIsReadOnlyTableResponseType> getIsTableReadOnly() {
        if (isTableReadOnly == null) {
            isTableReadOnly = new ArrayList<AgileIsReadOnlyTableResponseType>();
        }
        return this.isTableReadOnly;
    }

}
