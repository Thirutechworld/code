package Rightclick;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//takeSnapShot(driver, "E:\\screenshot.png") ; 
		
		takeScreen_shot("facebook loh in");
		
		

	}
	
	public static void takeScreen_shot(String filename) //throws IOException
     {
		//1.take screen shot store it as file formate

 		File files = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
 		// coopy screen shot to desired location using filr method
		
 		FilesUtils.copyFile(files, new File("E:\\screenshot" +filename+".jpg"));
 		
  	
	} 
	
	
}
