
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileRowType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.PropertyType;


/**
 *               Request
 *                 object for the Create Object webservice. It contains
 *                 information relating              to the class type and
 *                 object number for creating a unique Agile Object and
 *                 additional atrributes which might be mandatory, specific
 *                 to the type of object that              is to be
 *                 created.                   @classIdentifier    -  This
 *                 field is used for determining the type of object
 *                 which is to be retrieved. The input could  be a number
 *                 as defined in one of the constant files in SDK or the
 *                 APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                  @autoNumberSource   -
 *                 Refers to the pre-determined autonumber for the
 *                 particular                                     class
 *                 type, which may be passed through this field.
 *                 Alternatively, a unique object number may also be passed
 *                 using the 'data' element.                       @data
 *                 -  Data is an element of type 'AgileRowType', through
 *                 which                                     comprehensive
 *                 information about an object's details may be
 *                 declared via attribute/value mappings. This information
 *                 is                                      used to
 *                 eventually create the object using the web service.
 *                 @options            -  Optional name-value pair reserved
 *                 for addressing any                             special
 *                 handling.     @inputParameters    -  Optional name,value
 *                 pair for addressing future requirements.                   
 * 
 * <p>Java class for AgileCreateObjectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCreateObjectRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoNumberSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRowType" minOccurs="0"/>
 *         &lt;element name="options" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileCreateObjectRequest", propOrder = {
    "classIdentifier",
    "autoNumberSource",
    "data",
    "options",
    "inputParameters"
})
public class AgileCreateObjectRequest {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(nillable = true)
    protected String autoNumberSource;
    @XmlElement(nillable = true)
    protected AgileRowType data;
    @XmlElement(nillable = true)
    protected List<PropertyType> options;
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
     * Gets the value of the autoNumberSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoNumberSource() {
        return autoNumberSource;
    }

    /**
     * Sets the value of the autoNumberSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoNumberSource(String value) {
        this.autoNumberSource = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link AgileRowType }
     *     
     */
    public AgileRowType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileRowType }
     *     
     */
    public void setData(AgileRowType value) {
        this.data = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getOptions() {
        if (options == null) {
            options = new ArrayList<PropertyType>();
        }
        return this.options;
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
