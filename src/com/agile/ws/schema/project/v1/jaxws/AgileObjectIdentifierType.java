
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.ObjectIdentifierType;


/**
 * 
 *                 AgileObjectIdentifierType is an extension of
 *                 ObjectIdentifierType                  which provides
 *                 additional information about the object including
 *                 object display name and subclass details.
 *                 @subClassId             -   Refers to the id of the
 *                 subclass in the Agile system
 *                 @subClassName           -   Refers to the API name of
 *                 the subclass in the Agile system.
 *                 @subClassDisplayName    -   The display name of the
 *                 subclass in the Agile system.
 *                 @objectDisplayName      -   The display name of the
 *                 object in the Agile system.             
 * 
 * <p>Java class for AgileObjectIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileObjectIdentifierType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType">
 *       &lt;sequence>
 *         &lt;element name="subClassId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subClassName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subClassDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileObjectIdentifierType", propOrder = {
    "subClassId",
    "subClassName",
    "subClassDisplayName",
    "objectDisplayName"
})
public class AgileObjectIdentifierType
    extends ObjectIdentifierType
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer subClassId;
    @XmlElement(required = true, nillable = true)
    protected String subClassName;
    @XmlElement(nillable = true)
    protected String subClassDisplayName;
    @XmlElement(required = true, nillable = true)
    protected String objectDisplayName;

    /**
     * Gets the value of the subClassId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubClassId() {
        return subClassId;
    }

    /**
     * Sets the value of the subClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubClassId(Integer value) {
        this.subClassId = value;
    }

    /**
     * Gets the value of the subClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassName() {
        return subClassName;
    }

    /**
     * Sets the value of the subClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassName(String value) {
        this.subClassName = value;
    }

    /**
     * Gets the value of the subClassDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubClassDisplayName() {
        return subClassDisplayName;
    }

    /**
     * Sets the value of the subClassDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubClassDisplayName(String value) {
        this.subClassDisplayName = value;
    }

    /**
     * Gets the value of the objectDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectDisplayName() {
        return objectDisplayName;
    }

    /**
     * Sets the value of the objectDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectDisplayName(String value) {
        this.objectDisplayName = value;
    }

}
