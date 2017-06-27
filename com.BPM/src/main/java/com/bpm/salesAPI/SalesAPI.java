package com.bpm.salesAPI;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by georgev on 20/06/2017.
 */


public class SalesAPI {

    public static String postNewPurchase() {
        //Purchase body - currently as json
        //TODO refactored as csv to json for DataDriven consistency
        File jsonLocation = new File("src/test/resources/tst.json");

        // The ocp-apim-subscription-key header seems to be legacy from Azure / below value is also hardcoded on API-QA side
        Header header = new Header("ocp-apim-subscription-key", "D050FF63-35B5-43AA-87FB-80C2D22952CC");
        Header contentType = new Header("Content-Type", "application/json");

        //Initial POST to receive the api token
        String access_token = given().log().all()
                .formParam("grant_type", "password")  // required value
                .formParam("userName", API_Helper.getUsername())  // can be replaced with BaseFramework.getProperty or runtime param
                .formParam("password", API_Helper.getPassword())  // can be replaced with BaseFramework.getProperty or runtime param
                .when().post(API_Helper.getAPIHost() + "/token")  // can be replaced with BaseFramework.getProperty or runtime param
                .then().statusCode(200).body(containsString("access_token")) // Checks for Code 200 on the request and retrieves the api token for future uses
                .extract().path("access_token");

        //Sets the token as new header
        Header auth = new Header("Authorization", "bearer " + access_token);

        //The actual POST for packagepurchase
        Response response = given().log().all()
                .header(header)
                .header(contentType)
                .header(auth)
                .body(jsonLocation) // Uses the above hardcoded one
                .when().post("/sales/services/packagepurchase")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract().response();

        String activitiId = response.path("ActivitiCaseItems.ActivitiServices.ActivitiCaseId").toString(); // JsonPath for the last elem.

       String newactivitiId =  activitiId.substring(2, activitiId.length()-2);
        System.out.println(newactivitiId);
        System.out.println(activitiId);

        return newactivitiId;
    }

}