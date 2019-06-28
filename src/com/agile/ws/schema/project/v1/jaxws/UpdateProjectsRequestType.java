
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 * <p>Java class for UpdateProjectsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProjectsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="projects" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectsType"/>
 *         &lt;element name="canceledActivitiesProcessingPreference" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProjectsRequestType", propOrder = {
    "projects",
    "canceledActivitiesProcessingPreference"
})
public class UpdateProjectsRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true)
    protected ProjectsType projects;
    @XmlElement(nillable = true)
    protected Integer canceledActivitiesProcessingPreference;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectsType }
     *     
     */
    public ProjectsType getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectsType }
     *     
     */
    public void setProjects(ProjectsType value) {
        this.projects = value;
    }

    /**
     * Gets the value of the canceledActivitiesProcessingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCanceledActivitiesProcessingPreference() {
        return canceledActivitiesProcessingPreference;
    }

    /**
     * Sets the value of the canceledActivitiesProcessingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCanceledActivitiesProcessingPreference(Integer value) {
        this.canceledActivitiesProcessingPreference = value;
    }

}
