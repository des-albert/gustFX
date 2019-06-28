
package com.agile.ws.schema.project.v1.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateProjectsStatusesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProjectsStatusesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateProjectStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}UpdateProjectStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProjectsStatusesType", propOrder = {
    "updateProjectStatus"
})
public class UpdateProjectsStatusesType {

    protected List<UpdateProjectStatusType> updateProjectStatus;

    /**
     * Gets the value of the updateProjectStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateProjectStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateProjectStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateProjectStatusType }
     * 
     * 
     */
    public List<UpdateProjectStatusType> getUpdateProjectStatus() {
        if (updateProjectStatus == null) {
            updateProjectStatus = new ArrayList<UpdateProjectStatusType>();
        }
        return this.updateProjectStatus;
    }

}
