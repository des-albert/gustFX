
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *              Request object for the
 *                 'createCalendar' operation. It contains information
 *                 about the Project Object and the name by which the new
 *                 baseline needs to be created. Baselines can only be
 *                 created on a root project.
 *                 @name             -  It is the unique Object name which
 *                 identifies a calendar.             @description      -
 *                 It specifies the description of the calendar needs to be
 *                 created.             @createFrom       -  It specifies
 *                 template calendar based on which the new one is created.
 *                 The default value will be "Default Calendar"
 *                 which cannot be deleted in Agile system.
 *                 @enabled          -  It specifies if this calendar is
 *                 active or not.             @workWeekSetting  -  It
 *                 specifies the which days of a week are the working days.
 *                 Note that for this parameter customers need to pass in
 *                 the non-working days.          eg. If working days are
 *                 from Mon to Fri then customers need to pass in
 *                 "1,7".          1 - Sun          2 - Mon
 *                 3 - Tue          4 - Wed          5 - Thu          6 -
 *                 Fri          7 - Sat    @inputParameters  - reserve for
 *                 future features                                  
 * 
 * <p>Java class for AgileCreateCalendarRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileCreateCalendarRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workWeekSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AgileCreateCalendarRequestType", propOrder = {
    "name",
    "description",
    "createFrom",
    "enabled",
    "workWeekSetting",
    "inputParameters"
})
public class AgileCreateCalendarRequestType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String description;
    protected String createFrom;
    @XmlElement(required = true)
    protected String enabled;
    @XmlElement(nillable = true)
    protected String workWeekSetting;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the createFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateFrom() {
        return createFrom;
    }

    /**
     * Sets the value of the createFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateFrom(String value) {
        this.createFrom = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the workWeekSetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkWeekSetting() {
        return workWeekSetting;
    }

    /**
     * Sets the value of the workWeekSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkWeekSetting(String value) {
        this.workWeekSetting = value;
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
