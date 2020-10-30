package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the input String : ");
		String input=s.next();
		char[] charArray = input.toCharArray(); 
		List<Character> vowelList = new ArrayList<>();
		List<Character> consList = new ArrayList<>();
		List<Character> nonList = new ArrayList<>();
		for(char ch: charArray)
		{
			
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		vowelList.add(ch);
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')&&!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			consList.add(ch);
		}
		else
		{
	    nonList.add(ch);
		}
        
		}
		System.out.println("=======================================================================");
		
		System.out.println("Total count of Vowels in the given string       :"+vowelList.size());
		System.out.print("Vowel in the given string : ");
		for(char c:vowelList)
		System.out.print(c+" "); 
		System.out.println(" ");
		
		
		System.out.println(" Total count of Consonants in the given string   :"+consList.size());
		System.out.print("Consonants in the given string : ");
		for(char c:consList)
		System.out.print(c+" ");
		System.out.println(" ");
		
		
		System.out.println(" Total count of Non Alphabets in the given string:"+nonList.size());
		System.out.print("Non Alphabet characters in the given string :");
		for(char c:nonList)
		System.out.print(c+" ");
		System.out.println(" ");
		System.out.println("\n=======================================================================");

	

	}

}
