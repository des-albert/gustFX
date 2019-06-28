
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Response object for the
 *                 'getCalendar' operation. It contains an element
 *                 agileCalendar which holds complete information about a
 *                 calendar retrieved              by the web service.
 *                 @agileCalendar       -  An element of type AgileCType,
 *                 agileObject holds the
 *                 details about an object retrieved by the webservice.
 *                 These                                     details
 *                 include object and table information.
 *                 @outputParameters    -  Optional name,value pair for
 *                 addressing future requirements.    
 * 
 * <p>Java class for AgileGetCalendarResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileGetCalendarResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agileCalendar" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}PPMCalendarType" minOccurs="0"/>
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
@XmlType(name = "AgileGetCalendarResponseType", propOrder = {
    "agileCalendar",
    "outputParameters"
})
public class AgileGetCalendarResponseType {

    @XmlElement(nillable = true)
    protected PPMCalendarType agileCalendar;
    @XmlElement(nillable = true)
    protected List<PropertyListType> outputParameters;

    /**
     * Gets the value of the agileCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link PPMCalendarType }
     *     
     */
    public PPMCalendarType getAgileCalendar() {
        return agileCalendar;
    }

    /**
     * Sets the value of the agileCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPMCalendarType }
     *     
     */
    public void setAgileCalendar(PPMCalendarType value) {
        this.agileCalendar = value;
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
