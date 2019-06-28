
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              ObjectReferentIdType is used
 *                 to uniquely identify instance of an Agile Object using
 *                 classIdentifier and objectIdentifier.
 *                 @classIdentifier     -  This field is used for
 *                 determining the type of object
 *                 which is referred to. The input could  be a number
 *                 as defined in one of the constant files in SDK or the
 *                 APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @objectIdentifier    -
 *                 It is the unique Object number which identifies an
 *                 object                                     in the Agile
 *                 system. Eg:- P00001    @referencedObjKey   -  It is the
 *                 key which uniquely identifies an object
 *                 in the external system. Eg:- 12|4567          @version
 *                 -  Specifies the version of the Agile object. Not
 *                 supported                                   in this
 *                 release.             @options             -  Optional
 *                 name,value pair reserved for addressing future
 *                 requirements and any special options specific to any
 *                 webservice operation.                      
 * 
 * <p>Java class for ObjectReferentIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectReferentIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencedObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectReferentIdType", propOrder = {
    "classIdentifier",
    "objectIdentifier",
    "referencedObjKey",
    "version",
    "options"
})
public class ObjectReferentIdType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectIdentifier;
    protected String referencedObjKey;
    @XmlElement(nillable = true)
    protected String version;
    @XmlElement(nillable = true)
    protected List<PropertyType> options;

    /**
     * Gets the value of the classIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassIdentifier() {
        return classIdentifier;
    }

    /**
     * Sets the value of the classIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassIdentifier(String value) {
        this.classIdentifier = value;
    }

    /**
     * Gets the value of the objectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Sets the value of the objectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectIdentifier(String value) {
        this.objectIdentifier = value;
    }

    /**
     * Gets the value of the referencedObjKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedObjKey() {
        return referencedObjKey;
    }

    /**
     * Sets the value of the referencedObjKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedObjKey(String value) {
        this.referencedObjKey = value;
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

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getOptions() {
        if (options == null) {
            options = new ArrayList<PropertyType>();
        }
        return this.options;
    }

}
