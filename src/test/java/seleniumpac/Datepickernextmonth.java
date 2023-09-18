package seleniumpac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Datepickernextmonth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("https://demo.automationtesting.in/Datepicker.html");
			driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
			
			String month="March 2024";
			String day="30";

			while(true)
			{
			String monthtext =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yeartext =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String monthyear=monthtext+" "+yeartext;
			//it gives the month and year text
			if(monthyear.equals(month))
				{
				   break;
				 }
				else
				{
				//need to click on arrow mark to move next text month and year
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
									
				}
			}
			
			List<WebElement> dates = driver.findElements(By.xpath("//tbody/tr/td[@data-event='click']"));

			int count = dates.size();
			System.out.println("number of days"+" "+count);

				for(int i=0;i<count;i++)
			{
				String  text=dates.get(i).getText();
				if(text.equalsIgnoreCase("30"))
				   {
			              dates.get(i).click();
						   break;
				  }
			}
				
				String data=driver.findElement(By.xpath("//input[@id='datepicker1']")).getAttribute("value");
			System.out.println(data);
			
			String Exactdate="03/30/2024";
			Assert.assertEquals(data, Exactdate);
			
				
				

	}

}
