package com.limeroad.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.limeroad.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory
	@FindBy(id="nlogo")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\'shopWomen\']")
	WebElement shopWomen;
	
	@FindBy(xpath="//*[@id=\'shopMen\']")
	WebElement shopMen;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
		
	}
	public boolean validateLoginPageLogo() {
		return shopWomen.isDisplayed();
	}
	public boolean validateLoginPageMenLogo() {
		return shopMen.isDisplayed();
	}
	
	public ShopWomenPage clickOnShopWomen() {
		shopWomen.click();
		return new ShopWomenPage();
		
	}
	
	
	

}
