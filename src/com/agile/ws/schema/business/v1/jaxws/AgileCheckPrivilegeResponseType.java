
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileUserIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Each of the batched
 *                 responses for the 'checkPrivilege' webservice are of
 *                 this type.             This response object contains
 *                 information about the privilege which was checked for
 *                 a particular user by the web service operation.
 *                 @userIdentification  -  Refers to an
 *                 AgileUserIdentifierType object, referring
 *                 to the user whose privileges were checked.
 *                 privilege which is being checked for by the webservice.
 *                 @privilege           -  privilege is of type
 *                 CheckPrivilegeType and refers to
 *                 information about the privilege which was checked for by
 *                 the webservice.    @outputParameters -  Optional
 *                 name,value pair for addressing future requirements.               
 * 
 * <p>Java class for AgileCheckPrivilegeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCheckPrivilegeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdentification" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserIdentifierType"/>
 *         &lt;element name="privilege" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}CheckPrivilegeType"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileCheckPrivilegeResponseType", propOrder = {
    "userIdentification",
    "privilege",
    "outputParameters"
})
public class AgileCheckPrivilegeResponseType {

    @XmlElement(required = true, nillable = true)
    protected AgileUserIdentifierType userIdentification;
    @XmlElement(required = true, nillable = true)
    protected CheckPrivilegeType privilege;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the userIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link AgileUserIdentifierType }
     *     
     */
    public AgileUserIdentifierType getUserIdentification() {
        return userIdentification;
    }

    /**
     * Sets the value of the userIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileUserIdentifierType }
     *     
     */
    public void setUserIdentification(AgileUserIdentifierType value) {
        this.userIdentification = value;
    }

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPrivilegeType }
     *     
     */
    public CheckPrivilegeType getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPrivilegeType }
     *     
     */
    public void setPrivilege(CheckPrivilegeType value) {
        this.privilege = value;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
