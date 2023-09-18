package mavenproject.mavenproject;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readdatacoloumnname {

	public static String gettingcoloum(String coloumname,String Sheet) throws IOException {
	
		
		FileInputStream fis = new FileInputStream("C:\\Users\\\\Pradeep\\Documents\\checking\\datanew.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        
        
        HSSFSheet sheet = workbook.getSheet(Sheet);
        
        HSSFRow row = sheet.getRow(0);
 
        int col_num = -1;
 
        for(int i=0; i < row.getLastCellNum(); i++)
        {
            if(row.getCell(i).getStringCellValue().trim().equals(coloumname))
                col_num = i;
        }
 
        row = sheet.getRow(1);
        HSSFCell cell = row.getCell(col_num);
 
        String value = cell.getStringCellValue();
        //System.out.println("Value of the Excel Cell is - "+ value);
        return value;
	}

	
	

}
