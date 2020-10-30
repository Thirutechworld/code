package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basement.Base;
import pages.Dms_login_page;
import pages.Dms_report;
import pages.My_Queue;

//import basement.Base;

public class SMyqueue_Test 
{
	Dms_login_page loginpagedoc;
	Dms_report reportdetails;
	My_Queue myque;
	@BeforeMethod
	public void initial() {
		Base.initializer1();
		loginpagedoc = new Dms_login_page();
		reportdetails= new Dms_report();
		myque = new My_Queue();
		
		@Test
		public void login22() 
		{
			loginpagedoc.loginverify();
			reportdetails.reportdetail1();
			myque.myqueuedetails();
		}
	}
	
}
