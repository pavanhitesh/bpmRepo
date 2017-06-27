package com.bpm.pageactions;



import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bpm.base.BaseFramework;
import com.bpm.base.BaseWebDriver;
import com.bpm.pageobjects.BPMHomePage;

import com.bpm.util.TestStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;



public class BPMHomeActions extends BaseFramework {

	WebDriver d;
	BaseWebDriver base;
	BPMHomePage obj;

	public BPMHomeActions(WebDriver d) {
		this.d=d;
		base = new BaseWebDriver(this.d);
		obj = new BPMHomePage();
	}


	public void clickAllTaskTab() throws Exception{

		try{
			base.clickAndWait(base.getWebElement(obj.getAllTask));
			base.delay(3);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}

	}

	public void searchCaseId(String caseId) throws Exception {

		try{
			getReport().insertStep("Searching for Case Id", "Case ID : "+caseId, TestStatus.INFO, "", false);
			base.Clear(base.getWebElement(obj.getCaseIDSearchBox));
			base.delay(2);
			base.sendKeys(base.getWebElement(obj.getCaseIDSearchBox), caseId);
			base.waitForPageToLoad();
			base.delay(3);
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


	public void ClickLogOut() throws Exception{
		try{
			base.clickAndWait(base.getWebElement(obj.getUserNamedropdown));
			base.delay(2);
			base.clickAndWait(base.getWebElement(obj.getLogOutButton));
			base.delay(1);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}


	public void clickTaskTab() throws Exception{
		try{
			base.clickAndWait(base.getWebElement(obj.getTaskTab));
			base.delay(3);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}


	public void clickCaseLink(String caseId) throws Exception{
		try{
			base.sendKeys(base.getWebElement(obj.getCaseIDSearchBox), caseId);
			base.delay(3);
			base.clickAndWait(base.getWebElement(replaceLocator(obj.getCaseLink, caseId)));
			base.delay(3);
		}catch(Exception e){
			getReport().insertStep(e.getMessage(), "", TestStatus.FAIL, "", true);
			throw e;
		}
	}

	/**
	 * to get Case ID form api call
	 * @throws IOException 
	 */

	public String postNewPurchase() throws IOException   {
		
		String filepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"json"+File.separator+"tst.json";
		RestAssured.baseURI = getProperty("server.host");
		String caseId = "";
		File jsonLocation = new File(filepath);
		Header header = new Header("ocp-apim-subscription-key", "D050FF63-35B5-43AA-87FB-80C2D22952CC");
																 
		Header contentType = new Header("Content-Type", "application/json");

		//Initial POST to receive the api token
		String access_token = given().log().all()
				.formParam("grant_type", "password")
				.formParam("userName", getProperty("server.username"))
				.formParam("password", getProperty("server.password"))
				.when().post("/token")
				.then().statusCode(200).body(containsString("access_token"))
				.extract().path("access_token");
		Header auth = new Header("Authorization", "bearer " + access_token);

		//The actual POST for packagepurchas
		Response response = given().log().all()
				.header(header)
				.header(contentType)
				.header(auth)
				.body(jsonLocation)
				.when().post("/sales/services/packagepurchase")
				.then()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.extract().response();

		caseId = response.path("ActivitiCaseItems.ActivitiServices.ActivitiCaseId").toString();
		System.out.println(caseId);
		//getReport().insertStep("The Activity Case ID", "Activity Case ID"+caseId, TestStatus.INFO, "", false);
		return caseId;
		
	}

}
