package com.bpm.pageactions;



import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.BPMLogin_PageObjects;

import com.bpm.util.TestStatus;



public class BPMLogin_PageActions extends BaseFramework {

	WebDriver d;
	BaseWebDriver base;
	BPMLogin_PageObjects obj;

	public BPMLogin_PageActions(WebDriver d) {
		this.d=d;
		base = new BaseWebDriver(this.d);
		obj = new BPMLogin_PageObjects();
	}

	public void loginToBPM() throws Exception {
		try{
			if(getProperty("env").contentEquals("qa")){
				String userName = getProperty("qa_userName");
				String password = getProperty("qa_password");
				getReport().insertStep("Login to BPM Portal", "User Trying to Login to BPM Portal", TestStatus.INFO, "", false);
				base.sendKeys(base.getWebElement(obj.getUserIdTextBox), userName);
				base.sendKeys(base.getWebElement(obj.getPasswordTextBox), password);
				base.click(base.getWebElement(obj.getSigninButton));
				base.delay(3);
			}else{
				String userName = getProperty("dev_userName");
				String password = getProperty("dev_password");
				getReport().insertStep("Login to BPM Portal", "User Trying to Login to BPM Portal", TestStatus.INFO, "", false);
				base.sendKeys(base.getWebElement(obj.getUserIdTextBox), userName);
				base.sendKeys(base.getWebElement(obj.getPasswordTextBox), password);
				base.click(base.getWebElement(obj.getSigninButton));
				base.delay(3);
				
			}
			
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}


	}

	public boolean LoginSuccess() throws Exception{

		if(base.getWebElements(obj.getLoginComfirmation).size()>0){
			getReport().insertStep("Login to BPM Portal", "User Successfully Naviagted", TestStatus.PASS, "", true);
			return true;
		}else{
			getReport().insertStep("Login to BPM Portal", "User Unable to Naviagte", TestStatus.FAIL, "", true);
			return false;
		}
	}


}
