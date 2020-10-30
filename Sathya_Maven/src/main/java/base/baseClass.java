package base;
/*
 * Author Name:Nithya
 * Description 1:Sign-in a Sathya website and write 4 description for 5 products into ExcelSheet and  from Flipkart	
 * Description 2:Read the details form ExcelSheet to Billing Address
 * Framework:	Selenium - Page Object Model
 * Driver:		Chrome Driver
 * API:			Apache POI and TestNG
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass 
{
	public static WebDriver driver;

	// Defined the Brower and navigating to sathya Home page 
	public static void initializer() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sathya.in/");
	}

}
