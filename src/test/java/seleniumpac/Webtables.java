package seleniumpac;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
	        List <WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	        System.out.println("No of rows are : " +row.size());
	        int rowcount=row.size();
	     
	        List <WebElement> coloumn = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th")); 
	        System.out.println("No of coloumns are : " + coloumn.size());
	        int coloumncount=coloumn.size();
	       
	        
	       Assert.assertEquals(rowcount, 1827);
	       Assert.assertEquals(coloumncount, 5);
	       
		    WebElement cellIneed = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		     Assert.assertEquals(valueIneed, "M");
		    
		    for (int i =0;i<row.size();i++)
	        {    
	          // String company= driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	           String company= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[1]")).getText();
	          // System.out.println(company);
	           int count=0;
	           String string1="Ajanta Pharma Lt";
	           String string2="IDFC Bank";
	           String string3="Quess Corp";
	           //if(company.equals(string1) || company.equals(string2) || company.equals(string3));
	         
	           if("Ajanta Pharma Lt".equals(company)||"IDFC Bank".equals(company)||"Quess Corp".equals(company))
	           {
	                 System.out.println(company);
	           }
	           
	           //Regular expressions
	           if (company.matches("Ajanta Pharma Lt|IDFC Bank|Quess Corp")) {
	        	   System.out.println(company);
	        	}
	         
	        }
	}

}
