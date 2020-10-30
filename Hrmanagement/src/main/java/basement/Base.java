package basement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base
{
	public static WebDriver driver;

	// Defined the Brower and navigating to sathya Home page 


	public static void initializer1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://103.219.205.36:8443/"); 
	}
	
}