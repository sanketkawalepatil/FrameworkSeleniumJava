package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	WebDriver ldriver;

	public indexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText = "My Account")
	WebElement MyAccount;
	
	public void clickOnLogin() {
		MyAccount.click();
	}
	
}
