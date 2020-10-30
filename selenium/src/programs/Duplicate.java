package programs;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name");
		
		Scanner str = new Scanner(System.in);
		
		String name = str.next();
		
		int length = name.length();
		
		char[] ch= name.toCharArray();
		
		for ( int i=0; i<length;i++)
		{
			for(int j=i+1; j<length;j++)
			{
				if(ch[i]==ch[j]) {
					System.out.println("duplicate elements are:" +ch[j]);
					break;
				}
			}
		}
		
	}

}
