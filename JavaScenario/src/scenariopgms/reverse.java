package scenariopgms;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args)
{
//		
//		String str;
//		System.out.println("Enter the String");
//		Scanner sc1 = new Scanner(System.in);
//		str = sc1.next();
//		char[] ch = str.toCharArray();
//		int n = ch.length;
//		System.out.println("reverse String");
//		for(int i=n;i>0;i--) 
//		{
//			System.out.print(ch[i-1]);
//			
//		}
		
//		String name;
//		Scanner sc1 = new Scanner(System.in);
//		name = sc1.nextLine();
//		char[] ch1 = name.toCharArray();
//		for(int i = ch1.length-1;i>=0;i--)
//		{
//		System.out.print(ch1[i]);
//		}
     
		int x,y,temp;
		System.out.println("enter value x and y");
		Scanner sc1 = new Scanner(System.in);
		x=sc1.nextInt();
		y= sc1.nextInt();
		System.out.println("Before swapping x" +x );
		System.out.println( "y" +y );
		temp = x;
		x=y;
		y= temp;
		System.out.println("After swapping X"+x);
		System.out.println(" y"+y);

		
		
	}

}
