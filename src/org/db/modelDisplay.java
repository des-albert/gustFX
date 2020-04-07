package org.db;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class modelDisplay {
    private final SimpleIntegerProperty modModelId;
    private final SimpleIntegerProperty modNumber;
    private final SimpleStringProperty modConfigName;
    private final SimpleStringProperty modExtDesc;

    modelDisplay(int id, int number, String configName, String extDesc) {

        modModelId = new SimpleIntegerProperty(id);
        modNumber = new SimpleIntegerProperty(number);
        modConfigName = new SimpleStringProperty(configName);
        modExtDesc = new SimpleStringProperty(extDesc);
    }
    public int getModModelId () {return modModelId.get();}
    public int getModNumber() {return modNumber.get();}
    public String getModConfigName() {return modConfigName.get();}
    public String getModExtDesc() {return modExtDesc.get();}

    public void setModModelId(int id) {modModelId.set(id);}
    public void setModConfigName(String configName) { modConfigName.set(configName);}
    public void setModExtDesc(String extDesc) { modExtDesc.set(extDesc);}
}
