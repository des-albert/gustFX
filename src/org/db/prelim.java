package org.db;

import com.agile.api.ChangeConstants;
import com.agile.api.ItemConstants;
import com.agile.ws.schema.attachment.v1.jaxws.AddFileAttachmentRequestType;
import com.agile.ws.schema.attachment.v1.jaxws.AddFileAttachmentResponseType;
import com.agile.ws.schema.attachment.v1.jaxws.AgileAddFileAttachmentRequest;
import com.agile.ws.schema.attachment.v1.jaxws.AgileAddFileAttachmentRequestType;
import com.agile.ws.schema.business.v1.jaxws.*;
import com.agile.ws.schema.collaboration.v1.jaxws.*;
import com.agile.ws.schema.common.v1.jaxws.*;
import com.agile.ws.schema.table.v1.jaxws.*;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.w3c.dom.Element;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Optional;

import static org.db.Base.*;
import static org.db.Exceptions.*;
import static org.db.gustMain.*;
import static org.db.Shared.*;

public class prelim {

    @FXML
    Button buttonCreateManPart, buttonQuit, buttonCreatePart, buttonCreateECO, buttonAddCustomCode,  buttonAddManPart;
    @FXML
    Label label_Product_Category, label_List_Price, label_Reference_Cost, label_Price_Floor, label_Exception, label_AgileId;
    @FXML
    Label label_Prelim_Status_Message, label_ECO_notes;
    @FXML
    Label label_Total_Cost, label_Maintenance_Units, label_Reference_Price;
    @FXML
    TextArea textArea_Notes;
    @FXML
    public TextField textField_Man_Part_Number, textField_Man_Part_Desc, textField_Part_Number, textField_Part_Description;
    @FXML
    public TextField textField_Cost, textField_Duration, textField_Customer, textField_ExchangeRate;
    @FXML
    public TextField textField_Solution_Type, textField_LocalCost;
    @FXML
    public ChoiceBox<String> choiceBox_Man_Name, choiceBox_Product_Line, choiceBox_Product_Family, choiceBox_BoM_Class;
    @FXML
    public ChoiceBox<String> choiceBox_ChangeAnalyst, choiceBox_Price_Category, choiceBox_Product_Team;
    @FXML
    public ListView<String> listView_Codes;
    @FXML
    public ChoiceBox<String> choiceBox_Code_Type;

    private static String prodCat, duration, FXRate = "1.0";
    private static String new_USDcost = "0.0", new_LocalCost = "0.0", new_FXRate = "1.0";
    private Stage mainStage = getPrimaryStage();
    private static String[] prodCatList = {"HW", "HW", "HW", "SW", "SVC", "SVC", "SVC", "SVC", "SVC",
            "SVC", "SVC", "SVC", "SVC", "SVC", "SVC", "SVC", "TNG"};
    static double[] margin = {0.225, 0.35, 0.4, 0.4, 0.35, 0., 0.15, 0.25, 0.35, 0.4, 0., 0.15, 0.25, 0.35, 0.4, 0.5, 0.35};
    static double[] burden = {1.05, 1.05, 1.05, 1.018, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
    static double[] maint = {4., 4., 4, 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0., 0.};
    private int priceCatIndex;
    private DecimalFormat df = new DecimalFormat("#.00");

    private double ref_cost, list_price, floor_price, total_cost, maint_units, maint_coeff;

    public void initialize() {

        /*  ChoiceBox initialization */

        choiceBox_Man_Name.setItems(manNameChoices);
        choiceBox_Product_Line.setItems(prodLineChoices);
        choiceBox_Price_Category.setItems(priceCatChoices);
        choiceBox_Product_Family.setItems(prodFamilyChoices);
        choiceBox_BoM_Class.setItems(bomClassChoices);
        choiceBox_ChangeAnalyst.setItems(analysts);
        choiceBox_Product_Team.setItems(productTeams);
        choiceBox_Code_Type.setItems(codeTypes);
        choiceBox_Code_Type.setValue("Product Led");

        customCodeList = new ArrayList<>();
        textField_Cost.setText(new_USDcost);
        textField_LocalCost.setText(new_LocalCost);
        textField_ExchangeRate.setText(new_FXRate);

        agileECO.itemText = null;
        label_AgileId.setText(agileId);
        label_Exception.setText(exceptionName);

        /* Price Category Change Listener */

        choiceBox_Price_Category.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                    priceCatIndex = choiceBox_Price_Category.getSelectionModel().getSelectedIndex();
                    prodCat = prodCatList[priceCatIndex];
                    label_Product_Category.setText(prodCat);
                    calculate (new_USDcost, new_LocalCost, new_FXRate);
                });

        /* Cost Change Listener */

        textField_Cost.textProperty().addListener((ObservableValue<? extends String> observable,
                                                   String oldValue, String newValue) -> {
            new_USDcost = newValue;
            calculate (new_USDcost, new_LocalCost, new_FXRate);
        });

        textField_LocalCost.textProperty().addListener((ObservableValue<? extends String> observable,
                                                        String oldValue, String newValue) -> {
            new_LocalCost = newValue;
            calculate (new_USDcost, new_LocalCost, new_FXRate);

        });

        textField_ExchangeRate.textProperty().addListener((ObservableValue<? extends String> observable,
                                                           String oldValue, String newValue) -> {
            new_FXRate = newValue;
            calculate (new_USDcost, new_LocalCost, new_FXRate);
            FXRate = new_FXRate;
        });
    }
    /* Cost and Price calculations */

    private void calculate(String usd, String local, String fx) {

        double costUSD = Double.parseDouble(usd);
        if ( ! local.equals("0.0")) {
            costUSD = Double.parseDouble(local) * Double.parseDouble(fx);
            textField_Cost.setText(df.format(costUSD));
        }
        label_ECO_notes.setText("Fx Rate : " + new_FXRate);
        total_cost = Math.ceil(100.0 * costUSD * burden[priceCatIndex]) / 100.0;
        label_Total_Cost.setText(df.format(total_cost));

        ref_cost = roundup(total_cost);
        label_Reference_Cost.setText(df.format(ref_cost));

        floor_price = roundup(ref_cost / (1.0 - margin[priceCatIndex]));
        label_Price_Floor.setText(df.format(floor_price));
        label_Reference_Price.setText(df.format(floor_price));

        if (priceCatIndex < 3 || priceCatIndex == 4 || priceCatIndex > 14)
            list_price = roundup(ref_cost / (1.0 - margin[priceCatIndex]) / 0.7d);
        else
            list_price = roundup(ref_cost / (1.0 - margin[priceCatIndex]));
        label_List_Price.setText(df.format(list_price));

        maint_units = ref_cost * maint[priceCatIndex];
        label_Maintenance_Units.setText(df.format(maint_units));

        maint_coeff = 1.0;
        if (priceCatIndex == 1)
            maint_coeff = 1.21;
        else if (priceCatIndex == 2)
            maint_coeff = 2.29;

        duration = textField_Duration.getText();

    }

    private double roundup(double cost) {
        int digits = ((int) Math.log10(cost)) - 2;
        double divider = Math.pow(10, digits);
        return divider * Math.ceil(cost / divider);
    }


    /* Create Manufacturer Part + add Quote */

    public void ButtonCreateManPartOnAction() {

        CreateObjectRequestType createObjectRequestType = new CreateObjectRequestType();
        AgileCreateObjectRequest agileCreateObjectRequest = new AgileCreateObjectRequest();
        agileCreateObjectRequest.setClassIdentifier("ManufacturerPart");

        Element el_man = createTextElement("manufacturerName", choiceBox_Man_Name);
        Element el_manNumber = createTextElement("manufacturerPartNumber", textField_Man_Part_Number);
        AgileRowType row = new AgileRowType();
        row.getAny().add(el_man);
        row.getAny().add(el_manNumber);
        agileCreateObjectRequest.setData(row);

        createObjectRequestType.getRequests().add(agileCreateObjectRequest);
        CreateObjectResponseType createObjectResponseType = agileBusinessObjectStub.createObject(createObjectRequestType);
        AgileCreateObjectResponse createObjectResponse = createObjectResponseType.getResponses().get(0);
        if (createObjectResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            manPart.objectNumber = createObjectResponse.getAgileObject().getObjectIdentifier().getObjectId().toString();
            label_Prelim_Status_Message.setText("Manufacturer Part Create SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
        } else {
            label_Prelim_Status_Message.setText("Manufacturer Part Create Create FAILURE - " +
                    createObjectResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
        }

        /* Add Attachment to Part */

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("pdf file (*.pdf)", "*.pdf"));
        fileChooser.setTitle("Open pdf file");
        File file = fileChooser.showOpenDialog(mainStage);

        AddFileAttachmentRequestType addFileAttachmentRequestType = new AddFileAttachmentRequestType();
        AgileAddFileAttachmentRequest agileAddFileAttachmentRequest = new AgileAddFileAttachmentRequest();
        agileAddFileAttachmentRequest.setClassIdentifier("ManufacturerPart");
        agileAddFileAttachmentRequest.setObjectNumber(manPart.objectNumber);

        AgileAddFileAttachmentRequestType attachments = new AgileAddFileAttachmentRequestType();
        attachments.setName(file.getName());
        attachments.setDescription("Quote PDF");

        FileDataSource datasource = new FileDataSource(file);
        attachments.setContent(new DataHandler(datasource));

        agileAddFileAttachmentRequest.getAttachments().add(attachments);
        agileAddFileAttachmentRequest.setSingleFolder(true);
        addFileAttachmentRequestType.getRequests().add(agileAddFileAttachmentRequest);
        AddFileAttachmentResponseType addFileAttachmentResponseType = agileAttachmentStub.addFileAttachment(addFileAttachmentRequestType);
        if (addFileAttachmentResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            label_Prelim_Status_Message.setText("Manufacturer Part Attachment SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
        } else {
            label_Prelim_Status_Message.setText("Manufacturer Part Attachment  FAILURE - " +
                    addFileAttachmentResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
        }

        // Add description to Manufacturing Part

        UpdateObjectRequestType updateObjectRequestType = new UpdateObjectRequestType();
        AgileUpdateObjectRequest agileUpdateObjectRequest = new AgileUpdateObjectRequest();
        agileUpdateObjectRequest.setClassIdentifier("ManufacturerPart");
        agileUpdateObjectRequest.setObjectNumber(manPart.objectNumber);

        Element el_desc = createTextElement("description", textField_Man_Part_Desc);
        row = new AgileRowType();
        row.getAny().add(el_desc);
        agileUpdateObjectRequest.setData(row);

        updateObjectRequestType.getRequests().add(agileUpdateObjectRequest);
        UpdateObjectResponseType  updateObjectResponseType = agileBusinessObjectStub.updateObject(updateObjectRequestType);

        if (updateObjectResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            label_Prelim_Status_Message.setText("Manufacturing Part Update SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
        } else {
            label_Prelim_Status_Message.setText("Manufacturing Part  Update FAILURE - "
                    + updateObjectResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
            agileECO.itemText = null;
        }

    }
    public void ButtonCreatePartOnAction() {
        if (createCustomCode())
            attachManPart();
    }

    /* Create Agile Custom Code */

    private boolean createCustomCode() {

        CreateObjectRequestType createObjectRequestType = new CreateObjectRequestType();
        AgileCreateObjectRequest agileCreateObjectRequest = new AgileCreateObjectRequest();
        agileCreateObjectRequest.setClassIdentifier("CustomCode");
        AgileRowType row = new AgileRowType();

        Element el_number = createTextElement("number", textField_Part_Number);
        Element el_desc = createTextElement("description",textField_Part_Description);
        Element el_prodLine = createListElement("productLineS", choiceBox_Product_Line );
        Element el_cognizant = createTextElement("text02", agileCognizant);
        Element el_notes = createTextElement("notes", textArea_Notes.getText());


        if(agileId == null) {
            TextInputDialog labelDialog = new TextInputDialog();
            labelDialog.setHeaderText("Enter Exception Name :" );
            Optional<String> agileInput = labelDialog.showAndWait();
            agileId = agileInput.toString();
        }
        Element el_AgileId = createTextElement("text32", agileId,
                ItemConstants.ATT_PAGE_THREE_TEXT02.toString());

        Element el_cost = createTextElement("numeric32", total_cost,
                ItemConstants.ATT_PAGE_THREE_NUMERIC02.toString());

        Element el_list = createTextElement("numeric31", list_price,
                ItemConstants.ATT_PAGE_THREE_NUMERIC01.toString());

        Element el_ref_cost = createTextElement("numeric38", ref_cost,
                ItemConstants.ATT_PAGE_THREE_NUMERIC08.toString());

        AgileMoneyType floor = new AgileMoneyType();
        floor.setAmount(floor_price);
        floor.setCurrency("USD");
        Element el_floor = createTextElement("money30", floor,
                ItemConstants.ATT_PAGE_THREE_MONEY10.toString());

        Element el_ref_price = createTextElement("money39", floor,
                ItemConstants.ATT_PAGE_THREE_MONEY09.toString());

        Element el_main_units = createTextElement("numeric30", maint_units,
                ItemConstants.ATT_PAGE_THREE_NUMERIC10.toString());

        Element el_main_coeff = createTextElement("text38", maint_coeff,
                ItemConstants.ATT_PAGE_THREE_TEXT08.toString());

        Element el_duration = createTextElement("text39", duration,
                ItemConstants.ATT_PAGE_THREE_TEXT09.toString());

        row.getAny().add(el_number);
        row.getAny().add(el_cost);
        row.getAny().add(el_list);
        row.getAny().add(el_ref_cost);
        row.getAny().add(el_floor);
        row.getAny().add(el_ref_price);
        row.getAny().add(el_main_units);
        row.getAny().add(el_desc);
        row.getAny().add(el_prodLine);
        row.getAny().add(el_cognizant);
        row.getAny().add(el_notes);
        row.getAny().add(el_AgileId);

        row.getAny().add(el_main_coeff);
        row.getAny().add(el_duration);
        agileCreateObjectRequest.setData(row);

        createObjectRequestType.getRequests().add(agileCreateObjectRequest);
        CreateObjectResponseType createObjectResponseType = agileBusinessObjectStub.createObject(createObjectRequestType);
        if (createObjectResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            AgileCreateObjectResponse createObjectResponse = createObjectResponseType.getResponses().get(0);
            customCode.objectNumber = createObjectResponse.getAgileObject().getObjectIdentifier().getObjectId().toString();
            label_Prelim_Status_Message.setText("Custom Code Create SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
        } else {
            label_Prelim_Status_Message.setText("Custom Code Create  FAILURE - "
                    + createObjectResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
            return false;
        }

        /*  Updates to Page Two and Three information */

        UpdateObjectRequestType updateObjectRequestType = new UpdateObjectRequestType();
        AgileUpdateObjectRequest agileUpdateObjectRequest = new AgileUpdateObjectRequest();
        agileUpdateObjectRequest.setClassIdentifier("CustomCode");
        agileUpdateObjectRequest.setObjectNumber(customCode.objectNumber);

        Element el_price_cat = createListElement("list31", choiceBox_Price_Category,
                ItemConstants.ATT_PAGE_THREE_LIST01.toString());

        Element el_prod_cat = createListElement("list32",  prodCat,
                ItemConstants.ATT_PAGE_THREE_LIST02.toString());

        Element el_prod_fam = createListElement("list33", choiceBox_Product_Family,
                ItemConstants.ATT_PAGE_THREE_LIST03.toString());

        Element el_bom_class = createListElement("list34", choiceBox_BoM_Class,
                ItemConstants.ATT_PAGE_THREE_LIST04.toString());

        Element el_code_type = createListElement("list43", choiceBox_Code_Type,
            ItemConstants.ATT_PAGE_THREE_LIST13.toString());


        row = new AgileRowType();
        row.getAny().add(el_price_cat);
        row.getAny().add(el_prod_cat);
        row.getAny().add(el_prod_fam);
        row.getAny().add(el_bom_class);
        row.getAny().add(el_code_type);
        agileUpdateObjectRequest.setData(row);

        updateObjectRequestType.getRequests().add(agileUpdateObjectRequest);
        UpdateObjectResponseType updateObjectResponseType = agileBusinessObjectStub.updateObject(updateObjectRequestType);

        if (updateObjectResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            label_Prelim_Status_Message.setText("Custom Code Update SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0,"label-success");
            listView_Codes.getItems().add(textField_Part_Number.getText());
            agileItem newCode = new agileItem(textField_Part_Number.getText(), customCode.objectNumber);
            customCodeList.add(newCode);
            return true;
        } else {
            label_Prelim_Status_Message.setText("Custom Code Update FAILURE - "
                    + updateObjectResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
            agileECO.itemText = null;
            return false;
        }
    }

    private void attachManPart() {

        AddRowsRequestType addRowsRequestType = new AddRowsRequestType();
        AgileAddRowsRequest agileAddRowsRequest = new AgileAddRowsRequest();

        RequestTableType table = new RequestTableType();
        table.setClassIdentifier("CustomCode");
        table.setObjectNumber(customCode.objectNumber);
        table.setTableIdentifier("Manufacturers");

        AgileRowType row = new AgileRowType();

        ObjectReferentIdType objRefId = new ObjectReferentIdType();
        objRefId.setClassIdentifier("ManufacturerPart");
        objRefId.setObjectIdentifier(manPart.objectNumber);

        PropertyType properties_manufName = new PropertyType();
        properties_manufName.setPropertyName( SchemaConstants.MANUFACTURER_NAME.value() );
        properties_manufName.setPropertyValue( choiceBox_Man_Name.getSelectionModel().getSelectedItem() );
        objRefId.getOptions().add(properties_manufName);

        Element el_man = createTextElement("mfrPartNumber", objRefId);

        row.getAny().add(el_man);
        agileAddRowsRequest.getRow().add(row);
        agileAddRowsRequest.setObjectInfo(table);

        addRowsRequestType.getData().add(agileAddRowsRequest);
        AddRowsResponseType addRowsResponseType = agileTableStub.addRows(addRowsRequestType);
        if( addRowsResponseType.getStatusCode().equals( ResponseStatusCode.SUCCESS )) {
            label_Prelim_Status_Message.setText("Add Manufacturer Part SUCCESS");
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
        }
        else {
            label_Prelim_Status_Message.setText("Add Manufacturer Part FAILURE - " +
                    addRowsResponseType.getExceptions().get(0).getException().get(0).getMessage());
            label_Prelim_Status_Message.getStyleClass().remove(0);
            label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
            agileECO.itemText = null;
        }
    }



    public void ButtonAddCustomCodeOnAction() {
        customCode.objectNumber = agileSearchCode("CustomCode", textField_Part_Number.getText(), label_Prelim_Status_Message);
        agileItem newCode = new agileItem(textField_Part_Number.getText(), customCode.objectNumber);
        listView_Codes.getItems().add(textField_Part_Number.getText());
        customCodeList.add(newCode);
    }
    public void ButtonAddManPartOnAction() {
        manPart.itemText = textField_Man_Part_Number.getText();
        agileItem result = agileSearchPart(manPart.itemText, label_Prelim_Status_Message);
        if (result != null)
            manPart.objectNumber = result.objectNumber;
    }

    public void ButtonCreateECOOnAction() {
        if (createPrelimECO())
            if (attachAffectedItems())
                submitECO();
    }
    private boolean createPrelimECO() {

        String ECOExtendedDescription = "EFFECTIVITY: UPON RELEASE\n\nMATERIAL DISPOSITION: NONE\n\n" +
                "FIELD IMPACT: NO IMPACT\n \n JIRA#: N/A\n \n" +
                "REASON FOR CHANGE: CUSTOM CODE REQUIRED FOR EXECUTION AND QUOTING IN BIGMACHINES\n \n" +
                "AGENCY COMPLIANCE IMPACT: NO IMPACT\n \n" +
                "OTHER IMPACT:\n GOODS BURDEN: 1.8% \n" +
                "LABOR BURDEN: 3.2% \n NON-GOODS BURDEN: 0%\n EXCHANGE RATE per USD: " + FXRate;
        CreateObjectRequestType createObjectRequestType = new CreateObjectRequestType();
        AgileCreateObjectRequest agileCreateObjectRequest = new AgileCreateObjectRequest();
        agileCreateObjectRequest.setClassIdentifier("ECO");
        AgileRowType row = new AgileRowType();

        if(exceptionName == null) {
            TextInputDialog labelDialog = new TextInputDialog();
            labelDialog.setHeaderText("Enter Exception Number :" );
            Optional<String> exceptionInput = labelDialog.showAndWait();
            exceptionName = exceptionInput.toString();

        }

        String ECODescription = choiceBox_Product_Team.getSelectionModel().getSelectedItem() +
                ": CUSTOM CODE FOR " + textField_Customer.getText() +
                " PRELIMINARY RELEASE OF CUSTOM CODE FOR " + textField_Solution_Type.getText() +
                " SOLUTION. AGILE OPPY ID \n" + agileId + " SFDC EXCEPTION " +
                exceptionName;
        if ((agileECO.itemText = getNextAutoNumber("ECO")) != null) {

            Element el_number = createTextElement("number", agileECO.itemText);
            Element el_prodLine = createListElement("productLineS", choiceBox_Product_Line);
            Element el_ECO_desc = createTextElement("descriptionOfChange", ECODescription);
            Element el_Reason = createTextElement("reasonForChange", ECOExtendedDescription);
            Element el_Engineer = createTextElement("text02", agileCognizant);
            Element el_ReasonCode = createListElement("reasonCode", "Release",
                    ChangeConstants.ATT_COVER_PAGE_REASON_CODE.toString());
            Element el_Analyst = createListElement("changeAnalyst", choiceBox_ChangeAnalyst);

            row.getAny().add(el_number);
            row.getAny().add(el_prodLine);
            row.getAny().add(el_ECO_desc);
            row.getAny().add(el_Reason);
            row.getAny().add(el_Engineer);
            row.getAny().add(el_ReasonCode);
            row.getAny().add(el_Analyst);
            agileCreateObjectRequest.setData(row);

            createObjectRequestType.getRequests().add(agileCreateObjectRequest);
            CreateObjectResponseType createObjectResponseType = agileBusinessObjectStub.createObject(createObjectRequestType);

            if (createObjectResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
                AgileCreateObjectResponse createObjectResponse = createObjectResponseType.getResponses().get(0);
                agileECO.objectNumber = createObjectResponse.getAgileObject().getObjectIdentifier().getObjectId().toString();
                label_Prelim_Status_Message.setText("ECO " + agileECO.itemText + " Create SUCCESS");
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-success");
                return true;
            } else {
                label_Prelim_Status_Message.setText("ECO Create FAILURE - "
                        + createObjectResponseType.getExceptions().get(0).getException().get(0).getMessage());
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
                agileECO.itemText = null;
                return false;
            }
        }
        return false;
    }

    private boolean attachAffectedItems() {

        RequestTableType table = new RequestTableType();
        table.setClassIdentifier("ECO");
        table.setObjectNumber(agileECO.objectNumber);
        table.setTableIdentifier("Affected Items");

        for(agileItem item : customCodeList) {
            AddRowsRequestType addRowsRequestType = new AddRowsRequestType();
            AgileAddRowsRequest agileAddRowsRequest = new AgileAddRowsRequest();
            agileAddRowsRequest.setObjectInfo(table);
            AgileRowType row = new AgileRowType();
            ObjectReferentIdType objRefId = new ObjectReferentIdType();
            objRefId.setClassIdentifier("CustomCode");
            objRefId.setObjectIdentifier(item.objectNumber);

            Element el_man = createTextElement("itemNumber", objRefId);

            row.getAny().add(el_man);
            agileAddRowsRequest.getRow().add(row);

            addRowsRequestType.getData().add(agileAddRowsRequest);
            AddRowsResponseType addRowsResponseType = agileTableStub.addRows(addRowsRequestType);
            if (addRowsResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
                label_Prelim_Status_Message.setText("Add Affected Item " + item.itemText + " SUCCESS");
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-success");

            }
            else {
                label_Prelim_Status_Message.setText("Add Affected Item FAILURE - " + item.itemText + " " +
                        addRowsResponseType.getExceptions().get(0).getException().get(0).getMessage());
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
                return false;
            }

            /* Set Revision A and LifeCycle Phase */

            UpdateRowsRequestType updateRowsRequestType = new UpdateRowsRequestType();
            AgileUpdateRowsRequest agileUpdateRowsRequest = new AgileUpdateRowsRequest();

            AgileUpdateRow updateRow = new AgileUpdateRow();
            updateRow.setRowId(getRowID("ECO", agileECO.objectNumber,
                    ChangeConstants.TABLE_AFFECTEDITEMS.toString(), item.itemText, "itemNumber" ));
            row = new AgileRowType();

            Element el_newRev = createTextElement("newRev", "A",
                    ChangeConstants.ATT_AFFECTED_ITEMS_NEW_REV.toString());
 //           Element el_lifeCycle = createListElement("lifecyclePhase", "Preliminary",
 //                  ChangeConstants.ATT_AFFECTED_ITEMS_LIFECYCLE_PHASE.toString());
            row.getAny().add(el_newRev);
//            row.getAny().add(el_lifeCycle);
            updateRow.setRow(row);

            agileUpdateRowsRequest.getRow().add(updateRow);
            agileUpdateRowsRequest.setObjectInfo(table);

            updateRowsRequestType.getData().add(agileUpdateRowsRequest);
            UpdateRowsResponseType updateRowsResponseType = agileTableStub.updateRows(updateRowsRequestType);
            if (updateRowsResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
                label_Prelim_Status_Message.setText("Add new Revision SUCCESS");
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-success");

            }
            else {
                label_Prelim_Status_Message.setText("Add Affected Item FAILURE - " +
                        updateRowsResponseType.getExceptions().get(0).getException().get(0).getMessage());
                label_Prelim_Status_Message.getStyleClass().remove(0);
                label_Prelim_Status_Message.getStyleClass().add(0, "label-failure");
                return false;
            }
        }
        return true;
    }

    private void submitECO() {

        SetWorkFlowRequestType setWorkFlowRequestType = new SetWorkFlowRequestType();
        AgileSetWorkFlowRequestType agileSetWorkFlowRequestType =  new AgileSetWorkFlowRequestType();
        agileSetWorkFlowRequestType.setClassIdentifier("ECO");
        agileSetWorkFlowRequestType.setObjectNumber( agileECO.objectNumber );

        String workflow = String.valueOf(getWorkFlow("ECO", agileECO.itemText, label_Prelim_Status_Message));
        agileSetWorkFlowRequestType.setWorkFlowIdentifier( workflow );

        setWorkFlowRequestType.getSetWorkFlowRequest().add(agileSetWorkFlowRequestType);
        SetWorkFlowResponseType setWorkflowResponseType = agileCollaborationStub.setWorkFlow(setWorkFlowRequestType);
        if (setWorkflowResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS))
            label_Prelim_Status_Message.setText("ECO " + agileECO.itemText + " Setup  SUCCESS");
        else
            label_Prelim_Status_Message.setText("ECO " + agileECO.itemText + " Setup  FAILURE - " +
                    setWorkflowResponseType.getExceptions().get(0).getException().get(0).getMessage());

        ChangeStatusRequestType changeStatusRequestType = new ChangeStatusRequestType();
        AgileChangeStatusRequestType agileChangeStatusRequestType = new AgileChangeStatusRequestType();

        agileChangeStatusRequestType.setClassIdentifier("ECO");
        agileChangeStatusRequestType.setObjectNumber( agileECO.itemText );
        agileChangeStatusRequestType.setNewStatusIdentifier( "Submitted");
        agileChangeStatusRequestType.setComment("Comments");
        agileChangeStatusRequestType.setNotifyChangeAnalyst(true);
        agileChangeStatusRequestType.setAuditRelease(false);
        agileChangeStatusRequestType.setUrgent(false);
        changeStatusRequestType.setDisableAllWarnings(true);
        changeStatusRequestType.getChangeStatusRequest().add(agileChangeStatusRequestType);
        ChangeStatusResponseType changeStatusResponseType = agileCollaborationStub.changeStatus(changeStatusRequestType);
        if (changeStatusResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
            label_Prelim_Status_Message.setText("ECO " + agileECO.itemText + " Submit  SUCCESS");
        }
        else
            label_Prelim_Status_Message.setText("ECO " + agileECO.itemText + " Submit FAILURE - " +
                    setWorkflowResponseType.getExceptions().get(0).getException().get(0).getMessage());
   }

   public void ButtonQuitOnAction () {
        Stage stage = (Stage) buttonQuit.getScene().getWindow();
        stage.close();
    }
}


