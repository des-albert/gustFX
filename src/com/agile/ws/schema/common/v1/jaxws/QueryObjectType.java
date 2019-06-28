
package com.agile.ws.schema.common.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *     @queryIdentifier      -  Refers to
 *                 the name, id and version of the query.
 *                 @searchClassIdentifier   -  This field is used for
 *                 determining the type of object being
 *                 queried in the Agile system as part of the
 *                 'advancedSearch'
 *                 webservice. The input could  be a number as defined in
 *                 one                                     of the constant
 *                 files in SDK or the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @criteria            -
 *                 An advanced search criterion may be specified with this
 *                 field.                                     For example:
 *                 [Title Block.Number] starts with 'P000'    @visibility
 *                 -  Refers to the visibility of the query. Possible
 *                 values include PRIVATE or PUBLIC.
 *                 @searchType          -  Refers to the type of
 *                 "Where Used" or "Object search"
 *                 query.    @relatedContentClassIdentifier - Refers to
 *                 class identifier in case related object search.
 *                 @caseSensitive       -  Set this to 'true' if the search
 *                 performed is to be case sensitive.
 *                 @resultAttributes    -  The attributes to be included as
 *                 a part of the result columns.       
 * 
 * <p>Java class for QueryObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}QueryObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="searchClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedContentClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="resultAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryObjectType", propOrder = {
    "queryIdentifier",
    "searchClassIdentifier",
    "criteria",
    "visibility",
    "searchType",
    "relatedContentClassIdentifier",
    "caseSensitive",
    "resultAttributes",
    "owner"
})
public class QueryObjectType {

    protected QueryObjectIdentifierType queryIdentifier;
    @XmlElement(nillable = true)
    protected String searchClassIdentifier;
    @XmlElement(nillable = true)
    protected String criteria;
    @XmlElement(nillable = true)
    protected String visibility;
    @XmlElement(nillable = true)
    protected String searchType;
    @XmlElement(nillable = true)
    protected String relatedContentClassIdentifier;
    @XmlElement(nillable = true)
    protected Boolean caseSensitive;
    @XmlElement(nillable = true)
    protected List<String> resultAttributes;
    @XmlElement(nillable = true)
    protected String owner;

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
     * Gets the value of the searchClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchClassIdentifier() {
        return searchClassIdentifier;
    }

    /**
     * Sets the value of the searchClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchClassIdentifier(String value) {
        this.searchClassIdentifier = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the relatedContentClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedContentClassIdentifier() {
        return relatedContentClassIdentifier;
    }

    /**
     * Sets the value of the relatedContentClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedContentClassIdentifier(String value) {
        this.relatedContentClassIdentifier = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the resultAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultAttributes() {
        if (resultAttributes == null) {
            resultAttributes = new ArrayList<String>();
        }
        return this.resultAttributes;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

}
