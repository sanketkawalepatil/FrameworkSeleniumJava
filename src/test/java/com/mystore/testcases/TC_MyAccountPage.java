package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.Basket;
import com.mystore.pageobject.BillingDetails;
import com.mystore.pageobject.ShopDetails;
import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;

public class TC_MyAccountPage extends BaseClass{
	
	@Test(enabled = false)
	public void verifyRegistrationAndLogin()
	{
		
		indexPage pg = new indexPage(driver);
		pg.clickOnLogin();
		logger.info("Clicked on Login");
		
		/*myAccount myAcpg = new myAccount(driver);
		myAcpg.enterRegEmail("cs12366@gmail.com");
		logger.info("Email address enterd");
		myAcpg.enterPassword("PasswordNewSanket@12345");
		logger.info("Passward Enterd");
		myAcpg.clickRegister();*/
		
	}
	@Test(enabled = true)
	public void VerifyLogin()
	{
		indexPage pg = new indexPage(driver);
		pg.clickOnLogin();
		logger.info("Clicked on Login");
		
		myAccount myAcpg = new myAccount(driver);
		
		myAcpg.RegisterdUsernameEmail("cs12366@gmail.com");
		myAcpg.RegisterdUserpwd("PasswordNewSanket@12345");
		myAcpg.login();
		myAcpg.clickOnShop();
		
		logger.info("Succesfully login");
	}
	
}
