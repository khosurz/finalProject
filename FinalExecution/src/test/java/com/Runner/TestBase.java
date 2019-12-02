package com.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.Pages.HomePage;

public class TestBase {
	
	public static HomePage home;

	//ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getWebDriver() {
		return driver.get();
	}

	public void createDriverWith(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver", "/Users/khosruzzaman/eclipse-workspace/FinalExecution/chromedriver");
			driver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.firefox.driver", "/Users/khosruzzaman/eclipse-workspace/FinalExecution/geckodriver");
			driver.set(new FirefoxDriver());
		}
	}
	
	@BeforeTest
	public void testStartUp() {
		System.out.println("Test Started..............");
	}
	@BeforeMethod
	public void rampUp() {
		System.out.println("Browser Should Start Here........");
	}
	@AfterMethod
	public void rampdown() {
		driver.get().quit();
		System.out.println("Browser Should be Closed Here");
	}
	@AfterTest
	public void testCompleted() {
		System.out.println("Test Is Done...................");
	}

}
