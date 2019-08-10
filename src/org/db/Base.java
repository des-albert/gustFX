package org.db;

import com.agile.ws.service.attachment.v1.jaxws.AttachmentPortType;
import com.agile.ws.service.attachment.v1.jaxws.AttachmentService;
import com.agile.ws.service.business.v1.jaxws.BusinessObjectPortType;
import com.agile.ws.service.business.v1.jaxws.BusinessObjectService;
import com.agile.ws.service.collaboration.v1.jaxws.CollaborationPortType;
import com.agile.ws.service.collaboration.v1.jaxws.CollaborationService;
import com.agile.ws.service.metadata.v1.jaxws.AdminMetadataPortType;
import com.agile.ws.service.metadata.v1.jaxws.AdminMetadataService;
import com.agile.ws.service.search.v1.jaxws.SearchService;
import com.agile.ws.service.search.v1.jaxws.SearchService_Service;
import com.agile.ws.service.table.v1.jaxws.TablePortType;
import com.agile.ws.service.table.v1.jaxws.TableService;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.db.Shared.*;

public class Base {

  @FXML
  Label label_User, label_Version;
  @FXML
  Button buttonExceptions, buttonBaseQuit;

  private static final String VERSION = "V 2.0";
  private static String agileServerURL, agileUsername, userFullName;

  static String sfdcOwnerId, agileCognizant;
  static EnterpriseConnection connection;
  private static String password;


  static BusinessObjectPortType agileBusinessObjectStub;
  static AttachmentPortType agileAttachmentStub;
  static AdminMetadataPortType agileAdminStub;
  static TablePortType agileTableStub;
  static CollaborationPortType agileCollaborationStub;
  static SearchService agileSearchStub;
  static ObservableList<String> manNameChoices, productTeams, analysts, prodLineChoices, priceCatChoices,
      prodFamilyChoices, bomClassChoices, codeTypes;

  public void initialize() {

    if (sfdcLogin()) {
      if (agileLogin()) {
        label_User.setText("Salesforce and Agile login success");
        label_User.getStyleClass().remove(0);
        label_User.getStyleClass().add(0, "label-success");
      } else {
        label_User.setText("Agile login failed");
        label_User.getStyleClass().remove(0);
        label_User.getStyleClass().add(0, "label-failure");
      }
    } else {
      label_User.setText("Salesforce login failed");
      label_User.getStyleClass().remove(0);
      label_User.getStyleClass().add(0, "label-failure");
    }

  }

  private boolean sfdcLogin() {

    agileECO = new agileItem();
    agileMCO = new agileItem();
    customCode = new agileItem();
    manPart  = new agileItem();
    redlineManPart  = new agileItem();

    String currentDirectory = System.getProperty("user.dir");
    final String version = VERSION;
    final String dataFile = currentDirectory + "/UserData.txt";
    final String manufacturerFile = currentDirectory + "/manData.txt";

    try {
      FileReader fr = new FileReader(dataFile);
      BufferedReader br = new BufferedReader(fr);
      userFullName = br.readLine();
      String sfdcUsername = br.readLine();
      password = br.readLine();

      ConnectorConfig config = new ConnectorConfig();

      sfdcOwnerId = br.readLine();

      config.setUsername(sfdcUsername);
      config.setPassword(password);

      String authEndPoint = br.readLine();
      config.setAuthEndpoint(authEndPoint);
      connection = new EnterpriseConnection(config);

      agileServerURL = br.readLine();
      if (agileServerURL.contains("dv"))
        label_Version.setText(version + "DV");
      else
        label_Version.setText(version);
      agileUsername = br.readLine();
      agileCognizant = br.readLine();

      label_User.setText(userFullName + " Salesforce login success");
      label_User.getStyleClass().remove(0);
      label_User.getStyleClass().add(0, "label-success");

      br.close();
      fr.close();

      fr = new FileReader(manufacturerFile);
      br = new BufferedReader(fr);

      manNameChoices = FXCollections.observableArrayList();
      String line;
      while ((line = br.readLine()) != null) {
        manNameChoices.add(line);
      }

      br.close();
      fr.close();


      prodLineChoices = FXCollections.observableArrayList("CASCADE",
          "CUSTOM ENGINEERING", "CCS", "SHASTA", "STORAGE");
      priceCatChoices = FXCollections.observableArrayList("CE-HW-CPG", "CE-HW-SCP",
          "CE-HW-SPG", "CE-SW", "CE-INST", "SUPHW30", "SUPHW3P", "SUPHW3L", "SUPHW3M", "SUPHW3H", "" +
              "SUPSW30", "SUPSW3P", "SUPSW3L", "SUPSW3M", "SUPSW3H", "CE-SVC-PS", "CE-SVC-TNG");
      prodFamilyChoices = FXCollections.observableArrayList("CA", "CS", "DDN", "ES", "SNX", "STO", "XA");
      bomClassChoices = FXCollections.observableArrayList("ctBomBlade", "ctBomBladeOpt", "ctBomBoot",
          "ctBomCabAux", "ctBomCabOp", "ctBomCabs", "ctBomDoors", "ctBomFacility", "ctBomFreight", "ctBomFte",
          "ctBomFtePs", "ctBomHba", "ctBomHbaCables", "ctBomHbaSsd", "ctBomInstall", "ctBomInstallSw", "ctBomMem",
          "ctBomNet", "ctBomPci", "ctBomPdc", "ctBomPdu", "ctBomProc", "ctBomProcGpu", "ctBomProcMic",
          "ctBomProcOpt", "ctBomRackOpt", "ctBomRackPdu", "ctBomRacks", "ctBomServer", "ctBomServerChas",
          "ctBomServerMb", "ctBomServerOpt", "ctBomStoCtrl", "ctBomStoCtrlDisk", "ctBomStoDsk", "ctBomStoDskSsd",
          "ctBomStoTray", "ctBomStoTrayDisk", "ctBomSupFte", "ctBomSupHSML", "ctBomSupHw",
          "ctBomSupSw", "ctBomSvc", "ctBomSw", "ctBomSwDBug", "ctBomSwFee", "ctBomSwitch", "ctBomSwitchOpt",
          "ctBomSwOs", "ctBomSwPe", "ctBomSwWlm", "ctBomSys", "ctBomTapeLib", "ctBomTapeMedia", "ctBomTrng");
      analysts = FXCollections.observableArrayList("Erickson, Sue (sce)", "Wu, Bing (bing)");
      productTeams = FXCollections.observableArrayList("CPG", "SCP", "SPG");
      codeTypes = FXCollections.observableArrayList("Product Led", "Sales Led");

      return true;
    } catch (ConnectionException | IOException ce) {
      ce.printStackTrace();
      label_User.setText("Salesforce login failed");
      label_User.getStyleClass().remove(0);
      label_User.getStyleClass().add(0, "label-failure");

      return false;
    }
  }

  private boolean agileLogin() {
      try {
        String BUSINESS_OBJECT_URL = "/BusinessObject";
        URL url = new URL(agileServerURL + BUSINESS_OBJECT_URL + "?wsdl");
        BusinessObjectService businessLocator = new BusinessObjectService(url);
        if ((agileBusinessObjectStub = businessLocator.getBusinessObject()) == null)
          return false;
        Map<String, Object> reqContextBusinessObject = ((BindingProvider) agileBusinessObjectStub).getRequestContext();
        reqContextBusinessObject.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextBusinessObject.put(BindingProvider.PASSWORD_PROPERTY, password);


        //  Collaboration
        String COLLABORATION_URL = agileServerURL + "/" + "Collaboration";
        url = new URL(COLLABORATION_URL + "?WSDL");
        CollaborationService collaborationLocator = new CollaborationService(url);
        if ((agileCollaborationStub = collaborationLocator.getCollaboration()) == null)
          return false;
        Map<String, Object> reqContextCollaboration = ((BindingProvider) agileCollaborationStub).getRequestContext();
        reqContextCollaboration.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextCollaboration.put(BindingProvider.PASSWORD_PROPERTY, password);

        //  Attachment
        String ATTACHMENT_URL = agileServerURL + "/" + "Attachment";
        url = new URL(ATTACHMENT_URL + "?WSDL");
        AttachmentService attachmentLocator = new AttachmentService(url);
        if ((agileAttachmentStub = attachmentLocator.getAttachment()) == null)
          return false;
        Map<String, Object> reqContextAttachment = ((BindingProvider) agileAttachmentStub).getRequestContext();
        reqContextAttachment.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextAttachment.put(BindingProvider.PASSWORD_PROPERTY, password);

        //  AdminMetaData
        String ADMIN_URL = agileServerURL + "/" + "AdminMetadata";
        url = new URL(ADMIN_URL + "?WSDL");
        AdminMetadataService adminLocator = new AdminMetadataService(url);
        if ((agileAdminStub = adminLocator.getAdminMetadata()) == null)
          return false;
        Map<String, Object> reqContextAdmin = ((BindingProvider) agileAdminStub).getRequestContext();
        reqContextAdmin.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextAdmin.put(BindingProvider.PASSWORD_PROPERTY, password);

        //  Table
        String TABLE_URL = agileServerURL + "/" + "Table";
        url = new URL(TABLE_URL + "?WSDL");
        TableService tableLocator = new TableService(url);
        if ((agileTableStub = tableLocator.getTable()) == null)
          return false;
        Map<String, Object> reqContextTable = ((BindingProvider) agileTableStub).getRequestContext();
        reqContextTable.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextTable.put(BindingProvider.PASSWORD_PROPERTY, password);

        //  Search
        String SEARCH_URL = agileServerURL + "/" + "Search";
        url = new URL(SEARCH_URL + "?WSDL");
        SearchService_Service searchLocator = new SearchService_Service(url);
        if ((agileSearchStub = searchLocator.getSearch()) == null)
          return false;
        Map<String, Object> reqContextSearch = ((BindingProvider) agileSearchStub).getRequestContext();
        reqContextSearch.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
        reqContextSearch.put(BindingProvider.PASSWORD_PROPERTY, password);


      } catch (IOException ce) {
        label_User.setText("Agile login failed");
        label_User.getStyleClass().remove(0);
        label_User.getStyleClass().add(0, "label-failure");
      }

      label_User.setText(userFullName + " Salesforce + Agile login success");
    label_User.getStyleClass().remove(0);
      label_User.getStyleClass().add(0, "label-success");
      return true;
    }

    public void ButtonBaseQuitOnAction () {
      Platform.exit();
    }

    public void ButtonExceptionsOnAction () {
      try {
        FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("exceptions.fxml"));
        Parent partForm = fxmlFormLoader.load();
        Stage exceptionStage = new Stage();
        exceptionStage.setTitle("Sales Operations Exceptions");
        exceptionStage.setScene(new Scene(partForm, 1820, 650));
        exceptionStage.show();
      } catch (IOException ex) {
        ex.printStackTrace();
        label_User.setText("Exceptions FormLoader failed");
        label_User.getStyleClass().remove(0);
        label_User.getStyleClass().add(0, "label-failure");
      }
    }
  }


