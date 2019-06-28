
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.PropertyListType;


/**
 *               Each of the batched
 *                 requests for the 'reschedule' web service are of this
 *                 type.                         This request identifies
 *                 the project to be delegated and the user to whom the
 *                 ownership                         is assigned.
 *                 @projectIdentifier  -   It is the unique Object number
 *                 which identifies a project in the Agile system. Eg:-
 *                 T00012
 *                 @inputParameters     -  Optional name,value pair for
 *                 addressing future requirements.                                                         
 * 
 * <p>Java class for AgileRescheduleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileRescheduleRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rescheduleType" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}RescheduleType" minOccurs="0"/>
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
@XmlType(name = "AgileRescheduleRequestType", propOrder = {
    "projectIdentifier",
    "rescheduleType",
    "inputParameters"
})
public class AgileRescheduleRequestType {

    @XmlElement(required = true, nillable = true)
    protected String projectIdentifier;
    @XmlElement(nillable = true)
    protected RescheduleType rescheduleType;
    @XmlElement(nillable = true)
    protected List<PropertyListType> inputParameters;

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the rescheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link RescheduleType }
     *     
     */
    public RescheduleType getRescheduleType() {
        return rescheduleType;
    }

    /**
     * Sets the value of the rescheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RescheduleType }
     *     
     */
    public void setRescheduleType(RescheduleType value) {
        this.rescheduleType = value;
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
