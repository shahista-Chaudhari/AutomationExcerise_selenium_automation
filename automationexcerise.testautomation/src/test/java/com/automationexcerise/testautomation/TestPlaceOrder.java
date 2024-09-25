package com.automationexcerise.testautomation;

import java.time.Duration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPlaceOrder extends Setup{
	@Test(priority=3)
	@Parameters({"cname","card","cvc","mm","yyyy"})
	public void testPage(String cname, String card, String cvc, String mm, String yyyy   ) throws InterruptedException{
		PlaceOrder webpage = new PlaceOrder(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		webpage.click_cart();
		webpage.click_placeOrder();
		webpage.enterMessage();
		webpage.enterPlaceOrder();
		webpage.enterName(cname);
		webpage.enterCard(card);
		webpage.enterCvc(cvc);
		webpage.enterMm(mm);
		webpage.enterYyyy(yyyy);
		webpage.clickSubmit();
		
		// Download Invoice
		webpage.clickInvoice();
		
	}
}
