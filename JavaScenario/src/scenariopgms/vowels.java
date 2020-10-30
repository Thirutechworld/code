package scenariopgms;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {

        String str;
        System.out.println("Enterthe string");
        Scanner sc1 = new Scanner(System.in);
        str = sc1.next();
        
        char[] ch = str.toCharArray();
        
        int n = ch.length;
        for(int i =0;i<n; i++) {
        	
       
        
        switch(i) 
        {
       
   	 case 'e'  :
   	 case 'i'   :
   	 case 'o'  :
   	 case 'u'  :
   	 case  'A' :
   	 case 'E'  :
   	 case 'I'   :
   	 case 'O'  :	
   	 case 'U'  : i = 1;
   	 
   	 System.out.println(ch);
   	 
   	 
        }
        }
	}

}
