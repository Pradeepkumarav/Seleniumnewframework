package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
			            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
			        // Instantiate a ChromeDriver class.
			        WebDriver driver = new ChromeDriver();
			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			        // Maximize the browser
			        driver.manage().window().maximize();
			 
			        // Launch Website
			        driver.get("https://the-internet.herokuapp.com/upload");
			    	Thread.sleep(4000);
					//we want to import selenium-snapshot file. 
					driver.findElement(By.id("file-upload")).sendKeys("D:\\interview (4)\\interview\\New Text.txt");
					Thread.sleep(4000);
					driver.findElement(By.id("file-submit")).submit();
					Thread.sleep(4000);
					if(driver.getPageSource().contains("File Uploaded!")) {
						System.out.println("file uploaded");
					}
					else{
							System.out.println("file not uploaded");
						}
					driver.quit();

	}
}
