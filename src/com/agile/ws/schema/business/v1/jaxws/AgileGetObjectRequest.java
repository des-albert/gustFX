
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.PropertyType;


/**
 * 
 *                 Request object for the Get Object webservice. It
 *                 contains information relating              to the class
 *                 type and object number for identifing a unique Agile
 *                 Object and               also the list of tables that
 *                 must be retrieved with this operation.
 *                 @classIdentifier    -  This field is used for
 *                 determining the type of object
 *                 which is to be retrieved. The input could  be a number
 *                 as defined in one of the constant files in SDK or the
 *                 APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @objectNumber       -
 *                 It is the unique Object number which identifies an
 *                 object                                    in the Agile
 *                 system. Eg:- P00001    @referencedObjKey   -  It is the
 *                 key which uniquely identifies an object
 *                 in the external system. Eg:- 12|4567
 *                 @tableRequests      -  AgileDataTableRequestType object
 *                 holds a set of tables            that will be loaded
 *                 from the specified Agile Object                 @options
 *                 -  Optional name-value pair reserved for addressing any
 *                 special                                    handling.
 *                 @inputParameters    -  Optional name,value pair for
 *                 addressing future requirements.                       
 * 
 * <p>Java class for AgileGetObjectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetObjectRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencedObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableRequests" type="{http://xmlns.oracle.com/AgileObjects/Core/Business/V1}AgileDataTableRequestType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileGetObjectRequest", propOrder = {
    "classIdentifier",
    "objectNumber",
    "referencedObjKey",
    "tableRequests",
    "options",
    "inputParameters"
})
public class AgileGetObjectRequest {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true)
    protected String objectNumber;
    protected String referencedObjKey;
    @XmlElement(nillable = true)
    protected List<AgileDataTableRequestType> tableRequests;
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
     * Gets the value of the objectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectNumber() {
        return objectNumber;
    }

    /**
     * Sets the value of the objectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectNumber(String value) {
        this.objectNumber = value;
    }

    /**
     * Gets the value of the referencedObjKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedObjKey() {
        return referencedObjKey;
    }

    /**
     * Sets the value of the referencedObjKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedObjKey(String value) {
        this.referencedObjKey = value;
    }

    /**
     * Gets the value of the tableRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileDataTableRequestType }
     * 
     * 
     */
    public List<AgileDataTableRequestType> getTableRequests() {
        if (tableRequests == null) {
            tableRequests = new ArrayList<AgileDataTableRequestType>();
        }
        return this.tableRequests;
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
