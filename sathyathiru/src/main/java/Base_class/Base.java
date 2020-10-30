package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
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
