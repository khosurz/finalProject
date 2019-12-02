package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterPage {
	
	public static WebDriver driver;

	// Master Constructor
    MasterPage(WebDriver driver) {
 	this.driver = driver;
 		}
    
    

	public static void gotoURL(String url) {
		driver.get(url);
	}

	public void clickElement(String locator) {
		if (locator.contains("ID")) {
			driver.findElement(By.id(locator.split(":")[1])).click();
			waitFor(1000);
		} else if (locator.contains("Xpath")) {
			driver.findElement(By.xpath(locator.split(":")[1])).click();
			waitFor(1000);
		} else if (locator.contains("Name")) {
			driver.findElement(By.name(locator.split(":")[1])).click();
			waitFor(1000);
		} else if (locator.contains("Css")) {
			driver.findElement(By.cssSelector(locator.split(":")[1])).click();
			waitFor(1000);
		}

	}

	public void typeOnElement(String locator, String valueTotype) {
		if (locator.contains("ID")) {
			driver.findElement(By.id(locator.split(":")[1])).sendKeys(valueTotype);
		} else if (locator.contains("Xpath")) {
			driver.findElement(By.xpath(locator.split(":")[1])).sendKeys(valueTotype);
		} else if (locator.contains("Name")) {
			driver.findElement(By.name(locator.split(":")[1])).sendKeys(valueTotype);
		} else if (locator.contains("Css")) {
			driver.findElement(By.cssSelector(locator.split(":")[1])).sendKeys(valueTotype);
		}

	}

	// Singular
	public String getElementText(String locator) {

		try {
			if (locator.contains("ID")) {
				return driver.findElement(By.id(locator.split(":")[1])).getText();
			} else if (locator.contains("Xpath")) {
				return driver.findElement(By.xpath(locator.split(":")[1])).getText();
			} else if (locator.contains("Name")) {
				return driver.findElement(By.name(locator.split(":")[1])).getText();
			} else if (locator.contains("Css")) {
				return driver.findElement(By.cssSelector(locator.split(":")[1])).getText();
			}
		} catch (Exception e) {
			return "NULL";
		}

		return "NULL";

	}

	// === Plural
	public List<String> getElementsText(String locatorsOfElements) {

		List<String> actualList = new ArrayList<String>();

		if (locatorsOfElements.contains("Xpath")) {
			List<WebElement> availableUI = driver.findElements(By.xpath(locatorsOfElements.split(":")[1]));
			System.out.println("Total List Size " + availableUI.size());
			for (int i = 0; i < availableUI.size(); i++) {
				System.out.println(availableUI.get(i).getText());
				actualList.add(availableUI.get(i).getText());
			}
		}

		return actualList;
	}

	public boolean elementNotExist(String locator) {

		try {
			if (locator.contains("ID")) {
				return driver.findElement(By.id(locator.split(":")[1])).isDisplayed();
			} else if (locator.contains("Xpath")) {
				return driver.findElement(By.xpath(locator.split(":")[1])).isDisplayed();
			} else if (locator.contains("Name")) {
				return driver.findElement(By.name(locator.split(":")[1])).isDisplayed();
			} else if (locator.contains("Css")) {
				return driver.findElement(By.cssSelector(locator.split(":")[1])).isDisplayed();
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls); // Sleep for one thousand milisecond
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
