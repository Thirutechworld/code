package commonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commomfuction.Base_Class;

public class Log_in_pages extends Base_Class
{

	@FindBy(xpath = "//input[@id='txtLoginId']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement submitbutton;
	
	public Log_in_pages() {
		PageFactory.initElements(driver,this);
	}
	
	@Test
	public void logindetails()
	{
		username.sendKeys(" Administrator");
		password.sendKeys(" Admin@321$");
		submitbutton.click();
	}
}
