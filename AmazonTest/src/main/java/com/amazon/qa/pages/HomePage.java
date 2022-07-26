package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Deliver to Karthika')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Fresh')]")
	WebElement freshLink;
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement giftCardLink;
	
	@FindBy(xpath="//a[contains(text(),'Buy Again')]")
	WebElement buyAgainLink;
	
	@FindBy(xpath="//a[@id = \"nav-cart\"]")
	WebElement cartLink;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedToBuy;
	


//initialize the pagefactory/page object

public HomePage() {
	PageFactory.initElements(driver, this);
	
}
public String verifyHomePageTitle2() {
	 return driver.getTitle();
	  
}
public FreshPage clickOnFreshLink() {
	freshLink.click();
	return new FreshPage();
}
public boolean verifyUserLabel() {
	return userNameLabel.isDisplayed();
}

public void clickOnCart() {
	cartLink.click();
	
	
}
public CheckOutPage clickOnProceedToBuy() {
 proceedToBuy.click();
return new CheckOutPage();

}
}
