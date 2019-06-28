
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
 *                 'queryGetSearchableClasses' operation. It retrieves the
 *                 list of              Searchable
 *                 BaseClasses/Classes/SubClasses for which the user has
 *                 privilege.             @onlyBaseClasses     - This field
 *                 if set to true, it retrives only the list of base
 *                 classes for which the user  has search privilege. This
 *                 take precedence over the 'classIdentifier' element if
 *                 this field is set to true.             @classIdentifier
 *                 -  This field represents the baseclass/class value whose
 *                 children the user has privilege to search. This field is
 *                 nillable, so if you do not pass any value, it retrieves
 *                 the list of all the classes(base class, class and sub
 *                 class) for which user has search privilege. For this to
 *                 work, set the 'onlyBaseClasses' element to false.
 *                 @inputParameters -  Optional name,value pair for
 *                 addressing future requirements.             
 * 
 * <p>Java class for GetSearchableClassesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSearchableClassesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="onlyBaseClasses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="classIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetSearchableClassesRequestType", propOrder = {
    "onlyBaseClasses",
    "classIdentifier",
    "inputParameters"
})
public class GetSearchableClassesRequestType
    extends AbstractRequestType
{

    @XmlElement(nillable = true)
    protected Boolean onlyBaseClasses;
    @XmlElement(nillable = true)
    protected String classIdentifier;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the onlyBaseClasses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyBaseClasses() {
        return onlyBaseClasses;
    }

    /**
     * Sets the value of the onlyBaseClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyBaseClasses(Boolean value) {
        this.onlyBaseClasses = value;
    }

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
