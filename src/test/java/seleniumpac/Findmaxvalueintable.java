package seleniumpac;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findmaxvalueintable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
	        List<WebElement>  rows = driver.findElements(By.xpath ("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        
	        double r=0;
	        for (int i =0;i<rows.size();i++)
	        {    
	        	String max= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
	        	NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            
	            double  m = Double.parseDouble(max);
	            
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
	}

}
