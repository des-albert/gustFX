
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.project.v1.jaxws.AssignUsersFromPoolResponseType;
import com.agile.ws.schema.project.v1.jaxws.CreateBaselineResponseType;
import com.agile.ws.schema.project.v1.jaxws.CreateCalendarResponseType;
import com.agile.ws.schema.project.v1.jaxws.DelegateOwnershipResponseType;
import com.agile.ws.schema.project.v1.jaxws.ExportSearchedTimesheetResponseType;
import com.agile.ws.schema.project.v1.jaxws.ExportToAXMLResponseType;
import com.agile.ws.schema.project.v1.jaxws.GetBaselinesResponseType;
import com.agile.ws.schema.project.v1.jaxws.GetCalendarResponseType;
import com.agile.ws.schema.project.v1.jaxws.IsLockedResponseType;
import com.agile.ws.schema.project.v1.jaxws.LoadDeliverablesStatusResponseType;
import com.agile.ws.schema.project.v1.jaxws.LoadProjectsResponseType;
import com.agile.ws.schema.project.v1.jaxws.LogOrChangeTimesheetResponseType;
import com.agile.ws.schema.project.v1.jaxws.RemoveBaselineResponseType;
import com.agile.ws.schema.project.v1.jaxws.RemoveCalendarResponseType;
import com.agile.ws.schema.project.v1.jaxws.RescheduleResponseType;
import com.agile.ws.schema.project.v1.jaxws.RetrieveTimesheetResponseType;
import com.agile.ws.schema.project.v1.jaxws.SetLockResponseType;
import com.agile.ws.schema.project.v1.jaxws.SubstituteResourceResponseType;
import com.agile.ws.schema.project.v1.jaxws.UpdateCalendarResponseType;
import com.agile.ws.schema.project.v1.jaxws.UpdateProjectsResponseType;
import com.agile.ws.schema.project.v1.jaxws.ValidateProjectsResponseType;


/**
 *              AbstractResponseType is a
 *                 response type that uses AgileResponseHeaderType as a
 *                 base.             
 * 
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileResponseHeaderType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseType")
@XmlSeeAlso({
    CreateCalendarResponseType.class,
    UpdateCalendarResponseType.class,
    UpdateProjectsResponseType.class,
    RemoveCalendarResponseType.class,
    CreateBaselineResponseType.class,
    ExportSearchedTimesheetResponseType.class,
    AssignUsersFromPoolResponseType.class,
    RetrieveTimesheetResponseType.class,
    ExportToAXMLResponseType.class,
    SubstituteResourceResponseType.class,
    GetCalendarResponseType.class,
    SetLockResponseType.class,
    IsLockedResponseType.class,
    LogOrChangeTimesheetResponseType.class,
    RemoveBaselineResponseType.class,
    ValidateProjectsResponseType.class,
    LoadDeliverablesStatusResponseType.class,
    RescheduleResponseType.class,
    DelegateOwnershipResponseType.class,
    GetBaselinesResponseType.class,
    LoadProjectsResponseType.class
})
public class AbstractResponseType
    extends AgileResponseHeaderType
{


}
