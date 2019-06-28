
package com.agile.ws.schema.business.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              CheckPrivilegeType is a
 *                 complexType used in the 'checkPrivilege' web service
 *                 for AgileCheckPrivilegeResponseType. It identifies a
 *                 particular privilege and             the object number,
 *                 classtype fields and has a boolean named checkPrivilege
 *                 that reflects the privilege status of the entities
 *                 specified in the request              object.
 *                 @privilege           -  privilege is an integer
 *                 identifying the privilege which
 *                 was checked for by the webservice operation.
 *                 @checkPrivilege      -  checkPrivilege is a boolean that
 *                 reflects the privilege
 *                 status of the entities specified in the request object.
 *                 to the user whose privileges were checked.
 *                 privilege which is being checked for by the webservice.
 *                 @classIdentifier     -  This field is used for
 *                 determining the type of object
 *                 for which the checkPrivilege operation was performed.
 *                 @objectNumber        -  It is the unique Object number
 *                 specified in the request
 *                 object for which the checkPrivilege operation was
 *                 performed.         
 * 
 * <p>Java class for CheckPrivilegeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPrivilegeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilege" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="checkPrivilege" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPrivilegeType", propOrder = {
    "privilege",
    "checkPrivilege",
    "classIdentifier",
    "objectNumber"
})
public class CheckPrivilegeType {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer privilege;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean checkPrivilege;
    @XmlElement(nillable = true)
    protected String classIdentifier;
    @XmlElement(nillable = true)
    protected String objectNumber;

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivilege(Integer value) {
        this.privilege = value;
    }

    /**
     * Gets the value of the checkPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckPrivilege() {
        return checkPrivilege;
    }

    /**
     * Sets the value of the checkPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckPrivilege(Boolean value) {
        this.checkPrivilege = value;
    }

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
     * Gets the value of the objectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Sets the value of the objectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

}
