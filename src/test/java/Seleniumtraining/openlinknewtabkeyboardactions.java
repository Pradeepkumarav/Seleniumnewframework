package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openlinknewtabkeyboardactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
			            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
			        // Instantiate a ChromeDriver class.
			        WebDriver driver = new ChromeDriver();
			        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			        // Maximize the browser
			        driver.manage().window().maximize();
			 
			        // Launch Website
			        driver.get("https://www.amazon.in/");
			        driver.manage().window().maximize();
			       
			        
			        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);

	}

}
