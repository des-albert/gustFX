
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 * <p>Java class for ValidateProjectsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateProjectsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="validateProjectsStatuses" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ValidateProjectsStatusesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateProjectsResponseType", propOrder = {
    "validateProjectsStatuses"
})
public class ValidateProjectsResponseType
    extends AbstractResponseType
{

    protected ValidateProjectsStatusesType validateProjectsStatuses;

    /**
     * Gets the value of the validateProjectsStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProjectsStatusesType }
     *     
     */
    public ValidateProjectsStatusesType getValidateProjectsStatuses() {
        return validateProjectsStatuses;
    }

    /**
     * Sets the value of the validateProjectsStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProjectsStatusesType }
     *     
     */
    public void setValidateProjectsStatuses(ValidateProjectsStatusesType value) {
        this.validateProjectsStatuses = value;
    }

}
