package seleniumAdvance;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class BFrames {

	public static void main(String[] args)
	{
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		
		int size = frames.size();
		
		
		
		System.out.println(size);
		
		driver.quit();

	}
       
}
