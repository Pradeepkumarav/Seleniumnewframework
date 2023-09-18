package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parallel {

	
	@Test
	   public void A() {
	      System.out.println("Inside method1()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		   
	   }
	@Test
	public void B() {
	      System.out.println("Inside method2()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://www.amazon.in/");
		   
	   }
	
	@Test
	public void C() {
	      System.out.println("Inside method3()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://www.flipkart.com/");
		   
	   }
	
	
	@Test
	public void D() {
	      System.out.println("Inside method4()");
	      //Assert.assertEquals(message, messageUtil.printMessage());
	      
	      System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        // Maximize the browser
		        driver.manage().window().maximize();
		 
		        // Launch Website
		        driver.get("https://demo.opencart.com/");
		   
	   }
}
