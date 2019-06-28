
package com.agile.ws.schema.collaboration.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileExceptionType;
import com.agile.ws.schema.common.v1.jaxws.AgileWarningType;
import com.agile.ws.schema.common.v1.jaxws.ObjectIdentifierType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for the
 *                 actual result of the audit routable operation
 *                 webservice.              It contains an elements that
 *                 identify the Agile object under question and also
 *                 populates a list of errors and warnings.
 *                 @identifier         -  This field is an object
 *                 identifier, providng information about
 *                 the object with which the webservice operation was
 *                 performed.             @error              -  The
 *                 element 'error' is of AgileExceptionType, describing a
 *                 list                                    of exceptions
 *                 thrown during execution of the webservice operation.
 *                 @warning            -  The element 'warning' is of
 *                 AgileWarningType, describing a list
 *                 of warnings encountered during execution of the
 *                 webservice operation.    @outputParameters -  Optional
 *                 name,value pair for addressing future requirements.              
 * 
 * <p>Java class for AgileAuditRObjectResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileAuditRObjectResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}ObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="error" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileExceptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warning" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileWarningType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}PropertyListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileAuditRObjectResponseType", propOrder = {
    "identifier",
    "error",
    "warning",
    "outputParameters"
})
public class AgileAuditRObjectResponseType {

    @XmlElement(nillable = true)
    protected ObjectIdentifierType identifier;
    @XmlElement(nillable = true)
    protected List<AgileExceptionType> error;
    @XmlElement(nillable = true)
    protected List<AgileWarningType> warning;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setIdentifier(ObjectIdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileExceptionType }
     * 
     * 
     */
    public List<AgileExceptionType> getError() {
        if (error == null) {
            error = new ArrayList<AgileExceptionType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileWarningType }
     * 
     * 
     */
    public List<AgileWarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<AgileWarningType>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyListType }
     * 
     * 
     */
    public List<PropertyListType> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<PropertyListType>();
        }
        return this.outputParameters;
    }

}
