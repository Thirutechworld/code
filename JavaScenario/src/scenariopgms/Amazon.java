package scenariopgms;

import java.util.Scanner;

public class Amazon {

	 public  static String products;
		public static String products22;
		public static int goldwinner=90;
		public static int ibaco= 250;
		public static int c;
	public  static void  Amazon23() {
		String username;
	    String password;
        
	  
	    
	    
	    password = "9585013913";
	    username = "Thirumurugan";

	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	   username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    password = input2.next();

	    if (username.equals(username) && password.equals(password)) {

	        System.out.println("Access Granted! Welcome!");
	    }

	    else if (username.equals(username)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(password)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username & Password!"); }
	    }
      
	    public  static void productdetails()
	    {
	    	
	    	System.out.println("=====================================================================================");
	    	System.out.println("The best brand of oils");
	    	System.out.println("=====================================================================================");
			if(products.equals("oils")) {
	    	System.out.println("Gold winner");
	    	System.out.println("idhayam");
	    	}
			
			System.out.println("=====================================================================================");
	    	System.out.println("icecream products");
	    	System.out.println("=====================================================================================");

			 if( products22.equals("icecream"))
			{
				System.out.println("Arun icecream");
		    	System.out.println("ibaco");
		    	System.out.println("Oyalo");
		    	System.out.println("Jammai");
			}
			 
			 
	    }
	    
	
	
	public static void main(String[] args) {
		
		Amazon23();
		
		System.out.println("=====================================================================================");
		
		System.out.println("WELCOME TO AMAZON GROCERY SHOP");
		
		System.out.println("=====================================================================================");
		
		System.out.println("Enter your products");
		
		
		
		Scanner am1 = new Scanner(System.in);
		
        products = am1.next();
        products22 = am1.next();
        
        productdetails();
       show();
	}

	public static void show()
	{
		
		
		char ch = '\0';
		System.out.println("A.Know your points");
		System.out.println("\n");
		System.out.println("B.purchae product");
		System.out.println("\n");
		System.out.println("C Your bills");
		System.out.println("\n");
		System.out.println("D Exit");
		
		Scanner t1 =new Scanner(System.in);
		do {
			System.out.println("=====================================================================================");
			System.out.println("Enter an option");
			System.out.println("======================================================================================");
            ch = t1.next().charAt(0);
            
            switch (ch) { 
            
            case 'A':
            	int goldwinner = 0;
            	int idhayam;
            	int arunicecream;
            	int ibaco = 0;
            	int oyalo;
            	int jammai;
            	
            	goldwinner =90;
            	idhayam = 300;
            	arunicecream = 40;
            	ibaco= 250;
            	oyalo =500;
            	jammai = 30;
            	
            	System.out.println("gold winner="+goldwinner);
            	System.out.println("idhayam="+idhayam);
            	System.out.println("arunicecream="+arunicecream);
            	System.out.println("ibaco="+ibaco);
            	System.out.println("oyalo="+oyalo);
            	System.out.println("jammai="+jammai);
            	break;
            	
            case 'B':
            	
            	 enteryourproducts();
            	 break;
            case 'C':
            	
            	int cash;
            	System.out.println("Amount" +c);
            	billsamount(); 
            	
            	
            	
            	break;
            	
			} 
			
		} while(ch!='D');
		System.out.println("thanks for using application ");
		
		
		
		
	}

	public static void enteryourproducts() 
	{
		// TODO Auto-generated method stub
		
		
		Scanner p1 = new Scanner(System.in);
		Scanner p2 = new Scanner(System.in);
		String gold = p1.next();
		String ibaco1 = p2.next();
		
		
		System.out.println("Prize details");
		 purchase();
		
	}

	public static void purchase() {
		System.out.println("gold winner"+goldwinner);
		System.out.println("ibaco"+ibaco);
		}

  	public static void billsamount() {
  		 
  		c= goldwinner+ibaco;
  	}

}
