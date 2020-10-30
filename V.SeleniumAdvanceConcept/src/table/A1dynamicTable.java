package table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1dynamicTable {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		File files = new File("C:\\Users\\HP-PC\\Desktop\\thiru\\sridhar.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("thiru");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.livechennai.com/gold_silverrate.asp");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);  

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//WebElement table= driver.findElement(By.xpath("(//table[@class='table-price'])[2]")); //(//table[@class='table-price'])[4]

		WebElement table= driver.findElement(By.xpath("(//table[@class='table-price'])[4]"));

		List<WebElement> row=table.findElements(By.tagName("tr")); // find rows

		for(int r=0;r<row.size();r++)
		{
           
			XSSFRow rowvalue = sheet.createRow(r);
			
		List<WebElement> column= row.get(r).findElements(By.tagName("td")); // find columns

		for(int c=0;c<column.size();c++)
		{

		String name= column.get(c).getText(); // it is used to get values from table

		System.out.print(name+ "\t");
		
		rowvalue.createCell(c).setCellValue(name);
		}

		System.out.println();
		
		
		}

		FileOutputStream fos = new FileOutputStream(files);
		wb.write(fos);
		
		} 


}
