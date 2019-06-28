
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileWarningResolutionType
 *                 defines a warning resolution in the Agile system. This
 *                 is used to             disable/enable a particular
 *                 warning.                @id                  -  Id of
 *                 the Agile warning resolution type. Please refer to SDK
 *                 guide                             for all warning IDs
 *                 supported by Agile System              @resolution
 *                 -  resolution is of type
 *                 AgileWarningResolutionConstantsType.             
 * 
 * <p>Java class for AgileWarningResolutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileWarningResolutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resolution" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningResolutionConstantsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileWarningResolutionType", propOrder = {
    "id",
    "resolution"
})
public class AgileWarningResolutionType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AgileWarningResolutionConstantsType resolution;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link AgileWarningResolutionConstantsType }
     *     
     */
    public AgileWarningResolutionConstantsType getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileWarningResolutionConstantsType }
     *     
     */
    public void setResolution(AgileWarningResolutionConstantsType value) {
        this.resolution = value;
    }

}
