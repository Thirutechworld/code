package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_class.Base;

public class loginpage extends Base
{
	// Defined the Xpath for LoginPage
		@FindBy(xpath="//a[@class='menubar-link' and @href='/login?ReturnUrl=%2F']")
		WebElement loginBtn;
		@FindBy(xpath="//input[@class='email form-control']")
		WebElement userName;
		@FindBy(xpath="//input[@class='password form-control'and @type='password']")
		WebElement password;
		@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block btn-login'and @type='submit']")
		WebElement submit;

		public loginpage()
		{
			PageFactory.initElements(driver,this);
		}

		
		

		public void loginIntoApp() {
			// TODO Auto-generated method stub
			loginBtn.click();
			userName.sendKeys("thiruvaradharaj1996@gmail.com");
			password.sendKeys("9585013913");
			submit.click();
		}
}
