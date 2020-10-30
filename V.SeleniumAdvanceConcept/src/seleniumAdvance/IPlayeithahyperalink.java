package seleniumAdvance;

import java.util.List;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPlayeithahyperalink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.navigate().to("http://www.leafground.com/pages/Link.html");
	     
	     WebElement home = driver.findElement(By.linkText("Go to Home Page"));//1
	     home.click();
	     driver.navigate().back();
	     
	     WebElement where = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));//2
	      String clickme = where.getAttribute("href");
	      System.out.println(clickme);
	      
	      WebElement error = driver.findElement(By.partialLinkText("Verify am I broken?"));//3
	      error.click();
	     String titles = driver.getTitle();
	     
	     if (titles.contains("404")) {
			System.out.println("the website is broken");
		}
	      
	      driver.navigate().back();
	      
	      WebElement home22 = driver.findElement(By.linkText("Go to Home Page"));// 4
		     home22.click();
         driver.navigate().back();
      
      List<WebElement> totalpages =  driver.findElements(By.tagName("a"));
      int topages = totalpages.size();
      System.out.println(topages);
         
         

	}

}
