package com.qa.test;

import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.pages.AddressPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class AddressTest extends TestBase{
	
	 LoginPage loginPage;
	 HomePage homePage;
	 AddressPage addressPage;
	 
	
	
	@BeforeTest
	public void setUp() {
		initialisation();
		loginPage = new LoginPage();
		homePage = new HomePage();
		addressPage = new AddressPage();
				
	}
	
	@Test
	public void test() {
			loginPage.updateLoginDetails();
			homePage = loginPage.clickSignUp();
			homePage.checkHomePageText();
			delay();
			homePage.clickOnAddress();
			delay();
			addressPage=	homePage.clickOnNewAddress();
			delay();
			
			addressPage.updateAddressDetails();
			delay();
			addressPage.checkAddressCreated();
			homePage = addressPage.goToAddress();
			homePage.clickDestroy();
			homePage.clickOkOnAlert();
			homePage.checkDestroyMessage();
			homePage.clickSignOut();	
	}
	
	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}


