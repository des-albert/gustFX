
package com.agile.ws.schema.business.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileObjectType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              AgileBusinessObjectType is a
 *                 general Agile Business object which extends
 *                 AgileObjectType to              include options to mark
 *                 objects.                 @options             -
 *                 Optional name,value pair reserved for addressing future
 *                 requirements and any special options specific to a
 *                 business                                     object
 *                 webservice operation.          
 * 
 * <p>Java class for AgileBusinessObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileBusinessObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileObjectType">
 *       &lt;sequence>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileBusinessObjectType", propOrder = {
    "options"
})
public class AgileBusinessObjectType
    extends AgileObjectType
{

    @XmlElement(nillable = true)
    protected PropertyListType options;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyListType }
     *     
     */
    public PropertyListType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyListType }
     *     
     */
    public void setOptions(PropertyListType value) {
        this.options = value;
    }

}
