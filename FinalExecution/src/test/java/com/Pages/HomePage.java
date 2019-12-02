package com.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {

	String loginLInkButton = "Xpath://div[@class='login-btn-outer']";
	String usernameFIeld = "Xpath://input[@name='txtUsername']";
	String passwordField = "Xpath://input[@name='txtPassword']";
	String loginButton = "Xpath://input[@class='login_btn']";
	String logOutButton = "Xpath://div[@class='login-btn-outer']";
	String accVarification = "Xpath:/html/body/div[1]/nav/div/div[2]/div[1]/div/b";   
	String signUpLink = "Xpath://a[@class='right']";
	String myAccLink = "Xpath://div[@id='navbar']/ul/li[6]/a";
	String profileNameLevel = "Xpath://a[@class='active']";

	// Contractors Takes Driver from TastBase/Test
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Getter and Setter
	public String getAccVarification() {
		return getElementText(accVarification);
	}

	// Add URL
	public void goToHomePage() {
		//openBrowser(browser);
		gotoURL("https://www.demo.iscripts.com/netmenus/mrml/");
	}

	public void login() {
		clickElement(loginLInkButton);
		typeOnElement(usernameFIeld, "user@netmenus.com");
		typeOnElement(passwordField, "pass");
		clickElement(loginButton);

	}

	public void takeMeToAccount() {
		clickElement(myAccLink);
		clickElement(profileNameLevel);
		

	}

	public void logOut() {
		clickElement(logOutButton);
	}

	public void takeMeToSignup() {
	clickElement(loginLInkButton);
	clickElement(signUpLink);
	}
	public void closeBrowser() {
	//super.closeBrowser();
		closeBrowser();
	}
	public void allBrowserClose() {
		quitBrowser();
	}

	

}