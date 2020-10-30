package commonTestcase;

import commomfuction.Base_Class;
import commonpages.Log_in_pages;

public class Dms_log_test extends Base_Class
{
     Log_in_pages login;
     
     public void initial() 
     {
    	 Base_Class.launchbrowser(); 
    	 login = new Log_in_pages();
     }
     
     
     public void login() {
    	 login.logindetails();
     }
}
