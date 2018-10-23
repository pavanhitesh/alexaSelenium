package com.example.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Feature/",
				glue ="com/example/stepdefinitions/",
				plugin={"pretty", "html:report/cucumber-html-report","json:report/cucumber-report.json"})
public class TestRunner  {
}
