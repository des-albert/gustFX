
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'assignUsersFromPool' web service are
 *                 of this type.                         This request
 *                 identifies the project to be delegated and the user to
 *                 whom the ownership                         is assigned.
 *                 @projectIdentifier  -   It is the unique Object number
 *                 which identifies a project in the Agile system. Eg:-
 *                 T00012
 *                 @inputParameters     -  Optional name,value pair for
 *                 addressing future requirements.                                                         
 * 
 * <p>Java class for AgileAssignUsersFromPoolRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAssignUsersFromPoolRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="users" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usergroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyToChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileAssignUsersFromPoolRequestType", propOrder = {
    "projectIdentifier",
    "users",
    "usergroup",
    "applyToChildren",
    "inputParameters"
})
public class AgileAssignUsersFromPoolRequestType {

    @XmlElement(required = true, nillable = true)
    protected String projectIdentifier;
    @XmlElement(nillable = true)
    protected List<String> users;
    @XmlElement(nillable = true)
    protected String usergroup;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean applyToChildren;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsers() {
        if (users == null) {
            users = new ArrayList<String>();
        }
        return this.users;
    }

    /**
     * Gets the value of the usergroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsergroup() {
        return usergroup;
    }

    /**
     * Sets the value of the usergroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsergroup(String value) {
        this.usergroup = value;
    }

    /**
     * Gets the value of the applyToChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Sets the value of the applyToChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChildren(Boolean value) {
        this.applyToChildren = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<PropertyListType>();
        }
        return this.inputParameters;
    }

}
