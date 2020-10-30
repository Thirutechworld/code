package NewProject;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int sum=0;
		System.out.println("how many u want print");
		Scanner sc1 = new Scanner(System.in);
		
		int n = sc1.nextInt();
		int m = sc1.nextInt();
		
		int[][] a = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++) {
				
			
			a[i][j]= sc1.nextInt();
			//sum = sum+a[i];
			}
		}
		//System.out.println(+sum);
		
		System.out.println("Elememtns of the array");
		
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++) {
				
			
			System.out.print(a[i][j]+"");
			}
			
			System.out.println();
		}
		
	}

}
