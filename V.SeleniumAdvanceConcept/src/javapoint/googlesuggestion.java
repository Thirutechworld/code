package javapoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		
	}

}
