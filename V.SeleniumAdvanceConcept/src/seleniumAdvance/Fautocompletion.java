package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fautocompletion {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement textbox = driver.findElement(By.id("tags"));
		textbox.sendKeys("s");
		Thread.sleep(4000);
		
	 List<WebElement> elemrnt= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	 
	 System.out.println(elemrnt.size());
	 
	 for (WebElement webElement : elemrnt) 
	 {
		if(webElement.getText().equals("Selenium"));
		   webElement.click();
		   break;
	 }
	}

}
