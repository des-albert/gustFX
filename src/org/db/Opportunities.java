package org.db;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Exception__c;
import com.sforce.soap.enterprise.sobject.Opportunity;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.soap.enterprise.sobject.Task;
import com.sforce.ws.ConnectionException;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Optional;


import static org.db.Base.*;
import static org.db.Exceptions.*;

public class Opportunities {

    @FXML
    Button buttonOpportunitiesQuit;
    @FXML
    Label label_Opportunity_Status;
    @FXML
    TableView<oppDisplay> tableViewOpportunity;
    @FXML
    TableColumn<oppDisplay, String> columnOpportunity, columnStatus, columnShipDate, columnExecDate,
            columnQualified, columnPrimary, columnException;

    static Opportunity[] opportunity;
    private Task[] task;
    private DateTimeFormatter dtf;
    private SimpleDateFormat df;
    static int rowSelect;
    private HashMap<String, String> exMap = new HashMap<>();
    private String opportunityId;
    static String quoteNumber, quoteId;

    private ObservableList<oppDisplay> data = FXCollections.observableArrayList();

    public void initialize() {

        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        df = new SimpleDateFormat("yyyy-MM-dd");
        columnOpportunity.setCellValueFactory(new PropertyValueFactory<>("oppOpportunity"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("oppStatus"));
        columnShipDate.setCellValueFactory(new PropertyValueFactory<>("oppShipDate"));
        columnExecDate.setCellValueFactory(new PropertyValueFactory<>("oppExecDate"));
        columnQualified.setCellValueFactory(new PropertyValueFactory<>("oppQualified"));
        columnPrimary.setCellValueFactory(new PropertyValueFactory<>("oppPrimary"));
        columnException.setCellValueFactory(new PropertyValueFactory<>("oppException"));

        columnShipDate.setStyle( "-fx-alignment: CENTER;");
        columnExecDate.setStyle( "-fx-alignment: CENTER;");
        columnQualified.setStyle( "-fx-alignment: CENTER;");

        SetUp();
        load_Opportunities();
    }


    public void ButtonOpportunitiesQuitOnAction() {
        Stage stage = (Stage) buttonOpportunitiesQuit.getScene().getWindow();
        stage.close();
    }

    private void SetUp() {
        final int OPPORTUNITY_LINK_COLUMN = 0;
        final int OPPORTUNITY_PRIMARY_STATUS_COLUMN = 5;
        final int OPPORTUNITY_EXCEPTION_COLUMN = 6;

        columnOpportunity.setCellFactory(e -> new TableCell<oppDisplay, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty)
                    setText(null);
                else {
                    setText(item);
                    this.setStyle("-fx-text-fill: blue;" + "-fx-alignment: CENTER;");
                }
            }
        });

        columnStatus.setCellFactory(e -> new TableCell<oppDisplay, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty)
                    setText(null);
                else {
                    switch(item) {
                        case "Not Started": {
                            setText(item);
                            this.setStyle("-fx-text-fill: cyan;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "In Progress": {
                            setText(item);
                            this.setStyle("-fx-text-fill: green;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Deferred": {
                            setText(item);
                            this.setStyle("-fx-text-fill: orange;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Waiting on someone else": {
                            setText(item);
                            this.setStyle("-fx-text-fill: purple;" + "-fx-alignment: CENTER;");
                            break;
                        }
                    }
                }
            }
        });

        columnPrimary.setCellFactory(e -> new TableCell<oppDisplay, String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty)
                    setText(null);

                else {
                    switch (item) {
                        case "Approved": {
                            setText(item);
                            this.setStyle("-fx-text-fill: green;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Export Pending": {
                            setText(item);
                            this.setStyle("-fx-text-fill: orange;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Export Complete": {
                            setText(item);
                            this.setStyle("-fx-text-fill: purple;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Pending Approval": {
                            setText(item);
                            this.setStyle("-fx-text-fill: brown;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Reconcile Complete": {
                            setText(item);
                            this.setStyle("-fx-text-fill: cyan;" + "-fx-alignment: CENTER;");
                            break;
                        }
                        case "Pending":
                        case "Revision Pending":
                        {
                            setText(item);
                            this.setStyle("-fx-text-fill: black;" + "-fx-alignment: CENTER;");
                            break;
                        }
                    }
                }
            }
        });

        columnException.setCellFactory(e -> new TableCell<oppDisplay, String>() {
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

        tableViewOpportunity.getSelectionModel().setCellSelectionEnabled(true);
        ObservableList<TablePosition> selectedCells = tableViewOpportunity.getSelectionModel().getSelectedCells();

        selectedCells.addListener((ListChangeListener<TablePosition>) change -> {
            TablePosition tablePosition = selectedCells.get(0);
            oppDisplay selectedOpp = tableViewOpportunity.getSelectionModel().getSelectedItem();

            rowSelect = selectedOpp.getOppIndex();
            int column = tablePosition.getColumn();
            opportunityId = opportunity[rowSelect].getId();

            switch (column) {
                case OPPORTUNITY_LINK_COLUMN: {
                    String link = "https://cray.my.salesforce.com/" + opportunityId;
                    openWebpage(link);
                }
                break;

                case OPPORTUNITY_EXCEPTION_COLUMN: {
                    String value = exMap.get(opportunityId);
                    String link = "https://cray.my.salesforce.com/" + value.substring(value.indexOf('~') + 1);
                    openWebpage(link);
                }
                break;

                case OPPORTUNITY_PRIMARY_STATUS_COLUMN: {

                    switch (opportunity[rowSelect].getPrimary_Quote_Status__c()) {
                        case "Approved": {

                            Alert nextStep = new Alert(Alert.AlertType.WARNING, "Ready for Export ?",
                                    ButtonType.YES, ButtonType.NO);
                            nextStep.setHeaderText(null);
                            nextStep.setTitle("Next Step");
                            Optional<ButtonType> response = nextStep.showAndWait();
                            if (response.isPresent()) {
                                if (response.get() == ButtonType.NO) {
                                    TextInputDialog labelDialog = new TextInputDialog();
                                    labelDialog.setHeaderText("Enter Reason :");
                                    Optional<String> reason = labelDialog.showAndWait();
                                    if (reason.isPresent()) {
                                        Task updateTask = new Task();
                                        updateTask.setId(task[rowSelect].getId());
                                        updateTask.setStatus("Waiting on someone else");
                                        if (task[rowSelect].getDescription() == null)
                                            updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName + "\n"
                                                    + reason.get());
                                        else
                                            updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName + "\n"
                                                    + reason.get() + "\n" + task[rowSelect].getDescription());
                                        try {
                                            connection.update(new SObject[]{updateTask});
                                            oppDisplay row = data.get(rowSelect);
                                            row.setOppStatus("Waiting on someone else");
                                            tableViewOpportunity.refresh();
                                        } catch (ConnectionException ce) {
                                            ce.printStackTrace();

                                        }
                                    }
                                    break;
                                }
                            }

                            if (opportunity[rowSelect].getConfiguration_Owner__c() == null) {
                                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                                alert.setTitle("Prepare to Export");
                                alert.setContentText("Configuration Owner not set");
                                alert.showAndWait().ifPresent(rs -> {
                                });
                                break;
                            }

                            try {
                                TextInputDialog labelDialog = new TextInputDialog();
                                labelDialog.setHeaderText("Paste Asset Map  :");
                                Optional<String> assetDetail = labelDialog.showAndWait();
                                if (assetDetail.isPresent()) {
                                    Task updateTask = new Task();
                                    updateTask.setId(task[rowSelect].getId());
                                    updateTask.setStatus("In Progress");
                                    if (task[rowSelect].getDescription() == null)
                                        updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName + "\n"
                                                + assetDetail.get());
                                    else
                                        updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName + "\n"
                                                + assetDetail.get() + "\n" + task[rowSelect].getDescription());
                                    connection.update(new SObject[]{updateTask});
                                    oppDisplay row = data.get(rowSelect);
                                    row.setOppPrimary("Export Pending");
                                    tableViewOpportunity.refresh();

                                    Opportunity qualOpp = new Opportunity();
                                    qualOpp.setId(opportunity[rowSelect].getId());
                                    qualOpp.setPrimary_Quote_Status__c("Export Pending");
                                    qualOpp.setQualified_Quote__c(opportunity[rowSelect].getPrimary_Quote_Number__c().substring(2, 8));
                                    connection.update(new SObject[]{qualOpp});
                                }
                            } catch (ConnectionException ce) {
                                ce.printStackTrace();

                            }
                        }
                        break;

                        case "Export Pending": {
                            label_Opportunity_Status.setText("Export Selected");
                            quoteNumber = opportunity[rowSelect].getQualified_Quote__c();
                            quoteId = opportunity[rowSelect].getId();
                            try {
                                FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("export.fxml"));
                                Parent exportForm = fxmlFormLoader.load();
                                Stage exportStage = new Stage();
                                exportStage.setTitle("Quote Export");
                                exportStage.setScene(new Scene(exportForm, 2350, 700));
                                exportStage.show();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                label_Opportunity_Status.setText("Export FormLoader failed");
                                label_Opportunity_Status.getStyleClass().add("label-failure");
                            }
                        }
                        break;
                        case "Export Complete":
                            quoteNumber = opportunity[rowSelect].getQualified_Quote__c();
                            try {
                                Task updateTask = new Task();
                                updateTask.setId(task[rowSelect].getId());
                                updateTask.setStatus("Completed");
                                if (task[rowSelect].getDescription() == null)
                                    updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName
                                            + ": Export Complete\n");
                                else
                                    updateTask.setDescription(dtf.format(LocalDateTime.now()) + " " + userFullName
                                            + ": Quote " + quoteNumber + " Export Complete\n" + task[rowSelect].getDescription());
                                connection.update(new SObject[]{updateTask});
                                label_Opportunity_Status.setText(opportunity[rowSelect].getName() + " Task Complete");
                                label_Opportunity_Status.getStyleClass().remove(0);
                                label_Opportunity_Status.getStyleClass().add(0, "label-success");
                            } catch (ConnectionException ce) {
                                ce.printStackTrace();
                            }
                            break;
                        case "Pending":
                            label_Opportunity_Status.setText(opportunity[rowSelect].getName() +
                                    " " + task[rowSelect].getId());
                            label_Opportunity_Status.getStyleClass().remove(0);
                            label_Opportunity_Status.getStyleClass().add(0, "label-success");
                    }
                }
            }
        });
    }
    private void load_Opportunities() {

        StringBuilder exQuery = new StringBuilder("SELECT Id, Name, Exception_Number__c, Opportunity_Name__c "
                + " FROM Exception__c WHERE Status__c = 'In Review' AND "
                + " Opportunity_Name__c IN ('");

        String soqlQuery = "SELECT Id, Status, Description, WhatId "
                + "FROM Task WHERE Status <> 'Completed' "
                + "AND Subject = 'Quote Review Request' AND OwnerId = '"+ sfdcOwnerId + "' AND WhatId IN "
                + "(SELECT Id FROM Opportunity WHERE Sales_Enablement_User__c = '" + sfdcOwnerId + "' "
                + "AND SOPS_Control__c = True AND Primary_Quote_Status__c <> '') ORDER BY WhatId";

        StringBuilder outerQuery = new StringBuilder("SELECT Id, Configuration_Owner__c, Name,  Qualified_Quote__c, "
                + "Primary_Quote_Status__c, Primary_Quote_Number__c, Transaction_Execute_by_Date__c, "
                + " Ship_Date__c FROM Opportunity WHERE Primary_Quote_Status__c <> '' AND Id IN ('");

        QueryResult qr;

        data.clear();
        tableViewOpportunity.setItems(data);

        try {
            qr = connection.query(soqlQuery);
            if (qr.getSize() > 0) {
                SObject[] records = qr.getRecords();
                task = new Task[records.length];
                for (int i = 0; i < records.length; i++)
                {
                    task[i] = (Task)records[i];
                    if (i == 0) {
                        outerQuery.append(task[0].getWhatId());
                        exQuery.append(task[0].getWhatId());
                    } else {
                        outerQuery.append("', '");
                        outerQuery.append(task[i].getWhatId());
                        exQuery.append("', '");
                        exQuery.append(task[i].getWhatId());
                    }
                }

                exQuery.append("')");
                QueryResult ex = connection.query(exQuery.toString());
                SObject[] exRecords = ex.getRecords();
                Exception__c[] exception = new Exception__c[exRecords.length];
                for (int i = 0; i < exRecords.length; i++) {
                    exception[i] = (Exception__c) exRecords[i];
                    exMap.put(exception[i].getOpportunity_Name__c(),
                            exception[i].getException_Number__c() + '~' + exception[i].getId());
                }

                outerQuery.append("') ORDER BY Id");
                QueryResult iq = connection.query(outerQuery.toString());
                SObject[] oppRecords = iq.getRecords();
                opportunity = new Opportunity[oppRecords.length];
                String exceptionNumber;
                for (int i = 0; i < oppRecords.length; i++) {
                    opportunity[i] = (Opportunity)oppRecords[i];
                    String value;
                    if (exMap.containsKey(opportunity[i].getId())) {
                        value = exMap.get(opportunity[i].getId());
                        exceptionNumber = value.substring(0, value.indexOf('~') - 1);
                    } else {
                        exceptionNumber = "";
                    }

                    String execDate = (opportunity[i].getTransaction_Execute_by_Date__c() != null) ?
                            df.format(opportunity[i].getTransaction_Execute_by_Date__c().getTime()) : "";
                    oppDisplay row = new oppDisplay(
                            i,
                            opportunity[i].getName(),
                            task[i].getStatus(),
                            df.format(opportunity[i].getShip_Date__c().getTime()),
                            execDate,
                            opportunity[i].getQualified_Quote__c(),
                            opportunity[i].getPrimary_Quote_Status__c(),
                            exceptionNumber);
                    data.add(row);
                }

                tableViewOpportunity.refresh();
            }
        } catch (ConnectionException ce ) {
            ce.printStackTrace();
        }
    }
}

