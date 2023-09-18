package Seleniumtraining;
import java.io.*;  
public class Checkfiledownload2 {

	public static void main(String[] args) {
	
		String home = System.getProperty("user.home");
	    String file_name = "details";
	    String file_with_location = home + "\\Documents\\" + file_name;
		  
		
		    File file = new File(file_with_location);
		    if (file.exists()) {
		        System.out.println(file_with_location + " is present");
		        
		    } else {
		        System.out.println(file_with_location + " is not present");
		    }
	       
		}
	}


