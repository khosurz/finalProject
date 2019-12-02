package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.AddNewUser;
import com.Pages.HomePage;
import com.Pages.MyAccount;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSmockTest {

	WebDriver driver;
	HomePage homePage;
	MyAccount myAccount;

	@Given("I am on WildFire home page")
	public void i_am_on_WildFire_home_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/khosruzzaman/eclipse-workspace/chromedriver");
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		homePage.goToHomePage();
	}

	@When("I click Loginlink button after click Create New Account link")
	public void i_click_Loginlink_button_after_click_Create_New_Account_link() {
		homePage.takeMeToSignup();
	}

	@When("I fillup all required fild after I click creat account button")
	public void i_fillup_all_required_fild_after_I_click_creat_account_button() {
		AddNewUser addNewUser = new AddNewUser(driver);
		addNewUser.newUserRegistration("kkks@gmail.com");
	
		}


	@Then("I close browser.")
	public void i_close_browser() {
		homePage.quitBrowser();
	}

}
