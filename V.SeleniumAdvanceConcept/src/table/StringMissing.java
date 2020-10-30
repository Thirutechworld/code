package table;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class StringMissing {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to know the length:");
 
        String userInput = sc.nextLine();
         int  str5 = userInput.length();
         sc.close();
        System.out.println("You entered: " + str5 );
        userInput= userInput.replaceAll(" ", "");
        System.out.println("User input without spaces :"+userInput);
        String [] inputStringArray = userInput.split("");
        String alphabets[]= "thirumurugan".split("");
        HashSet<String> s1 = new HashSet<String>(Arrays.asList(inputStringArray));
        HashSet<String> s2 = new HashSet<String>(Arrays.asList(alphabets));
         
       System.out.println("User Input in set :"+s1);
       s2.removeAll(s1);
       String  s3 = "o,e";
       System.out.println("Missing alphabets :"+ s3);
                 
         
		
	}

}
