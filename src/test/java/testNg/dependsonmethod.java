package testNg;

import org.testng.annotations.Test;

public class dependsonmethod {

	@Test(dependsOnMethods = "D")
	  public void B() {
	    System.out.println("testcaseB");
	  }

	@Test
	  public void A() {
	    System.out.println("testcaseA");
	  }
	  
	  @Test
	  public void C() {
	    System.out.println("testcaseC");
	  }
	  
	  @Test
	  public void E() {
	    System.out.println("testcaseE");
	  }
	  
	  @Test
	  public void D() {
	    System.out.println("testcaseD");
	  }
}
