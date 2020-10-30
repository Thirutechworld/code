package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;
import pages.loginPage;

public class loginPageTest extends baseClass{
	loginPage login;
	@BeforeMethod
	public void initialise()
	{
		baseClass.initializer();
		login=new loginPage();
	}
	
	

	@Test
	public void loginPage() throws Exception
	{
		login.loginIntoApp();
	}

}
