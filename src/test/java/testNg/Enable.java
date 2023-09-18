package testNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Enable {


	  @Test(enabled=false)
	  public void myTestMethod1() {
	    System.out.println("testcase1");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("testcase2");
	  }
	  
	  @BeforeClass(enabled=false)
	  public void myTestMethod3() {
	    System.out.println("testcase3");
	  }
	  
	  @BeforeTest(enabled=false)
	  public void myTestMethod4() {
	    System.out.println("testcase4");
	  }
	  
	
}
