package seleniumAdvance;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GDownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	    driver.get("http://www.leafground.com/pages/download.html");
	    
	    WebElement downloadfile = driver.findElement(By.linkText("Download Excel")); // file link 
	    downloadfile.click();
	    Thread.sleep(4000);
	    
	   File filelocation = new File("C:\\Users\\HP-PC\\Downloads\\thiru\\Telegram Desktop");// location
	    
	    File[] totalfiles = filelocation.listFiles();  // list of files are stored in totalfiles
	    
	    for (File file : totalfiles)            // which is iterate eache file in the totalfiles
	    {
			if(file.getName().equals("Download Excel"));  // to check whether file id downloaded or not.
			System.out.println("file is downloaded");
	    	break;
	    	
		}
	  
	  
	  

	}

}
