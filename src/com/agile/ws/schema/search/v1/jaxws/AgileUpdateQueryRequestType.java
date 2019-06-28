
package com.agile.ws.schema.search.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.QueryObjectIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.QueryObjectType;


/**
 *     @queryIdentifier   - It uniquely
 *                 identifies a query in the Agile system. The query
 *                 version can be passed to ensure that query object
 *                 version is the latest.             @newQueryParams    -
 *                 This refers to the new parameters for the query. The
 *                 folder path  where the query is created cannot be
 *                 modified.     @inputParameters -  Optional name,value
 *                 pair for addressing future requirements.    
 * 
 * <p>Java class for AgileUpdateQueryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileUpdateQueryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}QueryObjectIdentifierType"/>
 *         &lt;element name="newQueryParams" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}QueryObjectType"/>
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
@XmlType(name = "AgileUpdateQueryRequestType", propOrder = {
    "queryIdentifier",
    "newQueryParams",
    "inputParameters"
})
public class AgileUpdateQueryRequestType {

    @XmlElement(required = true)
    protected QueryObjectIdentifierType queryIdentifier;
    @XmlElement(required = true, nillable = true)
    protected QueryObjectType newQueryParams;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the queryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectIdentifierType }
     *     
     */
    public QueryObjectIdentifierType getQueryIdentifier() {
        return queryIdentifier;
    }

    /**
     * Sets the value of the queryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectIdentifierType }
     *     
     */
    public void setQueryIdentifier(QueryObjectIdentifierType value) {
        this.queryIdentifier = value;
    }

    /**
     * Gets the value of the newQueryParams property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjectType }
     *     
     */
    public QueryObjectType getNewQueryParams() {
        return newQueryParams;
    }

    /**
     * Sets the value of the newQueryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjectType }
     *     
     */
    public void setNewQueryParams(QueryObjectType value) {
        this.newQueryParams = value;
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
