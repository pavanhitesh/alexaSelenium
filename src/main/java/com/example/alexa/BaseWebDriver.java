package com.example.alexa;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


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
				System.setProperty("webdriver.chrome.driver", builder.toString());
				driver = new ChromeDriver();
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
