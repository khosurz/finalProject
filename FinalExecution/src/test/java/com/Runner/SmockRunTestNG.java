package com.Runner;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.mobile.AddNetworkConnection;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.AddNewUser;
import com.Pages.HomePage;
import com.Pages.MyAccount;

public class SmockRunTestNG extends TestBase {

// HomePage homePage(WebDriver driver) {
//		return null;
//	}

	@Test
	public void login() {
		// To create new webDriver
		this.createDriverWith("chrome");
		WebDriver driver = this.getWebDriver();
		HomePage home = new HomePage(driver);
		home.goToHomePage();
		home.login();
		String actualProfileName = home.getAccVarification();
		Assert.assertEquals(actualProfileName, "KHOSRUZ ZAMAN", "Faild to find Proper Profile name ");
		home.logOut();
	} 
	private void extracted() {
		home.goToHomePage();
	}
	@Test
	public void myAccount() {
		this.createDriverWith("chrome");
		WebDriver driver = this.getWebDriver();
		MyAccount myAcc = new MyAccount(driver);
		home = new HomePage(driver);
		extracted();
		home.login();
		//myAcc.getAvailableOptions();
		home.takeMeToAccount();
		String actualMyAccount = myAcc.getAccountName();
		Assert.assertEquals(actualMyAccount, "NULL", "Failed to go to my Account");
	} 
	@Test
	public void logOut() {
		this.createDriverWith("chrome");
		WebDriver driver = this.getWebDriver();
		home = new HomePage(driver);
		extracted();
		home.login();
		home.logOut();
		String actualProfileName = home.getAccVarification();
		Assert.assertEquals(actualProfileName, "NULL", "Failed Login doesn't Happend");
	}

	@Test
	public void signUP() {
		createDriverWith("chrome");
		WebDriver driver = this.getWebDriver();
		home = new HomePage(driver);
		home.goToHomePage();
		home.takeMeToSignup();
		AddNewUser addUsr = new AddNewUser(driver);
		Random random = new Random();
		int regNum = random.nextInt();
		addUsr.newUserRegistration(null);
		String actualProfileName = home.getAccVarification();
		Assert.assertEquals(actualProfileName, "NULL",
				"Faield To Find To Proper Profile Name After Registrationb");
	} 

}
