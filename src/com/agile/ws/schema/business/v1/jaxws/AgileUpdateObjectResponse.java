
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileObjectType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for the
 *                 'updateObject' operation. It contains an element
 *                 agileObject which holds complete information about an
 *                 object updated              by the web service.
 *                 @agileObject         -  An element of type
 *                 AgileObjectType, agileObject holds the
 *                 details about the object updated by the webservice.
 *                 These                                     details
 *                 include object and table information.
 *                 @outputParameters -  Optional name,value pair for
 *                 addressing future requirements.          
 * 
 * <p>Java class for AgileUpdateObjectResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileUpdateObjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agileObject" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileObjectType" minOccurs="0"/>
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
@XmlType(name = "AgileUpdateObjectResponse", propOrder = {
    "agileObject",
    "outputParameters"
})
public class AgileUpdateObjectResponse {

    @XmlElement(nillable = true)
    protected AgileObjectType agileObject;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the agileObject property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectType }
     *     
     */
    public AgileObjectType getAgileObject() {
        return agileObject;
    }

    /**
     * Sets the value of the agileObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectType }
     *     
     */
    public void setAgileObject(AgileObjectType value) {
        this.agileObject = value;
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
