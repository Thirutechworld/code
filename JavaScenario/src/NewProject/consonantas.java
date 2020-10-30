package NewProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class consonantas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter your name:");
		Scanner sc1 = new Scanner(System.in);
		
		String input = sc1.next();
		
		char[] chararray = input.toCharArray();
		
		List<Character> vowels = new ArrayList<Character>();
		List<Character> consonant = new ArrayList<Character>();
		List<Character> special = new ArrayList<Character>();
		List<Character> number = new ArrayList<Character>();
		
		for (char ch :  chararray)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowels.add(ch);
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')&&!(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				consonant.add(ch);
			}
//			else if(ch>='0' || ch<='9')
//			{
//				number.add(ch);
//			}
			else
			{
				special.add(ch);
			}
			
		}
			
			System.out.println("1) Total count of Vowels in the given string       :"+vowels.size());
			
			for (char c : vowels) 
			
				System.out.print(c+ "");
				System.out.println(" ");
			
			
           System.out.println("1) Total count of consonants in the given string       :"+consonant.size());
			
			for (char c : consonant) 
			
				System.out.print(c+ "");
				System.out.println(" ");
			
			
           System.out.println("1) Total count of special in the given string       :"+special.size());
			
			for (char c : special) 
			
				System.out.print(c+ "");
				System.out.println(" ");
			
			
          System.out.println("1) Total count of number in the given string       :"+number.size());
			
			for (char c : number) 
			
				System.out.print(c+ "");
				System.out.println(" ");
			
		}
	}


