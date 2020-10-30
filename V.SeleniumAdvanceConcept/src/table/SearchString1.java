package table;

import java.util.Scanner;

public class SearchString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1,st2;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		st1= sc1.nextLine();
		System.out.println("Enter the second string");
		st2= sc1.nextLine();
		System.out.println(st1.contains(st2));

	}

}
