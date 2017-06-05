package com.bpm.pageactions;



import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.BPMCaseDetails;

import com.bpm.util.TestStatus;



public class BPMCaseActions extends BaseFramework {

	WebDriver d;
	BaseWebDriver base;
	BPMCaseDetails obj;

	public BPMCaseActions(WebDriver d) {
		this.d=d;
		base = new BaseWebDriver(this.d);
		obj = new BPMCaseDetails();
	}

	public void clickClaim() throws Exception {
		try{

			getReport().insertStep("clicking on claim", "user claiming the task", TestStatus.INFO, "", false);
			base.click(base.getWebElement(obj.getClaimButton));
			base.waitForPageToLoad();
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}

	}

	public void SelectLOADetails(String loavalue) throws Exception{
		try{
			base.click(base.getWebElement(obj.getDropdownLOA));
			base.click(base.getWebElement(replaceLocator(obj.getLOADropwonValue,loavalue)));
			getReport().insertStep("LOA Value", "The LOA Value is Selected " +loavalue, TestStatus.PASS, "", true);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}


	public void clickAddHaluerButton() throws Exception{

		try{
			base.clickAndWait(base.getWebElement(obj.getAddHaluerButton));
			base.wait(3000);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}

	public void addHaluerDetails() throws Exception{

		try{
			base.sendKeys(base.getWebElement(obj.getHaulerTextBox), "Testutomation");
			base.sendKeys(base.getWebElement(obj.getRateTypeDropDown), "Lock Fee");
			base.click(base.getWebElement(replaceLocator(obj.getRateDropwonValue,"Lock Fee")));
			base.sendKeys(base.getWebElement(obj.getUnitOfMeasureDropDown), "Each");
			base.click(base.getWebElement(replaceLocator(obj.getUnitOfMeasureDropwonValue,"Each")));
			base.sendKeys(base.getWebElement(obj.getRateTextBox), "10.0");
			base.delay(3);
			base.click(base.getWebElement(obj.getAddRateButton));
			base.delay(4);
			base.click(base.getWebElement(obj.getADDHaluerButton));
			base.delay(3);


		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}

	public void selectHaluerTermsAndDetails() throws Exception{

		try{
			base.click(base.getWebElement(obj.getHaluerAgreeTerms));
			base.click(base.getWebElement(replaceLocator(obj.getHaluerAgreeTermsDropwonValue,"Yes, Hauler Candidate")));
			getReport().insertStep("Selecting Haluer Tearms Details", "", TestStatus.PASS, "", true);


		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}

	public void addContractedHaluerDetails() throws Exception{

		try{
			base.clickAndWait(base.getWebElement(obj.getAddContractedHaluer));
			base.wait(3000);
			base.Clear(base.getWebElement(obj.getNameTextBox));
			base.sendKeys(base.getWebElement(obj.getVendorIDTextBox), "AB1003");
			base.clickAndWait(base.getWebElement(obj.getSearchButton));
			base.wait(3000);
			base.click(base.getWebElement(replaceLocator(obj.getVendorLink,"AB1003")));
			base.click(base.getWebElement(obj.getVendorTypeDropDown));
			base.click(base.getWebElement(replaceLocator(obj.getVendorTypeDropDownValue,"Exclusive Franchise")));
			getReport().insertStep("The Vendor Details", "User Has Entered the Vendor Details", TestStatus.PASS, "", true);
			base.click(base.getWebElement(obj.getNextButton));
			base.delay(5);
			base.click(base.getWebElement(obj.getFinishButton));
			base.delay(5);
			getReport().insertStep("Adding Contracted Haluer", "Contracted Haluer is Added", TestStatus.PASS, "", false);


		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}

	public void completeTask() throws Exception{

		try{

			base.click(base.getWebElement(obj.getCompleteTaskButton));
			getReport().insertStep("Completing Task	", "Task Completed for adding Haluer", TestStatus.PASS, "", true);


		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}
	
}
