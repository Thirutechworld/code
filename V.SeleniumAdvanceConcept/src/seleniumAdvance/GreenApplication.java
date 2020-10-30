package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenApplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://103.219.205.36:8443/logout");
		
		driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
        driver.findElement(By.xpath("//input[@id='txtLoginId']")).sendKeys("Administrator");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin@321$");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.close();

	}

}
