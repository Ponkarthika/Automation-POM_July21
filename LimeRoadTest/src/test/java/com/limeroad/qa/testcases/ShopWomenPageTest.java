package com.limeroad.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.limeroad.qa.base.TestBase;
import com.limeroad.qa.pages.LoginPage;
import com.limeroad.qa.pages.ShopWomenPage;

public class ShopWomenPageTest extends TestBase {
	LoginPage loginPage;
	ShopWomenPage shopwomen;
	
	
	public ShopWomenPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	 loginPage = new LoginPage();
	  shopwomen= new ShopWomenPage();
		
	}
	
	@Test(priority=1)
	public void validateCollectionTest() {
		
	shopwomen.validateCollections();
	}
	
	

}
