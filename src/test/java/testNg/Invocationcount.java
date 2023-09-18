package testNg;

import org.testng.annotations.Test;

public class Invocationcount {


	@Test(invocationCount = 3)
	  public void myTestMethod1() {
	    System.out.println("testcase1");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("testcase2");
	  }
}
