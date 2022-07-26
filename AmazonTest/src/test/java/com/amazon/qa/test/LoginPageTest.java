package com.amazon.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
LoginPage loginpage;
HomePage homePage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTest(){
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void validateHomPageTitle(){
		String title=loginpage.validateLoginPagetitle();
		Assert.assertEquals(title, "Online shopping for Echo, Fire TV &amp; Kindle | Event Store from a great selection at Amazon Devices &amp; Accessories Store.");
		
	}
		
		
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
}
