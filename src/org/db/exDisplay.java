package org.db;

import javafx.beans.property.SimpleStringProperty;


public class exDisplay {

    private final SimpleStringProperty exOpp;
    private final SimpleStringProperty exName;
    private final SimpleStringProperty exDate;
    private final SimpleStringProperty exStatus;
    private final SimpleStringProperty exNumber;
    private final SimpleStringProperty exAgileId;
    private final SimpleStringProperty exECO_MCO;
    private final SimpleStringProperty exApprovals;
    private final SimpleStringProperty exTask;
    private final SimpleStringProperty exCodes;

    exDisplay(String opp, String name, String dueDate, String status, String number, String agileId, String change,
              String approvals, String task, String codes) {
        this.exOpp = new SimpleStringProperty(opp);
        this.exName = new SimpleStringProperty(name);
        this.exDate = new SimpleStringProperty(dueDate);
        this.exStatus = new SimpleStringProperty(status);
        this.exNumber = new SimpleStringProperty(number);
        this.exAgileId = new SimpleStringProperty(agileId);
        this.exECO_MCO = new SimpleStringProperty(change);
        this.exApprovals = new SimpleStringProperty(approvals);
        this.exTask = new SimpleStringProperty(task);
        this.exCodes = new SimpleStringProperty(codes);

    }
    public String getExOpp () {return exOpp.get();}
    public String getExName () {return exName.get();}
    public String getExDate () {return exDate.get();}
    public String getExStatus () {return exStatus.get();}
    public String getExNumber () {return exNumber.get();}
    public String getExAgileId () {return exAgileId.get();}
    public String getExECO_MCO () {return exECO_MCO.get();}
    public String getExApprovals () {return exApprovals.get();}
    public String getExTask () {return exTask.get();}
    public String getExCodes () {return exCodes.get();}

    public void setExTask(String taskStatus) {exTask.set(taskStatus);}
    public void setExECO_MCO(String change) {exECO_MCO.set(change);}
    public void setExCodes(String codes) {exCodes.set(codes);}
    public void setExStatus(String status) {exStatus.set(status);}

}
