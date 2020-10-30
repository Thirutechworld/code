package javapoint;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.bind.v2.model.core.Element;

public class All_Concepts {

	public static WebDriver Driver;
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		
		Driver = new ChromeDriver();
		
		Driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Driver.manage().window().maximize();
		Driver.findElement(By.linkText("This is a link")).click();
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Driver.navigate().refresh();
		Driver.findElement(By.xpath("//input[@value='male']")).click();
        WebElement automation = Driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]"));
        automation.click();
        
        WebElement drpodown = Driver.findElement(By.xpath("//*[@id=\'testingDropdown\']"));
        
        Select select = new Select(drpodown);
        select.selectByVisibleText("Database Testing");
        
        drpodown.sendKeys("Performance Testing");
        
        //JavascriptExecutor js = (JavascriptExecutor) Driver;
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
        WebElement alertbox = Driver.findElement(By.cssSelector("body > div > div:nth-child(20) > div > p > button"));
        alertbox.click();
        Alert alerts = Driver.switchTo().alert();
        alerts.accept();
        
       // System.out.println(alerts.getText());
        
        
        

		//Driver.close();
		
		

	}

}
