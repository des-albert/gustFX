
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeekDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dayWorking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timePeriod" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="workingTimes" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}WorkingTimesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeekDayType", propOrder = {
    "dayType",
    "dayWorking",
    "timePeriod",
    "workingTimes"
})
public class WeekDayType {

    protected int dayType;
    protected Boolean dayWorking;
    protected TimePeriodType timePeriod;
    protected WorkingTimesType workingTimes;

    /**
     * Gets the value of the dayType property.
     * 
     */
    public int getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     */
    public void setDayType(int value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the dayWorking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayWorking() {
        return dayWorking;
    }

    /**
     * Sets the value of the dayWorking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayWorking(Boolean value) {
        this.dayWorking = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the workingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link WorkingTimesType }
     *     
     */
    public WorkingTimesType getWorkingTimes() {
        return workingTimes;
    }

    /**
     * Sets the value of the workingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingTimesType }
     *     
     */
    public void setWorkingTimes(WorkingTimesType value) {
        this.workingTimes = value;
    }

}
