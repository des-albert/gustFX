
package com.agile.ws.schema.business.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileWarningResolutionType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;
import com.agile.ws.schema.common.v1.jaxws.PropertyType;


/**
 *              Each of the batched requests
 *                 for the 'deleteObject' webservice are of this type. This
 *                 response object contains information that identifies the
 *                 object queried upon and the             underlying
 *                 information for the request object.
 *                 @classIdentifier    -  This field is used for
 *                 determining the type of object
 *                 which is to be deleted. The input could  be a number
 *                 as defined in one of the constant files in SDK or the
 *                 APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"                 @objectNumber       -
 *                 It is the unique Object number which identifies an
 *                 object                                    in the Agile
 *                 system. Eg:- P00001    @referencedObjKey   -  It is the
 *                 key which uniquely identifies an object
 *                 in the external system. Eg:- 12|4567
 *                 @warningResolution  -  Specifies the warning resolution
 *                 Id for any possible warning
 *                 message in the delete Object webservice operation.
 *                 @options            -  Optional name-value pair reserved
 *                 for addressing any special
 *                 handling.    @inputParameters    -  Optional name,value
 *                 pair for addressing future requirements.                 
 * 
 * <p>Java class for AgileDeleteObjectRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileDeleteObjectRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencedObjKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningResolution" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningResolutionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AgileDeleteObjectRequest", propOrder = {
    "classIdentifier",
    "objectNumber",
    "referencedObjKey",
    "warningResolution",
    "options",
    "inputParameters"
})
public class AgileDeleteObjectRequest {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String objectNumber;
    protected String referencedObjKey;
    @XmlElement(nillable = true)
    protected List<AgileWarningResolutionType> warningResolution;
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
     * Gets the value of the warningResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWarningResolutionType }
     * 
     * 
     */
    public List<AgileWarningResolutionType> getWarningResolution() {
        if (warningResolution == null) {
            warningResolution = new ArrayList<AgileWarningResolutionType>();
        }
        return this.warningResolution;
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
