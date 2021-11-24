package com.HRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase;

public class LoginPage extends TestBase {
//Locators and Methods
//Page Factory classes
	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgetpass;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void Login()
	{
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		btnLogin.click();
	}
	public void forgetpass()
	{
		forgetpass.click();
		driver.navigate().back();
	}
}
