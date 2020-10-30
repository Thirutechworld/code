package scenariopgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1;
//		int a;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name");
//		str1 = sc.nextLine();
//		System.out.println("Enter the age");
//		a = sc.nextInt();
//		System.out.println(str1);
//		System.out.println(a);
		
		ArrayList al = new ArrayList();
		System.out.println("Enter the name");
		Scanner scq = new Scanner(System.in);
		String str = scq.next();
		al.add(str);
		
		Iterator it1 = al.iterator();
		
		while(it1.hasNext()) {
			
			System.out.println(it1);
		}
		

	}

}
