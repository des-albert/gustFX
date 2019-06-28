
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;


/**
 * <p>Java class for DependencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predecessorTaskId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="successorTaskId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="timeBuffer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="externalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependencyType", propOrder = {
    "predecessorTaskId",
    "successorTaskId",
    "timeBuffer",
    "type",
    "externalFlag"
})
public class DependencyType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType predecessorTaskId;
    @XmlElement(required = true)
    protected AgileObjectIdentifierType successorTaskId;
    protected Long timeBuffer;
    @XmlElement(required = true)
    protected AgileListEntryType type;
    protected Boolean externalFlag;

    /**
     * Gets the value of the predecessorTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getPredecessorTaskId() {
        return predecessorTaskId;
    }

    /**
     * Sets the value of the predecessorTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setPredecessorTaskId(AgileObjectIdentifierType value) {
        this.predecessorTaskId = value;
    }

    /**
     * Gets the value of the successorTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getSuccessorTaskId() {
        return successorTaskId;
    }

    /**
     * Sets the value of the successorTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setSuccessorTaskId(AgileObjectIdentifierType value) {
        this.successorTaskId = value;
    }

    /**
     * Gets the value of the timeBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeBuffer() {
        return timeBuffer;
    }

    /**
     * Sets the value of the timeBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeBuffer(Long value) {
        this.timeBuffer = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setType(AgileListEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the externalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalFlag() {
        return externalFlag;
    }

    /**
     * Sets the value of the externalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalFlag(Boolean value) {
        this.externalFlag = value;
    }

}
