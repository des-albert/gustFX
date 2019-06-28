
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.common.v1.jaxws.AbstractRequestType;


/**
 *                  Request object for the
 *                 'loadProjects' operation. It contains an array of
 *                 AgileObjectIdentifierType named projectIdentifiers to
 *                 load multiple projects.
 *                 @projectIdentifiers         -   An array of
 *                 projectIdentifiers of type
 *                 AgileRemoveBaselineRequestType.
 *                 Details of the 'loadProjects' webservice operation are
 *                 specified in
 *                 these projectIdentifiers.             
 * 
 * <p>Java class for LoadProjectsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadProjectsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="projectIdentifiers" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadProjectsRequestType", propOrder = {
    "projectIdentifiers"
})
public class LoadProjectsRequestType
    extends AbstractRequestType
{

    @XmlElement(required = true)
    protected List<AgileObjectIdentifierType> projectIdentifiers;

    /**
     * Gets the value of the projectIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgileObjectIdentifierType }
     * 
     * 
     */
    public List<AgileObjectIdentifierType> getProjectIdentifiers() {
        if (projectIdentifiers == null) {
            projectIdentifiers = new ArrayList<AgileObjectIdentifierType>();
        }
        return this.projectIdentifiers;
    }

}
