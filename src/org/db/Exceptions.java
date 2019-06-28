package org.db;

import com.agile.ws.schema.collaboration.v1.jaxws.*;
import com.agile.ws.schema.common.v1.jaxws.AgileRowType;
import com.agile.ws.schema.common.v1.jaxws.AgileTableType;
import com.agile.ws.schema.common.v1.jaxws.ResponseStatusCode;
import com.agile.ws.schema.table.v1.jaxws.LoadTableRequestType;
import com.agile.ws.schema.table.v1.jaxws.LoadTableResponseType;
import com.agile.ws.schema.table.v1.jaxws.RequestTableType;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Exception__c;
import com.sforce.soap.enterprise.sobject.Opportunity;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.soap.enterprise.sobject.Task;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.w3c.dom.Element;

import static org.db.Base.connection;
import static org.db.Base.sfdcOwnerId;
import static org.db.Base.agileCollaborationStub;
import static org.db.Base.agileTableStub;

import static org.db.Shared.*;

import static org.apache.commons.lang3.StringUtils.chop;

public class Exceptions {
  @FXML
  Label labelStatus_Message;
  @FXML
  TableView<exDisplay> tableViewExceptions;
  @FXML
  Button buttonExceptionQuit;
  @FXML
  TableColumn<exDisplay, String> columnOpp, columnName, columnDate, columnStatus, columnNumber, columnAgileId,
      columnECO_MCO, columnApprovals, columnTask, columnCodes;

  private static ObservableList<exDisplay> exData = FXCollections.observableArrayList();
  private static int rowSelect, taskIndex;
  private Exception__c [] exception;
  private Task[] task;

  private static String exceptionId, taskId;
  static String exceptionName, agileId;
  private String taskSubject, taskStatus, changeStatus;
  private DateTimeFormatter dtf;


  private HashMap<String, String> mapOpportunity = new HashMap<>();
  private HashMap<String, Integer> mapTask = new HashMap<>();

  private final int EXCEPTION_LINK_COLUMN = 1;
  private final int EXCEPTION_STATUS_COLUMN = 3;

  public void initialize() {
    dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    columnOpp.setCellValueFactory(new PropertyValueFactory<>("exOpp"));
    columnName.setCellValueFactory(new PropertyValueFactory<>("exName"));
    columnDate.setCellValueFactory(new PropertyValueFactory<>("exDate"));
    columnStatus.setCellValueFactory(new PropertyValueFactory<>("exStatus"));
    columnNumber.setCellValueFactory(new PropertyValueFactory<>("exNumber"));
    columnAgileId.setCellValueFactory(new PropertyValueFactory<>("exAgileId"));
    columnECO_MCO.setCellValueFactory(new PropertyValueFactory<>("exECO_MCO"));
    columnApprovals.setCellValueFactory(new PropertyValueFactory<>("exApprovals"));
    columnTask.setCellValueFactory(new PropertyValueFactory<>("exTask"));
    columnCodes.setCellValueFactory(new PropertyValueFactory<>("exCodes"));

    tableSetup();
    if (load_exceptions()) {
      labelStatus_Message.setText("Exceptions Loaded");
      labelStatus_Message.getStyleClass().add("label-success");
    }

  }

  private void tableSetup() {
    columnName.setCellFactory(e -> new TableCell<>() {
      @Override
      public void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);
        if (item == null || empty)
          setText(null);

        else {
          setText(item);
          this.setStyle("-fx-text-fill: blue;");
        }
      }
    });

    columnTask.setCellFactory(e -> new TableCell<> () {
      @Override
      public void updateItem(String item, boolean empty) {

        super.updateItem(item, empty);
        if (item == null || empty)
          setText(null);
        else {
          setText(item);
          switch (item) {
            case "Prelim Not Started":
            case  "FA Not Started" :
              this.setStyle("-fx-text-fill: red;");
              break;
            case "Prelim In Progress":
            case "FA In Progress":
            case "Revision In Progress":
              this.setStyle("-fx-text-fill: orange;");
              break;
          }
        }
      }
    });

    /* Handle row selection */

    tableViewExceptions.getSelectionModel().setCellSelectionEnabled(true);
    ObservableList<TablePosition> selectedCells = tableViewExceptions.getSelectionModel().getSelectedCells();

    selectedCells.addListener((ListChangeListener<TablePosition>) change -> {
      TablePosition tablePosition = selectedCells.get(0);
      rowSelect = tablePosition.getRow();
      int column = tablePosition.getColumn();
      exceptionId = exception[rowSelect].getId();
      exceptionName = exception[rowSelect].getException_Number__c();
      agileId = exception[rowSelect].getAgile_Opportunity_ID__c();


      switch(column) {
        case EXCEPTION_LINK_COLUMN: {
          String link = "https://cray.my.salesforce.com/" + exceptionId;
          openWebpage(link);
        }
        break;

        case EXCEPTION_STATUS_COLUMN: {
          if (mapTask.containsKey(exceptionId)) {
            taskIndex = mapTask.get(exceptionId);

            taskId = task[taskIndex].getId();
            taskStatus = task[taskIndex].getStatus();
            taskSubject = task[taskIndex].getSubject();
            if (task[taskIndex].getStatus().equals("Not Started") ) {

              if(taskSubject.contains("Preliminary")) {

                /* Create Preliminary Custom Code */
                try {

                  FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("prelim.fxml"));
                  Parent prelimForm = fxmlFormLoader.load();
                  Stage prelimStage = new Stage();
                  prelimStage.setTitle("New Custom Code");
                  prelimStage.setScene(new Scene(prelimForm));
                  prelimStage.show();
                  prelimStage.setOnHiding(e -> updatePreliminaryStatus());
                } catch (IOException ex) {
                  labelStatus_Message.setText("preliminary FXML Loader Exception");
                  labelStatus_Message.getStyleClass().add("label-failure");
                }
              }
              else if (taskSubject.contains("FA")) {

                /* Change Custom Code to First Article ( FA ) */

                agileECO.itemText = exception[rowSelect].getAgile_ECO_MCO__c().substring(4);

                try {
                  FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("firstArticle.fxml"));
                  Parent firstArticleForm = fxmlFormLoader.load();
                  Stage faStage = new Stage();
                  faStage.setTitle("Promote Custom Code to first Article ");
                  faStage.setScene(new Scene(firstArticleForm, 600, 450));
                  faStage.show();
                  faStage.setOnHiding(e -> updateFirstArticleStatus());
                }
                catch (IOException ex) {
                  labelStatus_Message.setText("first Article FXML Loader Exception");
                  labelStatus_Message.getStyleClass().add("label-failure");
                }
              }
              else {

                try {
                  FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("revise.fxml"));
                  Parent reviseForm = fxmlFormLoader.load();
                  Stage reviseStage = new Stage();
                  reviseStage.setTitle("Revise Quote ");
                  reviseStage.setScene(new Scene(reviseForm, 925, 700));
                  reviseStage.show();
                  reviseStage.setOnHiding(e -> updateReviseStatus());
                }
                catch (IOException ex) {
                  labelStatus_Message.setText("Revision FXML Loader Exception");
                  labelStatus_Message.getStyleClass().add("label-failure");
                }


              }

            }
            else {
              Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
              alert.setTitle("Task Complete Confirmation");
              alert.setHeaderText("Exception Task");
              alert.setContentText("Change Task to Completed ?");

              Optional<ButtonType> result = alert.showAndWait();
              if (result.isPresent() ) {
                if (result.get() == ButtonType.OK) {
                  try {
                    Task updateTask = new Task();
                    updateTask.setId(taskId);
                    updateTask.setStatus("Completed");
                    if (updateTask.getDescription() == null)
                      updateTask.setDescription("Complete - " + dtf.format(LocalDateTime.now()));
                    else
                      updateTask.setDescription("Complete - " + dtf.format(LocalDateTime.now())
                          + "\n" + updateTask.getDescription());
                    connection.update(new SObject[]{updateTask});
                    exDisplay row = exData.get(rowSelect);
                    row.setExTask("Completed");
                    tableViewExceptions.refresh();

                  } catch (ConnectionException ex) {
                    labelStatus_Message.setText("Task Status Updated");
                    labelStatus_Message.getStyleClass().add("label-success");
                  }
                }
              }
            }

          }

        }
        break;
      }
    });


  }

  private void updatePreliminaryStatus() {
    if (agileECO.itemText != null) {
      StringBuilder quoteParts = new StringBuilder();
      try {
        Task updateTask = new Task();
        updateTask.setId(taskId);
        updateTask.setStatus("In Progress");
        updateTask.setDescription("ECO " + agileECO.itemText + " created - "
            + dtf.format(LocalDateTime.now()) + "\n");
        updateTask.setException_Agile_ECO_MCO__c("ECO " + agileECO.itemText);
        connection.update(new SObject[]{updateTask});

        for (agileItem item : customCodeList) {
          quoteParts.append(item.itemText);
          quoteParts.append("<br>");

        }
        Exception__c updateException = new Exception__c();
        updateException.setId(exceptionId);
        updateException.setAgile_ECO_MCO__c(agileECO.itemText);
        updateException.setQuoting_Instructions__c(quoteParts.toString());
        connection.update(new SObject[]{updateException});

        exDisplay row = exData.get(rowSelect);
        row.setExTask("In Progress");
        row.setExECO_MCO("ECO " + agileECO.itemText + " " +
            getKeyStatus(getChangeStatus(agileECO.itemText, "ECO")));
        row.setExCodes(quoteParts.toString());
        tableViewExceptions.refresh();

      } catch (ConnectionException ex) {
        labelStatus_Message.setText("update Preliminary Status Error");
        labelStatus_Message.getStyleClass().add("label-failure");
      }
    }
  }

  private void updateFirstArticleStatus() {
    if (agileMCO.itemText != null) {
      try {
        Task updateTask = new Task();
        updateTask.setId(taskId);
        updateTask.setStatus("In Progress");
        updateTask.setDescription("MCO " + agileMCO.itemText + " created - " +
                dtf.format(LocalDateTime.now()) + "\n");
        updateTask.setException_Agile_ECO_MCO__c("MCO " + agileMCO.itemText);
        connection.update(new SObject[]{updateTask});

        exDisplay row = exData.get(rowSelect);
        row.setExTask("In Progress");
        row.setExECO_MCO("MCO " + agileMCO.itemText + " " +
                  getKeyStatus(getChangeStatus(agileMCO.itemText, "MCO")));
        tableViewExceptions.refresh();

      } catch (ConnectionException ex) {
        labelStatus_Message.setText("update first Article Status Error");
        labelStatus_Message.getStyleClass().add("label-failure");
      }
    }
  }

  private void updateReviseStatus() {

  }
  private void openWebpage(String url) {
    try {
      Desktop desktop = java.awt.Desktop.getDesktop();
      desktop.browse(new URL(url).toURI());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void ButtonExceptionQuitOnAction() {
    Stage stage = (Stage) buttonExceptionQuit.getScene().getWindow();
    stage.close();
  }

  private boolean load_exceptions() {

    exData.clear();
    tableViewExceptions.setItems(exData);

    StringBuilder exQuery = new StringBuilder("SELECT Id, Name, Agile_ECO_MCO__c, Agile_Opportunity_ID__c, ");
    exQuery.append("Exception_Decision_Due__c, Opportunity_Name__c, Status__c, Exception_Number__c, ");
    exQuery.append("Quoting_Instructions__c FROM Exception__c WHERE (RecordTypeId = '0120b000000lBV8AAM' ");
    exQuery.append("OR RecordTypeId = '0120b000000ZhTWAA0')" );
    exQuery.append("AND Status__c <> 'Cancelled' AND Sales_Enablement_User__c = '");
    exQuery.append(sfdcOwnerId);
    exQuery.append("' AND Id in ('");

    StringBuilder taskQuery = new StringBuilder("SELECT Id, Exception_Agile_ECO_MCO__c, Status, Subject, WhatId ");
    taskQuery.append("FROM Task WHERE (Subject LIKE '%Preliminary' OR Subject LIKE '%FA' ");
    taskQuery.append("OR Subject LIKE '%Revision%' ) AND OwnerId = '");
    taskQuery.append(sfdcOwnerId);
    taskQuery.append("' AND (Status = 'Not Started' OR Status = 'In Progress')");
    taskQuery.append(" ORDER BY Subject");

    StringBuilder oppQuery = new StringBuilder("SELECT Id, Name FROM Opportunity WHERE Id IN ('");

    try {

      /* Exception Task Query */

      QueryResult tq = connection.query(taskQuery.toString());
      SObject[] taskRecords = tq.getRecords();

      if (tq.getSize() > 0) {
        task = new Task[taskRecords.length];
        for (int i = 0; i < taskRecords.length; i++) {
          task[i] = (Task) taskRecords[i];
          mapTask.put(task[i].getWhatId(), i);
          if (i == 0)
            exQuery.append(task[0].getWhatId());
          else {
            exQuery.append("', '");
            exQuery.append(task[i].getWhatId());
          }
        }

        exQuery.append("')");

        /* Exception Query */

        QueryResult exqr = connection.query(exQuery.toString());
        SObject[] exRecords = exqr.getRecords();
        exception = new Exception__c[exRecords.length];
        for (int i = 0; i < exRecords.length; i++) {
          exception[i] = (Exception__c) exRecords[i];
          if (i == 0)
            oppQuery.append(exception[0].getOpportunity_Name__c());
          else {
            oppQuery.append("', '");
            oppQuery.append(exception[i].getOpportunity_Name__c());
          }
        }

        oppQuery.append("')");

        /* Opportunity Query */

        QueryResult iq = connection.query(oppQuery.toString());
        SObject[] oppRecords = iq.getRecords();
        Opportunity[] opportunity = new Opportunity[oppRecords.length];


        for (int i = 0; i < oppRecords.length; i++) {
          opportunity[i] = (Opportunity) oppRecords[i];
          mapOpportunity.put(opportunity[i].getId(), opportunity[i].getName());

        }

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        for (int i = 0; i < exRecords.length; i++) {
          String approvers = null;
          taskIndex = mapTask.get(exception[i].getId());
          taskSubject = task[taskIndex].getSubject();
          taskStatus = task[taskIndex].getStatus();

          String taskECOMCO = task[taskIndex].getException_Agile_ECO_MCO__c();

          // Preliminary Code

          if (taskSubject.contains("Preliminary")) {

            taskStatus = "Prelim " + taskStatus;
            if (taskStatus.contains("In Progress")) {
              changeStatus = getChangeStatus(taskECOMCO.substring(4), "ECO");

              if (changeStatus != null) {
                taskECOMCO = taskECOMCO + "\n" + getKeyStatus(changeStatus);
              }
            }

            // FA Code

          } else if (taskSubject.contains("FA")) {

            taskStatus = "FA " + taskStatus;
            if (taskStatus.contains("In Progress")) {
              changeStatus = getChangeStatus(taskECOMCO.substring(4), "MCO");
              if (changeStatus != null) {
                taskECOMCO = taskECOMCO + "\n" + getKeyStatus(changeStatus);
                approvers = getChangeApprovers(getKeyId(changeStatus), "MCO");
              }
            }
            else {
              taskECOMCO = exception[i].getAgile_ECO_MCO__c();
            }

          } else {

            taskStatus = "Revision " + taskStatus;
            if (taskStatus.equals("In Progress")) {
              changeStatus = getChangeStatus(taskECOMCO.substring(4), "ECO");
              if (changeStatus != null) {
                taskECOMCO = taskECOMCO + "\n" + getKeyStatus(changeStatus);
                approvers = getChangeApprovers(getKeyId(changeStatus), "ECO");
              }
            }
            else {
              taskECOMCO = exception[i].getAgile_ECO_MCO__c();
            }
          }

          String instructions = exception[i].getQuoting_Instructions__c();
          if (instructions != null) {
            instructions = instructions.replaceAll("<br>", ",");
            instructions = chop(instructions);
          }
          if (!taskStatus.contains("Completed")) {
            exDisplay row = new exDisplay(
                mapOpportunity.get(exception[i].getOpportunity_Name__c()),
                exception[i].getName(),
                formatter.format(exception[i].getException_Decision_Due__c().getTime()),
                exception[i].getStatus__c(),
                exception[i].getException_Number__c(),
                exception[i].getAgile_Opportunity_ID__c(),
                taskECOMCO,
                approvers,
                taskStatus,
                instructions

            );
          exData.add(row);
          }
        }
        tableViewExceptions.refresh();
      }
    } catch (ConnectionException ce) {
      ce.printStackTrace();
    }
  
    return true;
  }
  
  private String MakeKey(String id, String status) {
      return id + '~' + status;
  }
  private String getKeyId(String a) {
      return a.substring(0, a.indexOf('~'));
  }
  private String getKeyStatus(String a)
  {
      return a.substring(a.indexOf('~') + 1);
  }
  
  /* find status of Agile PLM Change */

  private String getChangeStatus (String changeNumber, String changeType) {
      String changeStatus, objId;
      GetStatusRequestType getStatusRequestType = new GetStatusRequestType();
      AgileGetStatusRequestType agileGetStatusRequestType = new AgileGetStatusRequestType();

      agileGetStatusRequestType.setClassIdentifier(changeType);
      agileGetStatusRequestType.setObjectNumber(changeNumber);

      getStatusRequestType.getStatusRequest().add(agileGetStatusRequestType);
      GetStatusResponseType getStatusResponseType = agileCollaborationStub.getStatus(getStatusRequestType);
      if (getStatusResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
          AgileGetStatusResponseType response = getStatusResponseType.getStatusResponse().get(0);
          changeStatus = response.getCurrentStatus().getStatusDisplayName();
          objId =  response.getIdentifier().getObjectId().toString();

          AgileStatusType nextDefaultStatus = response.getNextDefaultStatus();
          if (nextDefaultStatus != null) {
              AgileStatusType[] nextValidStatuses = response.getNextStatus().toArray(new AgileStatusType[0]);
              for (AgileStatusType nextStatus : nextValidStatuses)
                  changeStatus = nextStatus.getStatusDisplayName();
          }
          return MakeKey(objId, changeStatus);
      }
      labelStatus_Message.setText("Change Status Request Error");
      labelStatus_Message.getStyleClass().add("label-failure");
      return null;
  }
  
  private String getChangeApprovers (String objNumber, String change) {
      String current, approvers;
      StringBuilder appStatus = new StringBuilder();

      RequestTableType table = new RequestTableType();
      table.setClassIdentifier(change);
      table.setObjectNumber(objNumber);
      table.setTableIdentifier("Workflow");

      LoadTableRequestType loadTableRequestType = new LoadTableRequestType();
      loadTableRequestType.getTableRequest().addAll(Arrays.asList(table));
      LoadTableResponseType loadTableResponseType = agileTableStub.loadTable(loadTableRequestType);

      if(loadTableResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {

          AgileTableType workflow = loadTableResponseType.getTableContents().get(0);
          try {
              AgileRowType[] rows = workflow.getRow().toArray(new AgileRowType[0]);
              for (int j = 0; j < rows.length; j++) {
                  List<Element> messages = rows[j].getAny();
                  if (messages.size() > 6) {
                      current = getMessageElementValue(messages.get(3));
                      if (current != null && current.length() > 8)
                          if (current.contains("Awaiting")) {
                              approvers = getMessageElementValue(messages.get(5));
                              appStatus.append(approvers);
                              appStatus.append("\n");
                          }
                  }
              }
          } catch (NullPointerException e) {
              labelStatus_Message.setText("Change workflow error");
              labelStatus_Message.getStyleClass().add("label-failure");
          }
          return appStatus.toString();
      }
      else
          return null;
  }
}
