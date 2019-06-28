
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractResponseType;


/**
 *                  Response object for
 *                 'loadProjects' operation. It contains an element
 *                 projects holding an array of ProjectsType.
 *                 @projects                   -   An array of projects of
 *                 type ProjectsType             
 * 
 * <p>Java class for LoadProjectsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadProjectsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="projects" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadProjectsResponseType", propOrder = {
    "projects"
})
public class LoadProjectsResponseType
    extends AbstractResponseType
{

    protected ProjectsType projects;

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

}
