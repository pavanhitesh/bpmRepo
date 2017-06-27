package com.bpm.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features ="src/main/java/com/bpm/features/",
				glue ="com/bpm/definitions/",
				tags={"@BPMAddHaluer1"},
				plugin={"pretty", "html:report/cucumber-html-report","json:report/cucumber-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
