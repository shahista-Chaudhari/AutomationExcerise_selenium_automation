package com.automationexcerise.testautomation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLoginPage extends Setup {
	
	@Test(priority=1)
	@Parameters({"email","password"})
	public void testPage(String email, String password) throws InterruptedException{
		LoginPage webpage = new LoginPage(driver);
		webpage.clickSignup1();
		Thread.sleep(1000);
		webpage.enterLoginEmail(email);
		Thread.sleep(1000);
		webpage.enterLoginPassword(password);
		Thread.sleep(1000);
		webpage.clickLogin();
		Thread.sleep(1000);
	}


}
