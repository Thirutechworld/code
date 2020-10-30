package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DToolTip {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement name = driver.findElement(By.id("age"));
		
		String toolText = name.getAttribute("title");
		System.out.println(toolText);
		
		driver.quit();
	}

}
