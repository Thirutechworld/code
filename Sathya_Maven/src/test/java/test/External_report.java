package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.baseClass;
import pages.desktopsPage;
import pages.loginPage;
import pages.productPage;

public class External_report extends baseClass {
	loginPage login;
	productPage prod;
	desktopsPage desk;
    public ExtentReports extentReport;
	public ExtentTest testCase;
	public ExtentHtmlReporter htmlReporter;
	@BeforeTest
	public void setExtent() 
   {		
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtendReporter.html");
		extentReport.attachReporter(htmlReporter);	
	}
	@BeforeMethod
	public void setup()
	{
		initialisation();
		login=new loginPage();
		prod=new productPage();
		desk=new desktopsPage();			
	}
	private void initialisation()
	{
		// TODO Auto-generated method stub
	}
	@Test
	public void induction() throws Exception 
    {	
		testCase = extentReport.createTest("Fetching details of desktop");
		login.loginIntoApp();
		prod.navigateToDesktop();
		desk.readAllDetails();
	}
	@AfterTest
	public void endReport() 
	{	
		extentReport.flush();
	} 
}



