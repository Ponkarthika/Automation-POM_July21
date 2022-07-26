package com.amazon.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.FreshPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	FreshPage freshpage;
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		 freshpage = new FreshPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	//TC should be independeant to eachother
	//before each TC open browser
	//after each TC close the browser--in avoid chache issue/memory issue
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle=homepage.verifyHomePageTitle2();	
		Assert.assertEquals(homePageTitle, "needtoaddexpectedtitle","Homepage title validation failed");
	}
	@Test(priority=2)
	public void verifyUserLabelTest() {
	Assert.assertTrue(homepage.verifyUserLabel());
	}
	@Test(priority=3)
	public void verifyFreshLinkTest() {
		freshpage = homepage.clickOnFreshLink();
		
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
