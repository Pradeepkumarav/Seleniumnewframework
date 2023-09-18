package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytestclass1  {

	
	@Test()
	  public void myTestMethod1() {
	    Assert.assertEquals(true, false);
	  }

	  @Test()
	  public void myTestMethod2() {
		  Assert.assertEquals(true, true);
	  }
}
