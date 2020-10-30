package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eselectable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		WebElement selectable = driver.findElement(By.xpath("//*[@id=\'selectable\']/li"));
		
		int list = selectable.size();
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(select);

	}

}
