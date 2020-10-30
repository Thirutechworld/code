package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basement.Base;
import pages.Dms_login_page;
import pages.Dms_report;

public class Report_Test 
{
	Dms_login_page loginpagedoc;
	Dms_report reportdetails;
	@BeforeMethod

	public void initial() {
		Base.initializer1();
		loginpagedoc = new Dms_login_page();
		reportdetails= new Dms_report();
	}

	@Test

	public void login() throws Exception {
		loginpagedoc.loginverify();
		reportdetails.reportdetail1();
	}
}
