package testNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.Test;

public class DATAREAD {

	
	@Test
	 public  void getExcelData() throws IOException {
	        String[][] data = null;
	       
	        
	      
	 
	            FileInputStream fis = new FileInputStream("C:\\Users\\Pradeep\\Documents\\checking\\dataprovider.xls");
	            HSSFWorkbook workbook = new HSSFWorkbook(fis);
	            HSSFSheet sheet = workbook.getSheet("Sheet1");
	            HSSFRow row = sheet.getRow(0);
	            int noOfRows = sheet.getPhysicalNumberOfRows();
	            int noOfCols = row.getLastCellNum();
	            
	            System.out.println(noOfRows);
	            System.out.println(noOfCols);
	            Cell cell;
	            
	            data = new String[noOfRows][noOfCols];
	            
	            
	            for (int i = 1; i < noOfRows; i++) {
	                for (int j = 0; j < noOfCols; j++) {
	                    row = sheet.getRow(i);
	                    cell = row.getCell(j);
	                    data[i][j] = cell.getStringCellValue();
	                }
	            }
	            
	            
	            System.out.println(data[1][0]);
	       
		    }

}
