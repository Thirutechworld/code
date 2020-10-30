package NewProject;

import java.util.Scanner;

public class Newarray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 int n, sum = 0; int i=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for( i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	          
	          
		         //int j = a[i];
				if(a[i]%2!=0)
		        {
					 System.out.println("odd numbers");
		        	System.out.println(a[i]);
		        }
				else {
					
					
				
				if(a[i]%2==0)
		        {
					System.out.println("even  numbers");
		        	System.out.println(a[i]);
		        }
				
				}
	            
	        }   //sum = sum + a[i];
	        
	      //  System.out.println("Sum:"+sum)
	   
	       
			
			
	   }
	}


