
package com.agile.ws.schema.metadata.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'getAutoNumber' web service are of this
 *                 type.    This request identifies the details for
 *                 autonumber to be retrieved.
 *                 @classIdentifier     -  ClassIdentifier is for
 *                 determining the type of object whose
 *                 autonumber is being retrieved. The input could be a
 *                 number                                       as defined
 *                 in one of the constant files in SDK or the APIName
 *                 of the class.                                      Eg:-
 *                 ChangeConstants.CLASS_ECO.toString() or "ECO"
 *                 @includeAllAutoNumberSource -  Set this to 'true' to
 *                 include all autonumber sources.
 *                 @autoNumberIdentifier  -  This value is used to identify
 *                 a unique autoNumber source.             @size
 *                 -  The number of autonumbers to be retrieved
 *                 @inputParameters -  Optional name,value pair for
 *                 addressing future requirement.                
 * 
 * <p>Java class for AgileGetAutoNumbersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetAutoNumbersRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includeAllAutoNumberSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoNumberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "AgileGetAutoNumbersRequestType", propOrder = {
    "classIdentifier",
    "includeAllAutoNumberSource",
    "autoNumberIdentifier",
    "size",
    "inputParameters"
})
public class AgileGetAutoNumbersRequestType {

    @XmlElement(required = true, nillable = true)
    protected String classIdentifier;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean includeAllAutoNumberSource;
    @XmlElement(nillable = true)
    protected List<String> autoNumberIdentifier;
    @XmlElement(nillable = true)
    protected Integer size;
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
     * Gets the value of the includeAllAutoNumberSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllAutoNumberSource() {
        return includeAllAutoNumberSource;
    }

    /**
     * Sets the value of the includeAllAutoNumberSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllAutoNumberSource(Boolean value) {
        this.includeAllAutoNumberSource = value;
    }

    /**
     * Gets the value of the autoNumberIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoNumberIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoNumberIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutoNumberIdentifier() {
        if (autoNumberIdentifier == null) {
            autoNumberIdentifier = new ArrayList<String>();
        }
        return this.autoNumberIdentifier;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
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
