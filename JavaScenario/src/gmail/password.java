package gmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {

	public static void main(String[] args) {
		
		String password;
		
		System.out.println("Enter your password");
		Scanner sc1 = new Scanner(System.in);
		
		password = sc1.next();
		
	   hasspecialcharacter( password);
	  // space( password);
	}
	
//	public static void space(String password) 
//	{
//		     for(char currentChar:password.toCharArray()) 
//		     {
//		    	   if(Character.isWhitespace(currentChar)) 
//		    	   {
//		    		   System.out.println("passwors is correct");
//		    	   }
//		     }
//		     System.out.println("password is incorrect");
//	}
	
	
	public static void hasspecialcharacter(String password)
	{
		Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher amatcher =sPattern.matcher(password);
		    if(!amatcher.matches())
		    {
		    	System.out.println("special character added");
		    }
		    else 
		    {
		    	System.out.println("special character not  added");
		    }
	}

}
