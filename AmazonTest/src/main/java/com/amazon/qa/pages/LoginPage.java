package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	//object repository/page repository of login page will be here
@FindBy(xpath = "//*[@id='nav-signin-tooltip']/a/span")
WebElement loginButton;
@FindBy(name= "email")
WebElement emailorMobileNumber;

@FindBy(id = "continue")
WebElement continueButton;

@FindBy(name= "password")
WebElement password;

@FindBy(xpath = "//input[@id ='signInSubmit']")
WebElement signInButton;

//initializing the page objects//initialisinhg object repositor/page factory
public LoginPage() {
	PageFactory.initElements(driver, this);
}

//actions
/*public LoginPage clickOnSigninbutton()
{
	loginButton.click();
	return new LoginPage();
	
}*/

public void clickOnSigninbutton()
{
	loginButton.click();
	//return new LoginPage();
	
}



public String validateLoginPagetitle() {
	return driver.getTitle();
}

//this method is returning homepage
public HomePage login(String un, String pwd) {
	loginButton.click();
	emailorMobileNumber.sendKeys(un);
	continueButton.click();
	password.sendKeys(pwd);
	signInButton.click();
	return new HomePage();
	

}





}
