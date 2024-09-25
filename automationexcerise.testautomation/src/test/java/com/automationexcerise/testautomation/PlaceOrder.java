package com.automationexcerise.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder extends Setup {
	
	public PlaceOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	WebElement cart;
	
	
	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
	WebElement checkout;
	
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message;
	
	@FindBy(xpath = "//a[normalize-space()='Place Order']")
	WebElement placeOrder;
	
	@FindBy(xpath = "//input[@name='name_on_card']")
	WebElement name;
	
	@FindBy(xpath = "//input[@name='card_number']")
	WebElement card;
	
	@FindBy(xpath = "//input[@placeholder='ex. 311']")
	WebElement cvc;
	
	
	@FindBy(xpath = "//input[@placeholder='MM']")
	WebElement mm;
	
	@FindBy(xpath = "//input[@placeholder='YYYY']")
	WebElement yyyy;
	
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit_button;
	
	//@FindBy(xpath = "//a[normalize-space()='Download Invoice']")
	//WebElement invoice_button;
	
	public void click_cart() throws InterruptedException {
		cart.click();
		Thread.sleep(2000);
	}
	
	public void click_placeOrder() throws InterruptedException {
		checkout.click();
		Thread.sleep(2000);
	}
	
	public void enterMessage() throws InterruptedException {
		message.sendKeys("Please call before delivery of the product to ensure I'm available at home to receive!");
		Thread.sleep(1000);
	}
	
	public void enterPlaceOrder() throws InterruptedException {
		placeOrder.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void enterName(String user) throws InterruptedException {
		name.sendKeys(user);
		Thread.sleep(2000);
	}
	
	public void enterCard(String card1) throws InterruptedException {
		card.sendKeys(card1);
		Thread.sleep(2000);
	}
	
	public void enterCvc(String cvc1) throws InterruptedException {
		cvc.sendKeys(cvc1);
		Thread.sleep(2000);
	}
	
	public void enterMm(String month) throws InterruptedException {
		mm.sendKeys(month);
		Thread.sleep(2000);
	}
	
	public void enterYyyy(String yyyy1) throws InterruptedException {
		yyyy.sendKeys(yyyy1);
		Thread.sleep(2000);
	}
	
	public void clickSubmit() throws InterruptedException {
		submit_button.click();
		Thread.sleep(2000);
	}
	
	public void clickInvoice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement invoice_button = wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//a[normalize-space()='Download Invoice']")));
		invoice_button.click();
		Thread.sleep(2000);
	}
}
