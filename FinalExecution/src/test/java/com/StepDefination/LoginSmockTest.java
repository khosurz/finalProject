package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSmockTest {
	WebDriver driver;
	HomePage testHome;

	@Given("I am on WildFire Home page")
	public void i_am_on_WildFire_Home_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/khosruzzaman/eclipse-workspace/chromedriver");
		driver = new ChromeDriver();
		testHome = new HomePage(driver);
		testHome.goToHomePage();
	}

	@When("I complete login with valid credentials")
	public void i_complete_login_with_valid_credentials() {
		testHome.login();
	}

	@Then("I see profile name as KHOSRUZ ZAMAN")
	public void i_see_profile_name_is() {
		testHome.getAccVarification();
		System.out.println(" My name is Appear as : " + testHome.getAccVarification());
	}

	@Then("I successfully loged out.")
	public void i_successfully_loged_out() {
		testHome.logOut();

	}

	@Then("I closed browser")
	public void i_closed_browser() {
		testHome.quitBrowser();

	}

}
