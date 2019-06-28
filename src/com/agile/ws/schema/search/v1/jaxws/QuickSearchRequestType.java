
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
 *                 'quickSearch' operation. It contains information about
 *                 the             classIdentifier and keywords using which
 *                 a query for the search process will be
 *                 executed. The quick search web service operates on base
 *                 classes alone, meaning    the classIdentifier specified
 *                 would have to be a base class.
 *                 @classIdentifier     -  This field is used for
 *                 determining the type of object being
 *                 queried in the Agile system as part of the 'quickSearch'
 *                 webservice. The input could  be a number as defined in
 *                 one                                     of the constant
 *                 files in SDK or the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @keywords            -
 *                 Keywords using which the search criteria will be
 *                 determined.                                     The
 *                 character '*' may also be used as a wildcard.
 *                 For example: 'P00001' or 'P0*' may be used as a keyword.
 *                 @searchFiles         -  Set this to 'true' to indicate
 *                 that the content of files attached
 *                 must also be searched for any occurence of the keyword
 *                 specified.    @inputParameters     -  Optional
 *                 name,value pair for addressing future requirements.          
 * 
 * <p>Java class for QuickSearchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickSearchRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "QuickSearchRequestType", propOrder = {
    "classIdentifier",
    "keywords",
    "searchFiles",
    "inputParameters"
})
public class QuickSearchRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String keywords;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean searchFiles;
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
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the searchFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchFiles() {
        return searchFiles;
    }

    /**
     * Sets the value of the searchFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchFiles(Boolean value) {
        this.searchFiles = value;
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
