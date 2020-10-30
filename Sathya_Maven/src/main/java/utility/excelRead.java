package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {


	public static ArrayList<String> getCredendiatials() throws Exception
	{
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\Downloads\\sathya1.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet login=WB.getSheetAt(0);
		String userName=login.getRow(0).getCell(1).getStringCellValue();
		String password1=login.getRow(1).getCell(1).getStringCellValue();
		String Company=login.getRow(2).getCell(1).getStringCellValue();
		String First_name=login.getRow(3).getCell(1).getStringCellValue();
		String Last_name=login.getRow(4).getCell(1).getStringCellValue();
		String address1=login.getRow(5).getCell(1).getStringCellValue();
		String address2=login.getRow(6).getCell(1).getStringCellValue();
		String city=login.getRow(7).getCell(1).getStringCellValue();
		String zip_postal_code=login.getRow(8).getCell(1).getStringCellValue();
		String Email=login.getRow(9).getCell(1).getStringCellValue();
		String phone_number=login.getRow(10).getCell(1).getStringCellValue();
		String Fax_number=login.getRow(11).getCell(1).getStringCellValue();

		ArrayList<String> credentials=new ArrayList<String>();
		credentials.add(userName);
		credentials.add(password1);
		credentials.add(Company);
		credentials.add(First_name);
		credentials.add(Last_name);
		credentials.add(address1);
		credentials.add(address2);
		credentials.add(city);
		credentials.add(zip_postal_code);
		credentials.add(Email);
		credentials.add(phone_number);
		credentials.add(Fax_number);

		return credentials;
	}
}
