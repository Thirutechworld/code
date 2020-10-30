package scenariopgms;

import java.util.Scanner;

public class Class1 
{

	
	public static class users {
	    public String user_name;
	    public int user_id = 1;
	    private String password;
	    public static int count = 1;
	    public static String input;

	    public users(String Ruser, String Rpassword) {

	        this.user_id = count++;
	        this.user_name = Ruser;
	        this.password = Rpassword;
	        count++;

	        System.out.printf("User %s has been crated \n", Ruser);
	        System.out.printf("Enter 'login' to log in or 'register' to open another account");

	    }

	    public static void login(String Luser, String Lpassword) {
	        for (int i = 1; i <= count; i++) {
	            System.out.printf("Enter 'login' to log in or 'register' to open another account");
	            // user_id.users
	            // if(this.user_name)
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("login");
	        System.out.println("register");
	        input = scanner.nextLine();


	            while (input.equals("login")) {

	                System.out.println("username");
	                String Luser = scanner.nextLine();
	                System.out.println("Password");
	                String Lpassword = scanner.nextLine();
	                int a = count;
	                login(Luser, Lpassword);
	                System.out.println("");
	                input = scanner.nextLine();
	            }
	            while (input.equals("register")) {

	                System.out.println("username");
	                String Ruser = scanner.nextLine();
	                System.out.println("Password");
	                String Rpassword = scanner.nextLine();
	                users count = new users(Ruser, Rpassword);
	                System.out.println("");
	                input = scanner.nextLine();
	            }
	            while ((!input.equals("register")) || (!input.equals("login"))) {
	                System.out.println("invild option, chose login or regiser!");
	                input = scanner.nextLine();


	        }
//	public static void main(String[] args) 
//	{
////		// TODO Auto-generated method stub
////
////		Scanner input = new Scanner(System.in);
////
////	    String username;
////	    String password;
////
////	    //System.out.println("Log in:");
////	    System.out.println("username: ");
////	    username = input.next();
////
////	    System.out.println("password: ");
////	    password = input.next();
////
////	    //users check = new users(username, password);
////
////	    if(username.equals(username) && password.equals(password)) 
////	        System.out.println("You are logged in");
//		
//		
//		String thUsername;
//	    String thPassword;
////
////	    Password = "123";
////	    Username = "wisdom";
//
//	    Scanner input1 = new Scanner(System.in);
//	    System.out.println("Enter Username : ");
//	     thUsername = input1.next();
//
//	    Scanner input2 = new Scanner(System.in);
//	    System.out.println("Enter Password : ");
//	     thPassword = input2.next();
//
//	    if (thUsername.equals("thiru") && thPassword.equals("murugan")) {
//
//	        System.out.println("Access Granted! Welcome!");
//	    }
//
//	    else if (thUsername.equals("thiru")) {
//	        System.out.println("Invalid Password!");
//	    } else if (thPassword.equals("murugan")) {
//	        System.out.println("Invalid Username!");
//	    } else {
//	        System.out.println("Invalid Username & Password!");
//	    }
//
//		
//		
//
   }
	
	}
	
}


