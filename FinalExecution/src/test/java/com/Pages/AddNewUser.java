package com.Pages;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;

public class AddNewUser extends MasterPage {

	String firstNameField = "Name:fname";
	String lastNameField = "Name:lname";
	String emailField = "Name:email";
	String phoneNumber = "Name:phone";
	String passwordField = "Xpath: //input[@name='password']";
	String cnfPassword = "Xpath://input[@name='confirm_password']";
	String chkBox = "Xpath://label[@id='register_updatecheck']";
	String submitButton = "Xpath://input[@type='submit']";
	String loginSucc = "Xpath://*[@id='message-red']/table/tbody/tr/td[1]";

	public AddNewUser(WebDriver driver) {
		super(driver);
	}

	public void newUserRegistration(String email) {
		typeOnElement(firstNameField, "Khosruz");
		typeOnElement(lastNameField, "zaman");
		typeOnElement(emailField, email);
		typeOnElement(phoneNumber, "2136549872");
		typeOnElement(passwordField, "1234abcd");
		typeOnElement(cnfPassword, "1234abcd");
		clickElement(chkBox);
		clickElement(submitButton);
		getElementText(loginSucc);
		getElementsText(loginSucc);
		// public void completeREgistraionWith(String email, String uname, String fname,
		// String lname ) {
	}

	public void cloeseBrowser() {
		closeBrowser();
	}

}
