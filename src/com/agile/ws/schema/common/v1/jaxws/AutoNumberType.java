
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AutoNumberType defines an
 *                 autonumber using a string, which may be used for any
 *                 object             in the Agile system .
 *                 @autoNumber          -  A string defining an auto
 *                 number, which may be used by any
 *                 object in the Agile system.             
 * 
 * <p>Java class for AutoNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoNumberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}BaseNodeType">
 *       &lt;sequence>
 *         &lt;element name="autoNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoNumberType", propOrder = {
    "autoNumber"
})
public class AutoNumberType
    extends BaseNodeType
{

    @XmlElement(nillable = true)
    protected List<String> autoNumber;

    /**
     * Gets the value of the autoNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutoNumber() {
        if (autoNumber == null) {
            autoNumber = new ArrayList<String>();
        }
        return this.autoNumber;
    }

}
