package com.automationexcerise.testautomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Setup {
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement signup1;
	
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement login_email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement login_password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement login_button;
	
	public void clickSignup1() throws InterruptedException {
		signup1.sendKeys(Keys.ENTER);
	}
	
	public void enterLoginEmail(String user) {
		login_email.sendKeys(user);
	}
	
	public void enterLoginPassword(String pass) {
		login_password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login_button.click();
	}
	
}
