package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HInteractwithimage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//WebElement image = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
		//image.click();
		
	   // driver.navigate().back();  // back to webpage
	    
	    
	    WebElement brokenimgae = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
	   // brokenimgae.click();
	    //naturalwidth=0
	    
	    if(brokenimgae.getAttribute("naturalWidth").equals("0"))
        {
	    	System.out.println("the image is broken");
	    }
	    else
	    {
	    	System.out.println("the image is not broken");
	    }
        driver.close();
	}

}
