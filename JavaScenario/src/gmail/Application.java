package gmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

	public static String name;
	public static  String password;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("=========================================================");
		System.out.println("GMAIL LOGIN APPLICATION");
		System.out.println("=========================================================");
		
		System.out.println("Enter user name:");
		Scanner sc1 = new Scanner(System.in);
		 name  = sc1.next();
		
		int no = name.length();
		
		if(no==5) {
			System.out.println("username credentails accepted");
		}
		else {
			System.out.println("it should not accept morethan six letters.");
			finalmethod();
		}
          
		//gmailpassword();
	}
 
	
	
	public static void gmailpassword()
	{
        String password;
		
		System.out.println("Enter your password");
		Scanner sc1 = new Scanner(System.in);
		
		password = sc1.next();
		
	   hasspecialcharacter( password);

	}
	
	public static void hasspecialcharacter(String password)
	{
		Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher amatcher =sPattern.matcher(password);
		    if(!amatcher.matches())
		    {
		    	System.out.println(" nuemericaldata added");
		    }
		    else 
		    {
		    	System.out.println("special character not  added");
		    }
		    
		   // finalmethod();
	}
	
	public static void finalmethod() 
	{
		
		String username= "thiru1997";
		String gmailpassword="thirumurugan@123";
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter user name ");
		String name = scr.next();
		System.out.println("Enter your password ");
		String usepassword = scr.next();
		
		 if (name.equals( username) && usepassword.equals(gmailpassword))
		 {

		        System.out.println("Access Granted! Welcome!");
		    }

		    else if (name.equals(username)) {
		        System.out.println("Invalid Password!");
		    } else if (usepassword.equals(gmailpassword)) {
		        System.out.println("Invalid Username!");
		    } else {
		        System.out.println("Invalid Username & Password!"); }
		  // menu();
	}
		
	  public static void menu() 
	  {
		  char ch ='\0';
		  System.out.println("A.COMPOSE");
		  System.out.println("B.INBOX");
		  System.out.println("C.SENT");
		  System.out.println("D.DRAFTS");
		  System.out.println("E.Exit");
		  Scanner t1 =new Scanner(System.in);
		  
		  
		  do 
		  {
			  System.out.println("=====================================================================================");
				System.out.println("Enter an option");
				System.out.println("======================================================================================");
	            ch = t1.next().charAt(0);
			  
	       switch(ch) 
	       {
	       
	       case'A':
	    	   System.out.println("Enter mail From:");
	    	   String from = t1.next();
	    	   System.out.println("Enter mail To:");
	           String to = t1.next();
	           System.out.println("mail successfully sent");
	           break;
	           
	       case'B':
	    	   System.out.println("inbox:95");
	    	   break;
	    	   
	       case'C':
	    	   System.out.println("Recently sent");
	    	   String sz1 ="thivaradharaja@gmail.com";
	    	   String sz2 ="sridharvembu@gmail.com";
	    	   
	    	   System.out.println(sz1);
	    	   System.out.println(sz2);
	    	   break;
	    	   
	       case'D':
	    	   
	    	   System.out.println("Draft     Document from txt.file - document");
	    	   System.out.println("Draft     Document from txt2.file - seleniumproject");
	    	   
	           break;
	       }
		  }while(ch!='E');
		  System.out.println("Thanks for using application");
		  
	  }
	
		


	
}
