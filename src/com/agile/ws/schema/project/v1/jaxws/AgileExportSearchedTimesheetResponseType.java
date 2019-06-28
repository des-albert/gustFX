
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgileExportSearchedTimesheetResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileExportSearchedTimesheetResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileExportSearchedTimesheetResponseType", propOrder = {
    "fullFileName"
})
public class AgileExportSearchedTimesheetResponseType {

    @XmlElement(nillable = true)
    protected String fullFileName;

    /**
     * Gets the value of the fullFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullFileName() {
        return fullFileName;
    }

    /**
     * Sets the value of the fullFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullFileName(String value) {
        this.fullFileName = value;
    }

}
