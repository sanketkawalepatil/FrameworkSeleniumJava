package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Basket {

WebDriver ldriver;
	
	public Basket(WebDriver rdriver) 
	{
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);

	}
	
	//@FindBy(xpath = "//input[@name='cart[4c5bde74a8f110656874902f07378009][qty]']")
	//WebElement Quantity;
	
	@FindBy(name = "update_cart")
	WebElement UpdateBasket;
	
	@FindBy(linkText = "Proceed to Checkout")
	WebElement Checkout;
	
	
	/*public void setQuantity(String qty) 
	{
	
		Quantity.clear();
		Select oSelect=new Select(Quantity);
		oSelect.selectByVisibleText(qty);
		
	}*/
	
	public void clickOnUpdateBasket()
	{
		UpdateBasket.click();
	}
	public void clickOnCheckout()
	{
		Checkout.click();
	}
}
