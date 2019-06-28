
package com.agile.ws.schema.project.v1.jaxws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Calendars are used to define standard
 *                 working and                                non-working
 *                 times. Projects must have one base
 *                 calendar. Tasks and resources may have their own
 *                 non-base calendars which are based on a base                                calendar.
 * 
 * <p>Java class for CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseCalendarUID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="weekDays" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}WeekDaysType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarType", propOrder = {
    "uid",
    "name",
    "baseCalendar",
    "baseCalendarUID",
    "weekDays"
})
public class CalendarType {

    @XmlElement(required = true)
    protected BigInteger uid;
    protected String name;
    protected Boolean baseCalendar;
    protected BigInteger baseCalendarUID;
    protected WeekDaysType weekDays;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUid(BigInteger value) {
        this.uid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the baseCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaseCalendar() {
        return baseCalendar;
    }

    /**
     * Sets the value of the baseCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseCalendar(Boolean value) {
        this.baseCalendar = value;
    }

    /**
     * Gets the value of the baseCalendarUID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaseCalendarUID() {
        return baseCalendarUID;
    }

    /**
     * Sets the value of the baseCalendarUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaseCalendarUID(BigInteger value) {
        this.baseCalendarUID = value;
    }

    /**
     * Gets the value of the weekDays property.
     * 
     * @return
     *     possible object is
     *     {@link WeekDaysType }
     *     
     */
    public WeekDaysType getWeekDays() {
        return weekDays;
    }

    /**
     * Sets the value of the weekDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekDaysType }
     *     
     */
    public void setWeekDays(WeekDaysType value) {
        this.weekDays = value;
    }

}
