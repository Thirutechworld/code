package programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		int a;
		int temp;
		temp =n;
		int sum1 =0;
		
		while(n>0)
		{
			a = n%10;
			n =n/10;
			sum1 = (a*a*a)+sum1;
		}
		
		if(temp==sum1)
		{
			System.out.println("it is a armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong umber");
		}

	}

}
