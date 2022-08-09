package com.limeroad.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.limeroad.qa.base.TestBase;
import com.limeroad.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setup() {
		initialization();
		
	 loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "Limeroad");
		
		
	}
	
	@Test(priority=2)
	public void menLogoTest() {
		loginPage.validateLoginPageMenLogo();
	}
	@Test(priority=3)
	public void woMenLogoTest() {
		loginPage.validateLoginPageLogo();
	}
	
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
		}
}
