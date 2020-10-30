package scenariopgms;

import java.awt.Menu;
import java.awt.MenuItem;
import java.util.Scanner;

public class Arithmatic_calculation {

	public static int a;
	public static int b;
	public static int c;
	
	public static void addition() 
	{
		System.out.println("Addiotion");
		
		c = a+b;
		
		System.out.println("Addiotion is " +c);
		
	}
   public  static  void subtraction() 
   {
	   System.out.println("substraction");
		
		c = a-b;
		
		System.out.println("substraction " +c);
   }
   
    public  static  void mutiple() 
    {
      System.out.println("multiple");
		
		c = a*b;
		
		System.out.println("Addiotion is " +c);
    }
    public  static  void divide()
    {
System.out.println("division");
		
		c = a/b;
		
		System.out.println("division is " +c);
    }
    
	
	public static void main(String[] args)
	
	
	 { 

		System.out.println("Cloud calculator");
		
		
		System.out.println("Enter the First No1");
		Scanner sc1 = new Scanner(System.in);
		a = sc1.nextInt();
		System.out.println("Enter the second  No2");
		b = sc1.nextInt();
	
      menu();
	 }
	
	public static void menu()
    {
    	char option = '\0';
    	System.out.println("A.Addiotion");
    	System.out.println("B.Subtraction");
    	System.out.println("C.Multplication");
    	System.out.println("D.division");
    	System.out.println("E.Exite");
    	Scanner t1 = new Scanner(System.in);
    	do {
    		System.out.println("=====================================================================================");
			System.out.println("Enter an option");
			System.out.println("======================================================================================");
            option = t1.next().charAt(0);
            
            switch(option) {
            
            case 'A':
            	
            	addition();
            	break;
            case 'B':
            	subtraction();
            	break;
            case 'C':
            	
            	 mutiple(); 
            	 break;
            case 'D':
            	
            	divide();
            	
            	break;
            
            	
                         }
    		
    	  } while( option!='E');
    	System.out.println("thanks for using application ");
    	
    }
   
  	
  
  }
	
	
	
