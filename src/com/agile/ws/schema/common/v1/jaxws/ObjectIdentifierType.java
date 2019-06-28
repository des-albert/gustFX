
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.project.v1.jaxws.AgileObjectIdentifierType;


/**
 *              ObjectIdentifierType
 *                 provides comprehensive information about an object
 *                 including its name, id and class type.
 *                 @classId             -  Refers to the id of the class in
 *                 the Agile system.             @className           -
 *                 Refers to the API name of the class in the Agile system.
 *                 @classDisplayName    -  The display name of the class in
 *                 the Agile system.             @objectId            -  An
 *                 object in the Agile system is referred to by an
 *                 identification number
 *                 that is maintained in the database. objectId refers to
 *                 this id.             @objectName          -  It is the
 *                 unique name assigned to the Agile object.    @version
 *                 -  Specifies the version of the Agile object. Not
 *                 supported in this release.             
 * 
 * <p>Java class for ObjectIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIdentifierType", propOrder = {
    "classId",
    "className",
    "classDisplayName",
    "objectId",
    "objectName",
    "objectVersion",
    "version"
})
@XmlSeeAlso({
    AgileObjectIdentifierType.class
})
public class ObjectIdentifierType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer classId;
    @XmlElement(required = true, nillable = true)
    protected String className;
    @XmlElement(nillable = true)
    protected String classDisplayName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer objectId;
    @XmlElement(required = true, nillable = true)
    protected String objectName;
    @XmlElement(nillable = true)
    protected String objectVersion;
    @XmlElement(nillable = true)
    protected String version;

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassId(Integer value) {
        this.classId = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDisplayName() {
        return classDisplayName;
    }

    /**
     * Sets the value of the classDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDisplayName(String value) {
        this.classDisplayName = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the objectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectVersion(String value) {
        this.objectVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
