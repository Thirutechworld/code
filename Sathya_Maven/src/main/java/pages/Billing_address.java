package pages;

import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClass;
import utility.excelRead;

public  class Billing_address extends baseClass 
{
	// Defined the Xpath for Billing_address from add to cart
	@FindBy(xpath="//article[@class='art' and @data-id='10598']")
	WebElement product1;
	@FindBy(xpath="//a[@class='btn btn-primary btn-lg btn-block btn-add-to-cart ajax-cart-link']")
	WebElement Add_to_card;
	@FindBy(css="#occ-cart > div.offcanvas-cart-footer > div > div.offcanvas-cart-footer-col.row.sm-gutters.d-flex.flex-wrap > div:nth-child(2) > a > span")
	WebElement Check_out;
	@FindBy(xpath="//input[@name=\"NewAddress.Company\"]")
	WebElement company;
	@FindBy(xpath="//input[@name=\"NewAddress.FirstName\"]")
	WebElement firstname;
	@FindBy(xpath="//input[@id=\"NewAddress_LastName\"]")
	WebElement lastname;
	@FindBy(xpath="//input[@id='NewAddress_Address1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='NewAddress_Address2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='NewAddress_City']")
	WebElement city;
	@FindBy(xpath="//input[@id='NewAddress_ZipPostalCode']")
	WebElement zipcode;
	@FindBy(xpath="//select[@id='NewAddress_CountryId']")
	WebElement country;
	@FindBy(xpath="//input[@data-val-required=\"Email is required.\"]")
	WebElement mail;
	@FindBy(xpath="//input[@id='NewAddress_PhoneNumber']")
	WebElement phonenumber1;
	@FindBy(xpath="//input[@id='NewAddress_FaxNumber']")
	WebElement Faxnumber;
	@FindBy(xpath="//button[@class=\"btn btn-warning btn-lg new-address-next-step-button\"]")
	WebElement next;

	public Billing_address()
	{
		PageFactory.initElements(driver, this);
	}

	public void readAllDetails1() throws Exception
	{
		// Opening one desktop product and read the Billing address information from Excel Sheet 
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(product1));
		product1.click();
		wait.until(ExpectedConditions.elementToBeClickable(Add_to_card));
		Add_to_card.click();
		wait.until(ExpectedConditions.elementToBeClickable(Check_out));
		Check_out.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		//Thread.sleep(5000);
		ArrayList<String>credentials=excelRead.getCredendiatials();	
		company.sendKeys(credentials.get(2));
		firstname.sendKeys(credentials.get(3));
		lastname.sendKeys(credentials.get(4));
		address1.sendKeys(credentials.get(5));
		address2.sendKeys(credentials.get(6));
		city.sendKeys(credentials.get(7));
		zipcode.sendKeys(credentials.get(8));
		wait.until(ExpectedConditions.elementToBeClickable(country));
		Select s=new Select(country);
		s.selectByVisibleText("India");	
		mail.sendKeys(credentials.get(9));
		phonenumber1.sendKeys(credentials.get(10));
		Faxnumber.sendKeys(credentials.get(11));
		wait.until(ExpectedConditions.elementToBeClickable(next));
		next.click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1600)", "");
	}
}