package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDetails {

	
WebDriver ldriver;
	
	public BillingDetails(WebDriver rdriver) 
	{
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(id = "billing_first_name")
	WebElement BillingFirstName;
	
	@FindBy(id = "billing_last_name")
	WebElement BillingLastName;
	
	@FindBy(id = "billing_company")
	WebElement BillingCompany;
	
	@FindBy(id = "billing_phone")
	WebElement BillingPhone;
	
	@FindBy(id = "billing_address_1")
	WebElement BillingAddress1;
	
	@FindBy(id = "billing_address_2")
	WebElement BillingAddress2;
	
	@FindBy(id = "billing_city")
	WebElement BillingCity;
	
	@FindBy(id = "billing_postcode")
	WebElement BillingPostcode;
	
	@FindBy(id = "place_order")
	WebElement PlaceOrder;
	
	public void enterBillingFirstName(String billing_first_name) {
		BillingFirstName.sendKeys("Sanket");
	}
	
	public void enterBillingPhone(String billing_phone) {
		BillingPhone.sendKeys("9850022074");
		
	}
	
	public void enterBillingAddress1(String billing_address_1) {
		BillingAddress1.sendKeys("Devyani HOuse");
		
	}
	
	public void enterBillingAddress2(String billing_address_2) {
		BillingAddress2.sendKeys("Pimpri Chinchwad");
		
	}
	public void enterBillingCity(String billing_city) {
		BillingCity.sendKeys("Pune");
		
	}
	

	public void ClickOnPlaceOrder() {
		PlaceOrder.click();
		
	}
	
	
	
}
