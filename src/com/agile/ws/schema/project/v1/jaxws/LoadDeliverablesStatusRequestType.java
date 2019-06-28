
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *                  Request object for the
 *                 'loadDeliverablesStatus' operation. It  contains an
 *                 element of AgileObjectIdentifierType named
 *                 projectIdentifier for which the
 *                 deliverable status is loaded.
 *                 @projectIdentifier          -   An element of
 *                 projectIdentifiers of type
 *                 AgileRemoveBaselineRequestType.
 *                 Details of the 'loadProjects' webservice operation are
 *                 specified in these
 *                 projectIdentifiers.             
 * 
 * <p>Java class for LoadDeliverablesStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadDeliverablesStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifier" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="includeAllLevels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadDeliverablesStatusRequestType", propOrder = {
    "projectIdentifier",
    "includeAllLevels"
})
public class LoadDeliverablesStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true)
    protected AgileObjectIdentifierType projectIdentifier;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean includeAllLevels;

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setProjectIdentifier(AgileObjectIdentifierType value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the includeAllLevels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllLevels() {
        return includeAllLevels;
    }

    /**
     * Sets the value of the includeAllLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllLevels(Boolean value) {
        this.includeAllLevels = value;
    }

}
