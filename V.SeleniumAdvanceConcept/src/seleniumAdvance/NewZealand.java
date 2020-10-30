package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import basement.Basementcricbuzz;
import cucumber.api.java.en.Then;

public class NewZealand 
{
	WebDriver driver;

	@Then("^click on New zealand Test match under Team$")
	public void click_on_New_zealand_Test_match_under_Team()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver(1)_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-team/new-zealand/13/schedule");
		
		
	    	}

	@Then("^Cliclk on the schedule$")
	public void cliclk_on_the_schedule() {
		
	
	   
	}

	@Then("^user can view new zealand Test match$")
	public void user_can_view_new_zealand_Test_match()  {
		
		WebElement table =	driver.findElement(By.xpath("//*[@id=\'series-matches\']/div/div[3]"));
		String str = driver.findElement(By.xpath("//*[@id=\'series-matches\']/div/div[3]/div[1]/span")).getText();
		System.out.println(str);
	    
	}

	
	
	
}
