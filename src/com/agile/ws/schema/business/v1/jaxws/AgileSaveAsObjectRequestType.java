
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
 *               Each of the batched
 *                 requests for the 'saveAsObject' web service are of this
 *                 type.    This request identifies the object and its
 *                 information to be saved by the web service.
 *                 @parentClassIdentifier-    parentClassIdentifier is for
 *                 determining the type of the
 *                 original object which will be saved. The input could be
 *                 a                                        number as
 *                 defined in one of the constant files in SDK or
 *                 the APIName of the class.
 *                 Eg:- ChangeConstants.CLASS_ECO.toString() or
 *                 "ECO"             @parentObjectNumber     -
 *                 It is the unique Object number which identifies an
 *                 object                                        in the
 *                 Agile system, in this case, the parent object.
 *                 Eg:- P00001             @newClassIdentifier     -
 *                 ClassIdentifier is for determining the type of the new
 *                 object                                        which will
 *                 be saved from the parent object. The input could be
 *                 a number as defined in one of the constant files in SDK
 *                 or the                                        APIName of
 *                 the class.                                         Eg:-
 *                 ChangeConstants.CLASS_ECO.toString() or "ECO"
 *                 @autoNumberSource       -  Refers to the pre-determined
 *                 autonumber for the particular
 *                 class type, which may be passed through this field.
 *                 @tablesToCopy           -  Refers to certain tables
 *                 which are to be copied. This option is
 *                 specific to PPM.             @applyToChildren        -
 *                 Set this to 'true' to apply the properties to children.
 *                 This option is  specific to PPM.             @options
 *                 -  Optional name-value pair reserved for addressing any
 *                 special handling.      For PPM Create from Template the
 *                 property name "clone_deliverables"       needs
 *                 to be set as true.      @inputParameters -  Optional
 *                 name,value pair for addressing future requirements.                      
 * 
 * <p>Java class for AgileSaveAsObjectRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileSaveAsObjectRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentObjectNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRowType" minOccurs="0"/>
 *         &lt;element name="autoNumberSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tablesToCopy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applyToChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AgileSaveAsObjectRequestType", propOrder = {
    "parentClassIdentifier",
    "parentObjectNumber",
    "newClassIdentifier",
    "data",
    "autoNumberSource",
    "tablesToCopy",
    "applyToChildren",
    "options",
    "inputParameters"
})
public class AgileSaveAsObjectRequestType {

    @XmlElement(required = true, nillable = true)
    protected String parentClassIdentifier;
    @XmlElement(required = true, nillable = true)
    protected String parentObjectNumber;
    @XmlElement(required = true, nillable = true)
    protected String newClassIdentifier;
    @XmlElement(nillable = true)
    protected AgileRowType data;
    @XmlElement(nillable = true)
    protected String autoNumberSource;
    @XmlElement(nillable = true)
    protected List<String> tablesToCopy;
    @XmlElement(nillable = true)
    protected Boolean applyToChildren;
    @XmlElement(nillable = true)
    protected List<PropertyType> options;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the parentClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentClassIdentifier() {
        return parentClassIdentifier;
    }

    /**
     * Sets the value of the parentClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentClassIdentifier(String value) {
        this.parentClassIdentifier = value;
    }

    /**
     * Gets the value of the parentObjectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentObjectNumber() {
        return parentObjectNumber;
    }

    /**
     * Sets the value of the parentObjectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentObjectNumber(String value) {
        this.parentObjectNumber = value;
    }

    /**
     * Gets the value of the newClassIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewClassIdentifier() {
        return newClassIdentifier;
    }

    /**
     * Sets the value of the newClassIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewClassIdentifier(String value) {
        this.newClassIdentifier = value;
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
     * Gets the value of the tablesToCopy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablesToCopy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablesToCopy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTablesToCopy() {
        if (tablesToCopy == null) {
            tablesToCopy = new ArrayList<String>();
        }
        return this.tablesToCopy;
    }

    /**
     * Gets the value of the applyToChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Sets the value of the applyToChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChildren(Boolean value) {
        this.applyToChildren = value;
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
