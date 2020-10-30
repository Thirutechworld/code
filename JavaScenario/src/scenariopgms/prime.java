package scenariopgms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the number");
		Scanner sc1= new Scanner(System.in);
		int n = sc1.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println(" not prime number");
		}
	}

}
