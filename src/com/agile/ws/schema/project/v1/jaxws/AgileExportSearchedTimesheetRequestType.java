
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileUserUserGroupIdentifierType;


/**
 *       Each of the batched requests for
 *                 the 'exportSearchedTimesheet' web service are of this
 *                 type.     This request includes the search query and
 *                 exported path/filename.                                                     
 * 
 * <p>Java class for AgileExportSearchedTimesheetRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExportSearchedTimesheetRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="users" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileUserUserGroupIdentifierType" maxOccurs="unbounded"/>
 *         &lt;element name="programs" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" maxOccurs="unbounded"/>
 *         &lt;element name="fromYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fromMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fromDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="includeCheckbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileExportSearchedTimesheetRequestType", propOrder = {
    "users",
    "programs",
    "fromYear",
    "fromMonth",
    "fromDay",
    "endYear",
    "endMonth",
    "endDay",
    "includeCheckbox",
    "fileType",
    "filePath",
    "fileName"
})
public class AgileExportSearchedTimesheetRequestType {

    @XmlElement(required = true, nillable = true)
    protected List<AgileUserUserGroupIdentifierType> users;
    @XmlElement(required = true, nillable = true)
    protected List<AgileObjectIdentifierType> programs;
    @XmlElement(nillable = true)
    protected Integer fromYear;
    @XmlElement(nillable = true)
    protected Integer fromMonth;
    @XmlElement(nillable = true)
    protected Integer fromDay;
    @XmlElement(nillable = true)
    protected Integer endYear;
    @XmlElement(nillable = true)
    protected Integer endMonth;
    @XmlElement(nillable = true)
    protected Integer endDay;
    @XmlElement(defaultValue = "false", nillable = true)
    protected Boolean includeCheckbox;
    @XmlElement(nillable = true)
    protected String fileType;
    @XmlElement(nillable = true)
    protected String filePath;
    @XmlElement(nillable = true)
    protected String fileName;

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileUserUserGroupIdentifierType }
     * 
     * 
     */
    public List<AgileUserUserGroupIdentifierType> getUsers() {
        if (users == null) {
            users = new ArrayList<AgileUserUserGroupIdentifierType>();
        }
        return this.users;
    }

    /**
     * Gets the value of the programs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileObjectIdentifierType }
     * 
     * 
     */
    public List<AgileObjectIdentifierType> getPrograms() {
        if (programs == null) {
            programs = new ArrayList<AgileObjectIdentifierType>();
        }
        return this.programs;
    }

    /**
     * Gets the value of the fromYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromYear() {
        return fromYear;
    }

    /**
     * Sets the value of the fromYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromYear(Integer value) {
        this.fromYear = value;
    }

    /**
     * Gets the value of the fromMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromMonth() {
        return fromMonth;
    }

    /**
     * Sets the value of the fromMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromMonth(Integer value) {
        this.fromMonth = value;
    }

    /**
     * Gets the value of the fromDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromDay() {
        return fromDay;
    }

    /**
     * Sets the value of the fromDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromDay(Integer value) {
        this.fromDay = value;
    }

    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndYear(Integer value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the endMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndMonth() {
        return endMonth;
    }

    /**
     * Sets the value of the endMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndMonth(Integer value) {
        this.endMonth = value;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndDay(Integer value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the includeCheckbox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCheckbox() {
        return includeCheckbox;
    }

    /**
     * Sets the value of the includeCheckbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCheckbox(Boolean value) {
        this.includeCheckbox = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
