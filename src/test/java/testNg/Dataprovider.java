package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Dataprovider {

	@DataProvider(name = "excelData")
    public Object[][] excelDataProvider() throws IOException {
 
        // We are creating an object from the excel sheet data by calling a method that
        // reads data from the excel stored locally in our system
        Object[][] arrObj = getExcelData(
                "C:\\Users\\Pradeep\\Documents\\checking\\dataprovider.xls","Sheet1");
        return arrObj;
}
 
	
	//------------------------------------------------------------------------
    // This method handles the excel - opens it and reads the data from the
    // respective cells using a for-loop & returns it in the form of a string array
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        try {
 
            FileInputStream fis = new FileInputStream(fileName);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheet(sheetName);
            HSSFRow row = sheet.getRow(0);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            
            System.out.println(noOfRows);
            System.out.println(noOfCols);
            Cell cell;
            
            data = new String[noOfRows-1][noOfCols];
 
            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            System.out.println("The exception is: " + e.getMessage());
        }
        return data;
	    }
    //-------------------------------------------------------------
    
    @Test(dataProvider = "excelData")
    public void testMethod(String username,String password) {
        System.out.println("Data is: " + username);
        System.out.println("Data is: " + password);
    }


}
