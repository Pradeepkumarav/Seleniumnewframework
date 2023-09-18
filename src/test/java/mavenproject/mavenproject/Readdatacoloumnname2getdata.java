package mavenproject.mavenproject;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readdatacoloumnname2getdata {

	public static void main(String[] args) throws IOException {
	
		Readdatacoloumnname data=new Readdatacoloumnname();
		
		     String lastname=   data.gettingcoloum("Last name","Sheet1");
		     String firstname=   data.gettingcoloum("First name","Sheet1");
		     
		     System.out.println(firstname);
		     System.out.println(lastname);
	}

}
