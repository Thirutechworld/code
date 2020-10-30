package gmail;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int s;
		
		int reversed=0;
		
		Scanner sc1 = new Scanner(System.in);
		
		int n = sc1.nextInt();
		
		while(n!=0) 
		{
			s= n%10;
			reversed = reversed*10+s;
			n/=10;
		}

		System.out.println("reversed number" +reversed);
	}

}
