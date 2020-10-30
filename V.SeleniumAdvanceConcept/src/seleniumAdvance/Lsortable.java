package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Lsortable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://www.leafground.com/pages/sortable.html");
	     
	    List<WebElement> elements = driver.findElements(By.xpath("(//ul[@id='sortable'])//li"));
	    
	    WebElement fromElement = elements.get(1);
	    
	    WebElement toelemElement = elements.get(6);
	    
	   Actions actions = new Actions(driver);
	   
	   actions.clickAndHold(fromElement);
	   actions.moveToElement(toelemElement);
	   actions.release(toelemElement);
	   actions.build().perform();
       
	}

}
