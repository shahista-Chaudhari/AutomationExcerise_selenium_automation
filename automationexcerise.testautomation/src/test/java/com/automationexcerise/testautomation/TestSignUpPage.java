package com.automationexcerise.testautomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSignUpPage extends Setup {

	@Test(priority=0)
	@Parameters({"user","email","title","day","password", "name", "year", "month",
		"lname", "company", "address","country","state","city","zipcode", "mobile"})
	public void testPage(String user, String email, String title, String day, String password, 
			String name , String year , String month, String lname, String company,
				String address, String country, String state, String city, String zipcode, String mobile) 
					throws InterruptedException{
		Thread.sleep(3000);
		SignUpPage signuppage = new SignUpPage(driver);
		signuppage.clickSignup1();
		signuppage.enterName(user);
		signuppage.enterEmail(email);
		signuppage.clickSignup2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		signuppage.clickTitle(title);
		signuppage.enterPassword(password);
		signuppage.enterDay(day);
		signuppage.enterMonth(month);
		signuppage.enterYear(year);
		signuppage.checkNewsletter();
		signuppage.enterFname(name);
		signuppage.enterLname(lname);
		signuppage.enterCompany(company);
		signuppage.enterAddress(address);
		signuppage.enterState(state);
		signuppage.enterCity(city);
		signuppage.enterZip(zipcode);
		signuppage.enterPhno(mobile);
		signuppage.clickCreateAccount();
	}

}
