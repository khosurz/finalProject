package com.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.HomePage;
import com.Pages.MyAccount;

//Singleton Concept

public class PageLoader {
	WebDriver driver;

	public HomePage homePage;
	public MyAccount myAccount;

	public WebDriver getDriver() {
		// Setup Chrome Driver
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/khosruzzaman/eclipse-workspace/FinalExecution/chromedriver");
			driver = new ChromeDriver();
		}
		return driver;

	}

	private HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	private MyAccount getMyAccountPage() {
		if (myAccount == null) {
			myAccount = new MyAccount(driver);

		}
		return myAccount;
	}

}