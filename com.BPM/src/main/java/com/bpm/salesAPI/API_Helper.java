package com.bpm.salesAPI;

import io.restassured.RestAssured;

/**
 * Created by georgev on 20/06/2017.
 */


public class API_Helper {

    public static String getAPIHost() {
        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://rubicon-services-api-qa.aws.rubiconglobal.com";
        }
        RestAssured.baseURI = baseHost;
        return baseHost;
    }

    public static String getUsername() {
        String username = System.getProperty("api.user");
        if(username==null){
            username = "adrian.balogh@lateral-inc.com";
        }
        return username;
    }

    public static String getPassword() {
        String password = System.getProperty("api.pass");
        if(password==null){
            password = "Rubic0n$";
        }
        return password;
    }


}
