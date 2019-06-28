
package com.agile.ws.schema.common.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.agile.ws.schema.project.v1.jaxws.AssignUsersFromPoolRequestType;
import com.agile.ws.schema.project.v1.jaxws.CreateBaselineRequestType;
import com.agile.ws.schema.project.v1.jaxws.CreateCalendarRequestType;
import com.agile.ws.schema.project.v1.jaxws.DelegateOwnershipRequestType;
import com.agile.ws.schema.project.v1.jaxws.ExportSearchedTimesheetRequestType;
import com.agile.ws.schema.project.v1.jaxws.ExportToAXMLRequestType;
import com.agile.ws.schema.project.v1.jaxws.GetBaselinesRequestType;
import com.agile.ws.schema.project.v1.jaxws.GetCalendarRequestType;
import com.agile.ws.schema.project.v1.jaxws.IsLockedRequestType;
import com.agile.ws.schema.project.v1.jaxws.LoadDeliverablesStatusRequestType;
import com.agile.ws.schema.project.v1.jaxws.LoadProjectsRequestType;
import com.agile.ws.schema.project.v1.jaxws.LogOrChangeTimesheetRequestType;
import com.agile.ws.schema.project.v1.jaxws.RemoveBaselineRequestType;
import com.agile.ws.schema.project.v1.jaxws.RemoveCalendarRequestType;
import com.agile.ws.schema.project.v1.jaxws.RescheduleRequestType;
import com.agile.ws.schema.project.v1.jaxws.RetrieveTimesheetRequestType;
import com.agile.ws.schema.project.v1.jaxws.SetLockRequestType;
import com.agile.ws.schema.project.v1.jaxws.SubstituteResourceRequestType;
import com.agile.ws.schema.project.v1.jaxws.UpdateCalendarRequestType;
import com.agile.ws.schema.project.v1.jaxws.UpdateProjectsRequestType;
import com.agile.ws.schema.project.v1.jaxws.ValidateProjectsRequestType;


/**
 *              AbstractRequestType is a
 *                 request type that uses AgileRequestHeaderType as a base.             
 * 
 * <p>Java class for AbstractRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileRequestHeaderType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestType")
@XmlSeeAlso({
    GetBaselinesRequestType.class,
    CreateCalendarRequestType.class,
    ExportSearchedTimesheetRequestType.class,
    RemoveBaselineRequestType.class,
    CreateBaselineRequestType.class,
    DelegateOwnershipRequestType.class,
    GetCalendarRequestType.class,
    RescheduleRequestType.class,
    IsLockedRequestType.class,
    RetrieveTimesheetRequestType.class,
    UpdateCalendarRequestType.class,
    LoadDeliverablesStatusRequestType.class,
    SetLockRequestType.class,
    ValidateProjectsRequestType.class,
    ExportToAXMLRequestType.class,
    SubstituteResourceRequestType.class,
    AssignUsersFromPoolRequestType.class,
    UpdateProjectsRequestType.class,
    LogOrChangeTimesheetRequestType.class,
    RemoveCalendarRequestType.class,
    LoadProjectsRequestType.class
})
public class AbstractRequestType
    extends AgileRequestHeaderType
{


}
