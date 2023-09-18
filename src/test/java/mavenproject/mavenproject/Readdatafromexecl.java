package mavenproject.mavenproject;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Readdatafromexecl {
	
    public ArrayList<String[]> getDataFromExcel() throws IOException {
		
		ArrayList<String[]> myData = new ArrayList<String[]>();
	 File file =    new File("C:\\Users\\Pradeep\\Documents\\checking\\datanew.xls");
     
     //Create an object of FileInputStream class to read excel file
     FileInputStream inputStream = new FileInputStream(file);
     
     //Creating workbook instance that refers to .xls file
     HSSFWorkbook wb=new HSSFWorkbook(inputStream);
     
     //Creating a Sheet object using the sheet Name
     String firstname=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
     String Lastneme=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
     long mobilenumber=(long) wb.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
     
     String Mobile=String.valueOf(mobilenumber);  
  
 	String ob[] = {firstname, Lastneme, Mobile};
	
	myData.add(ob);

     return myData;
}
}
