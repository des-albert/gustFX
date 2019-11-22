package org.db;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class oppDisplay {

    private final SimpleIntegerProperty oppIndex;
    private final SimpleStringProperty oppOpportunity;
    private final SimpleStringProperty oppStatus;
    private final SimpleStringProperty oppShipDate;
    private final SimpleStringProperty oppExecDate;
    private final SimpleStringProperty oppQualified;
    private final SimpleStringProperty oppPrimary;
    private final SimpleStringProperty oppException;

    oppDisplay(int index, String opp, String status, String shipDate, String execDate, String qual, String primary, String exception) {

        oppIndex = new SimpleIntegerProperty(index);
        oppOpportunity = new SimpleStringProperty(opp);
        oppStatus = new SimpleStringProperty(status);
        oppShipDate = new SimpleStringProperty(shipDate);
        oppExecDate = new SimpleStringProperty(execDate);
        oppQualified = new SimpleStringProperty(qual);
        oppPrimary = new SimpleStringProperty(primary);
        oppException = new SimpleStringProperty(exception);
    }

    public int getOppIndex () { return oppIndex.get();}
    public String getOppOpportunity () {return oppOpportunity.get();}
    public String getOppStatus () {return oppStatus.get();}
    public String getOppShipDate () {return oppShipDate.get();}
    public String getOppExecDate () {return oppExecDate.get();}
    public String getOppQualified () {return oppQualified.get();}
    public String getOppPrimary () {return oppPrimary.get();}
    public String getOppException () {return oppException.get();}

    public void setOppPrimary(String prim) {oppPrimary.set(prim);}
    public void setOppStatus(String status) {oppStatus.set(status);}
}

