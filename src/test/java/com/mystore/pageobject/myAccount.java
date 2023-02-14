package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	WebDriver ldriver;

	public myAccount(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	// New Registration
	
	/*@FindBy(id = "reg_email")
	WebElement regemail;
	
	@FindBy(id = "reg_password")
	WebElement regpassword;
	
	@FindBy(name = "register")
	WebElement register;
	
	//@FindBy(xpath = "//ul//li//Error:")
	WebElement Error;*/
	
	// Already register login
	
	@FindBy(id = "username")
	WebElement RegisterdUsernameEmail;
	
	@FindBy(id = "password")
	WebElement RegisterdUserPwd;
	
	@FindBy(name = "login")
	WebElement login;
	
	@FindBy(linkText = "Shop")
	WebElement shop;
	
	
	//@FindBy(linkText = "Sign out")
	//WebElement signOut;
	
	
	
	/* Register Method
	public void enterRegEmail(String reg_Email) {
		regemail.sendKeys(reg_Email);
	}
	public void enterPassword(String reg_password) {
		regpassword.sendKeys(reg_password);
	}
	
	public void clickRegister()
	{
		register.click();
	}
	
	/*public void error()
	{
		System.out.println("Already Register");
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}*/
	
	
	// Login Methods
	public void RegisterdUsernameEmail(String username) {
		RegisterdUsernameEmail.sendKeys(username);
	}
	public void RegisterdUserpwd(String password){
		RegisterdUserPwd.sendKeys(password);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void clickOnShop()
	{
		shop.click();
	}
}
 