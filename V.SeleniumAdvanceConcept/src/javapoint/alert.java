package javapoint;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
//		WebElement dropalert = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
//		
//		dropalert.click();
//		
//		Alert alerts = driver.switchTo().alert();
//		alerts.accept();
		
		driver.switchTo().frame(0);
	    WebElement button =	driver.findElement(By.xpath("//button[@id='Click']"));
	    button.click();
	
       String  str=	driver.findElement(By.xpath("//button[@id='Click']")).getText();
        System.out.println(str);
        
        driver.switchTo().defaultContent();
		
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement button1 =	driver.findElement(By.xpath("//button[@id='Click1']"));
	    button1.click();
		
	}

}
