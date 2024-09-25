package com.automationexcerise.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart extends Setup {
	
	public AddtoCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//input[@id='quantity']")
	WebElement count;
	
	@FindBy(css = "button[type='button']")
	WebElement add_to_cart1;
	
	@FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
	WebElement continueButton;
	
	public void navigate_add_cart1() throws InterruptedException {
		Thread.sleep(1000);
		//add_cart1.clear();
		//add_cart1.sendKeys(Keys.ENTER);
		driver.get("https://automationexercise.com/product_details/1");
	}
	
	public void navigate_add_cart2() throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://automationexercise.com/product_details/2");
	}
	
	public void clickCount() throws InterruptedException {
		Thread.sleep(1000);
		count.clear();
		count.sendKeys("2");
	}
	
	public void clickAddtoCart1() throws InterruptedException {
		Thread.sleep(1000);
		add_to_cart1.click();
	}
	
	public void clickContinueButton() throws InterruptedException {
		Thread.sleep(1000);
		continueButton.click();
	}
	
	
}
