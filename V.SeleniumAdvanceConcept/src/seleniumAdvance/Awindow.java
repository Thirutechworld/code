package seleniumAdvance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Awindow {

	public static void main(String[] args) throws InterruptedException
	{
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.leafground.com/pages/Window.html");
     
     String oldwindow = driver.getWindowHandle(); // to identify the current window of the website.
     
     WebElement firstbutton = driver.findElement(By.xpath("//button[@id='home']"));
     firstbutton.click();
     
      Set<String> handles =  driver.getWindowHandles(); // to handles multiple window and store or more than one<set> it combine old new window
      
      for (String newwindow : handles) 
      {
		driver.switchTo().window(newwindow);   //all control goes to new window
		
	  }
     
     WebElement edit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
     
     driver.close();
     
     driver.switchTo().window(oldwindow); //its move control to first window through driver.
     
     WebElement openmultiwin = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
     openmultiwin.click();
     
     Thread.sleep(3000);
     
     int noofwindows = driver.getWindowHandles().size();
     System.out.print("number of windows" +noofwindows);
     
     WebElement dontclose = driver.findElement(By.id("color"));
     dontclose.click();
      
     Thread.sleep(3000);
     
     Set<String>  newwindowhandle= driver.getWindowHandles();
     
     for (String allwindow : newwindowhandle) {
    	 if(!allwindow.equals(oldwindow)) {
    		 driver.switchTo().window(allwindow);
    		 driver.close(); // it is only close which is focus is called close
    	 }
    	 driver.quit(); // it is close all windows throughout driver
	}
     
     
	}

}
