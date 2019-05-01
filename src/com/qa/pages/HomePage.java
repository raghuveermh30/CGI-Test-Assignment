package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//h4[contains(text(), 'A simple web app')]")
	WebElement validateHomePage;
	
	@FindBy(linkText = "Addresses")
	WebElement address;
	
	@FindBy(linkText = "Sign out")
	WebElement signOut;
	
	@FindBy(linkText = "Destroy")
	WebElement destroy;
	
	@FindBy(linkText = "New Address")
	WebElement newAddress;
	
	@FindBy(xpath = "//*[contains(text(), 'Address was successfully destroyed.')]")
	WebElement validateDestroyMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkHomePageText() {
		boolean homePageText = validateHomePage.isDisplayed();
		return homePageText;
	}
	
	public AddressPage clickOnAddress() {
		address.click();
		return new AddressPage();
	}

	public void clickDestroy() {
		destroy.click();
	}
	
	public void clickOkOnAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void clickSignOut() {
		signOut.click();
	}
	
	public AddressPage clickOnNewAddress() {
		newAddress.click();
		return new AddressPage();
	}
	
	public boolean checkDestroyMessage() {
		boolean flag = validateDestroyMessage.isDisplayed();
		return flag;
	}
}
