package com.bpm.pageactions;



import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.BPMHomePage;

import com.bpm.util.TestStatus;



public class BPMHomeActions extends BaseFramework {
	
	WebDriver d;
	BaseWebDriver base;
	BPMHomePage obj;
	
	public BPMHomeActions(WebDriver d) {
		this.d=d;
		base = new BaseWebDriver(this.d);
		obj = new BPMHomePage();
	}
	
	public void searchCaseId(String caseId) throws Exception {
		
		try{
		base.clickAndWait(base.getWebElement(obj.getAllTask));
		base.wait(3000);
		getReport().insertStep("Searching for Case Id", "Case ID : "+caseId, TestStatus.INFO, "", false);
		base.sendKeys(base.getWebElement(obj.getCaseIDSearchBox), caseId);
		base.waitForPageToLoad();
		base.clickAndWait(base.getWebElement(replaceLocator(obj.getCaseIDLink,caseId)));
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
		
		
	}
	
	public void ClickAdd3ContactButton() throws Exception{
		try{
		base.clickAndWait(base.getWebElement(obj.getAdd3ContactButton));
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}
	
	

	
}
