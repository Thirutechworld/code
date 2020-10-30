package scenariopgms;

import java.util.Scanner;

public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome to FORMAR super market");
		  
		 System.out.println("Enter you product");
		 
		 String pens;
		 
		 String favouritepen;
		 
		 String bink;
		 
		 bink = "Bink";
		 
		// int price =5;
		 
		// int special = 15;
		 
		// String brand;
		 
		 Scanner input = new Scanner(System.in);
		 
		 pens=input.next();
		 
		 System.out.println("all brands are available here price ");
		 
		 System.out.println("\t");
		 
		 if(pens==pens) {
			 
			 System.out.println("1:Camlin    Rs5");
			 System.out.println("2:Titus     Rs5");
			 System.out.println("3:Fort      Rs10");
			 System.out.println("4:Cello     Rs15");
			 System.out.println("5:Montex    Rs25");
			 System.out.println("6:Rotomax   Rs30");
			  }
		 
		 
		 System.out.println("Choose your price");
		 
		 int pen = 5;
		 
		 int special  = 10;
		 
		 int cost;
		 
		 cost=input.nextInt();
		 
		 if(cost>=pen) {
			 System.out.println("you can buy pens");
		 }
		 else {
			 System.out.println("you have less money to buy pen"); 
		 }
		 
		 
		 System.out.println("if you want high brands the rate should be  35");
		 
		 System.out.println("Enter your price");
		 int highbrands=40;
		 
		 int prize;
		 
		 prize=input.nextInt();
		 
		for(int i =prize; prize<highbrands; prize +=50) {
			System.out.println(" you can buy Montax pen & Rotomax pen"); 
		}
		 
		System.out.println("Enter your favourite pens");
		
		favouritepen = input.next();
		
		
		
		
		if(favouritepen==bink) 
		{
			System.out.println("stocks are available");	
		}
		else 
		{
			System.out.println("stocks are not available");
		}
		
		//Scanner input1 = new Scanner(System.in);
		
	

	}

}
