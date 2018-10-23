package com.example.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.example.alexa.BaseWebDriver;
import com.example.pageobjects.SeleniumhqPageObjects;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	Logger logger = LogManager.getLogger(StepDefinitions.class);
	WebDriver driver;
	SeleniumhqPageObjects objects;
	private Scenario scenario;
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		this.scenario = scenario;
		logger.info("Started the Scenario");
		driver = BaseWebDriver.getWebDriver("chrome");
		objects = new SeleniumhqPageObjects(driver);
		System.out.println("executed before method");
	}
	
	@After
	public void embedScreenshot() {
		try {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			driver.close();
			driver.quit();
		} catch(Exception e) {
			logger.error(e);
		}
	}
	
	@Given("^User navigated to seleiumhq org with url \"([^\"]*)\"$")
	public void user_navigated_to_seleiumhq_org_with_url(String arg1) throws Throwable {
	    try {
	    	driver.get(arg1);
	    }catch(Exception e) {
	    	logger.error(e);
	    }
	}

	@When("^User click on download tab$")
	public void user_click_on_download_tab() throws Throwable {
	   try {
		   objects.clickDownloadLnk();
	   }catch(Exception e) {
	    	logger.error(e);
	    }
	}

	@Then("^User navigated to documentation tab$")
	public void user_navigated_to_documentation_tab() throws Throwable {
	    try {
	    	objects.clickDocumentationLnk();
	    }catch(Exception e) {
	    	logger.error(e);
	    }
	}
	
}
