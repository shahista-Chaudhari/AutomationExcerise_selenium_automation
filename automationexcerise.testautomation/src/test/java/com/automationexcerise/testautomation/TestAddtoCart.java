package com.automationexcerise.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAddtoCart extends Setup{
	
	@Test(priority=2)
	public void testPage() throws InterruptedException {
		System.out.println("Welcome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
		AddtoCart webpage = new AddtoCart(driver);
		webpage.navigate_add_cart1();
		webpage.clickCount();
		webpage.clickAddtoCart1();
		webpage.clickContinueButton();
		
		webpage.navigate_add_cart2();
		webpage.clickAddtoCart1();
		webpage.clickContinueButton();
		
	}
}
