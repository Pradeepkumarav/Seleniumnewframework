package launchbrowser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Datadriven {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream inputStream = new FileInputStream("C:\\Users\\Pradeep\\Documents\\checking\\datanew.xls");
		
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		
		HSSFSheet sheet=wb.getSheet("Sheet1");
	     
	     //Create a row object to retrieve row at index 1
	     HSSFRow row2=sheet.getRow(1);
	     
	     //Create a cell object to retreive cell at index 5
	     HSSFCell cell=row2.getCell(0);
	     
	     //Get the address in a variable
	     	String firstname= cell.getStringCellValue();
	     
	     //Printing the address
	     System.out.println("firstnamevalue :"+ firstname);

		
	     

	}

}
