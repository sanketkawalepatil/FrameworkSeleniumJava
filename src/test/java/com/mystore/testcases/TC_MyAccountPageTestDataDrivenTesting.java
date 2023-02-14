package com.mystore.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pageobject.indexPage;
import com.mystore.pageobject.myAccount;
import com.mystore.utilities.ReadExcelFile;

public class TC_MyAccountPageTestDataDrivenTesting extends BaseClass{
	
	@Test
	public void verifyRegistrationAndLogin()
	{
		
		indexPage pg = new indexPage(driver);
		pg.clickOnLogin();
		logger.info("Clicked on Login");
		
		myAccount myApg = new myAccount(driver);
		/*myApg.enterRegEmail("cs12366@gmail.com");
		logger.info("Email adress enterd");
		myApg.enterPassword("PasswordNewSanket@12345");
		logger.info("Password Enterd");
		myApg.clickRegister();*/
		
	}
	@Test(dataProvider = "LoginDataProvider")
	public void VerifyLogin(String userEmail, String userPwd)
	{
		indexPage pg = new indexPage(driver);
		pg.clickOnLogin();
		logger.info("Clicked on Login");
		
		myAccount myAcpg = new myAccount(driver);
		
		myAcpg.RegisterdUsernameEmail(userEmail);
		myAcpg.RegisterdUserpwd(userPwd);
		myAcpg.login();
		
		logger.info("Succesfully login");
		
		//myAcpg.clickOnSignOut();
	}
	

	
	@DataProvider(name= "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir")+"\\TestData\\MyStoreTestData.xlsx";
		
		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
		
		String data[][] = new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=1;j<ttlColumns;j++) 
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData",i,j);
				
			}
		}
		return data;
		
		
		
		
		
		
		
		
		
		
		
	}
}
