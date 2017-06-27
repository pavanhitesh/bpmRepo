$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "To Test BPM Portal",
  "description": "",
  "id": "to-test-bpm-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BPM"
    }
  ]
});
formatter.before({
  "duration": 6064892781,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "To upload customer document and add Haluer and complete the task",
  "description": "",
  "id": "to-test-bpm-portal;to-upload-customer-document-and-add-haluer-and-complete-the-task",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@BPMAddHaluer1"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I Make a New Purchase in Sales Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I Navigate to BPM Portal",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I Login to BPM",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I Click on All Task Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I Search CaseId \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Click on the Case Link \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I Click on Claim",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I Upload Customer Document",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I Click on the Cases Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "I Search CaseId \"\"",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I Click on the Case Link \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Click on Add3 Contact Button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I Click on Claim",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I Select LOA Details \"Yes, LOA looks OK\"",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I Click on Add Haluer Button",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I Add Hauler Name Details \"TestAutomation\"",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I Add Hauler Details \"Lock Fee\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I Add Hauler Details \"Caster Fee\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I Add Hauler Details Add Button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I Select Haulers Agree To The Terms",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I Add Contracted Haluer Details",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "I Click on the Task Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "I Search CaseId \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I Click on the Case Link \"\"",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I Click on Claim",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "I Select Cancellation Details \"No, the cancellation letter was not sent because there is no incumbent\"",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "I Click on Complete Task",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "I Click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I Click on Logout",
  "keyword": "And "
});
formatter.match({
  "location": "APIDefinitions.i_Make_a_New_Purchase_in_Sales_Portal()"
});
formatter.result({
  "duration": 39060821412,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Navigate_to_BPM_Portal()"
});
formatter.result({
  "duration": 2198026131,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Login_to_BPM()"
});
formatter.result({
  "duration": 3592745993,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_All_Task_Tab()"
});
formatter.result({
  "duration": 6435296862,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "duration": 8801780728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 26
    }
  ],
  "location": "BPMDefinitions.i_Click_on_the_Case_Link(String)"
});
formatter.result({
  "duration": 10282101978,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "duration": 329029323,
  "status": "passed"
});
formatter.match({
  "location": "BPMDefinitions.i_Upload_Customer_Documents()"
});
formatter.result({
  "duration": 2379854024,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 32 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RUB-BNTSR72\u0027, ip: \u002710.128.109.151\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\RAMYA~1.ANN\\AppData\\Local\\Temp\\scoped_dir10892_22601}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 4cd4d0e702dec5cf6dd8660b23e6b2f3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:122)\r\n\tat com.bpm.pageactions.BPMCaseActions.uploadContractDocument(BPMCaseActions.java:181)\r\n\tat com.bpm.definitions.BPMDefinitions.i_Upload_Customer_Documents(BPMDefinitions.java:235)\r\n\tat ✽.Given I Upload Customer Document(Login.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_the_Cases_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 26
    }
  ],
  "location": "BPMDefinitions.i_Click_on_the_Case_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add3_Contact_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes, LOA looks OK",
      "offset": 22
    }
  ],
  "location": "BPMDefinitions.i_Select_LOA_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Add_Haluer_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomation",
      "offset": 27
    }
  ],
  "location": "BPMDefinitions.i_Add_Hauler_Name_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Lock Fee",
      "offset": 22
    }
  ],
  "location": "BPMDefinitions.i_Add_Hauler_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Caster Fee",
      "offset": 22
    }
  ],
  "location": "BPMDefinitions.i_Add_Hauler_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Hauler_Details_Add_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Select_Haluer_Agree_To_The_Terms()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Add_Contracted_Haluer_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_the_Task_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 17
    }
  ],
  "location": "BPMDefinitions.i_Search_CaseId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 26
    }
  ],
  "location": "BPMDefinitions.i_Click_on_the_Case_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No, the cancellation letter was not sent because there is no incumbent",
      "offset": 31
    }
  ],
  "location": "BPMDefinitions.i_Select_Cancellation_Details(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Complete_Task()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BPMDefinitions.i_Click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3589582950,
  "status": "passed"
});
});