package com.bpm.definitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bpm.base.BaseWebDriver;
import com.bpm.pageactions.PageActions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Example {
	
	private Scenario scenario;
	BaseWebDriver base;
	WebDriver driver;
	Logger logger = LogManager.getLogger(Example.class);
	
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		logger.info("Started the Scenario");
		System.out.println("executed before method");
		base = new BaseWebDriver(driver);
		driver = base.createWebDriverInstance("Chrome");
		this.scenario=scenario;
		
	}
	
	@After
	public void embedScreenshot() {
		try {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			driver.close();
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Given("^I Navigate To Downloads$")
	public void i_Navigate_To_Download() throws Exception {
		logger.info("Navigating to Download");
		PageActions actions = new PageActions(driver);
		actions.navigateToDownload();
		
	}
	
	@Given("^I Open URL$")
	public void i_Open_URL() throws Exception {
		logger.info("Opening the url");
		base.openURL("http://www.seleniumhq.org/");
		
	}
	
	
	
	

}
