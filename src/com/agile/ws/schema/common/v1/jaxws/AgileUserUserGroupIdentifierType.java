
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileUserIdentifierType is
 *                 used to identify a unique Agile user group using string
 *                 values             of class and object identifiers.
 *                 @classIdentifier     -  ClassIdentifier is for
 *                 determining the type of object (User/UserGroup).
 *                 The input could be a number as defined in one of the
 *                 constant files                                     in
 *                 SDK or the APIName of the class.
 *                 Eg:- UserConstants.CLASS_USER.toString() or
 *                 "User"
 *                 UserGroupConstants.CLASS_USER_GROUP.toString() or
 *                 "UserGroup"             @objectIdentifier    -
 *                 It is the unique Object number which identifies Agile
 *                 User/UserGroup                            object.
 *                 @jobFunction      -  It is a job function associated
 *                 with Agile User/UserGroup object.             
 * 
 * <p>Java class for AgileUserUserGroupIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileUserUserGroupIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileUserUserGroupIdentifierType", propOrder = {
    "classIdentifier",
    "objectIdentifier",
    "jobFunction"
})
public class AgileUserUserGroupIdentifierType {

    @XmlElement(nillable = true)
    protected String classIdentifier;
    @XmlElement(nillable = true)
    protected String objectIdentifier;
    @XmlElement(nillable = true)
    protected String jobFunction;

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
     * Gets the value of the jobFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFunction() {
        return jobFunction;
    }

    /**
     * Sets the value of the jobFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFunction(String value) {
        this.jobFunction = value;
    }

}
