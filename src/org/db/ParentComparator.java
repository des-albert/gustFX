package org.db;

import com.sforce.soap.enterprise.sobject.BigMachines__Quote_Product__c;

import java.util.Comparator;

public class ParentComparator implements Comparator<BigMachines__Quote_Product__c>{

    @Override
    public int compare(BigMachines__Quote_Product__c a, BigMachines__Quote_Product__c b) {
        return Integer.parseInt(a.getParent_Doc__c()) - Integer.parseInt(b.getParent_Doc__c());
    }
}
