package Seleniumtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardautosuggestions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get("https://www.google.com/maps/search/maps+google/@37.5979349,-77.504561,15z/data=!3m1!4b1");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id='searchboxinput']")).clear();
	        driver.findElement(By.xpath("//*[@id='searchboxinput']")).sendKeys("Glen Allen");
	        Thread.sleep(5000);
	        

	        //cocRegion
	       Actions act = new Actions(driver);
	        act.sendKeys(Keys.DOWN).perform();
	        act.sendKeys(Keys.ENTER).perform();
	        // This code for open a new Tab
	        //act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();

	        /**
	         * Example for Visibility of Elements located by
	         */
	        /*WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("locSelectVal")));

	        List<WebElement> list = driver.findElements(By.id("locSelectVal"));

	        System.out.println("Auto Suggest List ::" + list.size());

	        for(int i = 1 ;i< list.size();i++)
	        {
	            System.out.println(list.get(i).getText());

	            if(list.get(i).getText().equals("Glen Allen"))
	            {
	                list.get(i).click();
	                break;


	            }*/
	        //driver.close();
	}

}
