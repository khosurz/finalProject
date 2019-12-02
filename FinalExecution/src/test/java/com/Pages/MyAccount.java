package com.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;

public class MyAccount extends MasterPage {


	String loginLInkButton = "Xpath://div[@class='login-btn-outer']";
	String usernameFIeld = "Xpath://input[@name='txtUsername']";
	String passwordField = "Xpath://input[@name='txtPassword']";
	String loginButton = "Xpath://input[@class='login_btn']";
	String logOutButton = "Xpath://div[@class='login-btn-outer']";
	String accVarification = "Xpath://div[@class='user-name-top']/div[1]";
	String correctLanding = "Xpath://h2[@class='home-new-tl']";
	String locatorOfAvailableOptions = "Xpath://*[@id='middle_content_mrml']/div/div[2]";
	
	public MyAccount(WebDriver driver) {
		super(driver);
		
	}
	//Landing Verification
	public String getAccountName() {
		getElementsText(accVarification);
		//System.out.println(getElementsText(accVarification));
		return getElementText(correctLanding);
	}
	//Available List verification
	public List<String> getAvailableOptions(){
		getElementsText(locatorOfAvailableOptions);
		return getElementsText(locatorOfAvailableOptions);
		
	}
}
/*
 * // Actual List By the Help Of selenium 
		MyAccountPage myaccount = new MyAccountPage(driver);
		List<String> actualOptionResult = myaccount.getAllOptions();

		
		// Exp List Using Manually 
		List<String> expOptionResult = new ArrayList<>();
		expOptionResult.add("My Orders");
		expOptionResult.add("Profile");
		expOptionResult.add("My Return Requests");
		expOptionResult.add("Change Password");
		expOptionResult.add("My Favorite Products");
		expOptionResult.add("My Favorite Sellers");
		expOptionResult.add("My Favorite Sellers");

		assertThat(actualOptionResult, equalTo(expOptionResult));
*/
