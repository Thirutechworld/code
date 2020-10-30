package programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =454; int temp; int r;
        int sum=0;
        
        temp = n;
        while(n>0)
        {
        	r = n%10;
        	sum = (sum*10)+r;
        	n =n/10;
        	
        	
        }
        if(temp==sum)
        {
        	System.out.println("it is palindrome number");
        }
        else
        {
        	System.out.println("It is not palindrome");
        }
	}

}
