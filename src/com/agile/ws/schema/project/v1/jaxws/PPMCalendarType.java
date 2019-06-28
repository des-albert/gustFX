
package com.agile.ws.schema.project.v1.jaxws;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for the
 *                 'getCalendar' operation. It contains an element
 *                 agileCalendar which holds complete information about a
 *                 calendar retrieved              by the web service.
 *                 @calendarIdentifier       -  identifier of the returned
 *                 calendar    @exceptionDays     -  elements of
 *                 exceptionDayType    @outputParameters    -  Optional
 *                 name,value pair for addressing future requirements.    
 * 
 * <p>Java class for PPMCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PPMCalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendarId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="calendarName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exceptionDays" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}exceptionDayType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PPMCalendarType", propOrder = {
    "calendarId",
    "calendarName",
    "any",
    "exceptionDays",
    "outputParameters"
})
public class PPMCalendarType {

    @XmlElement(required = true, nillable = true)
    protected BigInteger calendarId;
    @XmlElement(required = true, nillable = true)
    protected String calendarName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    protected List<ExceptionDayType> exceptionDays;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the calendarId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalendarId() {
        return calendarId;
    }

    /**
     * Sets the value of the calendarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalendarId(BigInteger value) {
        this.calendarId = value;
    }

    /**
     * Gets the value of the calendarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * Sets the value of the calendarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarName(String value) {
        this.calendarName = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the exceptionDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExceptionDayType }
     * 
     * 
     */
    public List<ExceptionDayType> getExceptionDays() {
        if (exceptionDays == null) {
            exceptionDays = new ArrayList<ExceptionDayType>();
        }
        return this.exceptionDays;
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
