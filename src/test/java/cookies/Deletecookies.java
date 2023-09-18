package cookies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletecookies {

	public static void main(String[] args) throws Exception {

	       WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       // Maximize the browser
	       driver.manage().window().maximize();

	       // Launch Website
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	       Thread.sleep(2000);
	       driver.manage().deleteAllCookies();
	       Thread.sleep(2000);
	       driver.navigate().refresh();
	       String title=driver.getTitle();
	       System.out.println(title);
	       Assert.assertEquals(title, "OrangeHRM");
	       
	       

	}

}
