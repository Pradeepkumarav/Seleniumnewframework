package launchbrowser;

import org.testng.annotations.Test;

public class Mytestclas1{

	@Test
	public void name() {
		System.out.println("name");
	}
	
	
	@Test(timeOut = 2000)
	public void BCD() throws Exception {
	
		Thread.sleep(3000);
		System.out.println("BCD");
	}
	
	
	@Test(timeOut = 2000)
	public void data() throws Exception {
		Thread.sleep(3000);
		System.out.println("data");
	}
	
	
	@Test(groups= {"regression"})
	public void ABC() {
		System.out.println("ABC");
	}
}
