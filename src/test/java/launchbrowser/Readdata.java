package launchbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Readdata {

	public static String[][] name(String path,String sheetname) throws IOException {
		
		String[][] data=null;

        FileInputStream fis = new FileInputStream(path);
        
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        
        HSSFSheet sheet = workbook.getSheet(sheetname);
        
        HSSFRow row = sheet.getRow(0);
        
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = row.getLastCellNum();
        
        System.out.println(noOfRows);
        System.out.println(noOfCols);
        
        
        Cell cell;
        
        data = new String[noOfRows][noOfCols];
       
        
        DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
      
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                //data[i][j] = cell.getStringCellValue();
                data[i][j]=  formatter.formatCellValue(cell);
                
                //0,8 ==last coloum
            }
        }
        
        return data;

	}
	
	public static void main(String[] args) throws IOException {
		String value[][]=  name("C:\\Users\\Pradeep\\Documents\\checking\\New.xls", "Sheet1");
		
		System.out.println(value);
	
	}

}
