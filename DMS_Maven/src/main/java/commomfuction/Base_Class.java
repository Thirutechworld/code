package commomfuction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base_Class
{
     
	public static WebDriver driver;
	
	@BeforeSuite
	public static void launchbrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://103.219.205.36:8443/logout");
		
	
	
		driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
	}
	
}
