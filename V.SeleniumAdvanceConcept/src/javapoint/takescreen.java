package javapoint;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreen {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\Kahoot\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		
		//take screenshot
		
		Robot robert = null;
		try {
			robert = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dimension screensize=  Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screensize);
		BufferedImage source =   robert.createScreenCapture(rect);
		File file = new File("E://thiru.png");
		try {
			ImageIO.write(source, "png", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
