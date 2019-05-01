package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "user_email")
	WebElement emailId;
	
	@FindBy(id = "user_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement signUp;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void updateLoginDetails() {
		emailId.sendKeys("kbgsdfd@gmail.com");
		password.sendKeys("Test1234");
	}
	
	public HomePage clickSignUp() {
		signUp.click();
		return new HomePage();
	}
	

}
