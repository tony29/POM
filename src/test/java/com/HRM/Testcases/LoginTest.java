package com.HRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.HRM.Pages.LoginPage;
import com.HRM.Testbase.TestBase;

public class LoginTest extends TestBase{
	LoginPage oo;
	String title;
public LoginTest()
{
	super();
}
@BeforeSuite
public void launch()
{
	initialization();
	oo=new LoginPage();
}
@Test
public void Checktitle()
{
	title=oo.verifyTitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void logindetails()
{
	oo.Login();
}
@Test
public void Forgetpas()
{
	oo.forgetpass();
}
}
