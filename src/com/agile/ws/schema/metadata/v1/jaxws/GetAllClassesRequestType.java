
package com.agile.ws.schema.metadata.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;
import com.agile.ws.schema.common.v1.jaxws.ClassFilterType;


/**
 *              Request object for the
 *                 'getAllClasses' operation. It contains an element
 *                 named 'level' as a parameter for the webservice call.
 *                 @level               -  This element acts as a filter
 *                 while retrieving the
 *                 classes. Possible values include 'TOP', 'CONCRETE'
 *                 or 'ALL'.      
 * 
 * <p>Java class for GetAllClassesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllClassesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ClassFilterType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllClassesRequestType", propOrder = {
    "level"
})
public class GetAllClassesRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ClassFilterType level;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link ClassFilterType }
     *     
     */
    public ClassFilterType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassFilterType }
     *     
     */
    public void setLevel(ClassFilterType value) {
        this.level = value;
    }

}
