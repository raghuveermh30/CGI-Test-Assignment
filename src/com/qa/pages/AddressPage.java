package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Base.TestBase;

public class AddressPage extends TestBase{
	
	@FindBy(linkText = "Addresses")
	WebElement addressLink;
	
	@FindBy(linkText = "New Address")
	WebElement newAddress;
	
	
	@FindBy(id = "address_first_name")
	WebElement firstName;
	
	@FindBy(id = "address_last_name")
	WebElement lastName;
	
	@FindBy(id = "address_street_address")
	WebElement address1;
	
	@FindBy(id = "address_city")
	WebElement city;
	
	
	@FindBy(id = "address_state")
	WebElement state;
	
	@FindBy(id = "address_zip_code")
	WebElement zipCode;
	
	@FindBy(id = "address_country_canada")
	WebElement country;
	
	@FindBy(id = "address_birthday")
	WebElement birthDay;
	
	@FindBy(id = "address_age")
	WebElement age;
	
	@FindBy(id = "address_website")
	WebElement website;
	
	@FindBy(id = "address_picture")
	WebElement uploadPic;
	
	@FindBy(id = "address_phone")
	WebElement phone;
	
	@FindBy(id = "address_interest_dance")
	WebElement commonIntrest;
	
	@FindBy(xpath = "//input[@value = 'Create Address']")
	WebElement createList;
	
	@FindBy(xpath = "//*[contains(text(), 'Address was successfully created.')]")
	WebElement addressCreated;
	
	@FindBy(xpath = "address_note")
	WebElement note;
	
	
	
	@FindBy (linkText = "Sign out")
	WebElement signOut;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkAddressPageIsDisplayed() {
		boolean chekAddressPage = newAddress.isDisplayed();
		return chekAddressPage;
	}
	
	
	
	public void updateAddressDetails() {
		firstName.sendKeys("dsds");
		lastName.sendKeys("ggfdgds");
		address1.sendKeys("sdasdasd");
		city.sendKeys("dsdsds");
		Select sel = new Select(state);
		sel.selectByVisibleText("Kentucky");
		zipCode.sendKeys("65769");
		country.click();
		birthDay.sendKeys("20121995");
		age.sendKeys("21");
		website.sendKeys("http:dsdsd@gmail.com");
		uploadPic.sendKeys("C:\\Users\\raghuveer.mh\\Desktop\\3.jpg");
		//note.sendKeys("dsdsdsds");
		commonIntrest.click();
		scrollPageDown();
		delay();
		createList.click();
		delay();
	}
	
	public void checkAddressCreated() {
		addressCreated.getText();
	}
	
	public HomePage goToAddress() {
		addressLink.click();
		return new HomePage();
	}
	
	public static void scrollPageDown() {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
}
