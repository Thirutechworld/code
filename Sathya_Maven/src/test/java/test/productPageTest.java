package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;
import pages.loginPage;
import pages.productPage;


public class productPageTest extends baseClass{
	
	loginPage login;
	productPage prod;
	
	@BeforeMethod
	public void initialise()
	{
		initializer();
		login=new loginPage();
		prod=new productPage();
	}
	@Test
	public void login() throws Exception
	{
		login.loginIntoApp();
		prod.navigateToDesktop();
	}
	
	

}
