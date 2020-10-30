package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kcalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://www.leafground.com/pages/Calendar.html");
	     WebElement calender = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
	    // calender.sendKeys("12/12/2020" +Keys.ENTER);
	     calender.click(); 
	     
	     WebElement button = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	     button.click();
	     
	     WebElement date = driver.findElement(By.xpath("//a[contains (text(),10)]"));
	     
	     date.click();
	     
	     Thread.sleep(4000);
	     driver.close();

	}

}
