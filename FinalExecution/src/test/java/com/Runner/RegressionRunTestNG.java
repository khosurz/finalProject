package com.Runner;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.MyAccount;

public class RegressionRunTestNG extends TestBase{

	@Test
	public void myAccountOptions() {
		createDriverWith("chrome");  // This Function has the power of creating the new driver 
		WebDriver driver = this.getWebDriver();
		home = new HomePage(driver); 
		home.goToHomePage();
		home.login();
	  //home.takeMeToAccount();
		List<String> expOptionResult = new ArrayList<String>();
//		expOptionResult.add("Enter Your Location");
//		expOptionResult.add("Select Restaurant");
//		expOptionResult.add("View Menus");
//		expOptionResult.add("Place Your Orderd");
		System.out.println(expOptionResult);
	

		//assertThat(actualOptionResult, equals(expOptionResult));

	}



}
