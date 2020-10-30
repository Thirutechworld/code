package gmail;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
        
		
		System.out.println("=========================================================");
		System.out.println("GMAIL LOGIN APPLICATION");
		System.out.println("=========================================================");
		
		System.out.println("Enter user name:");
		Scanner sc1 = new Scanner(System.in);
		String name  = sc1.next();
		
		int no = name.length();
		
		if(no==4) {
			System.out.println("username credentails accepted");
		}
		else {
			System.out.println("it should not accept morethan six letters.");
			
		}

		gmailpassword();

	}

	public static void gmailpassword()
	{
		
	}
}
