package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoughPage {
WebDriver driver = null;
	
	@BeforeTest
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver", "/Users/khosruzzaman/eclipse-workspace/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/");
	}
	@Test
	public void searchHomePage() {
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/");
		System.out.println("The Current Page : " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//div[@class='login-btn-outer']")).click();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user@netmenus.com");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@class='login_btn']")).click();
		//System.out.println("The Current Page : " + driver.findElement(By.xpath("//div[@class='user-name-top']/div[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//h2[@class='home-new-tl']")).getText());
		driver.findElement(By.xpath("//div[@id='navbar']/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//a[@class='active']")).click();
		System.out.println("about my acc : "+ driver.findElement(By.xpath("//p[@class='dash_board_text2']")).getText());

		//my account
		//my profile
		
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Successfully Jump out!!");
		}

}
//*[@id="message-green"]/table/tbody/tr