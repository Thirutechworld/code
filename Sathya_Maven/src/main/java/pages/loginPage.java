package pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseClass;
import utility.excelRead;
import pages.productPage;

public class loginPage extends baseClass{

	// Defined the Xpath for LoginPage
	@FindBy(xpath="//a[@class='menubar-link' and @href='/login?ReturnUrl=%2F']")
	WebElement loginBtn;
	@FindBy(xpath="//input[@class='email form-control'and @type='email']")
	WebElement userName;
	@FindBy(xpath="//input[@class='password form-control'and @type='password']")
	WebElement password;
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block btn-login'and @type='submit']")
	WebElement submit;

	public loginPage()
	{
		PageFactory.initElements(driver,this);
	}

	public productPage loginIntoApp() throws Exception 
	{
		// Login the LoginPage 
		loginBtn.click();
		ArrayList<String> credentials=excelRead.getCredendiatials();

		userName.sendKeys(credentials.get(0));
		password.sendKeys(credentials.get(1));

		submit.click();
		return new productPage();

	}

}
