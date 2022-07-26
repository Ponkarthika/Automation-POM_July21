package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class CheckOutPage extends TestBase{
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressFullName\"]")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressPhoneNumber\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id = \"address-ui-widgets-enterAddressLine1\"]")
	WebElement address;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
		
	}
	public void enterCheckOutAddress(String ftname, String adrs) {
		firstName.sendKeys(ftname);
		phoneNumber.sendKeys(adrs);
		
	}

}
