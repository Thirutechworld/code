package NewProject;

import java.util.Scanner;

public class Add_Matrix {

	public static void main(String[] args)
	{
		int sum=0;
		System.out.println("how many u want print");
		Scanner sc1 = new Scanner(System.in);
		
		int n = sc1.nextInt();
		int m = sc1.nextInt();
		
		int[][] a = new int[n][m];
		
		System.out.println("second array");
		
		int[][] b = new int[n][m];
		
		int [][] c = null;
		
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++) {
				
			
			a[i][j]= sc1.nextInt();
			b[i][j]=sc1.nextInt();
			//sum = sum+a[i];
			}
		}
		//System.out.println(+sum);
		
		System.out.println("Elememtns of the array");
		
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<m;j++) {
				
			
			System.out.print(a[i][j]+"");
			System.out.print(b[i][j]+"");
			
			c[i][j] = a[i][j]+b[i][j];
			
			System.out.println(c[i][j]);
			}
			
			System.out.println();
		
        
	}

	}
}

