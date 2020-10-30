package scenariopgms;

import java.util.Scanner;

public class class22
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bacacc = new BankAccount("Thirumurugasn",1000);
		
		bacacc.showManu();

	}

}
  

class BankAccount{
	int balance;
	int previousTransaction;
	String Customername;
	int Customerid;
	 
	BankAccount(String name,int id)
	{
		Customername = name;
		
		Customerid = id;
		
	}
	
	void deposit(int amount)
	        {
		       if(amount !=0)
		       {
		    	   balance = balance+amount;
		    	   
		    	   previousTransaction = amount;
		    	 }
	        }   
	void withdraw(int amount) 
	
	       {  
		         if(amount !=0)
		         {
		                balance = balance-amount;
		       
		                previousTransaction =-amount;
		
		         }
		
        	}
	void getprevioustransaction()
	{
		if(previousTransaction>0) 
		{
			System.out.println("previous transaction:" +previousTransaction);
			
		}
		else if(previousTransaction<0)
		{
			System.out.println("withdraw:" +Math.abs(previousTransaction));
		}
		
		else
		{
			System.out.println("NO transaction accured here");
		}
	}
	        
	void showManu() 
	{
		char option = '\0';
		
		System.out.println(" WELCOME FORMAR BANK OF INDIA");
		Scanner input = new Scanner(System.in);
		
		System.out.println("name:"+Customername);
		System.out.println("id:"+Customerid);
		System.out.println("\n");
		System.out.println("A.CheckBalance");
		System.out.println("B.Deposite");
		System.out.println("C.withdraw");
		System.out.println("D.previousTransaction");
		System.out.println("E.Exite");
		
		do {
			System.out.println("=====================================================================================");
			System.out.println("Enter an option");
			System.out.println("======================================================================================");
			option = input.next().charAt(0);
			System.out.println("\n");
			
			 switch(option)
			 {
			     case 'A':
			    	 
			    	 System.out.println("===============================================");
			    	 System.out.println("balance:=" +balance);
			    	 System.out.println("=================================================");
			    	 System.out.println("\n");
			    	 break;
			     case'B':
			    	 
			    	 System.out.println("===============================================");
			    	 System.out.println("Enter an amount to deposite:");
			    	 System.out.println("===============================================");
			    	 int amount = input.nextInt();
			    	 deposit(amount);
			    	 System.out.println("\n");
			    	 break;
			    	 
			     case'C':	
			    	 
			    	 System.out.println("===============================================");
			    	 System.out.println("Enter an amount to withdraw:");
			    	 System.out.println("===============================================");
			    	 int amount1 = input.nextInt();
			    	 withdraw(amount1);
			    	 System.out.println("\n");
			    	 break;
			    	 
			     case'D':
			    	 
			    	 System.out.println("===============================================");
			    	 getprevioustransaction();
			    	 System.out.println("===============================================");
			    	 break;
			    	 
			     case'E': 
			    	 
			    	 System.out.println("===============================================");
			    	 
			    	 break; 
			    	 
			    default:
			    	System.out.println("invalid option! plese enter again");
			    	 break;
			 }
			
			
		   } while(option !='E');
		System.out.println("Thanks for using application");
   	 
		
	}

	
}
