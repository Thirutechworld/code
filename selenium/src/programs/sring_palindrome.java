package programs;

import java.util.Scanner;

public class sring_palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter your string"); 
	Scanner string1 = new Scanner(System.in);
//		
//		String string1 = string.next();
//		
//        boolean flag = true;    
//            
//           
//        string1 = string1.toLowerCase();    
//            
//        
//        for(int i = 0; i < string1.length()/2; i++)
//        {    
//            if(string1.charAt(i) != string1.charAt(string1.length()-i-1))
//            {    
//                flag = false;    
//                break;    
//            }    
//        }    
//        if(flag)    
//            System.out.println("Given string is palindrome");    
//        else    
//            System.out.println("Given string is not a palindrome"); 
		
		String str = string1.next();
		String org_strig = str;
		
		String rev ="";
		
		for(int i =str.length()-1;i>=0;i--)
		{
			rev =rev+str.charAt(i);
		}
         
		System.out.println(rev);
		
		if(org_strig.equals(rev))
		{
			System.out.println("it is palindrome string");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}

}
