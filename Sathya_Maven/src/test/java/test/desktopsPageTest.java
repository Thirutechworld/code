package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;
import pages.desktopsPage;
import pages.loginPage;
import pages.productPage;

public class desktopsPageTest extends baseClass {
	loginPage login;
	productPage prod;
	desktopsPage desk;
	@BeforeMethod
	public void initialise()
	{
		initializer();
		login=new loginPage();
		prod=new productPage();
		desk=new desktopsPage();
	}
	@Test(priority=1)
	public void login() throws Exception
	{
		login.loginIntoApp();
		prod.navigateToDesktop();
		desk.readAllDetails();
	}
}
