package table;

import java.util.StringTokenizer;

public class StringToken2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "thirumurugan varadharaj";
		
		StringTokenizer str2 = new StringTokenizer(st1);
		
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		
	}

}
