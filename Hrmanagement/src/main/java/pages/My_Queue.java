package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basement.Base;

public class My_Queue extends Base
{
 
	@FindBy(xpath = "//select[@name='workflowSelect']")
	WebElement workflow;
	@FindBy(xpath = "//select[@name='userSelect']")
	WebElement userselect;
	@FindBy(xpath = "//select[@name='statusSelect']")
	WebElement statusselect;
	@FindBy(xpath = "//select[@name='assignUserSelect']")
	WebElement assign;
	@FindBy(xpath = "//input[@id='applyBtn' and @value='Apply']")
	WebElement applybutton;
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement okbutton;
	
	public My_Queue() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void myqueuedetails() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(workflow));
		Select s=new Select(workflow);
		s.selectByVisibleText("TestNG");
		
		WebDriverWait wait1 = new WebDriverWait(driver,15);
		wait1.until(ExpectedConditions.elementToBeClickable(userselect));
		Select s1=new Select(userselect);
		s1.selectByVisibleText("ADMINISTRATOR");
		
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.elementToBeClickable(statusselect));
		Select s3=new Select(statusselect);
		s3.selectByVisibleText("Completed");
		
		WebDriverWait wait3 = new WebDriverWait(driver,25);
		wait3.until(ExpectedConditions.elementToBeClickable(assign));
		Select s4=new Select(assign);
		s4.selectByVisibleText("Completed");
		
		applybutton.click();
		okbutton.click();
		
	}
}
