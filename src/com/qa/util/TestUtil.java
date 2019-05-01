package com.qa.util;

import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class TestUtil extends TestBase{
	
	public static long IMPLICITLY_WAIT = 30L;
	public static long PAGE_LOAD_TIMEOUT = 40L;
	
	public TestUtil() {
		PageFactory.initElements(driver, this);
	}
	
	

}
