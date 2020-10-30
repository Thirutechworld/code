package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClass;

public class productPage  extends baseClass
{

	// Defined the Xpath for ProductPage
	@FindBy(css="#main-nav-item-85 > a")
	WebElement electronics;
	@FindBy(xpath="//a[@href='/desktop']")
	WebElement desktop;

	public productPage()
	{
		PageFactory.initElements(driver, this);
	}

	public desktopsPage navigateToDesktop()
	{
		// Navigate HomePage to Desktop page 
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(electronics));
		action.moveToElement(electronics).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(desktop));
		desktop.click();
		return new desktopsPage();
	}

	public Billing_address navigateToOneDesktop()
	{
		// Navigate HomePage to Desktop page 
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(electronics));
		action.moveToElement(electronics).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(desktop));
		desktop.click();
		return new Billing_address();
	}
}
