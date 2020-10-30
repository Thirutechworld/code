package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basement.Base;
import pages.Dms_login_page;

public class Log_in_Test extends Base
{

	Dms_login_page loginpagedoc;
	
	@BeforeMethod
	
	public void initial() {
		Base.initializer1();
		loginpagedoc = new Dms_login_page();
	}
	
	@Test
	
	public void login() throws Exception {
		loginpagedoc.loginverify();
	}
}
