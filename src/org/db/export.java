package org.db;

import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.ws.ConnectionException;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.db.Base.connection;
import static org.db.Base.agileCognizant;

import static org.db.Opportunities.quoteNumber;
import static org.db.Opportunities.quoteId;

import static java.util.Arrays.asList;
import static org.apache.commons.lang3.StringUtils.isNumeric;


public class export {
    @FXML
    Button buttonQuit, buttonExport;
    @FXML
    TableView<exportDisplay> tableViewExport;
    @FXML
    TableView<assetDisplay> tableViewAsset;
    @FXML
    TableView<modelDisplay> tableViewModel;
    @FXML
    TableColumn<exportDisplay, String> column_Parent_Id, column_Part_Type, column_Description, column_Product_Line;
    @FXML
    TableColumn<exportDisplay, String> column_Cognizant, column_UoM, column_BoM_Line, column_Part_Number, column_BoM_Qty;
    @FXML
    TableColumn<exportDisplay, String> column_Group_Qty, column_Extd_Qty, column_Quote_Number, column_Quote_Version;
    @FXML
    TableColumn<exportDisplay, String> column_Model_Number, column_Group_Name, column_Part_Description, column_Ext_Desc;
    @FXML
    TableColumn<exportDisplay, String> column_BoM_Class, column_Asset, column_Model_Name, column_Config_Type;
    @FXML
    TableColumn<modelDisplay, String> colModelId, colModelNumber, colModelDescription, colModelExtDesc;
    @FXML
    ToggleGroup toggleProduct;
    @FXML
    RadioButton radioShasta, radioXC, radioStorage, radioCluster;
    @FXML
    Label label_Export_Status;

    @FXML
    TableColumn<assetDisplay, String> colAsset, colProduct, colModel;


    private String product, exportFileName;
    private static int quoteVersion;

    private static ObservableList<assetDisplay> assetData = FXCollections.observableArrayList();
    private static ObservableList<modelDisplay> modelData = FXCollections.observableArrayList();
    private static ObservableList<exportDisplay> exportData = FXCollections.observableArrayList();

    public void initialize() {

        assetData.clear();
        modelData.clear();
        exportData.clear();
        radioShasta.setSelected(true);
        product = "SHASTA";

        colAsset.setCellValueFactory(new PropertyValueFactory<>("asAsset"));
        colProduct.setCellValueFactory(new PropertyValueFactory<>("asProduct"));
        colModel.setCellValueFactory(new PropertyValueFactory<>("asModel"));

        colModelId.setCellValueFactory(new PropertyValueFactory<>("modModelId"));
        colModelNumber.setCellValueFactory(new PropertyValueFactory<>("modNumber"));
        colModelDescription.setCellValueFactory(new PropertyValueFactory<>("modConfigName"));
        colModelDescription.setCellFactory(TextFieldTableCell.forTableColumn());
        colModelDescription.setOnEditCommit( t ->
                t.getRowValue().setModConfigName(t.getNewValue().toUpperCase()));
        colModelExtDesc.setCellValueFactory(new PropertyValueFactory<>("modExtDesc"));
        colModelExtDesc.setCellFactory(TextFieldTableCell.forTableColumn());
        colModelExtDesc.setOnEditCommit( t ->
                t.getRowValue().setModExtDesc(t.getNewValue().toUpperCase()));

        column_Parent_Id.setCellValueFactory(new PropertyValueFactory<>("exParentId"));
        column_Part_Type.setCellValueFactory(new PropertyValueFactory<>("exPartType"));
        column_Description.setCellValueFactory(new PropertyValueFactory<>("exDescription"));
        column_Product_Line.setCellValueFactory(new PropertyValueFactory<>("exProductLine"));
        column_Cognizant.setCellValueFactory(new PropertyValueFactory<>("exCognizant"));
        column_UoM.setCellValueFactory(new PropertyValueFactory<>("exUoM"));
        column_BoM_Line.setCellValueFactory(new PropertyValueFactory<>("exBoM_Line"));
        column_Part_Number.setCellValueFactory(new PropertyValueFactory<>("exPart_Number"));
        column_BoM_Qty.setCellValueFactory(new PropertyValueFactory<>("exBoM_Qty"));
        column_Group_Qty.setCellValueFactory(new PropertyValueFactory<>("exGroup_Qty"));
        column_Extd_Qty.setCellValueFactory(new PropertyValueFactory<>("exExtd_Qty"));
        column_BoM_Class.setCellValueFactory(new PropertyValueFactory<>("exBoM_Class"));
        column_Asset.setCellValueFactory(new PropertyValueFactory<>("exAsset"));
        column_Quote_Number.setCellValueFactory(new PropertyValueFactory<>("exQuote_Number"));
        column_Quote_Version.setCellValueFactory(new PropertyValueFactory<>("exQuote_Version"));
        column_Model_Number.setCellValueFactory(new PropertyValueFactory<>("exModel_Number"));
        column_Model_Name.setCellValueFactory(new PropertyValueFactory<>("exModel_Name"));
        column_Ext_Desc.setCellValueFactory(new PropertyValueFactory<>("exExtDesc"));
        column_Config_Type.setCellValueFactory(new PropertyValueFactory<>("exConfigType"));
        column_Group_Name.setCellValueFactory(new PropertyValueFactory<>("exGroup_Name"));
        column_Part_Description.setCellValueFactory(new PropertyValueFactory<>("exPart_Description"));

        assetDisplay row = new assetDisplay("Misc");
        assetData.add(row);
        row = new assetDisplay("Pro Services");
        assetData.add(row);
        row = new assetDisplay("Training");
        assetData.add(row);
        row = new assetDisplay("Spares");
        assetData.add(row);

        toggleProduct.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov,
                                                            Toggle old_toggle, Toggle new_toggle) -> {
            if (radioXC.isSelected())
                product = "CASCADE";
            else if (radioShasta.isSelected())
                product = "SHASTA";
            else if (radioStorage.isSelected())
                product = "STORAGE";
            else
                product = "CCS";
        });

        /* Model Selection */

        tableViewModel.getSelectionModel().setCellSelectionEnabled(true);
        ObservableList<TablePosition> selectedCells = tableViewModel.getSelectionModel().getSelectedCells();

        selectedCells.addListener((ListChangeListener<TablePosition>) change -> {
            TablePosition tablePosition = selectedCells.get(0);
            if (tablePosition.getColumn() < 2)
                modelRowSelect();
        });

        loadExport();
        fillExportTable();
    }

    public void ButtonQuitOnAction() {
        Stage stage = (Stage) buttonQuit.getScene().getWindow();
        stage.close();
    }

    private void loadExport () {

        tableViewAsset.setItems(assetData);
        tableViewExport.setItems(exportData);
        String soqlQuery;

        soqlQuery = "SELECT Quote_Model_Information__c, Asset_Transaction__c, Transaction_Product__c "
                + "FROM Opportunity_Transaction__c WHERE Quote_Number_Quote__c = '" +
                quoteNumber + "' AND Asset_Transaction__c <> Null";
        try {
            QueryResult qr = connection.query(soqlQuery);
            SObject[] exRecords = qr.getRecords();
            if (exRecords != null && exRecords.length > 0) {
                StringBuilder outerQuery = new StringBuilder("SELECT Name FROM Asset WHERE Id in ('");
                Opportunity_Transaction__c[] ot = new Opportunity_Transaction__c[exRecords.length];
                for (int i = 0; i < exRecords.length; i++) {
                    ot[i] = (Opportunity_Transaction__c) exRecords[i];
                    if (i == 0)
                        outerQuery.append(ot[0].getAsset_Transaction__c());
                    else {
                        outerQuery.append("', '");
                        outerQuery.append(ot[i].getAsset_Transaction__c());
                    }
                }
                outerQuery.append("')");
                QueryResult iq = connection.query(outerQuery.toString());
                exRecords = iq.getRecords();
                if (exRecords != null) {
                    Asset[] aqp = new Asset[exRecords.length];
                    for (int i = 0; i < exRecords.length; i++) {
                        String quoteModel = ot[i].getQuote_Model_Information__c().substring(2, 5);
                        aqp[i] = (Asset) exRecords[i];
                        assetDisplay row = new assetDisplay(aqp[i].getName(), ot[i].getTransaction_Product__c(), quoteModel);
                        assetData.add(row);
                    }
                }
            }
        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }
    }
    private void modelRowSelect() {

        if (tableViewAsset.getSelectionModel().getSelectedItems() == null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Export Asset");
            alert.setContentText("Please Select an Asset before Model Assignment");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent()) {
                if (result.get() == ButtonType.OK)
                    return;
            }
        }

        String modelAsset = tableViewAsset.getSelectionModel().getSelectedItems().get(0).getAsAsset();
        String modelConfigName = tableViewModel.getSelectionModel().getSelectedItems().get(0).getModConfigName();
        String modelExtDesc = tableViewModel.getSelectionModel().getSelectedItems().get(0).getModExtDesc();
        int modelNum = tableViewModel.getSelectionModel().getSelectedItems().get(0).getModNumber();

        if (modelConfigName == null) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Config Name");
            alert.setContentText("Please Enter a Config Name");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent()) {
                if (result.get() == ButtonType.OK)
                    return;
            }
        }

        for (exportDisplay row : tableViewExport.getItems()) {
            if (Integer.parseInt(row.getExModel_Number()) == modelNum) {
                if (row.getExDescription().length() > 0 ) {
                    row.setExDescription((row.getExDescription() + " " + modelConfigName + " Q"
                            + quoteNumber + "-" + String.format("%03d", quoteVersion) + " SN" + modelAsset).toUpperCase());
                }
                row.setExProductLine(product);
                row.setExModel_Name(modelConfigName.toUpperCase());
                row.setExAsset(modelAsset);
                if (modelExtDesc != null)
                    row.setExExtDesc(modelExtDesc.toUpperCase());
            }
        }
        tableViewExport.refresh();

    }

    private void fillExportTable () {

        try {
            String soqlQuery = "SELECT Account_Abbr_Name_Opportunity__c, Agile_Opportunity_ID_Opportunity__c, "
                    + "Opportunity_Name_Quote__c FROM Opportunity_Transaction__c "
                    + "WHERE  Quote_Number_Quote__c = '" + quoteNumber + "' LIMIT 1";
            QueryResult qr = connection.query(soqlQuery);
            SObject[] exRecords = qr.getRecords();
            if (exRecords.length == 0) {
                label_Export_Status.setText("Opportunity Transactions not available");
                return;
            }
            Opportunity_Transaction__c oth = (Opportunity_Transaction__c) exRecords[0];

            soqlQuery = "SELECT Revision__c, Version__c FROM BigMachines__Quote__c WHERE BigMachines__Opportunity__c ='"
                    + quoteId + "' AND BigMachines__Is_Primary__c = true";
            qr = connection.query(soqlQuery);
            exRecords = qr.getRecords();
            BigMachines__Quote__c bmp = (BigMachines__Quote__c) exRecords[0];

            quoteVersion = ((int) bmp.getRevision__c());

            soqlQuery = "SELECT BigMachines_BOM_Class__c, BigMachines__Description__c, Unit_Qty__c, Group_Qty__c, Group__c, "
                    + "BigMachines__Quantity__c, Item_Line_Number__c, Model_Name__c, Model__c, Name, Parent_Doc__c  "
                    + "FROM BigMachines__Quote_Product__c WHERE Quote_Number__c = '" + quoteNumber
                    + "' ORDER BY Parent_Doc__c, Group__c, Name";

            qr = connection.query(soqlQuery);
            if (qr.getSize() > 0) {
                exRecords = qr.getRecords();
                int exportRows = exRecords.length;


                StringBuilder parentDoc = new StringBuilder("('");
                HashMap<String, Integer> map = new HashMap<>();

                int lineBoM = 0;
                String quoteVersionString = "V" + String.format("%03d", (int)bmp.getRevision__c());
                exportFileName = (oth.getAccount_Abbr_Name_Opportunity__c().replace("/", "-")
                        + "-" + oth.getOpportunity_Name_Quote__c().replace("/", "-")
                        + "-Q" + quoteNumber + quoteVersionString);
                String prevGroupName = "";
                String agileID = oth.getAgile_Opportunity_ID_Opportunity__c();


                BigMachines__Quote_Product__c[] exArray = new BigMachines__Quote_Product__c[exportRows];

                for (int i = 0; i < exportRows; i++) {
                    exArray[i] = (BigMachines__Quote_Product__c) exRecords[i];
                }

                /* Sort Object array using Parent_Doc__c as Integer */

                List<BigMachines__Quote_Product__c> exList = new ArrayList<>(Arrays.asList(exArray));
                exList.sort(new ParentComparator());

                /* Create List with Support items together */

                List<BigMachines__Quote_Product__c> maintList = new ArrayList<>();

                for (BigMachines__Quote_Product__c item : exList )  {
                    if ( ! (item.getBigMachines_BOM_Class__c().contains("Sup")))
                        maintList.add(item);
                }
                for (BigMachines__Quote_Product__c item : exList )  {
                    if ( item.getBigMachines_BOM_Class__c().contains("Sup")) {
                        item.setGroup__c("Maintenance");
                        maintList.add(item);
                    }
                }

                /* Convert list back to Array */

                BigMachines__Quote_Product__c[] eqp = maintList.toArray(new BigMachines__Quote_Product__c[exportRows]) ;

                for (int i = 0; i < exportRows; i++) {
                String groupName = (eqp[i].getGroup__c()).replace(",", "-");
                groupName = groupName.replace(" ", "-").toUpperCase();
                groupName = groupName.replace("&", "-");
                int groupNameLength = groupName.length();
                int MAX_LENGTH = 18;
                String shortGroupName = groupName;
                if (groupNameLength > MAX_LENGTH) {
                    shortGroupName = groupName.substring(0, 9) + "-" + groupName.substring(groupNameLength - 8);
                }

                if ( ! groupName.equals(prevGroupName)) {

                    // Group Header row

                    prevGroupName = groupName;
                    exportDisplay row = new exportDisplay(
                            agileID + '-' + eqp[i].getParent_Doc__c(),
                            "SYSTEM BOM",
                            "",
                            "",
                            agileCognizant.toUpperCase(),
                            "EA",
                            Integer.toString(++lineBoM),
                            quoteNumber + shortGroupName + eqp[i].getParent_Doc__c(),
                            Integer.toString(eqp[i].getGroup_Qty__c().intValue()),
                            "1",
                            Integer.toString(eqp[i].getGroup_Qty__c().intValue()),
                            "GROUP",
                            "",
                            quoteNumber,
                            Integer.toString(quoteVersion),
                            (eqp[i].getParent_Doc__c()).toUpperCase(),
                            "",
                            "",
                            (eqp[i].getModel__c()).toUpperCase(),
                            groupName,
                            "");

                    exportData.add(row);
                }

                    String quoteDescription = groupName + " "
                            + oth.getAccount_Abbr_Name_Opportunity__c().replace("/", "-").toUpperCase()
                            + " " + oth.getOpportunity_Name_Quote__c().toUpperCase();
                    exportDisplay row = new exportDisplay(
                            quoteNumber + shortGroupName + eqp[i].getParent_Doc__c(),
                            "SYSTEM BOM",
                            quoteDescription,
                            "",
                            agileCognizant.toUpperCase(),
                            "EA",
                            Integer.toString(++lineBoM),
                            (eqp[i].getName()).toUpperCase(),
                            Integer.toString((int) eqp[i].getBigMachines__Quantity__c()),
                            Integer.toString(eqp[i].getGroup_Qty__c().intValue()),
                            Integer.toString((int)eqp[i].getBigMachines__Quantity__c()),
                            (eqp[i].getBigMachines_BOM_Class__c()).toUpperCase(),
                            "",
                            quoteNumber,
                            Integer.toString(quoteVersion),
                            (eqp[i].getParent_Doc__c()).toUpperCase(),
                            "",
                            "",
                            (eqp[i].getModel__c()).toUpperCase(),
                            groupName,
                            (eqp[i].getBigMachines__Description__c()).toUpperCase());

                    exportData.add(row);

                    String key = eqp[i].getParent_Doc__c();
                    if (i == 0) {
                        parentDoc.append(quoteNumber);
                        parentDoc.append("-");
                        parentDoc.append(String.format("%04d", Integer.parseInt(key)));
                        map.put(key, i);
                    } else {
                        if (!map.containsKey(key)) {
                            parentDoc.append("', '");
                            parentDoc.append(quoteNumber);
                            parentDoc.append("-");
                            parentDoc.append(String.format("%04d", Integer.parseInt(key)));
                            map.put(key, i);
                        }
                    }
                }
                parentDoc.append("')");

                soqlQuery = "SELECT Doc_Config_Name__c, Doc_Description__c, Doc_Number__c, Id, Model_Name__c "
                        + "FROM CPQ_Model__c WHERE Model_Name__c IN " + parentDoc.toString();

                qr = connection.query(soqlQuery);
                SObject[] modelRecords = qr.getRecords();
                CPQ_Model__c[] model = new CPQ_Model__c[modelRecords.length];

                for (int i = 0; i < modelRecords.length; i++) {
                    model[i] = (CPQ_Model__c) modelRecords[i];

                    modelDisplay row = new modelDisplay(0,
                            Integer.parseInt(model[i].getDoc_Number__c()),
                            model[i].getDoc_Config_Name__c(),
                            model[i].getDoc_Description__c());

                    modelData.add(row);
                }
            }
            Comparator<modelDisplay> comparator = Comparator.comparingInt(modelDisplay::getModNumber);
            FXCollections.sort(modelData, comparator);
            int i = 1;
            for (modelDisplay item : modelData) {
                item.setModModelId(i++);
            }
            tableViewModel.setItems(modelData);
            tableViewModel.refresh();

        } catch (ConnectionException ce) {
            ce.printStackTrace();
        }

    }

    public void ButtonExportOnAction() {

        try {
            Workbook wb = new XSSFWorkbook();
            DataFormat format = wb.createDataFormat();
            Sheet exportSheet = wb.createSheet();

            Font exportFont = wb.createFont();
            exportFont.setFontName("Calibri");

            XSSFCellStyle headerStyle = (XSSFCellStyle) wb.createCellStyle();
            byte[] rgbHeader = {(byte)68, (byte)114,(byte)196};
            XSSFColor headerColor = new XSSFColor(rgbHeader, new DefaultIndexedColorMap());
            headerStyle.setFillForegroundColor(headerColor);
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Font headerFont = wb.createFont();
            headerFont.setColor(IndexedColors.WHITE.getIndex());
            headerFont.setFontName("Calibri");
            headerStyle.setFont(headerFont);

            XSSFCellStyle oddRowStyle = (XSSFCellStyle) wb.createCellStyle();
            byte[] rgbOddRow = {(byte)217, (byte)225,(byte)242};
            XSSFColor oddRowColor = new XSSFColor(rgbOddRow, new DefaultIndexedColorMap());
            oddRowStyle.setFillForegroundColor(oddRowColor);
            oddRowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            oddRowStyle.setFont(exportFont);

            XSSFCellStyle evenRowStyle = (XSSFCellStyle) wb.createCellStyle();
            evenRowStyle.setFillForegroundColor(IndexedColors.WHITE.index);
            evenRowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            evenRowStyle.setFont(exportFont);

            XSSFCellStyle assetStyle = (XSSFCellStyle) wb.createCellStyle();
            assetStyle.setAlignment(HorizontalAlignment.RIGHT);
            assetStyle.setFillForegroundColor(IndexedColors.CORAL.index);
            assetStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            assetStyle.setDataFormat(format.getFormat("0"));
            assetStyle.setFont(exportFont);

            XSSFCellStyle justifyOddStyle = (XSSFCellStyle) wb.createCellStyle();
            justifyOddStyle.setAlignment(HorizontalAlignment.RIGHT);
            justifyOddStyle.setFillForegroundColor(oddRowColor);
            justifyOddStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            justifyOddStyle.setDataFormat(format.getFormat("0"));
            justifyOddStyle.setFont(exportFont);

            XSSFCellStyle justifyEvenStyle = (XSSFCellStyle) wb.createCellStyle();
            justifyEvenStyle.setAlignment(HorizontalAlignment.RIGHT);
            justifyEvenStyle.setFillForegroundColor(IndexedColors.WHITE.index);
            justifyEvenStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            justifyOddStyle.setDataFormat(format.getFormat("0"));
            justifyEvenStyle.setFont(exportFont);

            Row row = exportSheet.createRow(0);

            for (int j = 0; j < tableViewExport.getColumns().size(); j++) {
                Cell headerCell = row.createCell(j);
                headerCell.setCellStyle(headerStyle);
                headerCell.setCellValue(tableViewExport.getColumns().get(j).getText());
            }
            Integer[] intCols = {6, 8, 9, 10, 14, 15};

            for (int i = 0; i < tableViewExport.getItems().size(); i++) {
                row = exportSheet.createRow(i + 1);
                for (int j = 0; j < tableViewExport.getColumns().size(); j++) {
                    Cell rowCell = row.createCell(j);
                    if (tableViewExport.getColumns().get(j).getCellData(i) != null) {

                        /* Integer Columns */

                        if (asList(intCols).contains(j)) {
                            rowCell.setCellValue(Integer.parseInt(tableViewExport.getColumns().get(j).getCellData(i).toString()));
                            if (i % 2 == 0) {
                                rowCell.setCellStyle(justifyOddStyle);
                            } else {
                                rowCell.setCellStyle(justifyEvenStyle);
                            }

                            /* Asset Column */

                        } else if (j == 12 ) {
                            String asset = tableViewExport.getColumns().get(j).getCellData(i).toString();
                            if (isNumeric(asset)) {
                                rowCell.setCellValue(Integer.parseInt(asset));
                                rowCell.setCellStyle(assetStyle);
                            }
                            else {
                                rowCell.setCellValue(asset);
                                rowCell.setCellStyle(assetStyle);
                            }
                        }
                        else {

                            /* Text Column */

                            rowCell.setCellValue(tableViewExport.getColumns().get(j).getCellData(i).toString());
                            if (i % 2 == 0) {
                                rowCell.setCellStyle(oddRowStyle);
                            } else {
                                rowCell.setCellStyle(evenRowStyle);
                            }
                        }
                    } else {
                        rowCell.setCellValue("");
                    }
                }
            }
            DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
            DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
            exportFileName = exportFileName + "-" + year.format(LocalDateTime.now()) + "y" +
                    month.format(LocalDateTime.now()) + "m" + day.format(LocalDateTime.now()) + "d.xlsx";
            DirectoryChooser dc = new DirectoryChooser();
            File selectedDirectory = dc.showDialog(gustMain.getPrimaryStage());
            String filePath = selectedDirectory.getAbsolutePath() + "\\" + exportFileName;

            File exportFile = new File(filePath);
            if (exportFile.exists())
                if (!exportFile.delete())
                    label_Export_Status.setText(exportFileName + " Deletion Error");
            if (exportFile.createNewFile()) {
                FileOutputStream fileOut = new FileOutputStream(exportFile);
                wb.write(fileOut);
                fileOut.close();

                label_Export_Status.setText(exportFileName + " Export Complete");
                label_Export_Status.getStyleClass().remove(0);
                label_Export_Status.getStyleClass().add(0, "label-success");
            }

        } catch(IOException ex){
            ex.printStackTrace();
        }
    }


}
