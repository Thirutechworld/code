package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_class.Base;
import pages.loginpage;

public class loginpagetest extends Base 
{
	loginpage login;
	@BeforeMethod
	public void initialise()
	{
		Base.initializer();
		login=new loginpage();
	}
	
	

	@Test
	public void login() {
		login.loginIntoApp();
	}
}
