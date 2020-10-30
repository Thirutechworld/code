package programs;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29;
		boolean flag = false;
		for(int i =2;i<=num/2;i++)
		{
			if(num%1==0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not  prime number");
		}
	}

}
