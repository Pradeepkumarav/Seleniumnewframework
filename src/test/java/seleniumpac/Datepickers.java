package seleniumpac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

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

	}

}
