package table;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class Stringduplicate3 {
	public static String str;
	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string");
		 str = sc1.nextLine();
        duplicate(str);
	}
      public static void duplicate(String str)
      {
    	Map<Character, Integer> map = new HashedMap<>();
    	
		char[] characters = str.toCharArray();
		
		for (char c : characters)
		{
			if(!map.containsKey(c)) 
			{
				map.put(c, 1);
				
			}
			else
			{
				map.put(c,map.get(c)+1);
				
			}
			
			Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
			for(Map.Entry<Character, Integer> entry:entrySet) 
			{
				if(entry.getValue()>1) {
					System.out.printf("%s:%d %n",entry.getKey(),entry.getValue());
				}
			}
		}
      }
}
