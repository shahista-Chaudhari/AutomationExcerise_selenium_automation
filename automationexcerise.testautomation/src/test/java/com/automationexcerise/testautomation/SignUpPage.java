package com.automationexcerise.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;



public class SignUpPage extends Setup {
	
	public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement email;
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement signup1;
	
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement signup2;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement mr_title;
	
	@FindBy(xpath = "//input[@id='id_gender2']")
	WebElement mrs_title;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement day;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement month;
	
	@FindBy(xpath = "//select[@id='years']")
	WebElement yrs;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsletter;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address;
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement country;
	
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zip;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement phno;
	
	
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement create_account;
	
	
	public void clickSignup1() throws InterruptedException {
		signup1.sendKeys(Keys.ENTER);
	}
	
	public void enterName(String user) throws InterruptedException {
		name.sendKeys(user);
		Thread.sleep(1000);
	}
	
	public void enterEmail(String email1) throws InterruptedException {
		email.sendKeys(email1);
		Thread.sleep(2000);
	}
	
	public void clickSignup2() throws InterruptedException {
		signup2.click();
		Thread.sleep(2000);
	}
	
	public void clickTitle(String title1) throws InterruptedException {
		if (title1.equalsIgnoreCase("mr")) 
			mr_title.click();
		else
			mrs_title.click();
		Thread.sleep(2000);
	}
	
	public void enterPassword(String pass) throws InterruptedException {
		password.sendKeys(pass);
		Thread.sleep(2000);
	}
	
	public void enterDay(String day1) throws InterruptedException {
		day.sendKeys(day1);
		Thread.sleep(2000);
	}
	
	public void enterMonth(String month1) throws InterruptedException {
		month.sendKeys(month1);
		Thread.sleep(2000);
	}
	
	public void enterYear(String year) throws InterruptedException {
		yrs.sendKeys(year);
		Thread.sleep(2000);
	}
	
	public void checkNewsletter() throws InterruptedException {
		newsletter.click();
		Thread.sleep(2000);
	}
	
	public void enterFname(String name) throws InterruptedException {
		fname.sendKeys(name);
		Thread.sleep(2000);
	}
	
	public void enterLname(String lname1) throws InterruptedException {
		lname.sendKeys(lname1);
		Thread.sleep(2000);
	}
	
	public void enterCompany(String comp) throws InterruptedException {
		company.sendKeys(comp);
		Thread.sleep(2000);
	}
	
	public void enterAddress(String addr) throws InterruptedException {
		address.sendKeys(addr);
		Thread.sleep(2000);
	}
	
	public void enterCountry(String country1) throws InterruptedException {
		country.sendKeys(country1);
		Thread.sleep(2000);
	}
	
	public void enterState(String state1) throws InterruptedException {
		state.sendKeys(state1);
		Thread.sleep(2000);
	}
	
	public void enterCity(String city1) throws InterruptedException {
		city.sendKeys(city1);
		Thread.sleep(2000);
	}
	
	public void enterZip(String zipcode) throws InterruptedException {
		zip.sendKeys(zipcode);
		Thread.sleep(2000);
	}
	
	public void enterPhno(String mobile) throws InterruptedException {
		phno.sendKeys(mobile);
		Thread.sleep(2000);
	}
	
	public void clickCreateAccount() throws InterruptedException {
		create_account.click();
		Thread.sleep(2000);
	}
	
}
