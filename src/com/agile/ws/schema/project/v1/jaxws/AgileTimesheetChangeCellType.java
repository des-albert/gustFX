
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *      This request includes the info of
 *                 cells to be changed.                                                    
 * 
 * <p>Java class for AgileTimesheetChangeCellType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileTimesheetChangeCellType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileTimesheetChangeCellType", propOrder = {
    "dayOfWeek",
    "hours"
})
public class AgileTimesheetChangeCellType {

    protected int dayOfWeek;
    protected int hours;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     */
    public void setDayOfWeek(int value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

}
