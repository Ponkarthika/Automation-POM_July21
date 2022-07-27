package com.amazon.qa.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.CheckOutPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.util.TestUtil;

public class CheckOutPageTest extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	String sheetName= "address";
	public CheckOutPageTest() {
		super();
		
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		loginpage= new LoginPage();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnCart();
		homepage.clickOnProceedToBuy();
	}
		
	@DataProvider
	public Object[][] getAmazonTestData() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	
    @Test(dataProvider ="getAmazonTestData")
    public void enterCheckoutAddress(String firstName, String address) {
    	CheckOutPage.enterCheckOutAddress(firstName,address);
    	
    	
    }
}
