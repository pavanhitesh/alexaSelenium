package com.example.alexa;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseWebDriver {


	private static WebDriver driver;


	public static WebDriver getWebDriver(String browser) {
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("user.dir"));
		builder.append(File.separator);
		builder.append("driver");
		builder.append(File.separator);
		
		if(driver==null) {
			switch(browser) {
			case "ie" :
				builder.append("IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", builder.toString());
				driver = new InternetExplorerDriver();
				break;
			case "chrome":
				builder.append("chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", builder.toString());
				//driver = new ChromeDriver();
				ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			DesiredCapabilities capabilities = new DesiredCapabilities(DesiredCapabilities.chrome());
			capabilities.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability (ChromeOptions.CAPABILITY,options);
			ChromeDriverManager.getInstance().setup();
			driver = new ChromeDriver(capabilities);
				break;
			default:
				break;
			}
			driver.manage().window().maximize();
			return driver;
		}else {
			return driver;
		}
	}

}
