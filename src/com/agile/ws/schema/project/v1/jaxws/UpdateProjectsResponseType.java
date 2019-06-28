
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 * <p>Java class for UpdateProjectsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProjectsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="updateProjectsStatuses" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}UpdateProjectsStatusesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProjectsResponseType", propOrder = {
    "updateProjectsStatuses"
})
public class UpdateProjectsResponseType
    extends AbstractResponseType
{

    protected UpdateProjectsStatusesType updateProjectsStatuses;

    /**
     * Gets the value of the updateProjectsStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateProjectsStatusesType }
     *     
     */
    public UpdateProjectsStatusesType getUpdateProjectsStatuses() {
        return updateProjectsStatuses;
    }

    /**
     * Sets the value of the updateProjectsStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProjectsStatusesType }
     *     
     */
    public void setUpdateProjectsStatuses(UpdateProjectsStatusesType value) {
        this.updateProjectsStatuses = value;
    }

}
