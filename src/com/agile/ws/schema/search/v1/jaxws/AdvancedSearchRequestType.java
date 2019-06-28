
package com.agile.ws.schema.search.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Request object for the
 *                 'advancedSearch' operation. It contains information
 *                 about             the classIdentifier, criteria and the
 *                 following parameters using which a query             for
 *                 the search process will be  executed.
 *                 @classIdentifier     -  This field is used for
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
 *                 [Title Block.Number] starts with 'P000'
 *                 @params              -  Parameters for the advanced
 *                 search operation may be passed as
 *                 a ParamListType.             @caseSensitive       -  Set
 *                 this to 'true' if the search performed is to be case
 *                 sensitive.             @displayName         -  Refers to
 *                 the name of the advanced search implemented.
 *                 @type                -  Refers to the type of
 *                 "Where Used" query to use.
 *                 @visibility          -  Refers to the visibility of the
 *                 advanced search implemented. Possible
 *                 values include PRIVATE or PUBLIC. Not used in 9.3
 *                 release.             @resultAttributes    -  The
 *                 attributes to be included as a part of the result
 *                 columns.    @inputParameters -  Optional name,value pair
 *                 for addressing future requirements.    
 * 
 * <p>Java class for AdvancedSearchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancedSearchRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="params" type="{http://xmlns.oracle.com/AgileObjects/Core/Search/V1}ParamListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributeID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}SearchType" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}VisibilityType" minOccurs="0"/>
 *         &lt;element name="resultAttributes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedContentClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancedSearchRequestType", propOrder = {
    "classIdentifier",
    "criteria",
    "params",
    "attributeID",
    "caseSensitive",
    "displayName",
    "type",
    "visibility",
    "resultAttributes",
    "relatedContentClassIdentifier",
    "inputParameters"
})
public class AdvancedSearchRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(nillable = true)
    protected String criteria;
    @XmlElement(nillable = true)
    protected List<ParamListType> params;
    @XmlElement(nillable = true)
    protected List<Integer> attributeID;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean caseSensitive;
    @XmlElement(nillable = true)
    protected String displayName;
    @XmlElement(nillable = true)
    protected Integer type;
    @XmlElement(nillable = true)
    protected Integer visibility;
    @XmlElement(nillable = true)
    protected List<String> resultAttributes;
    @XmlElement(nillable = true)
    protected String relatedContentClassIdentifier;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

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
     * Gets the value of the attributeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAttributeID() {
        if (attributeID == null) {
            attributeID = new ArrayList<Integer>();
        }
        return this.attributeID;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibility(Integer value) {
        this.visibility = value;
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
