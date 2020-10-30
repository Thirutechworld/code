package seleniumAdvance;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

public class CPlaywithdragandDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver(1)_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));
		
	    Actions action = new Actions(driver); // perform mouse action
	    
	    action.dragAndDrop(from, to).build().perform();
	    
	    driver.close();
	    
	    
	    
	}

}
