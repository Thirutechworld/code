package pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClass;


public class desktopsPage extends baseClass
{
	// Defined the Xpath for DeskTop Feature
	@FindBy(xpath="//a[@href='#pd-tabs-2']")
	static
	WebElement feature;
	@FindBy(xpath="//table[@class='table pd-specs-table']")
	WebElement table;


	public desktopsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void readAllDetails() throws Exception
	{
		// Opening 5 desktop products and writing there Feature's in Excel Sheet 
		String Before_Xpath = "(//article[@class='art'])[";
		String After_Xpath="]";
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Downloads\\sathya1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Details");
		WebDriverWait wait=new WebDriverWait(driver,2);
		for(int i=1;i<6;i++)
			try {
				{
					driver.findElement(By.xpath(Before_Xpath+i+After_Xpath)).click();
					JavascriptExecutor js=(JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,750)", "");
					wait.until(ExpectedConditions.elementToBeClickable(feature));
					feature.click();
					XSSFRow row=sheet.createRow(i);

					List<WebElement> columns=driver.findElements(By.xpath("//td[2]"));
					for(int j=0;j<5;j++)
					{
						String data=columns.get(j).getText();

						sheet.getRow(i).createCell(j).setCellValue(data);
					}
					driver.navigate().back();

					List<WebElement> relatedproduct=driver.findElements(By.xpath("//h3[@class='art-name']"));		
					List<String> list=new ArrayList<String>();

					for (WebElement webElement : relatedproduct)
					{
						String relatedproduct_all=webElement.getText();
						list.add(relatedproduct_all);
					}
					JavascriptExecutor js1=(JavascriptExecutor) driver;
					js1.executeScript("window.scrollBy(0,1500)", "");

					for (int s=0; s<=6;s++)
					{
						sheet.getRow(s+1).createCell(5).setCellValue(list.get(s));
					}
				}
			} catch (Exception e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

		// Save the feature's in Excel
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Downloads\\sathya1.xlsx");
		wb.write(fos);
		wb.close();
	}
}
