package programs;

import java.util.Scanner;

public class primebetween_twonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("starting number:");
		int low = sc1.nextInt();
		System.out.println("end number:");
		int high = sc1.nextInt();
		
		
		while (low < high) 
		{
            boolean flag = false;
                                          
    
            for(int i = 2; i <= low/2; ++i)
            {
                
                if(low % i == 0)
                {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.println(low + " ");

            ++low;
		}
	}

}
