package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class totaldata_into_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file = new FileReader("C:\\Users\\HP-PC\\Desktop\\data_into_file.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        try {
			while((line = br.readLine()) != null) {  
			    //Splits each line into words  
			    String words[] = line.split("");  
			    //Counts each word  
			    count = count + words.length;  
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  

	}

}
