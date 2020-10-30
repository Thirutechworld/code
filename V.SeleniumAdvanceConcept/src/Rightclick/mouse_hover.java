package Rightclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikihow.com/Study-Online");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String newtitle ="How to Study Online (with Pictures) - wikiHow";
		if(newtitle.equals(title)) 
		{
			System.out.println("title correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\'nav_explore\']"));
		
		action.moveToElement(element).build().perform();
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\'nav_explore_li\']/div[2]/a[1]"));
		
		element1.click();
		
		System.out.println("sucessfully");
		
		driver.close();
		

	}

}
