package NewProject;

import java.util.Scanner;

public class Frequent_string {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j;
		
        System.out.println("Enter your name");
		
		Scanner str = new Scanner(System.in);
		
		String name = str.next();
		int[] freq = new int[name.length()];    
		
		char string[] = name.toCharArray(); 
		
		 for(i = 0; i <name.length(); i++)
		 {    
	            freq[i] = 1;    
	            for(j = i+1; j <name.length(); j++)
	            {    
	                if(string[i] == string[j])
	                {    
	                    freq[i]++;    
	                        
	                     
	                    string[j] = '0';    
	                }    
	            }    
	        }    
	            
	         
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <name.length(); i++) 
	        {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.println(string[i] + "-" + freq[i]);    
	        }    
		

	}

}
