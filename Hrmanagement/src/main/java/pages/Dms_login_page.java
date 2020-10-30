package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basement.Base;

public class Dms_login_page extends Base
{

	@FindBy(id="details-button")
	WebElement button ;
	@FindBy(id="proceed-link")
	WebElement proceddLink ;
	@FindBy(xpath = "//input[@id='txtLoginId']")
	WebElement username;
	@FindBy(xpath ="//input[@id='txtPassword']")
	WebElement password;
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement button1;

	public Dms_login_page() 
	{
		PageFactory.initElements(driver,this);
	}

	public Dms_report loginverify() throws Exception 
	{
		button.click();
		proceddLink.click();
		username.sendKeys("Administrator");
		password.sendKeys("Admin@321$");
		button1.click();
		return new Dms_report();
	}







}
