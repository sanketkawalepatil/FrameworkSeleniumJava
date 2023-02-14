package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Basket;
import com.mystore.pageobject.BillingDetails;
import com.mystore.pageobject.ShopDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;

public class TC_ShopDetails extends BaseClass
{
	@Test(enabled = true)
	public void ShopProduct()
	{
		indexPage indexPg = new indexPage(driver);
		indexPg.clickOnLogin();
		
		ShopDetails sd = new ShopDetails(driver);
		sd.clickOnAddToBasket();
		sd.clickOnViewBasket();
		
		Basket basketpg = new Basket(driver);
		basketpg.clickOnUpdateBasket();
		basketpg.clickOnCheckout();
		
		BillingDetails billingpg = new BillingDetails(driver);
		billingpg.ClickOnPlaceOrder();
		
		
	}
}