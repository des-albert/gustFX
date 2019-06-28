
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;
import com.agile.ws.schema.common.v1.jaxws.AgileMoneyType;


/**
 * <p>Java class for ResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laborRate" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overheadRate" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="billRate" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceType", propOrder = {
    "resourceId",
    "name",
    "firstName",
    "lastName",
    "userID",
    "laborRate",
    "status",
    "title",
    "email",
    "overheadRate",
    "billRate"
})
public class ResourceType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType resourceId;
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String userID;
    protected AgileMoneyType laborRate;
    @XmlElement(required = true)
    protected AgileListEntryType status;
    protected String title;
    protected String email;
    protected AgileMoneyType overheadRate;
    protected AgileMoneyType billRate;

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setResourceId(AgileObjectIdentifierType value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the laborRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getLaborRate() {
        return laborRate;
    }

    /**
     * Sets the value of the laborRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setLaborRate(AgileMoneyType value) {
        this.laborRate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setStatus(AgileListEntryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the overheadRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getOverheadRate() {
        return overheadRate;
    }

    /**
     * Sets the value of the overheadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setOverheadRate(AgileMoneyType value) {
        this.overheadRate = value;
    }

    /**
     * Gets the value of the billRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getBillRate() {
        return billRate;
    }

    /**
     * Sets the value of the billRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setBillRate(AgileMoneyType value) {
        this.billRate = value;
    }

}
