package org.db;

import javafx.beans.property.SimpleStringProperty;

public class exportDisplay {
    private final SimpleStringProperty exParentId;
    private final SimpleStringProperty exPartType;
    private final SimpleStringProperty exDescription;
    private final SimpleStringProperty exProductLine;
    private final SimpleStringProperty exCognizant;
    private final SimpleStringProperty exUoM;
    private final SimpleStringProperty exBoM_Line;
    private final SimpleStringProperty exPart_Number;
    private final SimpleStringProperty exBoM_Qty;
    private final SimpleStringProperty exGroup_Qty;
    private final SimpleStringProperty exExtd_Qty;
    private final SimpleStringProperty exBoM_Class;
    private final SimpleStringProperty exAsset;
    private final SimpleStringProperty exQuote_Number;
    private final SimpleStringProperty exQuote_Version;
    private final SimpleStringProperty exModel_Number;
    private final SimpleStringProperty exModel_Name;
    private final SimpleStringProperty exExtDesc;
    private final SimpleStringProperty exConfigType;
    private final SimpleStringProperty exGroup_Name;
    private final SimpleStringProperty exPart_Description;

    exportDisplay(String parentId, String partType, String Description, String productLine, String cognizant,
                  String UoM, String BoM_Line, String partNumber, String BoM_Qty, String Group_Qty, String Extd_Qty,
                  String BoM_Class, String asset, String Quote_Number, String Quote_Version, String Model_Number,
                  String Model_Name, String extDesc, String configType, String Group_Name, String Part_Description) {
        exParentId = new SimpleStringProperty(parentId);
        exPartType = new SimpleStringProperty(partType);
        exDescription = new SimpleStringProperty(Description);
        exProductLine = new SimpleStringProperty(productLine);
        exCognizant = new SimpleStringProperty(cognizant);
        exUoM = new SimpleStringProperty(UoM);
        exBoM_Line = new SimpleStringProperty(BoM_Line);
        exPart_Number = new SimpleStringProperty(partNumber);
        exBoM_Qty = new SimpleStringProperty(BoM_Qty);
        exGroup_Qty = new SimpleStringProperty(Group_Qty);
        exExtd_Qty = new SimpleStringProperty(Extd_Qty);
        exBoM_Class = new SimpleStringProperty(BoM_Class);
        exAsset = new SimpleStringProperty(asset);
        exQuote_Number = new SimpleStringProperty(Quote_Number);
        exQuote_Version = new SimpleStringProperty(Quote_Version);
        exModel_Number = new SimpleStringProperty(Model_Number);
        exModel_Name = new SimpleStringProperty(Model_Name);
        exExtDesc = new SimpleStringProperty(extDesc);
        exConfigType = new SimpleStringProperty(configType);
        exGroup_Name = new SimpleStringProperty(Group_Name);
        exPart_Description = new SimpleStringProperty(Part_Description);
    }

    public String getExParentId() {return exParentId.get(); }
    public String getExPartType() {return exPartType.get(); }
    public String getExDescription() {return exDescription.get(); }
    public String getExProductLine() {return exProductLine.get(); }
    public String getExCognizant() {return exCognizant.get(); }
    public String getExUoM() {return exUoM.get(); }
    public String getExBoM_Line() {return exBoM_Line.get(); }
    public String getExPart_Number() {return exPart_Number.get(); }
    public String getExBoM_Qty() {return exBoM_Qty.get(); }
    public String getExGroup_Qty() {return exGroup_Qty.get(); }
    public String getExExtd_Qty() {return exExtd_Qty.get(); }
    public String getExBoM_Class() {return exBoM_Class.get();}
    public String getExAsset() {return exAsset.get(); }
    public String getExQuote_Number() {return exQuote_Number.get(); }
    public String getExQuote_Version() {return exQuote_Version.get(); }
    public String getExModel_Number() {return exModel_Number.get(); }
    public String getExModel_Name() {return exModel_Name.get(); }
    public String getExExtDesc() {return exExtDesc.get();}
    public String getExConfigType() {return exConfigType.get();}
    public String getExGroup_Name() {return exGroup_Name.get();}
    public String getExPart_Description() {return exPart_Description.get();}

    public void setExDescription(String Description) {
        exDescription.set(Description);
    }
    public void setExProductLine(String productLine) {
        exProductLine.set(productLine);
    }
    public void setExAsset(String asset) {
        exAsset.set(asset);
    }
    public void setExModel_Name(String Model_Name) { exModel_Name.set(Model_Name); }
    public void setExExtDesc(String extDesc) {
        exExtDesc.set(extDesc);
    }
}
