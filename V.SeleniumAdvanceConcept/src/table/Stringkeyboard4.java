package table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringkeyboard4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string");
		
		String str = br.readLine();
		
		System.out.println("Displaying the string that i entered displayed "+str);
		
	}

}
