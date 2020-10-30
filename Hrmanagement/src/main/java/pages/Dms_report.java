 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basement.Base;

public class Dms_report extends Base
{
	@FindBy(xpath="//a[@href='/settings/reports']")
	WebElement Report;
	@FindBy(xpath="//select[@class='form-control']")
	WebElement DropDown;
	@FindBy(css = "#frmReport > div:nth-child(5) > input" )
	WebElement submit;
	
	@FindBy(xpath = "//select[@class='form-control required']")
	WebElement user;
	@FindBy(css = "#txtFromDate")
	WebElement from;
	@FindBy(css = "#txtToDate")
	WebElement todate;
	@FindBy(xpath = "//*[@id='frmReport1']/div[5]/input")
	WebElement reportbutton;
	
	                                                      //#frmReport1 > div:nth-child(5) > input
	public Dms_report() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void reportdetail1() throws Exception {
		
		Thread.sleep(3000);
		Report.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(DropDown));
		Select s=new Select(DropDown);
		s.selectByVisibleText("Access History");
		submit.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.elementToBeClickable(user));
		Select s1 = new Select(user);
		s1.selectByVisibleText("ADMINISTRATOR");
		//from.click();
		from.sendKeys("10-2020-11");
		//todate.click();
		todate.sendKeys("11-2020-01");
		reportbutton.click();
		
	} 
}