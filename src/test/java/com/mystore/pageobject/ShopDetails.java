package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShopDetails {

	
WebDriver ldriver;
	
	public ShopDetails(WebDriver rdriver) 
	{
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(linkText = "Add to basket")
	WebElement AddToBasket;
	
	@FindBy(linkText = "View Basket")
	WebElement ViewBasket;
	
	
	
	public void clickOnAddToBasket()
	{
		AddToBasket.click();
	}
	
	public void clickOnViewBasket()
	{
		ViewBasket.click();
	}
	
 }
