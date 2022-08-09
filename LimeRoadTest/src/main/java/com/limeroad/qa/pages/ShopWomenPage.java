package com.limeroad.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.limeroad.qa.base.TestBase;

public class ShopWomenPage extends TestBase {
	
	@FindBy(xpath="//a/div[contains(text(),'WOMEN')]")
	WebElement womenSubCategory;
	
	
	public void validateCollections() {
		womenSubCategory.click();
	}
	
	
	
	

}
