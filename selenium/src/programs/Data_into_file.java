package programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Data_into_file {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("C:\\Users\\HP-PC\\Desktop\\data_into_file.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("thirumrugan");
		bw.write("thirumrugan");
		bw.write("thirumrugan");
		bw.write("thirumrugan");
		
		System.out.println("successfully updated");
        bw.close();
	}

}
