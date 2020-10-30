package Rightclick;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class right_click_demo {

	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// to perform double click we will use actions class     
		
		WebElement wb = driver.findElement(By.id("email"));
		
		Action act     =  new Actions(driver).contextClick(wb).build();
		
		act.perform();
        
		scrolldown();
		
	}
	
	public static void scrolldown() 
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		
		driver.close();
	}

	
	
}
