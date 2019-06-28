
package com.agile.ws.schema.search.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.QueryObjectIdentifierType;


/**
 *         @queryIdentifier - It uniquely
 *                 identifies a query in the Agile system.     @params
 *                 -  It refers to the params while executing the query if
 *                 the query is parametric.     @inputParameters -
 *                 Optional name,value pair for addressing future
 *                 requirements.    
 * 
 * <p>Java class for AgileExecuteSavedQueryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExecuteSavedQueryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}QueryObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="params" type="{http://xmlns.oracle.com/AgileObjects/Core/Search/V1}ParamListType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileExecuteSavedQueryRequestType", propOrder = {
    "queryIdentifier",
    "params",
    "inputParameters"
})
public class AgileExecuteSavedQueryRequestType {

    protected QueryObjectIdentifierType queryIdentifier;
    @XmlElement(nillable = true)
    protected List<ParamListType> params;
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
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamListType }
     * 
     * 
     */
    public List<ParamListType> getParams() {
        if (params == null) {
            params = new ArrayList<ParamListType>();
        }
        return this.params;
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
