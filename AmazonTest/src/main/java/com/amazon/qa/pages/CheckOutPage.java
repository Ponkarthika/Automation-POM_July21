package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CheckOutPage extends TestBase{
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressFullName\"]")
	static
	WebElement firstName;
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressPhoneNumber\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressLine1\"]")
	static
	WebElement address;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
		
	}
	public static void enterCheckOutAddress(String ftname, String adrs) {
		firstName.sendKeys(ftname);
		address.sendKeys(adrs);
		
	}

}
