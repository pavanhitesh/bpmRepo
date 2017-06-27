package com.bpm.definitions;


import com.bpm.base.BaseFramework;
import com.bpm.salesAPI.SalesAPI;
import com.bpm.util.TestStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


/**
 * Created by georgev on 20/06/2017.
 */

public class APIDefinitions extends BaseFramework{

    private String newActivitiCaseId;
    
    
    

    @Given("^I Make a New Purchase in Sales Portal$")
    public void i_Make_a_New_Purchase_in_Sales_Portal() throws Exception{
        this.newActivitiCaseId  = SalesAPI.postNewPurchase();
        setNewCaseID(this.newActivitiCaseId);
        getReport().insertStep("The Case ID Generated from Sales API", getNewCaseID(), TestStatus.INFO, "", false);
        System.out.print("New Purchase" + newActivitiCaseId);
    }


    @And("^I print the New Activiti Case Id$")
    public void iPrintTheNewActivitiCaseId() throws Exception {
        System.out.print("New Activiti CaseID generated" + newActivitiCaseId);
    }
}
