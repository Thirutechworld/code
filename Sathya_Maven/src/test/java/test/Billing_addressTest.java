package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;
import pages.Billing_address;
import pages.desktopsPage;
import pages.loginPage;
import pages.productPage;

public class Billing_addressTest extends baseClass {
	
		loginPage login;
		productPage prod;
		desktopsPage desk;
		Billing_address bill;
		
		
		@BeforeMethod
		public void initialise()
		{
			initializer();
			login=new loginPage();
			prod=new productPage();
			desk=new desktopsPage();
			bill=new Billing_address();
		}
		@Test(priority=1)
		public void login() throws Exception
		{
			login.loginIntoApp();
			prod.navigateToDesktop();
			desk.readAllDetails();
			bill.readAllDetails1();
		}



	}
