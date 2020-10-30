package seleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver(1)_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //getting color attribute with getCssValue()
	      String colr = driver.findElement(By.xpath("//*[text()=’GATE Exams’]"))
	      .getCssValue("color");
	      //getting background color attribute with getCssValue()
	      String bckgclr = driver.findElement(By.xpath("//*[text()=’ ’GATE Exams’]"))
	      .getCssValue("background-color");
	      System.out.println(colr);
	      System.out.println(bckgclr);
	      driver.close();
		
		
		

	}

}
