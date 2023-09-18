package seleniumpac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;  


public class Datepickeradvanced {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("https://demo.automationtesting.in/Datepicker.html");
	        driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	        
	       WebElement element= driver.findElement(By.xpath("//select[@title='Change the month']"));
	       Thread.sleep(5000);
	        Select dropdown = new Select(element);  
	        
	        dropdown.selectByVisibleText("October");
	        
            WebElement  yearelement= driver.findElement(By.xpath("//select[@title='Change the year']"));
            Thread.sleep(5000);
	        Select yeardropdown = new Select(yearelement);
	       
	        
	        yeardropdown.selectByVisibleText("2024");
	        
	        List<WebElement> dates = driver.findElements(By.xpath("//tbody/tr/td/a[@href=\"javascript:void(0)\"]"));

			int count = dates.size();
			System.out.println("number of days"+" "+count);

				for(int i=0;i<count;i++)
			{
				String  text=dates.get(i).getText();
				if(text.equalsIgnoreCase("20"))
				   {
			              dates.get(i).click();
						   break;
				  }
			}
				
				String data=driver.findElement(By.xpath("//input[@id='datepicker2']")).getAttribute("value");
				System.out.println(data);
				
				String Exactdate="10/20/2024";
				Assert.assertEquals(data, Exactdate);
	        
	}

}
