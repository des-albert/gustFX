
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *              AgileWorkFlowIdentifierType
 *                 is used to identify a workflow in the Agile PLM to which
 *                 a particular object may be assigned.                @id
 *                 -  Refers to the unique identification integer with
 *                 which an                                     Agile
 *                 workflow is identified.             @workFlowName
 *                 -  Refers to the name of the Agile workflow which along
 *                 with its                                     id together
 *                 constitutes an AgileWorkFlowIdentifierType.             
 * 
 * <p>Java class for AgileWorkFlowIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgileWorkFlowIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workFlowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgileWorkFlowIdentifierType", propOrder = {
    "id",
    "workFlowName"
})
public class AgileWorkFlowIdentifierType {

    @XmlElement(nillable = true)
    protected Integer id;
    @XmlElement(nillable = true)
    protected String workFlowName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the workFlowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkFlowName() {
        return workFlowName;
    }

    /**
     * Sets the value of the workFlowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkFlowName(String value) {
        this.workFlowName = value;
    }

}
