
package com.agile.ws.schema.project.v1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.agile.ws.schema.common.v1.jaxws.AgileListEntryType;
import com.agile.ws.schema.common.v1.jaxws.AgileMoneyType;


/**
 * <p>Java class for TaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType"/>
 *         &lt;element name="actualCapitalExpenses" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="actualDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualDurationVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualDurationVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualFinishVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualFinishVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualFixedCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="actualFlexCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="actualLaborCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="actualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualStartVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actualTimeInDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="auditScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="budgetedCapitalExpenses" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="budgetedFixedCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="budgetedFlexCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="budgetedLaborCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="budgetedTimeInDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="calculateCapitalCostActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateCapitalCostBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateCapitalCostEAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFixedCostActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFixedCostBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFixedCostEAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFlexCostActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFlexCostBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculateFlexCostEAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="category10" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category7" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category8" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category9" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category11" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category12" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category13" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category14" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category15" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category16" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category17" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category18" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category19" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category20" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category21" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category22" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category23" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="category24" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="programs" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="costStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="costStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdFromTemplate" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="daysEffort" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="delegatedOwner" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="deliverablesStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}DeliverablesStatusType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="durationType" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="estimatedCapitalExpensesToCompletion" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="estimatedDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedDurationVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedDurationVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedFinishVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedFinishVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedFixedCostToCompletion" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="estimatedFlexCostToCompletion" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="estimatedLaborCostToCompletion" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="estimatedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedStartVarianceCalendarDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedStartVarianceWorkDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="estimatedTimeToCompletion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="global" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="launchYear" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="leaf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockedFromProgram" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="lockStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockUser" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overallStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PLMReference" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="productLine" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="projectKeywords" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="projectState" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="projectType" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="qualityStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="qualityStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}ProjectListType" minOccurs="0"/>
 *         &lt;element name="resourceStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="resourceStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceType" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="rollupHealthStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rootParent" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}AgileObjectIdentifierType" minOccurs="0"/>
 *         &lt;element name="scheduleDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scheduleEditor" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="scheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scheduleStatus" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="scheduleStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="statusType" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="totalActualCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="totalBudgetedCost" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="totalEstimatedCostToCompletion" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileMoneyType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="weightedScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="workflow" type="{http://xmlns.oracle.com/AgileObjects/Core/Common/V1}AgileListEntryType" minOccurs="0"/>
 *         &lt;element name="pageTwo" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}FlexType" minOccurs="0"/>
 *         &lt;element name="pageThree" type="{http://xmlns.oracle.com/AgileObjects/Core/Project/V1}FlexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskType", propOrder = {
    "taskId",
    "actualCapitalExpenses",
    "actualDuration",
    "actualDurationVarianceCalendarDays",
    "actualDurationVarianceWorkDays",
    "actualEndDate",
    "actualFinishVarianceCalendarDays",
    "actualFinishVarianceWorkDays",
    "actualFixedCost",
    "actualFlexCost",
    "actualLaborCost",
    "actualStartDate",
    "actualStartVarianceCalendarDays",
    "actualStartVarianceWorkDays",
    "actualTimeInDays",
    "archived",
    "auditScore",
    "budgetedCapitalExpenses",
    "budgetedFixedCost",
    "budgetedFlexCost",
    "budgetedLaborCost",
    "budgetedTimeInDays",
    "calculateCapitalCostActual",
    "calculateCapitalCostBudget",
    "calculateCapitalCostEAC",
    "calculateFixedCostActual",
    "calculateFixedCostBudget",
    "calculateFixedCostEAC",
    "calculateFlexCostActual",
    "calculateFlexCostBudget",
    "calculateFlexCostEAC",
    "category10",
    "category7",
    "category8",
    "category9",
    "category11",
    "category12",
    "category13",
    "category14",
    "category15",
    "category16",
    "category17",
    "category18",
    "category19",
    "category20",
    "category21",
    "category22",
    "category23",
    "category24",
    "programs",
    "costStatus",
    "costStatusReason",
    "createdFromTemplate",
    "critical",
    "customer",
    "daysEffort",
    "delegatedOwner",
    "deliverablesStatus",
    "description",
    "division",
    "durationType",
    "estimatedCapitalExpensesToCompletion",
    "estimatedDuration",
    "estimatedDurationVarianceCalendarDays",
    "estimatedDurationVarianceWorkDays",
    "estimatedEndDate",
    "estimatedFinishVarianceCalendarDays",
    "estimatedFinishVarianceWorkDays",
    "estimatedFixedCostToCompletion",
    "estimatedFlexCostToCompletion",
    "estimatedLaborCostToCompletion",
    "estimatedStartDate",
    "estimatedStartVarianceCalendarDays",
    "estimatedStartVarianceWorkDays",
    "estimatedTimeToCompletion",
    "global",
    "launchYear",
    "leaf",
    "lockedFromProgram",
    "lockStatus",
    "lockUser",
    "name",
    "number",
    "overallStatus",
    "owner",
    "parent",
    "percentComplete",
    "plmReference",
    "productLine",
    "projectKeywords",
    "projectState",
    "projectType",
    "qualityStatus",
    "qualityStatusReason",
    "region",
    "resourceStatus",
    "resourceStatusReason",
    "resourceType",
    "rollupHealthStatus",
    "rootParent",
    "scheduleDuration",
    "scheduleEditor",
    "scheduleEndDate",
    "scheduleStartDate",
    "scheduleStatus",
    "scheduleStatusReason",
    "status",
    "statusType",
    "totalActualCost",
    "totalBudgetedCost",
    "totalEstimatedCostToCompletion",
    "type",
    "weight",
    "weightedScore",
    "workflow",
    "pageTwo",
    "pageThree"
})
public class TaskType {

    @XmlElement(required = true)
    protected AgileObjectIdentifierType taskId;
    protected AgileMoneyType actualCapitalExpenses;
    protected Long actualDuration;
    protected Long actualDurationVarianceCalendarDays;
    protected Long actualDurationVarianceWorkDays;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualEndDate;
    protected Long actualFinishVarianceCalendarDays;
    protected Long actualFinishVarianceWorkDays;
    protected AgileMoneyType actualFixedCost;
    protected AgileMoneyType actualFlexCost;
    protected AgileMoneyType actualLaborCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartDate;
    protected Long actualStartVarianceCalendarDays;
    protected Long actualStartVarianceWorkDays;
    protected Long actualTimeInDays;
    protected Boolean archived;
    protected Integer auditScore;
    protected AgileMoneyType budgetedCapitalExpenses;
    protected AgileMoneyType budgetedFixedCost;
    protected AgileMoneyType budgetedFlexCost;
    protected AgileMoneyType budgetedLaborCost;
    protected Long budgetedTimeInDays;
    protected Boolean calculateCapitalCostActual;
    protected Boolean calculateCapitalCostBudget;
    protected Boolean calculateCapitalCostEAC;
    protected Boolean calculateFixedCostActual;
    protected Boolean calculateFixedCostBudget;
    protected Boolean calculateFixedCostEAC;
    protected Boolean calculateFlexCostActual;
    protected Boolean calculateFlexCostBudget;
    protected Boolean calculateFlexCostEAC;
    protected ProjectListType category10;
    protected ProjectListType category7;
    protected ProjectListType category8;
    protected ProjectListType category9;
    protected ProjectListType category11;
    protected ProjectListType category12;
    protected ProjectListType category13;
    protected ProjectListType category14;
    protected ProjectListType category15;
    protected ProjectListType category16;
    protected ProjectListType category17;
    protected ProjectListType category18;
    protected ProjectListType category19;
    protected ProjectListType category20;
    protected ProjectListType category21;
    protected ProjectListType category22;
    protected ProjectListType category23;
    protected ProjectListType category24;
    protected ProjectListType programs;
    protected AgileListEntryType costStatus;
    protected String costStatusReason;
    protected AgileObjectIdentifierType createdFromTemplate;
    protected Boolean critical;
    protected ProjectListType customer;
    protected Long daysEffort;
    protected AgileObjectIdentifierType delegatedOwner;
    protected DeliverablesStatusType deliverablesStatus;
    protected String description;
    protected ProjectListType division;
    protected AgileListEntryType durationType;
    protected AgileMoneyType estimatedCapitalExpensesToCompletion;
    protected Long estimatedDuration;
    protected Long estimatedDurationVarianceCalendarDays;
    protected Long estimatedDurationVarianceWorkDays;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedEndDate;
    protected Long estimatedFinishVarianceCalendarDays;
    protected Long estimatedFinishVarianceWorkDays;
    protected AgileMoneyType estimatedFixedCostToCompletion;
    protected AgileMoneyType estimatedFlexCostToCompletion;
    protected AgileMoneyType estimatedLaborCostToCompletion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedStartDate;
    protected Long estimatedStartVarianceCalendarDays;
    protected Long estimatedStartVarianceWorkDays;
    protected Long estimatedTimeToCompletion;
    protected Boolean global;
    protected ProjectListType launchYear;
    protected Boolean leaf;
    protected AgileObjectIdentifierType lockedFromProgram;
    protected Boolean lockStatus;
    protected AgileObjectIdentifierType lockUser;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String number;
    protected AgileListEntryType overallStatus;
    protected AgileObjectIdentifierType owner;
    protected AgileObjectIdentifierType parent;
    protected Integer percentComplete;
    @XmlElement(name = "PLMReference")
    protected ProjectListType plmReference;
    protected ProjectListType productLine;
    protected AgileListEntryType projectKeywords;
    @XmlElement(required = true)
    protected AgileListEntryType projectState;
    protected ProjectListType projectType;
    protected AgileListEntryType qualityStatus;
    protected String qualityStatusReason;
    protected ProjectListType region;
    protected AgileListEntryType resourceStatus;
    protected String resourceStatusReason;
    protected AgileListEntryType resourceType;
    protected Boolean rollupHealthStatus;
    protected AgileObjectIdentifierType rootParent;
    protected Long scheduleDuration;
    protected AgileListEntryType scheduleEditor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleStartDate;
    protected AgileListEntryType scheduleStatus;
    protected String scheduleStatusReason;
    @XmlElement(required = true, nillable = true)
    protected AgileListEntryType status;
    @XmlElement(required = true)
    protected AgileListEntryType statusType;
    protected AgileMoneyType totalActualCost;
    protected AgileMoneyType totalBudgetedCost;
    protected AgileMoneyType totalEstimatedCostToCompletion;
    @XmlElement(required = true)
    protected AgileListEntryType type;
    protected Double weight;
    protected Double weightedScore;
    protected AgileListEntryType workflow;
    protected FlexType pageTwo;
    protected FlexType pageThree;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setTaskId(AgileObjectIdentifierType value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the actualCapitalExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getActualCapitalExpenses() {
        return actualCapitalExpenses;
    }

    /**
     * Sets the value of the actualCapitalExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setActualCapitalExpenses(AgileMoneyType value) {
        this.actualCapitalExpenses = value;
    }

    /**
     * Gets the value of the actualDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualDuration() {
        return actualDuration;
    }

    /**
     * Sets the value of the actualDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualDuration(Long value) {
        this.actualDuration = value;
    }

    /**
     * Gets the value of the actualDurationVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualDurationVarianceCalendarDays() {
        return actualDurationVarianceCalendarDays;
    }

    /**
     * Sets the value of the actualDurationVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualDurationVarianceCalendarDays(Long value) {
        this.actualDurationVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the actualDurationVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualDurationVarianceWorkDays() {
        return actualDurationVarianceWorkDays;
    }

    /**
     * Sets the value of the actualDurationVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualDurationVarianceWorkDays(Long value) {
        this.actualDurationVarianceWorkDays = value;
    }

    /**
     * Gets the value of the actualEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndDate() {
        return actualEndDate;
    }

    /**
     * Sets the value of the actualEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndDate(XMLGregorianCalendar value) {
        this.actualEndDate = value;
    }

    /**
     * Gets the value of the actualFinishVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualFinishVarianceCalendarDays() {
        return actualFinishVarianceCalendarDays;
    }

    /**
     * Sets the value of the actualFinishVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualFinishVarianceCalendarDays(Long value) {
        this.actualFinishVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the actualFinishVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualFinishVarianceWorkDays() {
        return actualFinishVarianceWorkDays;
    }

    /**
     * Sets the value of the actualFinishVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualFinishVarianceWorkDays(Long value) {
        this.actualFinishVarianceWorkDays = value;
    }

    /**
     * Gets the value of the actualFixedCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getActualFixedCost() {
        return actualFixedCost;
    }

    /**
     * Sets the value of the actualFixedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setActualFixedCost(AgileMoneyType value) {
        this.actualFixedCost = value;
    }

    /**
     * Gets the value of the actualFlexCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getActualFlexCost() {
        return actualFlexCost;
    }

    /**
     * Sets the value of the actualFlexCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setActualFlexCost(AgileMoneyType value) {
        this.actualFlexCost = value;
    }

    /**
     * Gets the value of the actualLaborCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getActualLaborCost() {
        return actualLaborCost;
    }

    /**
     * Sets the value of the actualLaborCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setActualLaborCost(AgileMoneyType value) {
        this.actualLaborCost = value;
    }

    /**
     * Gets the value of the actualStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartDate() {
        return actualStartDate;
    }

    /**
     * Sets the value of the actualStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartDate(XMLGregorianCalendar value) {
        this.actualStartDate = value;
    }

    /**
     * Gets the value of the actualStartVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualStartVarianceCalendarDays() {
        return actualStartVarianceCalendarDays;
    }

    /**
     * Sets the value of the actualStartVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualStartVarianceCalendarDays(Long value) {
        this.actualStartVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the actualStartVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualStartVarianceWorkDays() {
        return actualStartVarianceWorkDays;
    }

    /**
     * Sets the value of the actualStartVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualStartVarianceWorkDays(Long value) {
        this.actualStartVarianceWorkDays = value;
    }

    /**
     * Gets the value of the actualTimeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActualTimeInDays() {
        return actualTimeInDays;
    }

    /**
     * Sets the value of the actualTimeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActualTimeInDays(Long value) {
        this.actualTimeInDays = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the auditScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditScore() {
        return auditScore;
    }

    /**
     * Sets the value of the auditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditScore(Integer value) {
        this.auditScore = value;
    }

    /**
     * Gets the value of the budgetedCapitalExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getBudgetedCapitalExpenses() {
        return budgetedCapitalExpenses;
    }

    /**
     * Sets the value of the budgetedCapitalExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setBudgetedCapitalExpenses(AgileMoneyType value) {
        this.budgetedCapitalExpenses = value;
    }

    /**
     * Gets the value of the budgetedFixedCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getBudgetedFixedCost() {
        return budgetedFixedCost;
    }

    /**
     * Sets the value of the budgetedFixedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setBudgetedFixedCost(AgileMoneyType value) {
        this.budgetedFixedCost = value;
    }

    /**
     * Gets the value of the budgetedFlexCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getBudgetedFlexCost() {
        return budgetedFlexCost;
    }

    /**
     * Sets the value of the budgetedFlexCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setBudgetedFlexCost(AgileMoneyType value) {
        this.budgetedFlexCost = value;
    }

    /**
     * Gets the value of the budgetedLaborCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getBudgetedLaborCost() {
        return budgetedLaborCost;
    }

    /**
     * Sets the value of the budgetedLaborCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setBudgetedLaborCost(AgileMoneyType value) {
        this.budgetedLaborCost = value;
    }

    /**
     * Gets the value of the budgetedTimeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetedTimeInDays() {
        return budgetedTimeInDays;
    }

    /**
     * Sets the value of the budgetedTimeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetedTimeInDays(Long value) {
        this.budgetedTimeInDays = value;
    }

    /**
     * Gets the value of the calculateCapitalCostActual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateCapitalCostActual() {
        return calculateCapitalCostActual;
    }

    /**
     * Sets the value of the calculateCapitalCostActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateCapitalCostActual(Boolean value) {
        this.calculateCapitalCostActual = value;
    }

    /**
     * Gets the value of the calculateCapitalCostBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateCapitalCostBudget() {
        return calculateCapitalCostBudget;
    }

    /**
     * Sets the value of the calculateCapitalCostBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateCapitalCostBudget(Boolean value) {
        this.calculateCapitalCostBudget = value;
    }

    /**
     * Gets the value of the calculateCapitalCostEAC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateCapitalCostEAC() {
        return calculateCapitalCostEAC;
    }

    /**
     * Sets the value of the calculateCapitalCostEAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateCapitalCostEAC(Boolean value) {
        this.calculateCapitalCostEAC = value;
    }

    /**
     * Gets the value of the calculateFixedCostActual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFixedCostActual() {
        return calculateFixedCostActual;
    }

    /**
     * Sets the value of the calculateFixedCostActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFixedCostActual(Boolean value) {
        this.calculateFixedCostActual = value;
    }

    /**
     * Gets the value of the calculateFixedCostBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFixedCostBudget() {
        return calculateFixedCostBudget;
    }

    /**
     * Sets the value of the calculateFixedCostBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFixedCostBudget(Boolean value) {
        this.calculateFixedCostBudget = value;
    }

    /**
     * Gets the value of the calculateFixedCostEAC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFixedCostEAC() {
        return calculateFixedCostEAC;
    }

    /**
     * Sets the value of the calculateFixedCostEAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFixedCostEAC(Boolean value) {
        this.calculateFixedCostEAC = value;
    }

    /**
     * Gets the value of the calculateFlexCostActual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFlexCostActual() {
        return calculateFlexCostActual;
    }

    /**
     * Sets the value of the calculateFlexCostActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFlexCostActual(Boolean value) {
        this.calculateFlexCostActual = value;
    }

    /**
     * Gets the value of the calculateFlexCostBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFlexCostBudget() {
        return calculateFlexCostBudget;
    }

    /**
     * Sets the value of the calculateFlexCostBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFlexCostBudget(Boolean value) {
        this.calculateFlexCostBudget = value;
    }

    /**
     * Gets the value of the calculateFlexCostEAC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateFlexCostEAC() {
        return calculateFlexCostEAC;
    }

    /**
     * Sets the value of the calculateFlexCostEAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateFlexCostEAC(Boolean value) {
        this.calculateFlexCostEAC = value;
    }

    /**
     * Gets the value of the category10 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory10() {
        return category10;
    }

    /**
     * Sets the value of the category10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory10(ProjectListType value) {
        this.category10 = value;
    }

    /**
     * Gets the value of the category7 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory7() {
        return category7;
    }

    /**
     * Sets the value of the category7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory7(ProjectListType value) {
        this.category7 = value;
    }

    /**
     * Gets the value of the category8 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory8() {
        return category8;
    }

    /**
     * Sets the value of the category8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory8(ProjectListType value) {
        this.category8 = value;
    }

    /**
     * Gets the value of the category9 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory9() {
        return category9;
    }

    /**
     * Sets the value of the category9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory9(ProjectListType value) {
        this.category9 = value;
    }

    /**
     * Gets the value of the category11 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory11() {
        return category11;
    }

    /**
     * Sets the value of the category11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory11(ProjectListType value) {
        this.category11 = value;
    }

    /**
     * Gets the value of the category12 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory12() {
        return category12;
    }

    /**
     * Sets the value of the category12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory12(ProjectListType value) {
        this.category12 = value;
    }

    /**
     * Gets the value of the category13 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory13() {
        return category13;
    }

    /**
     * Sets the value of the category13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory13(ProjectListType value) {
        this.category13 = value;
    }

    /**
     * Gets the value of the category14 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory14() {
        return category14;
    }

    /**
     * Sets the value of the category14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory14(ProjectListType value) {
        this.category14 = value;
    }

    /**
     * Gets the value of the category15 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory15() {
        return category15;
    }

    /**
     * Sets the value of the category15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory15(ProjectListType value) {
        this.category15 = value;
    }

    /**
     * Gets the value of the category16 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory16() {
        return category16;
    }

    /**
     * Sets the value of the category16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory16(ProjectListType value) {
        this.category16 = value;
    }

    /**
     * Gets the value of the category17 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory17() {
        return category17;
    }

    /**
     * Sets the value of the category17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory17(ProjectListType value) {
        this.category17 = value;
    }

    /**
     * Gets the value of the category18 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory18() {
        return category18;
    }

    /**
     * Sets the value of the category18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory18(ProjectListType value) {
        this.category18 = value;
    }

    /**
     * Gets the value of the category19 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory19() {
        return category19;
    }

    /**
     * Sets the value of the category19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory19(ProjectListType value) {
        this.category19 = value;
    }

    /**
     * Gets the value of the category20 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory20() {
        return category20;
    }

    /**
     * Sets the value of the category20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory20(ProjectListType value) {
        this.category20 = value;
    }

    /**
     * Gets the value of the category21 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory21() {
        return category21;
    }

    /**
     * Sets the value of the category21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory21(ProjectListType value) {
        this.category21 = value;
    }

    /**
     * Gets the value of the category22 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory22() {
        return category22;
    }

    /**
     * Sets the value of the category22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory22(ProjectListType value) {
        this.category22 = value;
    }

    /**
     * Gets the value of the category23 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory23() {
        return category23;
    }

    /**
     * Sets the value of the category23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory23(ProjectListType value) {
        this.category23 = value;
    }

    /**
     * Gets the value of the category24 property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCategory24() {
        return category24;
    }

    /**
     * Sets the value of the category24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCategory24(ProjectListType value) {
        this.category24 = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setPrograms(ProjectListType value) {
        this.programs = value;
    }

    /**
     * Gets the value of the costStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getCostStatus() {
        return costStatus;
    }

    /**
     * Sets the value of the costStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setCostStatus(AgileListEntryType value) {
        this.costStatus = value;
    }

    /**
     * Gets the value of the costStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostStatusReason() {
        return costStatusReason;
    }

    /**
     * Sets the value of the costStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostStatusReason(String value) {
        this.costStatusReason = value;
    }

    /**
     * Gets the value of the createdFromTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getCreatedFromTemplate() {
        return createdFromTemplate;
    }

    /**
     * Sets the value of the createdFromTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setCreatedFromTemplate(AgileObjectIdentifierType value) {
        this.createdFromTemplate = value;
    }

    /**
     * Gets the value of the critical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCritical(Boolean value) {
        this.critical = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setCustomer(ProjectListType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the daysEffort property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysEffort() {
        return daysEffort;
    }

    /**
     * Sets the value of the daysEffort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysEffort(Long value) {
        this.daysEffort = value;
    }

    /**
     * Gets the value of the delegatedOwner property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getDelegatedOwner() {
        return delegatedOwner;
    }

    /**
     * Sets the value of the delegatedOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setDelegatedOwner(AgileObjectIdentifierType value) {
        this.delegatedOwner = value;
    }

    /**
     * Gets the value of the deliverablesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverablesStatusType }
     *     
     */
    public DeliverablesStatusType getDeliverablesStatus() {
        return deliverablesStatus;
    }

    /**
     * Sets the value of the deliverablesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverablesStatusType }
     *     
     */
    public void setDeliverablesStatus(DeliverablesStatusType value) {
        this.deliverablesStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setDivision(ProjectListType value) {
        this.division = value;
    }

    /**
     * Gets the value of the durationType property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getDurationType() {
        return durationType;
    }

    /**
     * Sets the value of the durationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setDurationType(AgileListEntryType value) {
        this.durationType = value;
    }

    /**
     * Gets the value of the estimatedCapitalExpensesToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getEstimatedCapitalExpensesToCompletion() {
        return estimatedCapitalExpensesToCompletion;
    }

    /**
     * Sets the value of the estimatedCapitalExpensesToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setEstimatedCapitalExpensesToCompletion(AgileMoneyType value) {
        this.estimatedCapitalExpensesToCompletion = value;
    }

    /**
     * Gets the value of the estimatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Sets the value of the estimatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedDuration(Long value) {
        this.estimatedDuration = value;
    }

    /**
     * Gets the value of the estimatedDurationVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedDurationVarianceCalendarDays() {
        return estimatedDurationVarianceCalendarDays;
    }

    /**
     * Sets the value of the estimatedDurationVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedDurationVarianceCalendarDays(Long value) {
        this.estimatedDurationVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the estimatedDurationVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedDurationVarianceWorkDays() {
        return estimatedDurationVarianceWorkDays;
    }

    /**
     * Sets the value of the estimatedDurationVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedDurationVarianceWorkDays(Long value) {
        this.estimatedDurationVarianceWorkDays = value;
    }

    /**
     * Gets the value of the estimatedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedEndDate() {
        return estimatedEndDate;
    }

    /**
     * Sets the value of the estimatedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedEndDate(XMLGregorianCalendar value) {
        this.estimatedEndDate = value;
    }

    /**
     * Gets the value of the estimatedFinishVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedFinishVarianceCalendarDays() {
        return estimatedFinishVarianceCalendarDays;
    }

    /**
     * Sets the value of the estimatedFinishVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedFinishVarianceCalendarDays(Long value) {
        this.estimatedFinishVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the estimatedFinishVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedFinishVarianceWorkDays() {
        return estimatedFinishVarianceWorkDays;
    }

    /**
     * Sets the value of the estimatedFinishVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedFinishVarianceWorkDays(Long value) {
        this.estimatedFinishVarianceWorkDays = value;
    }

    /**
     * Gets the value of the estimatedFixedCostToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getEstimatedFixedCostToCompletion() {
        return estimatedFixedCostToCompletion;
    }

    /**
     * Sets the value of the estimatedFixedCostToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setEstimatedFixedCostToCompletion(AgileMoneyType value) {
        this.estimatedFixedCostToCompletion = value;
    }

    /**
     * Gets the value of the estimatedFlexCostToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getEstimatedFlexCostToCompletion() {
        return estimatedFlexCostToCompletion;
    }

    /**
     * Sets the value of the estimatedFlexCostToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setEstimatedFlexCostToCompletion(AgileMoneyType value) {
        this.estimatedFlexCostToCompletion = value;
    }

    /**
     * Gets the value of the estimatedLaborCostToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getEstimatedLaborCostToCompletion() {
        return estimatedLaborCostToCompletion;
    }

    /**
     * Sets the value of the estimatedLaborCostToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setEstimatedLaborCostToCompletion(AgileMoneyType value) {
        this.estimatedLaborCostToCompletion = value;
    }

    /**
     * Gets the value of the estimatedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedStartDate() {
        return estimatedStartDate;
    }

    /**
     * Sets the value of the estimatedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedStartDate(XMLGregorianCalendar value) {
        this.estimatedStartDate = value;
    }

    /**
     * Gets the value of the estimatedStartVarianceCalendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedStartVarianceCalendarDays() {
        return estimatedStartVarianceCalendarDays;
    }

    /**
     * Sets the value of the estimatedStartVarianceCalendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedStartVarianceCalendarDays(Long value) {
        this.estimatedStartVarianceCalendarDays = value;
    }

    /**
     * Gets the value of the estimatedStartVarianceWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedStartVarianceWorkDays() {
        return estimatedStartVarianceWorkDays;
    }

    /**
     * Sets the value of the estimatedStartVarianceWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedStartVarianceWorkDays(Long value) {
        this.estimatedStartVarianceWorkDays = value;
    }

    /**
     * Gets the value of the estimatedTimeToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedTimeToCompletion() {
        return estimatedTimeToCompletion;
    }

    /**
     * Sets the value of the estimatedTimeToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedTimeToCompletion(Long value) {
        this.estimatedTimeToCompletion = value;
    }

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobal(Boolean value) {
        this.global = value;
    }

    /**
     * Gets the value of the launchYear property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getLaunchYear() {
        return launchYear;
    }

    /**
     * Sets the value of the launchYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setLaunchYear(ProjectListType value) {
        this.launchYear = value;
    }

    /**
     * Gets the value of the leaf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeaf() {
        return leaf;
    }

    /**
     * Sets the value of the leaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeaf(Boolean value) {
        this.leaf = value;
    }

    /**
     * Gets the value of the lockedFromProgram property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getLockedFromProgram() {
        return lockedFromProgram;
    }

    /**
     * Sets the value of the lockedFromProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setLockedFromProgram(AgileObjectIdentifierType value) {
        this.lockedFromProgram = value;
    }

    /**
     * Gets the value of the lockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockStatus() {
        return lockStatus;
    }

    /**
     * Sets the value of the lockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockStatus(Boolean value) {
        this.lockStatus = value;
    }

    /**
     * Gets the value of the lockUser property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getLockUser() {
        return lockUser;
    }

    /**
     * Sets the value of the lockUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setLockUser(AgileObjectIdentifierType value) {
        this.lockUser = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setOverallStatus(AgileListEntryType value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setOwner(AgileObjectIdentifierType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setParent(AgileObjectIdentifierType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the percentComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the percentComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentComplete(Integer value) {
        this.percentComplete = value;
    }

    /**
     * Gets the value of the plmReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getPLMReference() {
        return plmReference;
    }

    /**
     * Sets the value of the plmReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setPLMReference(ProjectListType value) {
        this.plmReference = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setProductLine(ProjectListType value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the projectKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getProjectKeywords() {
        return projectKeywords;
    }

    /**
     * Sets the value of the projectKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setProjectKeywords(AgileListEntryType value) {
        this.projectKeywords = value;
    }

    /**
     * Gets the value of the projectState property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getProjectState() {
        return projectState;
    }

    /**
     * Sets the value of the projectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setProjectState(AgileListEntryType value) {
        this.projectState = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setProjectType(ProjectListType value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the qualityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getQualityStatus() {
        return qualityStatus;
    }

    /**
     * Sets the value of the qualityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setQualityStatus(AgileListEntryType value) {
        this.qualityStatus = value;
    }

    /**
     * Gets the value of the qualityStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityStatusReason() {
        return qualityStatusReason;
    }

    /**
     * Sets the value of the qualityStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityStatusReason(String value) {
        this.qualityStatusReason = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setRegion(ProjectListType value) {
        this.region = value;
    }

    /**
     * Gets the value of the resourceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getResourceStatus() {
        return resourceStatus;
    }

    /**
     * Sets the value of the resourceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setResourceStatus(AgileListEntryType value) {
        this.resourceStatus = value;
    }

    /**
     * Gets the value of the resourceStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceStatusReason() {
        return resourceStatusReason;
    }

    /**
     * Sets the value of the resourceStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceStatusReason(String value) {
        this.resourceStatusReason = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setResourceType(AgileListEntryType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the rollupHealthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollupHealthStatus() {
        return rollupHealthStatus;
    }

    /**
     * Sets the value of the rollupHealthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollupHealthStatus(Boolean value) {
        this.rollupHealthStatus = value;
    }

    /**
     * Gets the value of the rootParent property.
     * 
     * @return
     *     possible object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public AgileObjectIdentifierType getRootParent() {
        return rootParent;
    }

    /**
     * Sets the value of the rootParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileObjectIdentifierType }
     *     
     */
    public void setRootParent(AgileObjectIdentifierType value) {
        this.rootParent = value;
    }

    /**
     * Gets the value of the scheduleDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleDuration() {
        return scheduleDuration;
    }

    /**
     * Sets the value of the scheduleDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleDuration(Long value) {
        this.scheduleDuration = value;
    }

    /**
     * Gets the value of the scheduleEditor property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getScheduleEditor() {
        return scheduleEditor;
    }

    /**
     * Sets the value of the scheduleEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setScheduleEditor(AgileListEntryType value) {
        this.scheduleEditor = value;
    }

    /**
     * Gets the value of the scheduleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Sets the value of the scheduleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleEndDate(XMLGregorianCalendar value) {
        this.scheduleEndDate = value;
    }

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleStartDate(XMLGregorianCalendar value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the scheduleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getScheduleStatus() {
        return scheduleStatus;
    }

    /**
     * Sets the value of the scheduleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setScheduleStatus(AgileListEntryType value) {
        this.scheduleStatus = value;
    }

    /**
     * Gets the value of the scheduleStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleStatusReason() {
        return scheduleStatusReason;
    }

    /**
     * Sets the value of the scheduleStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleStatusReason(String value) {
        this.scheduleStatusReason = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setStatus(AgileListEntryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusType property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of the statusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setStatusType(AgileListEntryType value) {
        this.statusType = value;
    }

    /**
     * Gets the value of the totalActualCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getTotalActualCost() {
        return totalActualCost;
    }

    /**
     * Sets the value of the totalActualCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setTotalActualCost(AgileMoneyType value) {
        this.totalActualCost = value;
    }

    /**
     * Gets the value of the totalBudgetedCost property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getTotalBudgetedCost() {
        return totalBudgetedCost;
    }

    /**
     * Sets the value of the totalBudgetedCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setTotalBudgetedCost(AgileMoneyType value) {
        this.totalBudgetedCost = value;
    }

    /**
     * Gets the value of the totalEstimatedCostToCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link AgileMoneyType }
     *     
     */
    public AgileMoneyType getTotalEstimatedCostToCompletion() {
        return totalEstimatedCostToCompletion;
    }

    /**
     * Sets the value of the totalEstimatedCostToCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileMoneyType }
     *     
     */
    public void setTotalEstimatedCostToCompletion(AgileMoneyType value) {
        this.totalEstimatedCostToCompletion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setType(AgileListEntryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightedScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeightedScore() {
        return weightedScore;
    }

    /**
     * Sets the value of the weightedScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeightedScore(Double value) {
        this.weightedScore = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link AgileListEntryType }
     *     
     */
    public AgileListEntryType getWorkflow() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgileListEntryType }
     *     
     */
    public void setWorkflow(AgileListEntryType value) {
        this.workflow = value;
    }

    /**
     * Gets the value of the pageTwo property.
     * 
     * @return
     *     possible object is
     *     {@link FlexType }
     *     
     */
    public FlexType getPageTwo() {
        return pageTwo;
    }

    /**
     * Sets the value of the pageTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexType }
     *     
     */
    public void setPageTwo(FlexType value) {
        this.pageTwo = value;
    }

    /**
     * Gets the value of the pageThree property.
     * 
     * @return
     *     possible object is
     *     {@link FlexType }
     *     
     */
    public FlexType getPageThree() {
        return pageThree;
    }

    /**
     * Sets the value of the pageThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexType }
     *     
     */
    public void setPageThree(FlexType value) {
        this.pageThree = value;
    }

}
