package Seleniumtraining;
import java.io.*;  
public class Checkfiledownload {

	
	public static void main(String[] args) {
		 boolean flag = false;
	        //paste your directory path below
	        //eg: C:\\Users\\username\\Downloads
	        String dirPath = "C:\\Users\\Pradeep\\Documents\\checking";
	        File dir = new File(dirPath);
	        String filename="data.txt";
	        File[] files = dir.listFiles();
	        System.out.println(files.length);
	        if (files.length == 0 || files == null) {
	            System.out.println("The directory is empty");
	         
	        } else {
	            for (File listFile : files) 
	            {
	            	
	                if (listFile.getName().equals(filename)) {
	            
	                    flag = true;
	                    break;
	                  }
	                 else
	                {
	                	flag = false;
	                }
	                
	              
	             }
	            
	           
	        }
	        
	       if(flag==true)
	       {
	    	   System.out.println(filename + " is present");
	       }
	       else
	       {
	    	   System.out.println(filename + " not present");
	       }
	       
	}
		
		
	
}

