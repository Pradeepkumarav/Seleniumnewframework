package mavenproject.mavenproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readexcelconfig extends Readdatafromexecl {

		
	public static void main(String[] args) throws IOException  {
		{
			System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/register.php");
		        Readexcelconfig obj=new Readexcelconfig();

		   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(obj.getDataFromExcel().get(0)[0]);
		   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(obj.getDataFromExcel().get(0)[1]);
		   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(obj.getDataFromExcel().get(0)[2]); 

		}
	}}
	


