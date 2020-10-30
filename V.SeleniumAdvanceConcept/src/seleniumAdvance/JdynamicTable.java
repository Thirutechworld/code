package seleniumAdvance;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdynamicTable {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	    driver.get("https://www.livechennai.com/gold_silverrate.asp"); //https://www.livechennai.com/gold_silverrate.asp
	    	 
	   List<WebElement> allelements = driver.findElements(By.xpath("(//table[@class='table-price'])[4]//tr"));
	     
		List<Integer> numberlist = new ArrayList<Integer>();
		
		for (WebElement webElement : allelements)
		{
			String list = webElement.getText();
			
			numberlist.add(Integer.parseInt(list));
			
		}

	}

}
